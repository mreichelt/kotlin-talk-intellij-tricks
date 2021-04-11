import org.apache.pdfbox.pdmodel.PDDocument
import org.apache.pdfbox.pdmodel.PDPage
import org.apache.pdfbox.pdmodel.PDPageContentStream
import org.apache.pdfbox.pdmodel.font.PDFont
import org.apache.pdfbox.pdmodel.font.PDType1Font

fun writeText(
    document: PDDocument,
    page: PDPage,
    text: String,
    x: Float,
    y: Float,
    font: PDFont = PDType1Font.HELVETICA,
    fontSize: Float = 14f
): PDPageContentStream {

    val contentStream = PDPageContentStream(document, page)
    contentStream.beginText()
    contentStream.setFont(font, fontSize)
    contentStream.newLineAtOffset(x, y)
    contentStream.showText(text)
    contentStream.endText()
    return contentStream

    // convert to also / apply / run / with
    // inline

    // pass contentStream as parameter
    // then: convert parameter to receiver

}
