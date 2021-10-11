package co.com.Reto.Utest.tasks;

import co.com.Reto.Utest.userinterface.PasoFinalPage;
import co.com.Reto.Utest.userinterface.PasoUnoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class PasoFinalTask implements Task {

    private String strEmail;
    private String strPassword;

    public PasoFinalTask(String strEmail, String strPassword) {
        this.strEmail = strEmail;
        this.strPassword = strPassword;
    }

    public static PasoFinalTask ThePage(String strEmail, String strPassword) {
        return Tasks.instrumented(PasoFinalTask.class,strEmail,strPassword);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PasoFinalPage.BOTON_INGRESAR));
        actor.attemptsTo(Enter.theValue(strEmail).into(PasoFinalPage.INGRESAR_EMAIL));
        actor.attemptsTo(Enter.theValue(strPassword).into(PasoFinalPage.INGRESAR_PASSWORD));
        actor.attemptsTo(Click.on(PasoFinalPage.BUTON_LOGIN));
    }
}
