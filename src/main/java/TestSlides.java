import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import com.aspose.slides.License;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;

/**
 * 由于ASPOSE比较吃内存，操作大一点的文件就会堆溢出，所以请先设置好java虚拟机参数：-Xms1024m -Xmx1024m(参考值)<br>
 */
public class TestSlides {


    /**
     * 获取license
     *
     * @return
     */
    public static boolean getLicense() {
        boolean result = false;
        try {
            InputStream in = TestSlides.class.getResourceAsStream("/license.xml");
            License aposeLic = new License();
            aposeLic.setLicense(in);
            result = true;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // 验证License
        if (!getLicense()) {
            return;
        }
        try {
            long old = System.currentTimeMillis();
            String dataDir = "/Users/yaoxuewei/Documents/a4_test_files/";

            // Instantiate a Presentation object that represents a presentation file
            Presentation pres = new Presentation(dataDir + "test-5ҳ.pptx");

            // Save the presentation to PDF with default options
            pres.save(dataDir + "ddd.pdf", SaveFormat.Pdf);

            long now = System.currentTimeMillis();
            System.out.println("共耗时：" + ((now - old) / 1000.0) + "秒\n\n" + "文件保存在:ddd");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}