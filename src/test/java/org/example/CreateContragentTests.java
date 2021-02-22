package org.example;

import org.junit.*;

// @Feature("Contragent")
public class CreateContragentTests extends TestBase {

    @Test
    public void createContragentTest() throws Exception {
        navigator.goToContragentPage();
        contragentsListPage
                .deleteContragent("Удалить")
                .clickByCreateContragentButton();
        contragentFormPage
                .fillContragentForm(new ContragentData("Станислав", "stanislav@tets.test", "Партнер", "Защита"))
                .clickToSaveBtn();
        contragentsListPage
                .CheckResualsAfterCreatedContragent();
    }
}
