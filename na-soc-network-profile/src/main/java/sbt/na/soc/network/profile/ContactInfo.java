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

    private String city;
    private String contactPhone;
    private String webSite;
    private Map<String,String> otherContacts;
    private ProfileBasic profileBasicSub;
    private List<FieldOfActivity> fieldOfActivities;

    public List<FieldOfActivity> getFieldOfActivities() {
        return fieldOfActivities;
    }

    public void setFieldOfActivities(List<FieldOfActivity> fieldOfActivities) {
        this.fieldOfActivities = fieldOfActivities;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String _city) {
        this.city = city;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String _contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String _webSite) {
        this.webSite = webSite;
    }

    public Map<String, String> getOtherContacts() {
        return otherContacts;
    }

    public void setOtherContacts(Map<String, String> _otherContacts) {
        this.otherContacts = otherContacts;
    }

    public ProfileBasic getProfileBasicSub() {
        return profileBasicSub;
    }

    public void setProfileBasicSub(ProfileBasic profileBasicSub) {
        this.profileBasicSub = profileBasicSub;
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
