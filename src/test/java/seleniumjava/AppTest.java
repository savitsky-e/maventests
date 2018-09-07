package seleniumjava;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        new ChromeDriver();
    }
    }
  /*  @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }*/

