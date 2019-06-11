package uitesting.upb.org.managepage.personalwallet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.webdrivermanager.DriverManager;

public class TransferPage extends Header {
    @FindBy(xpath = "//*[@id='amount']")
    private WebElement amountTransferTextField;
    @FindBy(xpath = "//*[@id='btn-transfer']")
    private WebElement transferButton;
    @FindBy(xpath = "//*[@id='msg-error']")
    private WebElement transferErrorMessage;
    @FindBy(xpath = "//*[@id='destinationAccount']")
    private WebElement destinationAccountSelector;
    @FindBy(xpath = "//*[@id='msg-successful']")
    private WebElement transferSuccessMessage;

    public  TransferPage fillAmountTransferTextField(String amount) {
        amountTransferTextField = DriverManager.getInstance().waitForElement(By.xpath("//*[@id='amount']"));
        Events.fillField(amountTransferTextField, amount);
        return this;
    }

    public TransferPage clickTransferButton(){
        transferButton = DriverManager.getInstance().waitForElement(By.xpath("//*[@id='btn-transfer']"));
        Events.click(transferButton);
        return this;
    }

    public TransferPage selectAccountDestination(String selectorAccountName){
        destinationAccountSelector = DriverManager.getInstance().waitForElement(By.xpath("//*[@id='destinationAccount']"));
        Events.fillField(destinationAccountSelector, selectorAccountName );
        return this;
    }
    public boolean isTransferErrorMessageVisible() {
        transferErrorMessage = DriverManager.getInstance().waitForElement(By.xpath("//*[@id='msg-error']"));
        return Events.isWebElementVisible(transferErrorMessage);
    }

    public boolean isTransferSuccessMessageVisible() {
        transferSuccessMessage = DriverManager.getInstance().waitForElement(By.xpath("//*[@id='msg-successful']"));
        return  Events.isWebElementVisible(transferSuccessMessage);
    }

}
