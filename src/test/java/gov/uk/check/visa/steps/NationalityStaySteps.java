package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.SelectNationalityPage;
import io.cucumber.java.en.And;

public class NationalityStaySteps {

        @And("I select nationality {string}")
        public void iSelectNationality(String country) {
            new SelectNationalityPage().nationalityDropDownList(country);
        }

        @And("I click on next step button")
        public void iClickOnNextStepButton() {
            new SelectNationalityPage().clickNextStepButton();
        }
}
