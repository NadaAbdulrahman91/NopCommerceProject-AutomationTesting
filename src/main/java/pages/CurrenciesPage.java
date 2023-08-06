package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class CurrenciesPage extends PageBase{

    private By currencyBox = By.id("customerCurrency");
    private By allPrices = By.cssSelector("span[class=\"price actual-price\"]");
    public CurrenciesPage(WebDriver driver) {
        super(driver);
    }
    public CurrenciesPage CheckCurrency(String Euro){
        actions().moveToElement(driver.findElement(currencyBox)).click().perform();
        Select selectcurrency = new Select(driver.findElement(currencyBox));
        selectcurrency.selectByVisibleText(Euro);

        return new CurrenciesPage(driver);
    }
    public boolean checkIfCurrency€(String currency){
        List<WebElement> Priceelements = driver.findElements(allPrices);
        List<String> Prices = new ArrayList<>();
        for (WebElement price : Priceelements){
            Prices.add(price.getText());
        }
        return Prices.stream().allMatch(s -> s.startsWith(currency));
    }

    }

