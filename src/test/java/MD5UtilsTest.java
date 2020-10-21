import com.isle.mauritius.md5.MD5Utils;
import org.junit.Test;

public class MD5UtilsTest {

    @Test
    public void testGetMD5Summary() {
        String str = "hello isle";
        String summary = MD5Utils.getMD5Summary(str);
        System.out.printf("%s",summary);
    }
}
