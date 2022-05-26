package Pages;

import org.checkerframework.checker.units.qual.C;

public class ContactUsPage extends BasePage{
    public static final String CONTACT_US_HEADER = "//h1[text()='Contact us']";

    public boolean isPageTitleVisible(){
       return elementExists(CONTACT_US_HEADER);

    }
}
