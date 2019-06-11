package uitesting.upb.org.handlewebsite;

import uitesting.upb.org.managefile.PropertyAccesor;
import uitesting.upb.org.managepage.personalwallet.AccountHomeMenu;
import uitesting.upb.org.managepage.personalwallet.MainMenu;
import uitesting.upb.org.managepage.personalwallet.ReportsPage;
import uitesting.upb.org.webdrivermanager.DriverManager;

/**
 * @autor Marcelo Garay
 */
public class LoadPage {
    public static AccountHomeMenu loadHomeMenu(){
        DriverManager.getInstance().getWebDriver().navigate().to(PropertyAccesor.getInstance().getBaseURL());
        return new AccountHomeMenu();
    }

    public static void main(String[] args) {
        String newAccountName = "Test";
        MainMenu mainMenu = loadHomeMenu().writeAccountName(newAccountName).clickAddButton().clickButtonById(newAccountName);
        ReportsPage reports = mainMenu.clickReportsButton();
    }
}
