package co.com.banistmo.retoautomatizacion.tasks;

import co.com.banistmo.retoautomatizacion.interactions.ValidateNameOfTarifario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DownloadPDF implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ValidateNameOfTarifario.validateNameOfTarifario()
        );
    }
    public static DownloadPDF downloadPDF (){
        return instrumented(DownloadPDF.class);
    }
}
