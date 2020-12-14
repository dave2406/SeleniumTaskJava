package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

public class SandboxPage extends BasePage {

    @FindBy(id="run-button")
    private WebElement runButton;

    @FindBy(id="output")
    private WebElement output;

    @FindBy(className="new-package")
    private WebElement addPackageField;

    @FindBy(className="add-package")
    private WebElement addAnotherButton;

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

    public void addPackage(String packageName, String version){
        if (this.addAnotherButton.isDisplayed()){
            this.addAnotherButton.click();
        }
        this.addPackageField.click();
        this.addPackageField.sendKeys(packageName);
        driver.findElement(By.cssSelector("a[package-id=\""+packageName+"\"]")).click();
        driver.findElement(By.cssSelector("a[package-id=\""+packageName+"\"][version-name=\""+version+"\"]")).click();
    }

    public WebElement packageListItem(String packageName){
        return driver.findElement(By.cssSelector("div[class=package-name][package-id=\""+packageName+"\"]"));
    }
}
