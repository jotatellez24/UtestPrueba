package co.com.Reto.Utest.tasks;

import co.com.Reto.Utest.userinterface.SignupPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class SingUp implements Task {


    public static Performable inthepage() {
        return Tasks.instrumented(SingUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SignupPage.SINGUP_BUTTON));
    }
}
