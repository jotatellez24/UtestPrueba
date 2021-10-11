package co.com.Reto.Utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignupPage {

    public static final Target SINGUP_BUTTON = Target.the("BOTON INICIAR A REGISTRAR ")
            .located(By.linkText("Join Today"));
}
