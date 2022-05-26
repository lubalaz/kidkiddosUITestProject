import Pages.*;
import Utils.UseCaseBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;
public class MainPageTest extends UseCaseBase {

    private static MainPage mainPage;
    private static final Logger logger = LogManager.getLogger(MainPageTest.class);


    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();


    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();


    }

    @Test
    public void mainPageLoadTest() {
        logger.info(("Main page load test"));

        Boolean success = mainPage.isLogoVisible();
        mainPage.takeScreenshot("MainPageTest");
        assertTrue(success);
    }

    @Test
    public void openContactUsPage() {
        ContactUsPage contactUsPage = mainPage.openContactUsTab();
        boolean isLoaded = contactUsPage.isPageTitleVisible();
        assertTrue(isLoaded);
    }

    @Test
    public void openLoginPage() {
        LoginPage loginPage = mainPage.openLoginIcon();
        boolean isLoaded = loginPage.isPageTitleVisible();
        assertTrue(isLoaded);
    }

    @Test
    public void openSignInPage() {
        LoginPage loginPage = mainPage.openLoginIcon();
        SignInPage signInPage = loginPage.openSignInIcon();
        boolean isLoaded = signInPage.isPageTitleVisible();
        assertTrue(isLoaded);


    }

    @Test
    public void errorTestEmail() {
        LoginPage loginPage = mainPage.openLoginIcon();
        loginPage.populateEmail("QWRRTEYT");
        boolean isLoaded = loginPage.isPageTitleVisible();
        assertTrue(isLoaded);


    }

    @Test
    public void errorTestPassword() {
        LoginPage loginPage = mainPage.openLoginIcon();
        loginPage.populatePassword("123456");
        boolean isLoaded = loginPage.isPageTitleVisible();
        assertTrue(isLoaded);

    }

    @Test
    public void openBooksResultsDropMenu() throws InterruptedException {
        BooksResultsPage booksResultsPage = mainPage.openBooksResultsDropMenu();
        Thread.sleep(2000);
        booksResultsPage.openEnglishOnlyMenu();
        Thread.sleep(2000);
        ProductPage brushMyTeethBook;
        brushMyTeethBook = new ProductPage().clickBookOfMyChoice();
        boolean isLoaded = brushMyTeethBook.isPageTitleVisible();
        assertEquals(true, isLoaded);
    }

    //  @Test
    //  public void changeToHardcover() throws InterruptedException {
    //     BooksResultsPage booksResultsPage = mainPage.openBooksResultsDropMenu();
    //    Thread.sleep(2000);
    //     booksResultsPage.openEnglishOnlyMenu();
    //    Thread.sleep(2000);
    //    new ProductPage().clickBookOfMyChoice();
    //  ProductPage changeHardcover = new ProductPage().chooseHardcover();
    //   boolean isLoaded =changeHardcover.isPageTitleVisible();
    //   assertEquals("HARDCOVER", changeHardcover);
    //  }

    //   @Test
    //  public void changeQuantity() throws InterruptedException {
    //    BooksResultsPage booksResultsPage = mainPage.openBooksResultsDropMenu();
    //   Thread.sleep(2000);
    //    booksResultsPage.openEnglishOnlyMenu();
    //    Thread.sleep(2000);
    //    new ProductPage().clickBookOfMyChoice();
    //    ProductPage chooseQuantity = new ProductPage().chooseQuantity();
    //    boolean isLoaded =chooseQuantity.isPageTitleVisible();
    //    assertEquals(true, isLoaded);
    // }

    @Test
    public void changeToHardcover() throws InterruptedException {
        BooksResultsPage booksResultsPage = mainPage.openBooksResultsDropMenu();
        Thread.sleep(2000);
        booksResultsPage.openEnglishOnlyMenu();
        Thread.sleep(2000);
        new ProductPage().clickBookOfMyChoice();
        ProductPage changeHardcover = new ProductPage().chooseHardcover("HARDCOVER");
        boolean isLoaded = changeHardcover.isPageTitleVisible();
        assertFalse(!isLoaded);
        //Assertions.assertEquals("HARDCOVER", changeHardcover);
    }

    @Test
    public void changeQuantity() throws InterruptedException {
        BooksResultsPage booksResultsPage = mainPage.openBooksResultsDropMenu();
        Thread.sleep(2000);
        booksResultsPage.openEnglishOnlyMenu();
        Thread.sleep(2000);
        new ProductPage().clickBookOfMyChoice();
        Thread.sleep(2000);
        ProductPage changeNumberOfBooks = new ProductPage().chooseQuantity("5");
        boolean isLoaded = changeNumberOfBooks.isPageTitleVisible();
        Assertions.assertEquals("5", changeNumberOfBooks);
        assertNotNull(changeNumberOfBooks);

    }

    @Test
    public void openAddToCartPage() throws InterruptedException {
        BooksResultsPage booksResultsPage = mainPage.openBooksResultsDropMenu();
        Thread.sleep(2000);
        booksResultsPage.openEnglishOnlyMenu();
        Thread.sleep(2000);
        ProductPage brushMyTeethBook;
        new ProductPage().clickBookOfMyChoice();
        CartPage addToCart = new ProductPage().clickAddToCart();
        boolean isLoaded = addToCart.isPageTitleVisible();
        assertEquals(true, isLoaded);
    }

    @Test
    public void changeQuantityOfBooksInCartPage() throws InterruptedException {
        BooksResultsPage booksResultsPage = mainPage.openBooksResultsDropMenu();
        Thread.sleep(2000);
        booksResultsPage.openEnglishOnlyMenu();
        Thread.sleep(2000);
        ProductPage brushMyTeethBook;
        new ProductPage().clickBookOfMyChoice();
        new ProductPage().clickAddToCart();
        ProductPage changeNumberOfBooks1 = new CartPage().chooseCartQuantity("6");
        boolean isLoaded = changeNumberOfBooks1.isPageTitleVisible();
        Assertions.assertEquals("6", changeNumberOfBooks1);
        assertNotNull(changeNumberOfBooks1);

        assertEquals(true, isLoaded);


    }

    @Test
    public void UpdateInCartPage() throws InterruptedException {
        BooksResultsPage booksResultsPage = mainPage.openBooksResultsDropMenu();
        Thread.sleep(2000);
        booksResultsPage.openEnglishOnlyMenu();
        Thread.sleep(2000);
        ProductPage brushMyTeethBook;
        new ProductPage().clickBookOfMyChoice();
        new ProductPage().chooseQuantity("5");
        new ProductPage().clickAddToCart();
        ProductPage changeNumberOfBooks1 = new CartPage().chooseCartQuantity("6");
        changeNumberOfBooks1.isPageTitleVisible();
        Assertions.assertEquals("6", changeNumberOfBooks1);
        CartPage updateCart = new CartPage().clickUpdateCart();
        boolean isLoaded = updateCart.isPageTitleVisible();

        assertNotNull(changeNumberOfBooks1);


        assertEquals(true, isLoaded);


    }

    @Test
    public void totalPriceVerification() throws InterruptedException {
        BooksResultsPage booksResultsPage = mainPage.openBooksResultsDropMenu();
        Thread.sleep(2000);
        booksResultsPage.openEnglishOnlyMenu();
        Thread.sleep(2000);
        ProductPage brushMyTeethBook;
        new ProductPage().clickBookOfMyChoice();
        new ProductPage().chooseQuantity("5");
        new ProductPage().clickAddToCart();
        ProductPage changeNumberOfBooks1 = new CartPage().chooseCartQuantity("6");
        changeNumberOfBooks1.isPageTitleVisible();
        Assertions.assertEquals("6", changeNumberOfBooks1);
        new CartPage().clickUpdateCart();
        CartPage totalPrice = new CartPage().verifyTotal();
        boolean isLoaded = totalPrice.isPageTitleVisible();

        assertNotNull(changeNumberOfBooks1);


        assertEquals(true, isLoaded);


    }
}





