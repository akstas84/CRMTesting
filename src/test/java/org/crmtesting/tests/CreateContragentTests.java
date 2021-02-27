package org.crmtesting.tests;

import org.crmtesting.model.ContragentData;
import org.junit.Test;

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
                .clickToSaveBtn()
                .CheckResualsAfterCreatedContragent("Станислав");
    }
    @Test
    public void createContragentTestTwo() throws Exception {
        manager.navigator()
                .goToContragentPage();
        manager.contragentsListPage()
                .deleteContragent("Удалить")
                .clickByCreateContragentButton();
        manager.contragentFormPage()
                .fillContragentForm(new ContragentData("Олег", "stanislav@tets.test", "Вкладчик", "Культура"))
                .clickToSaveBtn()
                .CheckResualsAfterCreatedContragent("Олег");
    }
}
