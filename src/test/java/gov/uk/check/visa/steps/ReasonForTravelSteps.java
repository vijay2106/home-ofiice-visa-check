package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.ReasonForTravelPage;
import io.cucumber.java.en.And;

public class ReasonForTravelSteps {
    @And("I select reason for visit {string}")
    public void iSelectReasonForVisit(String reason) {
        new ReasonForTravelPage().selectReasonForVisit(reason);
    }

    @And("I click on continue button")
    public void iClickOnContinueButton() {
        new ReasonForTravelPage().clickNextStepButton();
    }

    @And("I click on next steps button")
    public void iClickOnNextStepsButton() {
        new ReasonForTravelPage().clickNextStepButton();
    }
}
