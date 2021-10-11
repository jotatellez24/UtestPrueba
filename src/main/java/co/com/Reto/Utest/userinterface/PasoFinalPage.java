package co.com.Reto.Utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PasoFinalPage {
    public static final Target BOTON_INGRESAR = Target.the("CLICK AL BOTON INGRESAR")
            .located(By.xpath(" /html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[1]/a"));

    public static final Target INGRESAR_EMAIL = Target.the("INGRESAR EMAIL")
            .located(By.id("username"));
    public static final Target INGRESAR_PASSWORD = Target.the("INGRESAR PASSWORD")
            .located(By.id("password"));
    public static final Target BUTON_LOGIN = Target.the("BOTON LOGIN")
            .located(By.id("kc-login"));




}
