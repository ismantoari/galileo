package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import static helper.BestUtil.driver;
import static helper.Endpoint.galileo_loyalty_add;

public class LoyaltyPage {
    By addLoyalty = By.xpath("//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-1ra0vbb\"]");
    public void clickSubMenuTambahLoyalty(){
        driver.findElement(addLoyalty).click();
    }

    public void userOnPageAddLoyalty(){
        String url_loyalty_add = driver.getCurrentUrl();
        Assert.assertEquals(galileo_loyalty_add,url_loyalty_add);
    }
}
