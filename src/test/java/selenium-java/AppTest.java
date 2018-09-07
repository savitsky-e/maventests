package selenium-java;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public static void main(String[] args) {
        new ChromeDriver();
    }
    }
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
