package sbt.na.soc.network.profile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Роль пользователя в организации.
 *
 * @author Scherbakov_A_A
 */
public class Role extends ProfileObject {
    private static final Logger LOGGER = LoggerFactory.getLogger(Role.class);

    private Organization _organization;

    public Organization get_organization() {
        return _organization;
    }

    public void set_organization(Organization _organization) {
        this._organization = _organization;
    }

    public Role() {
        super();
    }

    public Role(long id, String name, String notes) {
        super(id, name, notes);
    }

    public Role(String name, String notes) {
        super(name, notes);
    }
}
