import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import person.Person;
import person.PersonFactory;
import utils.PdfTable;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception {

        final String dest = "/Users/andrey/Desktop/people.pdf";
        PdfWriter writer = new PdfWriter(dest);
        PdfDocument pdf = new PdfDocument(writer);
        Document doc = new Document(pdf, PageSize.A3);


        PdfTable table = new PdfTable(14);

        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();

        for (int i = 1; i <= length; i++) {
            Person person = PersonFactory.getPerson(length);
            table.getTable().addCell(new Cell().add(new Paragraph(person.getFio().getFirstName())));
            table.getTable().addCell(new Cell().add(new Paragraph(person.getFio().getLastName())));
            table.getTable().addCell(new Cell().add(new Paragraph(person.getFio().getMiddleName())));
            table.getTable().addCell(new Cell().add(new Paragraph(Integer.toString(person.getPhys().getAge()))));
            table.getTable().addCell(new Cell().add(new Paragraph(person.getPhys().getGender())));
            table.getTable().addCell(new Cell().add(new Paragraph(person.getPhys().getBirthDateAsString())));
            table.getTable().addCell(new Cell().add(new Paragraph(person.getPlace().getPlace())));

            String[] dictionary = new String[7];
            dictionary = person.getPlaceOfResidentes().getAddressByWord();
            for (String s : dictionary) {
                table.getTable().addCell(new Cell().add(new Paragraph(s)));
            }
        }

        doc.add(table.getTable());
        doc.close();

        System.out.println("Файл создан. Путь к файлу: " + dest);
    }
}
