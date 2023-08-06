    package pages;

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.support.ui.Select;


    public class RegisterPage  extends PageBase{
        private By registerBtn = By.cssSelector("a[class=\"ico-register\"]");
        //S2: select gender
        private By genderMale = By.id("gender-male");
        private By genderFemale = By.id("gender-female");
        //S3: personal data
        private By firstName = By.id("FirstName");
        private By lastName = By.id("LastName");

        //S4: date of birth
        private By dayOfBirth = By.cssSelector("select[name=\"DateOfBirthDay\"]");
        private By monthOfBirth = By.cssSelector("select[name=\"DateOfBirthMonth\"]");
        private By yearOfBirth = By.cssSelector("select[name=\"DateOfBirthYear\"]");
        // S5:
        private By emailField = By.id("Email");
        private By companyName = By.id("Company");
        //S6: password
        private By password = By.id("Password");
        private By confirmPassword = By.id("ConfirmPassword");

        private By registerBtn2 = By.id("register-button");
        // S7:
        private By continueBtn = By.cssSelector("a[class=\"button-1 register-continue-button\"]");

        public RegisterPage(WebDriver driver) {
            super(driver);
        }
        //Actions

        public void chooseGender(String gender) {
            if (gender.toLowerCase() == "male") {
                driver.findElement(genderMale).click();
            } else if (gender.toLowerCase() == "female") {
                driver.findElement(genderFemale).click();
            } else {
                System.out.println("Invalid Gender");
            }
        }

        public RegisterPage personalData(String FirstName, String LastName, String EmailField){
            driver.findElement(firstName).sendKeys(FirstName);
            driver.findElement(lastName).sendKeys(LastName);
            driver.findElement(emailField).sendKeys(EmailField);
            return new RegisterPage(driver);
        }
        public RegisterPage dateOfBirth(String Day, String Month, String Year){
            Select selectday = new Select(driver.findElement(dayOfBirth));
            selectday.selectByValue(Day);

            Select selectmonth = new Select(driver.findElement(monthOfBirth));
            selectmonth.selectByValue(Month);

            Select selectyear = new Select(driver.findElement(yearOfBirth));
            selectyear.selectByValue(Year);
            return new  RegisterPage(driver);
        }
        public RegisterPage companyName(String CompanyName){
            driver.findElement(companyName).sendKeys(CompanyName);
            return new RegisterPage(driver);
        }
        public RegisterPage passwords(String Password, String ConfirmPassword){
            driver.findElement(password).sendKeys(Password);
            driver.findElement(confirmPassword).sendKeys(ConfirmPassword);
            driver.findElement(registerBtn2).click();
            return new RegisterPage(driver);
        }
        public RegisterPage ClickContinue(){
            driver.findElement(continueBtn).click();
            return new RegisterPage(driver);
        }




    }







