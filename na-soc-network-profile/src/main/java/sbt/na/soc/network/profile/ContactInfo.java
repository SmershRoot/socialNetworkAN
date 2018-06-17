package sbt.na.soc.network.profile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * Контактная информация для профиля.
 * У одного профиля может быть несколько контактов, например в других городах компаньоны, если профиль организации.
 *
 * @author Scherbakov_A_A
 */
public class ContactInfo extends ProfileObject {
    private static final Logger LOGGER = LoggerFactory.getLogger(ContactInfo.class);

    private String _city;
    private String _contactPhone;
    private String _webSite;
    private Map<String,String> _otherContacts;
    private ProfileBasic _profileBasicSub;
    private List<FieldOfActivity> _fieldOfActivities;

    public List<FieldOfActivity> get_fieldOfActivities() {
        return _fieldOfActivities;
    }

    public void set_fFieldOfActivities(List<FieldOfActivity> _fFieldOfActivities) {
        this._fieldOfActivities = _fFieldOfActivities;
    }

    public String get_city() {
        return _city;
    }

    public void set_city(String _city) {
        this._city = _city;
    }

    public String get_contactPhone() {
        return _contactPhone;
    }

    public void set_contactPhone(String _contactPhone) {
        this._contactPhone = _contactPhone;
    }

    public String get_webSite() {
        return _webSite;
    }

    public void set_webSite(String _webSite) {
        this._webSite = _webSite;
    }

    public Map<String, String> get_otherContacts() {
        return _otherContacts;
    }

    public void set_otherContacts(Map<String, String> _otherContacts) {
        this._otherContacts = _otherContacts;
    }

    public ProfileBasic get_profileBasicSub() {
        return _profileBasicSub;
    }

    public void set_profileBasicSub(ProfileBasic _profileBasicSub) {
        this._profileBasicSub = _profileBasicSub;
    }

    public ContactInfo() {
        super();
    }

    public ContactInfo(long id, String name, String notes) {
        super(id, name, notes);
    }

    public ContactInfo(String name, String notes) {
        super(name, notes);
    }
}
