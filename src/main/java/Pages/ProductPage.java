package Pages;

import Consts.Consts;

public class ProductPage extends BasePage{
    private static final String BRUSH_MY_TEETH = "//div[@class='h4 grid-view-item__title']";
    private static final String FORMAT_HARDCOVER = "//select[@id='SingleOptionSelector-0']";
    private static final String QUANTITY = "//input[@id='Quantity']";
    private static final String ADD_TO_CART = "//button[@id='AddToCart-product-template']";




    public Boolean openProductPage() {
        webDriver.get(Consts.MAIN_URL);
        return null;
    }




    public static boolean isPageTitleVisible(){
        return elementExists(BRUSH_MY_TEETH);
    }



    public ProductPage clickBookOfMyChoice() {
        clickElementByXpath(BRUSH_MY_TEETH);
        return new ProductPage();


    }
   // public ProductPage chooseHardcover() {
    //    clickElementByXpath(FORMAT_HARDCOVER);
    //    return new ProductPage();


    //}
  //  public ProductPage chooseQuantity() {
   //     clickElementByXpath(QUANTITY);
    //    return new ProductPage();


    //}
    public ProductPage chooseHardcover(String text) {
        sendTextToElementByXpath(FORMAT_HARDCOVER, text);

        return null;
    }


    public ProductPage chooseQuantity(String text) {
        sendTextToElementByXpath(QUANTITY, text);

        return null;
    }

    public CartPage clickAddToCart(){
        clickElementByXpath(ADD_TO_CART);
        return new CartPage();
    }


}
