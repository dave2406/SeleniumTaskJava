package tests;

import org.junit.Test;
import pages.SandboxPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AddPackageTest extends BaseTest {

    @Test
    public void testAddingPackage() throws InterruptedException{
        driver.get("https://dotnetfiddle.net/");
        SandboxPage sandboxPage = new SandboxPage(driver);

        sandboxPage.addPackage("NUnit", "3.12.0.0");

        assertTrue(sandboxPage.packageListItem("NUnit").isDisplayed());
        assertEquals("NUnit",sandboxPage.packageListItem("NUnit").getText());
    }
}
