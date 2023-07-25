package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.FamilyImmigrationStatusPage;
import io.cucumber.java.en.And;

public class VisaYesOrNo {
    @And("I click on Yes button")
    public void iClickOnYesButton() {
        new FamilyImmigrationStatusPage().clickOnYes();
    }

    @And("I click on next button")
    public void iClickOnNextButton() {
        new FamilyImmigrationStatusPage().clickOnContinue();
    }
}
