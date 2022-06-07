import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.junit.jupiter.api.Test;

public class TesteApplicationTests {
    @Test
    public void hello(){
        WebDriver driver = new EdgeDriver();
        System.setProperty("webdriver.edge.driver", "C:\\Windows\\System32\\MicrosoftWebDriver.exe");   
        driver.get("http://www.google.br");
    }    
}
