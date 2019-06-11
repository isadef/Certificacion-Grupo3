package uitesting.upb.org.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.managepage.personalwallet.AccountHomeMenu;
import uitesting.upb.org.managepage.personalwallet.AccountSettingsPage;
import uitesting.upb.org.managepage.personalwallet.MainMenu;
import uitesting.upb.org.managepage.personalwallet.ReportsPage;

public class PersonalWalletSteps {
    private AccountHomeMenu accountHomeMenu;
    private MainMenu mainMenu;
    private ReportsPage reportsPage;
    private AccountSettingsPage accountSettingsPage;

    @Given("^The main page is loaded$")
    public void loadMainPage() {
        accountHomeMenu = LoadPage.loadHomeMenu();
    }

    @Given("^We filled the account name field on the main page with \"(.*)\"$")
    public void fillAccountNameField(String accountName) {
        accountHomeMenu.writeAccountName(accountName);
    }

    @Given("^We clicked the add button on the main page$")
    public void clickAddButton() {
        accountHomeMenu.clickAddButton();
    }

    @Given("^We clicked the \"(.*)\" button on the main page$")
    public void clickAccountButton(String accountId) {
        mainMenu = accountHomeMenu.clickButtonById(accountId);
    }

    @When("^We click 'Reports' button on the main menu page$")
    public void clickReportsButton() {
        reportsPage = mainMenu.clickReportsButton();
    }

    @And("^We select 'By category' in the select option on the reports page$")
    public void selectByCategoryOption() {
        reportsPage.selectByCategoryOption();
    }

    @And("^We click the 'Show report' button on the reports page$")
    public void clickShowReportButton() {
        reportsPage.clickShowReportButton();
    }

    @Then("^The title is \"(.*)\"$")
    public void assertPageTitle(String title) {
        Assert.assertEquals(reportsPage.getTitle(), title);
    }

    @Then("^The table has \"[0-9]+\" rows$")
    public void assertTableRows(int rows) {
        Assert.assertEquals(reportsPage.getNumberOfRows(), rows);
    }

    @When("^We click 'Account Settings' button on the main menu page$")
    public void clickAccountSettingsButton() {
        accountSettingsPage = mainMenu.clickAccountSettingsButton();
    }

    @And("^We change the account name field on the account settings page by adding \"([^\"]*)\" to it$")
    public void changeTheAccountNameField(String newAccountName) {
        accountSettingsPage.writeNewAccountName(newAccountName);
    }

    @And("^We click the 'Change name' button on the account settings page$")
    public void clickTheChangeNameButton() {
        accountSettingsPage.clickChangeNameButton();
    }

    @And("^We click the 'Exit' like button on the account settings page$")
    public void clickTheExitButton() {
        accountHomeMenu = accountSettingsPage.clickExitButton();
    }

    @Then("^The account title is \"([^\"]*)\"$")
    public void theAccountTitle(String title) {
        Assert.assertEquals(accountHomeMenu.getButtonNameById(title), title);
    }

    @And("^We click the 'Delete account' button on the account settings page$")
    public void clickTheDeleteAccount() {
        accountSettingsPage.clickDeleteAccountButton();
    }

    @Then("^Account menu has (\\d+) account button$")
    public void accountMenuHasAccountBuutton(int number) {
        Assert.assertEquals(accountHomeMenu.getNumberOfButtons(), number);
    }
}
