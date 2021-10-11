package co.com.Reto.Utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class PasoUnoPage {

    public static final Target INPUT_NAME = Target.the("INGRESAR NOMBRE EN EL INPUT")
            .located(By.id("firstName"));
    public static final Target INPUT_APELLIDO = Target.the("ingresa Apellido")
            .located(By.name("lastName"));
    public static final Target INPUT_EMAIL = Target.the("ingresa correo")
            .located(By.id("email"));
    public static final Target INPUT_MES = Target.the("ingresa MES")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[1]/select"));
    public static final Target INPUT_DIA = Target.the("ingresa DIA")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[2]/select"));
    public static final Target INPUT_ANO = Target.the("ingresa AÑO")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[3]/select"));
    public static final Target BUTTON_GO = Target.the("GO BUTTON")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a"));
    public static final Target INPUT_CITY = Target.the("ingresa CIUDAD")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[1]/input"));


    public static final Target INPUT_ZIP = Target.the("ingresa ZIP")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[3]/input"));
    public static final Target BUTTON_PASS = Target.the("GO BUTTON")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    public static final Target BUTTON_PASS2 = Target.the("GO BUTTON")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[2]/div/a"));
    public static final Target INPUT_CLAVE = Target.the("INPUT PASS")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[3]/div[1]/input"));
    public static final Target INPUT_CONFIRM = Target.the("GO CONFIRM")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[3]/div[2]/input"));
    public static final Target CHEKC_1 = Target.the("GO CONFIRM")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK_2 = Target.the("GO CONFIRM")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_FINAL = Target.the("GO CONFIRM")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));



}
