package sbt.na.soc.network.profile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * Объект профиля, содержит общие параметры для всех базовых объектов профиля.
 *
 * @author Scherbakov_A_A
 */
public class ProfileObject {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProfileObject.class);

    private long id;
    private String name;
    private String notes;
    private Date dateCreate;
    private Date dateChange;
    private String userCreator;
    private String userChanged;

    ProfileObject() {
    }

    ProfileObject(long id, String name, String notes) {
        this.id = id;
        this.name = (name != null) ? name : "";
        this.notes = notes;
    }

    ProfileObject(String name, String notes) {
        this.id = Long.MIN_VALUE; //TODO реализовать получение ИД из базы в модуле Tools
        this.name = name;
        this.notes = notes;
    }

    public Long getId() {
        if (id==Long.MIN_VALUE) {
            LOGGER.error("Иденификатор не установлен");
            return null;
        }
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNotes() {
        return notes;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public Date getDateChange() {
        return dateChange;
    }

    public String getUserCreator() {
        return userCreator;
    }

    public String getUserChanged() {
        return userChanged;
    }

    public void setId(Long id) {
        this.id = (id!=null)?id:Long.MIN_VALUE;
    }

    public void setName(String _name) {
        this.name = _name;
    }

    public void setNotes(String _notes) {
        this.notes = _notes;
    }

    public void setDateCreate(Date _dateCreate) {
        this.dateCreate = _dateCreate;
    }

    public void setDateChange(Date _dateChange) {
        this.dateChange = _dateChange;
    }

    public void setUserCreator(String _userCreator) {
        this.userCreator = _userCreator;
    }

    public void setUserChanged(String _userChanged) {
        this.userChanged = _userChanged;
    }
}
