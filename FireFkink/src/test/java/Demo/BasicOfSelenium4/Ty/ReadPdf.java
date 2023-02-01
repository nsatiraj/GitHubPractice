package Demo.BasicOfSelenium4.Ty;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.http.HttpResponse.BodyHandlers;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;
public class ReadPdf {

	public static void main(String[] args) throws IOException, SAXException, TikaException {
		 BodyContentHandler handlers = new BodyContentHandler();
		 FileInputStream fis=new FileInputStream("./src/test/resources/TestData/satishup.pdf");
		 Metadata metadata=new Metadata();
		 ParseContext parseContext=new ParseContext();
	    PDFParser parser=new PDFParser();
	    parser.parse(fis, handlers, metadata, parseContext);
	    System.out.println(handlers.toString());
	}
}
