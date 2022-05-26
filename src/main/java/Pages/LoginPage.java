package Pages;

import Consts.Consts;

public class LoginPage  extends BasePage {
    private static final String SIGN_IN_ICON = "//*[@value='Sign In']";


    public static final String LOGIN_HEADER = "//h1[text()='Login']";
    private static final String EMAIL_FIELD = "//*[@type='email']";
    private static final String PASSWORD_FIELD = "//*[@type='password']";


    public boolean isPageTitleVisible() {
        return elementExists(LOGIN_HEADER);

    }

    public Boolean navigateToLoginPage() {
        webDriver.get(Consts.MAIN_URL);
        return null;
    }


    public void populateEmail(String text) {
        sendTextToElementByXpath(EMAIL_FIELD, text);

    }


    public LoginPage populatePassword(String text) {
        sendTextToElementByXpath(PASSWORD_FIELD, text);

        return null;
    }








    public SignInPage openSignInIcon() {
        clickElementByXpath(SIGN_IN_ICON);
        return new SignInPage();
    }



}


