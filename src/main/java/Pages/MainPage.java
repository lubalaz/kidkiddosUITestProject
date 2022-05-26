package Pages;

import Consts.Consts;

public class MainPage extends BasePage {
    private static final String LOGO_IMG = "//img[@itemprop='logo']";
    private static final String CONTACT_US_OPTION = "//a[text()='Contact Us']";
    private static final String LOGIN_ICON = "//*[@class='icon icon-login']";
    private static final String SIGN_IN_ICON = "//*[@value='Sign In']";
    private static final String EMAIL_FIELD = "//*[@type='email']";
    private static final String PASSWORD_FIELD = "//*[@type='password']";
    private static final String BOOKS_BY_LANGUAGE_DROP="//*[@aria-controls='SiteNavLabel-books-by-language']";
    private static final String ENGLISH_ONLY = "//a[text()='English Only']";


    public void navigateToMainPage() {
        webDriver.get(Consts.MAIN_URL);

    }

    public boolean isLogoVisible() {
        Boolean isVisible = elementExists(LOGO_IMG);
        return isVisible;
    }

    public ContactUsPage openContactUsTab() {
        clickElementByXpath(CONTACT_US_OPTION);
        return new ContactUsPage();
    }


    public LoginPage openLoginIcon() {
        clickElementByXpath(LOGIN_ICON);
        return new LoginPage();
    }

    public SignInPage openSignInIcon() {
        clickElementByXpath(SIGN_IN_ICON);
        return new SignInPage();
    }

    public TabsPage populateEmailField() {
        clickElementByXpath(EMAIL_FIELD);
        return new TabsPage();


    }

    public TabsPage pressPasswordField() {
        clickElementByXpath(PASSWORD_FIELD);
        return new TabsPage();
    }

    public BooksResultsPage openBooksResultsDropMenu() {
        clickElementByXpath(BOOKS_BY_LANGUAGE_DROP);
        return new BooksResultsPage();
    }



}




