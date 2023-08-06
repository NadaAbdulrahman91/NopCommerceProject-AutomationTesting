package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchPage  extends PageBase {

    private By searchBox = By.cssSelector("input[id=\"small-searchterms\"]");
    private By searchKeyWordsLocator = By.cssSelector("li[class=\"ui-menu-item\"]");
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    public SearchPage searching(String x) {
        driver.findElement(searchBox).sendKeys(x);
        return new SearchPage(driver);
    }

    public boolean searchKeyWordChecker(String Keyword) {
        List<WebElement> searchListElements = driver.findElements(searchKeyWordsLocator);
        List<String> KeyWords = new ArrayList<>();
        System.out.println(searchListElements.size());

        for (WebElement product : searchListElements) {
           String priceText = product.getText().toLowerCase();
           KeyWords.add(priceText);
           System.out.println(priceText + " => " + Keyword);
        }

        return KeyWords.stream().anyMatch(s -> s.contains(Keyword));
    }
}




