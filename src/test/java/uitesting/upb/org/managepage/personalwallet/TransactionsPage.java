package uitesting.upb.org.managepage.personalwallet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.webdrivermanager.DriverManager;

public class TransactionsPage {

    @FindBy(xpath = "//*[@id='categoryRegister']")
    private WebElement categoryRegisterField;

    @FindBy(xpath = "//*[@id='buttonCategory']")
    private WebElement catergoryButton;

    @FindBy(xpath = "//*[@id='categorySuccess']")
    private WebElement categorySuccessAlert;

    @FindBy(xpath = "//*[@id='category']")
    private WebElement categorySelector;

    @FindBy(xpath = "//*[@id='name']")
    private WebElement expenseNameField;

    @FindBy(xpath = "//*[@id='amount']")
    private WebElement amountField;

    @FindBy(xpath = "//*[@id='dateSpace']")
    private WebElement dateField;

    @FindBy(xpath = "//*[@id='buttonTransaction']")
    private WebElement transactionButton;

    @FindBy(xpath = "//*[@id='transactionFail']")
    private WebElement transactionFailAlert;

    @FindBy(xpath = "//*[@id='transactionSuccess']")
    private WebElement transactionSuccessAlert;

    public boolean isTransactionFailAlertVisible() {
        transactionFailAlert = DriverManager.getInstance().waitForElement(By.xpath("//*[@id='transactionFail']"));
        return Events.isWebElementVisible(transactionFailAlert);
    }

    public boolean isTransactionSuccessAlertVisible() {
        transactionSuccessAlert = DriverManager.getInstance().waitForElement(By.xpath("//*[@id='transactionSuccess']"));
        return Events.isWebElementVisible(transactionSuccessAlert);
    }

    public TransactionsPage fillAmountField(String amount) {
        amountField = DriverManager.getInstance().waitForElement(By.xpath("//*[@id='amount']"));
        Events.fillField(amountField,amount);
        return this;
    }

    public TransactionsPage clickTransactionButton() {
        transactionButton = DriverManager.getInstance().waitForElement(By.xpath("//*[@id='buttonTransaction']"));
        Events.click(transactionButton);
        return this;
    }

    public TransactionsPage fillDateField(String date) {
        dateField = DriverManager.getInstance().waitForElement(By.xpath("//*[@id='dateSpace']"));
        Events.fillField(dateField, date);
        return this;
    }

    public TransactionsPage fillCategoryRegisterField(String name) {
        categoryRegisterField = DriverManager.getInstance().waitForElement(By.xpath("//*[@id='categoryRegister']"));
        Events.fillField(categoryRegisterField, name);
        return this;
    }

    public TransactionsPage fillExpenseNameField(String name) {
        expenseNameField = DriverManager.getInstance().waitForElement(By.xpath("//*[@id='name']"));
        Events.fillField(expenseNameField, name);
        return this;
    }

    public TransactionsPage clickCategoryButton() {
        catergoryButton = DriverManager.getInstance().waitForElement(By.xpath("//*[@id='buttonCategory']"));
        Events.click(catergoryButton);
        return this;
    }

    public boolean isCategorySuccessAlertVisible() {
        categorySuccessAlert = DriverManager.getInstance().waitForElement(By.xpath("//*[@id='categorySuccess']"));
        return Events.isWebElementVisible(categorySuccessAlert);
    }

    public boolean searchCategoryOnSelector(String category) {
        categorySelector = DriverManager.getInstance().waitForElement(By.xpath("//*[@id='category']"));
        return Events.isElementOnSelector(categorySelector, category);
    }

    public TransactionsPage selectCastegort(String category) {
        categorySelector = DriverManager.getInstance().waitForElement(By.xpath("//*[@id='category']"));
        Events.fillField(categorySelector, category);
        return this;
    }
}
