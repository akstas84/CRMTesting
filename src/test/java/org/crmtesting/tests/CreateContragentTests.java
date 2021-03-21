package org.crmtesting.tests;

import org.crmtesting.model.ContragentData;
import org.junit.Test;

public class CreateContragentTests extends TestBase {

    @Test
    public void createContragentTest() throws Exception {
        navigator
                .goToContragentPage();
        contragentsListPage
                .deleteContragent()
                .clickByCreateContragentButton();
        contragentFormPage
                .fillContragentForm(new ContragentData())
                .clickToSaveBtn()
                .CheckResualsAfterCreatedContragent(new ContragentData().name());
    }
    @Test
    public void createContragentPTest() throws Exception {
        navigator
                .goToContragentPage();
        contragentsListPage
                .deleteContragent()
                .clickByCreateContragentButton();
        contragentFormPage
                .fillContragentForm(new ContragentData())
                .clickToSaveBtn()
                .CheckResualsAfterCreatedContragent(new ContragentData().name());
    }
}
