package sbt.na.soc.network.profile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * Базовый класс профиля.
 *
 * @author Scherbakov_A_A
 */
public class ProfileBasic extends ProfileObject {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProfileBasic.class);

    private String _login;
    private String _firstName;
    private String _lastName;
    private String _middleName;
    private Long _sex;
    private String _statusText;
    private String _info;
    private List<Long> _idCities;
    private Long idHomeCity;
    private List<Long> _idLanguages;
    private Long _idStatus;
    private List<String> _basePhone;

    private List<Long> _idRoles;
    private List<ContactInfo> _contactInfos;
    private Map<String,String> _otherContacts;
    private List<FieldOfActivity> _fieldOfActivities;
    private List<Organization> _organizations;

    public String get_login() {
        return _login;
    }

    public void set_login(String _login) {
        this._login = _login;
    }

    public List<Organization> get_organizations() {
        return _organizations;
    }

    public void set_organizations(List<Organization> _organizations) {
        this._organizations = _organizations;
    }

    public List<FieldOfActivity> get_fieldOfActivities() {
        return _fieldOfActivities;
    }

    public void set_fieldOfActivities(List<FieldOfActivity> _fieldOfActivities) {
        this._fieldOfActivities = _fieldOfActivities;
    }

    public Map<String, String> get_otherContacts() {
        return _otherContacts;
    }

    public void set_otherContacts(Map<String, String> _otherContacts) {
        this._otherContacts = _otherContacts;
    }

    public List<ContactInfo> getContactInfos() {
        return _contactInfos;
    }

    public void setContactInfos(List<ContactInfo> contactInfos) {
        this._contactInfos = contactInfos;
    }

    public void addContactInfo(ContactInfo contactInfo){
        _contactInfos.add(contactInfo);
    }

    public ProfileBasic() {
        super();
    }

    public ProfileBasic(String name, String notes) {
        super(name, notes);
    }

    public ProfileBasic(long id, String name, String notes) {
        super(id, name, notes);
    }

    public String get_firstName() {
        return _firstName;
    }

    public void set_firstName(String _firstName) {
        this._firstName = _firstName;
    }

    public String get_lastName() {
        return _lastName;
    }

    public void set_lastName(String _lastName) {
        this._lastName = _lastName;
    }

    public String get_middleName() {
        return _middleName;
    }

    public void set_middleName(String _middleName) {
        this._middleName = _middleName;
    }

    public Long get_sex() {
        return _sex;
    }

    public void set_sex(Long _sex) {
        this._sex = _sex;
    }

    public String get_statusText() {
        return _statusText;
    }

    public void set_statusText(String _statusText) {
        this._statusText = _statusText;
    }

    public String get_info() {
        return _info;
    }

    public void set_info(String _info) {
        this._info = _info;
    }

    public List<Long> getIdCities() {
        return _idCities;
    }

    public void setIdCities(List<Long> idCities) {
        this._idCities = idCities;
    }

    public Long getIdhomeCity() {
        return idHomeCity;
    }

    public void setIdhomeCity(Long idhomeCity) {
        this.idHomeCity = idhomeCity;
    }

    public List<Long> getIdLanguages() {
        return _idLanguages;
    }

    public void setIdLanguages(List<Long> idLanguages) {
        this._idLanguages = idLanguages;
    }

    public Long getIdStatus() {
        return _idStatus;
    }

    public void setIdStatus(Long idStatus) {
        this._idStatus = idStatus;
    }

    public List<String> getBasePhone() {
        return _basePhone;
    }

    public void setBasePhone(List<String> basePhone) {
        this._basePhone = basePhone;
    }

    public List<Long> getIdRoles() {
        return _idRoles;
    }

    public void setIdRoles(List<Long> idRoles) {
        this._idRoles = idRoles;
    }
}
