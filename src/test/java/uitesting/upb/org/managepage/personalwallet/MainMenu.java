package uitesting.upb.org.managepage.personalwallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class MainMenu extends BasePage {
    @FindBy(id = "Report")
    private WebElement reportsButton;
    @FindBy(xpath = "//*[@id='Expenses']")
    private WebElement expensesButton;
    @FindBy(id = "Income")
    private WebElement incomeButton;

    @FindBy(xpath = "//*[@id='settings']")
    private WebElement accountSettingsButton;
    @FindBy(xpath = "//*[@id='Transfer']")
    private WebElement transferButton;

    public ReportsPage clickReportsButton() {
        Events.click(reportsButton);
        return new ReportsPage();
    }

    public TransactionsPage clickExpensesButton() {
        Events.click(expensesButton);
        return new TransactionsPage();
    }

    public  TransactionsPage clickIncomeButton() {
        Events.click((incomeButton));
        return new TransactionsPage();
    }
    public AccountSettingsPage clickAccountSettingsButton() {
        Events.click(accountSettingsButton);
        return new AccountSettingsPage();
    }
    public TransferPage clickTransferButton() {
        Events.click(transferButton);
        return new TransferPage();
    }
}
