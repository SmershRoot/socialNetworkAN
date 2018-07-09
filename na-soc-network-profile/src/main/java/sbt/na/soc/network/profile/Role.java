package sbt.na.soc.network.profile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Роль пользователя в организации.
 *
 * @author Scherbakov_A_A
 */
public class Role extends ProfileObject {
    private static final Logger LOGGER = LoggerFactory.getLogger(Role.class);

    public final static Long STATUS_CHIEF=1L;
    public final static Long STATUS_WORKER=2L;

    private Organization organization;
    private Long idStatus; //Статус из заранее заданных. Директор и т.д.
    private List<Privilege> privileges;


    public Long getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Long _idStatus) {
        this.idStatus = _idStatus;
    }
    // TODO Права еще должно содержать, но расширении модели идет уже большое. Реализация в случае продолжения работы по этому проекту

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization _organization) {
        this.organization = _organization;
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

    public List<Privilege> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<Privilege> privileges) {
        this.privileges = privileges;
    }
}
