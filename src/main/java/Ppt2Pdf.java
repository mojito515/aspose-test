import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;

public class Ppt2Pdf{

    public static void main(String[] args) {

        // The path to the documents directory.
        //ExStart:ConvertingPresentationToPDFUsingDefaultOptions
        String dataDir = "/Users/yaoxuewei/Documents/a4_test_files/";

        // Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(dataDir + "test-5ҳ.pptx");

        // Save the presentation to PDF with default options
        pres.save(dataDir + "demoDefault.pdf", SaveFormat.Pdf);

        //ExEnd:ConvertingPresentationToPDFUsingDefaultOptions
    }

}