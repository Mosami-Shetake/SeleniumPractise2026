import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Googletest {

        static void main(String[] args) throws InterruptedException {

            WebDriver driver = new ChromeDriver();

            driver.get("https://www.google.com/");
            Thread.sleep(5000);

            driver.manage().window().maximize();
            driver.quit();


        }
    }
