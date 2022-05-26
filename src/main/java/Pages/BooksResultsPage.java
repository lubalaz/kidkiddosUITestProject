package Pages;

import Consts.Consts;

public class BooksResultsPage extends BasePage {
    private static final String ENGLISH_ONLY = "//a[text()='English Only']";

    private static final String BOOKS_BY_LANGUAGE_DROP = "//*[@class='site-nav__link site-nav__link--main']";


    public static boolean isPageTitleVisible() {
        return elementExists(ENGLISH_ONLY);

    }


    public Boolean navigateToBooksResultsPage() {
        webDriver.get(Consts.MAIN_URL);
        return null;
    }

    public BooksResultsPage openEnglishOnlyMenu() {
        clickElementByXpath(ENGLISH_ONLY);
        return new BooksResultsPage();

    }


}
