package co.com.banistmo.retoautomatizacion.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.banistmo.retoautomatizacion.userinterfaces.BanistmoTarifarioPage.NAME_OF_DOCUMENT;
import static co.com.banistmo.retoautomatizacion.userinterfaces.BanistmoTarifarioPage.PDF_DOWNLOAD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidateNameOfTarifario implements Interaction {
    private String nametarifario;
    private String validatetarifario = "Tarifas de Cuentas de Depósitos";


    @Override
    public <T extends Actor> void performAs(T actor) {
        nametarifario = NAME_OF_DOCUMENT.resolveFor(actor).getText();
        if (nametarifario==validatetarifario){
            actor.attemptsTo(Click.on(PDF_DOWNLOAD));
        }
    }

    public static ValidateNameOfTarifario validateNameOfTarifario (){
        return instrumented(ValidateNameOfTarifario.class);
    }
}
