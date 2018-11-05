import com.aspose.words.FileFormatInfo;
import com.aspose.words.FileFormatUtil;

import java.io.File;


public class DetectFileFormat
{
    public static void main(String[] args) throws Exception {
        //ExStart:DetectFileFormat
        // The path to the documents directory.
        String dataDir = "/Users/yaoxuewei/Documents/a4_test_files/";

        // The path to the document which is to be processed.
        String filePath = dataDir + "test-h-less.docx";

        FileFormatInfo info = FileFormatUtil.detectFileFormat(filePath);
        System.out.println("The document format is: " + FileFormatUtil.loadFormatToExtension(info.getLoadFormat()));
        System.out.println("Document is encrypted: " + info.isEncrypted());
        System.out.println("Document has a digital signature: " + info.hasDigitalSignature());
        //ExEnd:DetectFileFormat
    }
}