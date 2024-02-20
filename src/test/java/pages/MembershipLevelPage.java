package pages;

import org.openqa.selenium.By;

import static helper.BestUtil.driver;

public class MembershipLevelPage {
By textBoxMembershipLevelName = By.xpath("//input[@name=\"name\"]");
    public void inputMembershipLevelName(String membershipLevelName){
    driver.findElement(textBoxMembershipLevelName).sendKeys(membershipLevelName);
    }





}
