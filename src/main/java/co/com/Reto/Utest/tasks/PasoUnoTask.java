package co.com.Reto.Utest.tasks;

import co.com.Reto.Utest.userinterface.PasoUnoPage;

import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;


public class PasoUnoTask implements Task {
    private String strNombre;
    private String strApellido;
    private String strEmail;
    private String strMes;
    private String strDia;
    private String strAno;
    private String strCity;
    private String strZip;
    private String strPassword;
    private String strConfirmPass;

    public PasoUnoTask(String strNombre,String strApellido,String strEmail,String strMes,String strDia,String strAno,String strCity,String strZip,String strPassword,String strConfirmPass) {
        this.strNombre = strNombre;
        this.strApellido= strApellido;
        this.strEmail=strEmail;
        this.strMes=strMes;
        this.strDia=strDia;
        this.strAno=strAno;
        this.strCity=strCity;
        this.strZip=strZip;
        this.strPassword=strPassword;
        this.strConfirmPass=strConfirmPass;
    }

    public static PasoUnoTask onThe(String srtNombre,String strApellido,String strEmail,String strMes,String strDia,String strAno,String strCity,String strZip,String strPassword, String strConfirmPass) {
        return Tasks.instrumented(PasoUnoTask.class,srtNombre,strApellido,strEmail,strMes,strDia,strAno,strCity,strZip,strPassword,strConfirmPass);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strNombre).into(PasoUnoPage.INPUT_NAME));

        actor.attemptsTo(Enter.theValue(strApellido).into(PasoUnoPage.INPUT_APELLIDO));

        actor.attemptsTo(Enter.theValue(strEmail).into(PasoUnoPage.INPUT_EMAIL),
              SelectFromOptions.byVisibleText(strMes).from(PasoUnoPage.INPUT_MES),
                SelectFromOptions.byVisibleText(strDia).from(PasoUnoPage.INPUT_DIA),

                SelectFromOptions.byVisibleText(strAno).from(PasoUnoPage.INPUT_ANO),
                Click.on(PasoUnoPage.BUTTON_GO)
             );


        actor.attemptsTo(   Enter.theValue(strCity).into(PasoUnoPage.INPUT_CITY),
                Enter.theValue(strCity).into(PasoUnoPage.INPUT_CITY).thenHit(Keys.DOWN).thenHit(Keys.ENTER)


        );
        actor.attemptsTo(  Enter.theValue(strZip).into(PasoUnoPage.INPUT_ZIP));
        actor.attemptsTo(Click.on(PasoUnoPage.BUTTON_PASS));
        actor.attemptsTo(Click.on(PasoUnoPage.BUTTON_PASS2));
        actor.attemptsTo(Enter.theValue(strPassword).into(PasoUnoPage.INPUT_CLAVE));
        actor.attemptsTo(Enter.theValue(strConfirmPass).into(PasoUnoPage.INPUT_CONFIRM),
                Click.on(PasoUnoPage.CHECK_2),
                Click.on(PasoUnoPage.CHEKC_1)

        );
        actor.attemptsTo(   Click.on(PasoUnoPage.BUTTON_FINAL));
        if (Visibility.of(PasoUnoPage.INPUT_ANO).viewedBy(actor).asBoolean())
        actor.attemptsTo(  Enter.theValue(strZip).into(PasoUnoPage.INPUT_ZIP));
        if (Visibility.of(PasoUnoPage.INPUT_ANO).viewedBy(actor).asBoolean())
            actor.attemptsTo(  Enter.theValue(strZip).into(PasoUnoPage.INPUT_ZIP));



    }
}
