package co.com.Reto.Utest.stepdefinitions;

import co.com.Reto.Utest.model.PasoUnoData;
import co.com.Reto.Utest.tasks.OpenUp;
import co.com.Reto.Utest.tasks.PasoFinalTask;
import co.com.Reto.Utest.tasks.PasoUnoTask;
import co.com.Reto.Utest.tasks.SingUp;
import cucumber.api.java.Before;
import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.util.List;

public class StepDefinition {
    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast());}
    @Dado("^que el estudiante quiera registrarse$")
    public void queElEstudianteQuieraRegistrarse() {
        OnStage.theActorCalled("estudiante").wasAbleTo(OpenUp.thePage(),(SingUp.inthepage()));
    }


    @Cuando("^se registra con la informacion requerida para el registro$")
    public void seRegistraConLaInformacionRequeridaParaElRegistro(List<PasoUnoData> pasoUnoData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(PasoUnoTask.onThe(pasoUnoData.get(0).getSrtNombre(),pasoUnoData.get(0).getStrApellido(),pasoUnoData.get(0).getStrEmail(),pasoUnoData.get(0).getStrMes(),
                pasoUnoData.get(0).getStrDia(),pasoUnoData.get(0).getStrAno(),pasoUnoData.get(0).getStrCity(),pasoUnoData.get(0).getStrZip(),pasoUnoData.get(0).getStrPassword(),pasoUnoData.get(0).getStrConfirmPass()));

    }

    @Entonces("^el debe finalizar el proceso$")
    public void elDebeFinalizarElProceso(List<PasoUnoData> pasoUnoData) throws Exception {
 OnStage.theActorInTheSpotlight().attemptsTo(OpenUp.thePage(),
         PasoFinalTask.ThePage(pasoUnoData.get(0).getStrEmail(),pasoUnoData.get(0).getStrPassword()));
    }



}
