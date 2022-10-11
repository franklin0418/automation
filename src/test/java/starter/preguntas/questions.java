package starter.preguntas;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.questions.Attribute;
import net.serenitybdd.screenplay.questions.Enabled;


public class questions {

    private questions() {
        throw new IllegalStateException("Utility class");
    }
    public static final By EXITOSO =
            By.xpath("//*[contains(text(),'Registration is successful')]");


    public static Question<String> exitoso() {
        return actor -> TextContent.of(EXITOSO).viewedBy(actor).asString();
    }

}
