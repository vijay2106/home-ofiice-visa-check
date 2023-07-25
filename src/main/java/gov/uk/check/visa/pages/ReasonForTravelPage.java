package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ReasonForTravelPage extends Utility {
    public ReasonForTravelPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//div//label")
    List<WebElement> reasonForVisitList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;


    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'')]")
    WebElement selectLongStay;


    public void selectReasonForVisit(String reason) {
        for (WebElement element : reasonForVisitList) {
            if (element.getText().contains(reason)) {
                clickOnElement(element);
                break;
            }
        }
    }


    public void clickNextStepButton() {
        clickOnElement(nextStepButton);


    }
}
