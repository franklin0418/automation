package starter.stepdefinitions.registro;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroStepDefinitions {


public static final Target BOTONREGISTRO =
        Target.the("boton de registro").located(By.xpath("/html/body/my-app/header/nav/div/my-login/div/form/a"));

    public static final Target LOGIN =
            Target.the("login").located(By.xpath("//*[@id='username']"));

    public static final Target NOMBRE =
            Target.the("nombre").located(By.xpath("//*[@id='firstName']"));

    public static final Target APELLIDO =
            Target.the("apellido").located(By.xpath("//*[@id='lastName']"));

    public static final Target PASWORD =
            Target.the("pasword").located(By.xpath("//*[@id='password']"));

    public static final Target CONFIRPASWORD =
            Target.the("confirpasword").located(By.xpath("/html/body/my-app/div/main/my-register/div"));
    @Dado("que {actor} desea registrarse en el portal buggy cars")
public void que_franklin_desea_registrarse_en_el_portal_buggy_cars(Actor actor) {

        actor.wasAbleTo(Open.url("https://buggy.justtestit.org/"));
        actor.attemptsTo(Click.on(BOTONREGISTRO));
}
    @Cuando("se ingrese los datos solicitados")
    public void se_ingrese_los_datos_solicitados() {

        theActorInTheSpotlight().attemptsTo(Enter.theValue("franklin18").into(LOGIN));
        theActorInTheSpotlight().attemptsTo(Enter.theValue("franklin").into(NOMBRE));
        theActorInTheSpotlight().attemptsTo(Enter.theValue("muñoz").into(APELLIDO));
        theActorInTheSpotlight().attemptsTo(Enter.theValue("Mayra_0717").into(PASWORD));
        theActorInTheSpotlight().attemptsTo(Enter.theValue("Mayra_0717").into(CONFIRPASWORD));

    }
    @Entonces("se debe crear el usuario correctamente")
    public void se_debe_crear_el_usuario_correctamente() {

    }
}
