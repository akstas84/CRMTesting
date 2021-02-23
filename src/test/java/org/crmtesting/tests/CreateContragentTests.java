package org.crmtesting.tests;

import org.crmtesting.model.ContragentData;
import org.junit.*;

// @Feature("Contragent")
public class CreateContragentTests extends TestBase {

    @Test
    public void createContragentTest() throws Exception {
        manager.navigator()
                .goToContragentPage();
        manager.contragentsListPage()
                .deleteContragent("Удалить")
                .clickByCreateContragentButton();
        manager.contragentFormPage()
                .fillContragentForm(new ContragentData("Станислав", "stanislav@tets.test", "Партнер", "Защита"))
                .clickToSaveBtn();
        manager.contragentsListPage()
                .CheckResualsAfterCreatedContragent();
    }
}
