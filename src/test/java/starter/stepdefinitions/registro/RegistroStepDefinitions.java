package starter.stepdefinitions.registro;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import starter.preguntas.questions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class RegistroStepDefinitions {


public static final Target BOTONREGISTRO =
        Target.the("boton de registro").located(By.xpath("/html/body/my-app/header/nav/div/my-login/div/form/a"));

    public static final Target EXITOSO =
            Target.the("registrar").located(By.xpath("/html/body/my-app/div/main/my-register/div/div/form/div[6]"));

    public static final Target LOGIN =
            Target.the("login").located(By.xpath("//*[@id='username']"));

    public static final Target NOMBRE =
            Target.the("nombre").located(By.xpath("//*[@id='firstName']"));

    public static final Target APELLIDO =
            Target.the("apellido").located(By.xpath("//*[@id='lastName']"));

    public static final Target PASWORD =
            Target.the("pasword").located(By.xpath("//*[@id='password']"));

    public static final Target CONFIRPASWORD =
            Target.the("confirpasword").located(By.xpath("//*[@id='confirmPassword']"));

    public static final Target REGISTRAR =
            Target.the("registrar").located(By.xpath("/html/body/my-app/div/main/my-register/div/div/form/button"));
    @Dado("que {actor} desea registrarse en el portal buggy cars")
public void que_franklin_desea_registrarse_en_el_portal_buggy_cars(Actor actor) {

        actor.wasAbleTo(Open.url("https://buggy.justtestit.org/"));
        actor.attemptsTo(Click.on(BOTONREGISTRO));
}
    @Cuando("se ingrese los datos solicitados")
    public void se_ingrese_los_datos_solicitados() {

        theActorInTheSpotlight().attemptsTo(
                Enter.theValue("franklin18").into(LOGIN),
                Enter.theValue("franklin").into(NOMBRE),
                Enter.theValue("muñoz").into(APELLIDO),
                Enter.theValue("Mayra_0717").into(PASWORD),
                Enter.theValue("Mayra_0717").into(CONFIRPASWORD),
                WaitUntil.the(REGISTRAR, isVisible())
                        .forNoMoreThan(120).seconds(),
                Click.on(REGISTRAR)
        );

    }
    @Entonces("el registro se ha realizado correctamente")
    public void el_registro_se_ha_realizado_correctamente() {

        theActorInTheSpotlight().should(
                seeThat("Muestra respuesta exitosa", questions.exitoso().containsString("Registration is successful"))
        );

    }
}
