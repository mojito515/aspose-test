import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;

public class PdfPageNum {
    public static void main(String[] args) throws IOException {
        String dataDir = "/Users/yaoxuewei/Documents/a4_test_files/";
        PDDocument pdf = PDDocument.load(new File(dataDir, "demoDefault.pdf"));
        System.out.println("demoDefault.pdf 的页数是：" + pdf.getNumberOfPages());

    }
}
