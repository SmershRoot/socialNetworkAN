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

    private String login;
    private String firstName;
    private String lastName;
    private String middleName;
    private Long sex;
    private String statusText;
    private String info;
    private List<Long> idCities;
    private Long idHomeCity;
    private List<Long> idLanguages;
    private Long idStatus;
    private List<String> basePhone;

    private List<Long> idRoles;
    private List<ContactInfo> contactInfos;
    private Map<String,String> otherContacts;
    private List<FieldOfActivity> fieldOfActivities;
    private List<Organization> organizations;

    public ProfileBasic() {
        super();
    }

    public ProfileBasic(String name, String notes) {
        super(name, notes);
    }

    public ProfileBasic(long id, String name, String notes) {
        super(id, name, notes);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public List<Organization> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(List<Organization> organizations) {
        this.organizations = organizations;
    }

    public List<FieldOfActivity> getFieldOfActivities() {
        return fieldOfActivities;
    }

    public void setFieldOfActivities(List<FieldOfActivity> fieldOfActivities) {
        this.fieldOfActivities = fieldOfActivities;
    }

    public Map<String, String> getOtherContacts() {
        return otherContacts;
    }

    public void setOtherContacts(Map<String, String> otherContacts) {
        this.otherContacts = otherContacts;
    }

    public List<ContactInfo> getContactInfos() {
        return contactInfos;
    }

    public void setContactInfos(List<ContactInfo> contactInfos) {
        this.contactInfos = contactInfos;
    }

    public void addContactInfo(ContactInfo contactInfo){
        contactInfos.add(contactInfo);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Long getSex() {
        return sex;
    }

    public void setSex(Long sex) {
        this.sex = sex;
    }

    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public List<Long> getIdCities() {
        return idCities;
    }

    public void setIdCities(List<Long> idCities) {
        this.idCities = idCities;
    }

    public Long getIdhomeCity() {
        return idHomeCity;
    }

    public void setIdhomeCity(Long idhomeCity) {
        this.idHomeCity = idhomeCity;
    }

    public List<Long> getIdLanguages() {
        return idLanguages;
    }

    public void setIdLanguages(List<Long> idLanguages) {
        this.idLanguages = idLanguages;
    }

    public Long getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Long idStatus) {
        this.idStatus = idStatus;
    }

    public List<String> getBasePhone() {
        return basePhone;
    }

    public void setBasePhone(List<String> basePhone) {
        this.basePhone = basePhone;
    }

    public List<Long> getIdRoles() {
        return idRoles;
    }

    public void setIdRoles(List<Long> idRoles) {
        this.idRoles = idRoles;
    }
}
