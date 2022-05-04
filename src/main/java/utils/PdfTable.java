package utils;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

public class PdfTable {

    private Table table;
    private final int column;

    public PdfTable(int column) {
        this.column = column;
        float[] pointColumnWidths = new float[column];
        for (int i = 0; i < column; i++) {
            pointColumnWidths[i] = 100F;
        }
        this.table = new Table(pointColumnWidths);
        table.addCell(new Cell().add(new Paragraph("First name")));
        table.addCell(new Cell().add(new Paragraph("Last name")));
        table.addCell(new Cell().add(new Paragraph("Middle name")));
        table.addCell(new Cell().add(new Paragraph("Age")));
        table.addCell(new Cell().add(new Paragraph("Gender")));
        table.addCell(new Cell().add(new Paragraph("Birthday date")));
        table.addCell(new Cell().add(new Paragraph("Place of birth")));
        table.addCell(new Cell().add(new Paragraph("Index")));
        table.addCell(new Cell().add(new Paragraph("Country")));
        table.addCell(new Cell().add(new Paragraph("Region")));
        table.addCell(new Cell().add(new Paragraph("City")));
        table.addCell(new Cell().add(new Paragraph("Street")));
        table.addCell(new Cell().add(new Paragraph("Building")));
        table.addCell(new Cell().add(new Paragraph("Apartment")));
    }

    public Table getTable() {
        return table;
    }
}





