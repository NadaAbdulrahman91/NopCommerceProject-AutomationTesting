package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class HomePage  extends PageBase{
    //Locators
    private By moveToElectronics = By.cssSelector("a[href=\"/electronics\"]");
    private By selectMobile =By.cssSelector("ul[class=\"top-menu notmobile\"] [href=\"/cell-phones\"]");
    private By addToWishlist = RelativeLocator.with(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]")).below(By.cssSelector("img[alt=\"Picture of HTC One M8 Android L 5.0 Lollipop\"]"));
    private By wishlistCart = By.cssSelector("span[class=\"wishlist-label\"]");
    private By checkAddToCart = By.cssSelector("td[class=\"add-to-cart\"] [name=\"addtocart\"]");
    private By addToCart = By.cssSelector("button[class=\"button-2 wishlist-add-to-cart-button\"]");
    private By productName = By.cssSelector("a[class=\"product-name\"]");


    //Variables
    //Constractors
    public HomePage(WebDriver driver) {
        super(driver);
    }
    //Actions

    public HomePage MoveToElement(){
        actions().moveToElement(driver.findElement(moveToElectronics)).perform();;
        click1(selectMobile);
        return new HomePage(driver);
    }

    public HomePage AddToWishlist(){
        click2(addToWishlist);
        return new HomePage(driver);
    }
    public HomePage WishlistCart(){
        click1(wishlistCart);
        return new HomePage(driver);
    }

    public HomePage AddToCart(){
        click1(addToCart);
        return new  HomePage(driver);
    }
    public HomePage CheckAddToCart(){
        click1(checkAddToCart);
        return new HomePage(driver);
    }
    public String getProductNameDisplayed(){
        return driver.findElement(productName).getText();
    }

}

