package seleniumjava;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.get("https://hillel.it/");
        browser.quit();
    }
    }
  /*  @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }*/

