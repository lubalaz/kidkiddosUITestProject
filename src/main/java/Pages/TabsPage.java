package Pages;

public class TabsPage extends BasePage{

    private static final String SIGN_IN_ICON = "//*[@value='Sign In']";
    private static final String EMAIL_FIELD = "//*[@type='email']";
    private static final String PASSWORD_FIELD = "//*[@type='password']";




    public SignInPage openSignInIcon() {
        clickElementByXpath(SIGN_IN_ICON);
        return new SignInPage();
    }



}
