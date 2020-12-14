package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.junit.Test;
import pages.SandboxPage;

import static org.junit.Assert.assertEquals;


public class RunCodeTest extends BaseTest{

        @Test
        public void testRunningCode() throws InterruptedException {
            driver.get("https://dotnetfiddle.net/");
            SandboxPage sandboxPage = new SandboxPage(driver);

            sandboxPage.runCode();

            assertEquals("Hello World", sandboxPage.output());


        }

}
