package sbt.na.soc.network.profile;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Сфера деятельности.
 * У одного профиля может быть несколько сфер деятельности.
 * У контактной информации также может быть несколько сфер деятельности.
 *
 * @author Scherbakov_A_A
 */
public class FieldOfActivity extends ProfileObject {
    private static final Logger LOGGER = LoggerFactory.getLogger(FieldOfActivity.class);

    public FieldOfActivity() {
        super();
    }

    public FieldOfActivity(long id, String name, String notes) {
        super(id, name, notes);
    }

    public FieldOfActivity(String name, String notes) {
        super(name, notes);
    }
}
