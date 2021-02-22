package org.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    protected static WebDriver driver;
    protected static ManagerBase manager;

    public PageBase(ManagerBase manager) {
          this.manager = manager;
          this.driver = manager.driver();
          PageFactory.initElements(manager.driver(), this);
    }
}
