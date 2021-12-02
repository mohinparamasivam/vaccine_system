/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package report;

import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.draw.SolidLine;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.LineSeparator;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;
import java.io.File;
import java.util.List;

/**
 *
 * @author howar
 */
public class PdfReportGenerator extends FileReportGenerator {

    private String font = StandardFonts.TIMES_ROMAN;
    private String boldFont = StandardFonts.TIMES_BOLD;
    private final LineSeparator ls = new LineSeparator(new SolidLine());

    public PdfReportGenerator(String fileName, List<? extends Generatable> subjects) {
        super(fileName + ".pdf", subjects);
    }

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public String getBoldFont() {
        return boldFont;
    }

    public void setBoldFont(String boldFont) {
        this.boldFont = boldFont;
    }

    @Override
    public void saveReport() {
        File file = new File(this.getFilePath());
        file.getParentFile().mkdirs();
        try {
            PdfWriter writer = new PdfWriter(this.getFilePath());
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);
            List<? extends Generatable> components = this.getSubjects();
            PdfFont pdfFont = PdfFontFactory.createFont(font);
            PdfFont pdfBoldFont = PdfFontFactory.createFont(boldFont);
            for (int i = 0; i < components.size(); i++) {
                Paragraph header = new Paragraph(components.get(i).getGenerateTitle())
                        .setTextAlignment(TextAlignment.LEFT)
                        .setFont(pdfBoldFont)
                        .setFontSize(16);
                Paragraph content = new Paragraph(components.get(i).getGenerateContent())
                        .setTextAlignment(TextAlignment.LEFT)
                        .setFont(pdfFont)
                        .setFontSize(14);

                document.add(new Paragraph(""));
                document.add(header);
                document.add(content);
                document.add(new Paragraph(""));

                if (i != this.getSubjects().size() - 1) { //add line if it is not the last content
                    document.add(ls);
                }
            }
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    private void addMetaData(Document document) {
//        document.addTitle("");
//        document.addSubject("Using iText");
//        document.addKeywords("Java, PDF, iText");
//        document.addAuthor("Lars Vogel");
//        document.addCreator("Lars Vogel");
//    }

}
