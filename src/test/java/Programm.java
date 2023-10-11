import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programm {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get ("https://www.seleniumhq.org/");
        driver.close();
    }
}
