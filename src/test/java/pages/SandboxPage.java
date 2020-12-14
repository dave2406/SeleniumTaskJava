package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

public class SandboxPage extends BasePage {

    @FindBy(id="run-button")
    private WebElement runButton;

    @FindBy(id="output")
    private WebElement output;

    public SandboxPage(WebDriver driver) {
        super(driver);
        // Verify page loaded
        assertTrue(runButton.isDisplayed());
    }

    public void runCode(){
        this.runButton.click();
    }

    public String output(){
        return this.output.getText();
    }
}
