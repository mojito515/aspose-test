import com.aspose.cells.License;
import com.aspose.cells.SaveFormat;
import com.aspose.cells.Workbook;

import java.io.InputStream;

/**
 * 由于ASPOSE比较吃内存，操作大一点的文件就会堆溢出，所以请先设置好java虚拟机参数：-Xms512m -Xmx512m(参考值)<br>
 * 如有疑问，请在CSDN下载界面留言,或者联系QQ569925980<br>
 *
 * @author Spark
 */
public class Excel2Pdf {

    /**
     * 获取license
     *
     * @return
     */
    public static boolean getLicense() {
        boolean result = false;
        try {
            InputStream in = Excel2Pdf.class.getResourceAsStream("/cell_license.xml");
            License aposeLic = new License();
            aposeLic.setLicense(in);
            result = true;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 支持DOC, DOCX, OOXML, RTF, HTML, OpenDocument, PDF, EPUB, XPS, SWF等相互转换<br>
     *
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
            Workbook wb = new Workbook(dataDir + "test-v-less.xlsx");
            wb.save(dataDir + "xls.pdf", SaveFormat.PDF);
            long now = System.currentTimeMillis();
            System.out.println("共耗时：" + ((now - old) / 1000.0) + "秒");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}