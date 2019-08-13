
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class TestRegistration extends ParentClassBaseUI {


        @Test
        public void testRegistrationButton() {
            driver.findElement(Locators.registrationButton).click();
            driver.findElement(Locators.inputEmail).sendKeys(Data.email);
            driver.findElement(Locators.inputPassword).sendKeys(Data.password);
            driver.findElement(Locators.nextButton).click();
            driver.findElement(Locators.inputUserName).sendKeys(Data.username);
            driver.findElement(Locators.inputUserPhone).sendKeys(Data.phoneNumber);

            WebElement dropDownDayElement = driver.findElement(Locators.dropDownDay);

            dropDownDayElement.click();
            dropDownDayElement.findElement(By.xpath("//a[@data-value='"+ Data.day+"']")).click();


            WebElement dropDownMonthElement = driver.findElement(Locators.dropDownMonth);
            dropDownMonthElement.click();
            dropDownMonthElement.findElement(By.xpath("//a[@data-action='change-datepicker'][text()='"+ Data.monthName+"']")).click();


            WebElement dropDownYearElement = driver.findElement(Locators.dropDownYear);
            dropDownYearElement.click();
            dropDownYearElement.findElement(By.xpath("//a[@data-value='"+ Data.year+"']")).click();


            WebElement checkBoxConf = driver.findElement(Locators.checkBoxConfirmation);
            checkBoxConf.click();
            boolean checkBoxChecked = checkBoxConf.isSelected();
            System.out.println(checkBoxChecked);



        }


}
