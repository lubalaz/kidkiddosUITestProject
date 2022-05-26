package Pages;

import Consts.Consts;

public class SignInPage extends BasePage {


    public static final String SIGN_IN_HEADER = "//*[@value='Submit']";




    public boolean isPageTitleVisible() {
        return elementExists(SIGN_IN_HEADER);
    }


}









