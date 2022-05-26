import Pages.*;
import Pages.LoginPage;
import Utils.UseCaseBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;


import static com.sun.org.apache.xalan.internal.xsltc.compiler.sym.error;
import static org.junit.jupiter.api.Assertions.*;

public class LoginPageTest extends UseCaseBase {



    private static LoginPage loginPage;
    private static final Logger logger = LogManager.getLogger(LoginPageTest.class);

    @BeforeAll
    public static void classSetup() {
        loginPage = new LoginPage();
    }


        @BeforeEach
        public void beforeTest(){
           loginPage.navigateToLoginPage();


        }




    }










