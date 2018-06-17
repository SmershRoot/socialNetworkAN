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
    private Long _idStatus; //Статус из заранее заданных. Директор и т.д.

    public Long get_idStatus() {
        return _idStatus;
    }

    public void set_idStatus(Long _idStatus) {
        this._idStatus = _idStatus;
    }
    // TODO Права еще должно содержать, но расширении модели идет уже большое. Реализация в случае продолжения работы по этому проекту

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
