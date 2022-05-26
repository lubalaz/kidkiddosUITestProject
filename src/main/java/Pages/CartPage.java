package Pages;

import Consts.Consts;

public class CartPage extends BasePage{

    private static final String YOUR_CART = "//h1[text()='Your cart']";
    private static final String YOUR_CART_QUANTITY = "//input[@class='cart__qty-input']";
    private static final String UPDATE_CART = "//input[@class='btn btn--secondary cart__update cart__update--large small--hide']";
    private static final String TOTAL_PRICE = "//span[@class='cbb-price-digits']";




    public boolean isPageTitleVisible() {

        return elementExists(YOUR_CART);


    }




    public Boolean navigateToCartPage() {
        webDriver.get(Consts.MAIN_URL);
        return null;
    }



    public ProductPage chooseCartQuantity(String text) {
        sendTextToElementByXpath(YOUR_CART_QUANTITY, "6");

        return null;
    }
    public CartPage clickUpdateCart(){
        clickElementByXpath(UPDATE_CART);
        return new CartPage();
    }
    public CartPage verifyTotal(){
        clickElementByXpath(TOTAL_PRICE);
        return new CartPage();
    }
}
