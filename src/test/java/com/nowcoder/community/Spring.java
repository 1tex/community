import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootVersion;
import org.springframework.core.SpringVersion;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ---
 * @date 3/6/2020
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class Spring {
    @Test
    public void test() {
        System.out.println("SpringBoot版本：" + SpringBootVersion.getVersion());
        System.out.println("Spring版本：" + SpringVersion.getVersion());
    }
}