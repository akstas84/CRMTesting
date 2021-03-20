package org.crmtesting.tests;

import org.crmtesting.model.ContragentData;
import org.junit.Test;

public class CreateContragentTests extends TestBase {

    @Test
    public void createContragentTest() throws Exception {
        navigator
                .goToContragentPage();
        contragentsListPage
                .deleteContragent("Удалить") //ToDo
                .clickByCreateContragentButton();
        contragentFormPage
                .fillContragentForm(new ContragentData("Станислав", "stanislav@tets.test", "Партнер", "Защита"))
                .clickToSaveBtn()
                .CheckResualsAfterCreatedContragent("Станислав"); //ToDo
    }
}
