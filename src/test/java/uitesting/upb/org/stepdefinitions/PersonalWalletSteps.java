package uitesting.upb.org.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.managepage.personalwallet.*;

public class PersonalWalletSteps {
    private AccountHomeMenu accountHomeMenu;
    private MainMenu mainMenu;
    private ReportsPage reportsPage;
    private TransactionsPage transactionsPage;
    private TransferPage transferPage;
    private Header header;

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

    @Given("^We clicked the 'Expenses' button on the main menu page$")
    public void weClickedTheExpensesButtonOnTheMainMenuPage() { transactionsPage = mainMenu.clickExpensesButton(); }

    @And("^We fill the 'category name' field with \"([^\"]*)\" on the Transactions page$")
    public void weFillTheCategoryNameFieldWithOnTheTransactionsPage(String categoryName) { transactionsPage = transactionsPage.fillCategoryRegisterField(categoryName); }

    @And("^We click the 'Register Category' button on the Transactions page$")
    public void weClickTheRegisterCategoryButtonOnTheTransactionsPage() { transactionsPage = transactionsPage.clickCategoryButton(); }

    @Then("^Search the 'category success' alert on the Transactions page$")
    public void searchTheCategorySuccessAlertOnTheTransactionsPage() { Assert.assertTrue(transactionsPage.isCategorySuccessAlertVisible()); }

    @And("^Search the category option \"([^\"]*)\" on the category selector on the Transactions page$")
    public void searchTheCategoryOptionOnTheCategorySelectorOnTheTransactionsPage(String option) { Assert.assertTrue(transactionsPage.searchCategoryOnSelector(option)); }

    @And("^We fill the 'expense name' field with \"([^\"]*)\" on the Transactions page$")
    public void weFillTheExpenseNameFieldWithOnTheTransactionsPage(String name) { transactionsPage = transactionsPage.fillExpenseNameField(name); }

    @And("^We select the \"([^\"]*)\" values on the category selector on the Transactions page$")
    public void weSelectTheValuesOnTheCategorySelectorOnTheTransactionsPage(String category) { transactionsPage = transactionsPage.selectCastegort(category); }

    @And("^We fill the 'AmountBS' field with \"([^\"]*)\" on the Transactions page$")
    public void weFillTheAmountBSFieldWithOnTheTransactionsPage(String amount) { transactionsPage = transactionsPage.fillAmountField(amount); }

    @And("^We fill the 'DateField' field with \"([^\"]*)\" on the Transactions page$")
    public void weFillTheDateFieldFieldWithOnTheTransactionsPage(String date) { transactionsPage = transactionsPage.fillDateField(date); }

    @And("^We click the 'Register Transition' button on the Transaction page$")
    public void weClickTheRegisterTransitionButtonOnTheTransactionPage() { transactionsPage = transactionsPage.clickTransactionButton(); }

    @Then("^Search the 'transaction fail' alert on the Transactions page$")
    public void searchTheTransactionFailAlertOnTheTransactionsPage() { Assert.assertTrue(transactionsPage.isTransactionFailAlertVisible()); }

    @Given("^We Filled the account name field on the main page with \"([^\"]*)\"$")
    public void weFilledTheAccountNameFieldOnTheMainPageWith(String accountName) throws Throwable {
        accountHomeMenu.writeAccountName(accountName);
    }

    @Then("^We click the 'Exit' button on the header page$")
    public void weClickTheExitButtonOnTheHeaderPage() {
        header = header.clickExitButton();
    }

    @Given("^We clicked the 'Transfer' Button on the main menu page$")
    public void weClickedTheTransferButtonOnTheMainMenuPage() {
        transferPage = mainMenu.clickTransferButton();
    }

    @And("^we fill 'amount in BS' text field with \"([^\"]*)\" on transfer page$")
    public void weFillAmountInBSTextFieldWithOnTransferPage(String amount) throws Throwable {
        transferPage = transferPage.fillAmountTransferTextField(amount);
    }

    @And("^We click the 'Transfer' Button$")
    public void weClickTheTransferButton() {
        transferPage = transferPage.clickTransferButton();
    }

    @Then("^Search the 'Error Message' fail alert on transfer page$")
    public void searchTheErrorMessageFailAlertOnTransferPage() {
        Assert.assertTrue(transferPage.isTransferErrorMessageVisible());
    }

    @And("^We select the \"([^\"]*)\" value on 'Destination Account' selector on Transfer Pager$")
    public void weSelectTheValueOnDestinationAccountSelectorOnTransferPager(String accountDestination) throws Throwable {
        transferPage = transferPage.selectAccountDestination(accountDestination);
    }

}
