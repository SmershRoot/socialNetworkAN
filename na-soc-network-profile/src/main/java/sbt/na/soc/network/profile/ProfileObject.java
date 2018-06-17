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

    private long _id;
    private String _name;
    private String _notes;
    private Date _dateCreate;
    private Date _dateChange;
    private String _userCreator;
    private String _userChanged;

    ProfileObject() {
    }

    ProfileObject(long id, String name, String notes) {
        this._id = id;
        this._name = (name != null) ? name : "";
        this._notes = notes;
    }

    ProfileObject(String name, String notes) {
        this._id = Long.MIN_VALUE; //TODO реализовать получение ИД из базы в модуле Tools
        this._name = name;
        this._notes = notes;
    }

    public Long get_id() {
        if (_id==Long.MIN_VALUE) {
            LOGGER.error("Иденификатор не установлен");
            return null;
        }
        return _id;
    }

    public String get_name() {
        return _name;
    }

    public String get_notes() {
        return _notes;
    }

    public Date get_dateCreate() {
        return _dateCreate;
    }

    public Date get_dateChange() {
        return _dateChange;
    }

    public String get_userCreator() {
        return _userCreator;
    }

    public String get_userChanged() {
        return _userChanged;
    }

    public void set_id(Long id) {
        this._id = (id!=null)?id:Long.MIN_VALUE;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public void set_notes(String _notes) {
        this._notes = _notes;
    }

    public void set_dateCreate(Date _dateCreate) {
        this._dateCreate = _dateCreate;
    }

    public void set_dateChange(Date _dateChange) {
        this._dateChange = _dateChange;
    }

    public void set_userCreator(String _userCreator) {
        this._userCreator = _userCreator;
    }

    public void set_userChanged(String _userChanged) {
        this._userChanged = _userChanged;
    }
}
