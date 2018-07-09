package ru.sbt.na.soc.network.models.communication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sbt.na.soc.network.profile.*;

import java.sql.Connection;
import java.util.Date;
import java.util.List;

public class GroupMessage implements Message {
    private static final Logger LOGGER = LoggerFactory.getLogger(GroupMessage.class);

    private Long id;
    private Object messageObject;
    private boolean editable=true;
    private Date dateCreate;
    private Date dateModify;
    private List<ProfileBasic> profilesTo;
    private ProfileBasic profileFrom;
    private ProfileManagerInterface profileManager = new ProfileManager();

    public GroupMessage(ProfileBasic profileFrom,List<ProfileBasic> profilesTo, Object messageObject) {
        this.profileFrom=profileFrom;
        this.profilesTo=profilesTo;
        this.messageObject=messageObject;
        //...
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id=id;
    }

    public Object getValue() {
        return messageObject;
    }

    public void setValue(Object value) {
        this.messageObject =value;
    }

    public boolean isEditable(ProfileBasic profileBasic) {
        Connection conn;

        if(profileBasic.getId().equals(profileFrom.getId())){
            return editable;
        }
        try{
            List<Role> roles=profileManager.getRolesForProfile(profileBasic.getId(), null);

            for(Role role:roles){
                Organization org = role.getOrganization();
                Long idStatus = role.getIdStatus();
                if(org!=null && idStatus.equals(Role.STATUS_CHIEF)){
                    return isEditable(getProfileFrom(), org);
                }
            }

        }catch (Exception ex){
            LOGGER.error(ex.getMessage(), ex);
        }finally {

        }
        return false;
    }

    //TODO Надуманный метод реализуется только из-за ошибки в фантазировании, что директор организации может удалять
    //записи людей которые являются представителями его фирмы и только его фирмы и при этом не расширена модель до привилегий
    //которые бы могли помочь в реализации этого
    private boolean isEditable (ProfileBasic profileBasicTo, Organization org){
        try{
            List<Role> roles=profileManager.getRolesForProfile(profileBasicTo.getId(), null);

            for(Role role:roles){
                if(role.getIdStatus().equals(Role.STATUS_WORKER) && role.getOrganization()!=null &&
                        role.getOrganization().getId().equals(org.getId())){
                    return true;
                }
            }
        }catch (Exception ex){
            LOGGER.error(ex.getMessage(), ex);
        }finally {

        }
        return  false;
    }



    public void setEditable(boolean editable){
        this.editable=editable;
    }



    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate=dateCreate;
    }

    public Date get_dateModify() {
        return dateModify;
    }

    public void setDateModify(Date _dateModify) {
        this.dateModify = _dateModify;
    }

    public ProfileBasic getProfileFrom() {
        return profileFrom;
    }

    public void setProfileFrom(ProfileBasic profileBasic) {
        this.profileFrom=profileBasic;
    }

    public List<ProfileBasic> getProfileTo() {
        return profilesTo;
    }

    public void setProfileTo(List<ProfileBasic> profileTo) {
        this.profilesTo = profileTo;
    }
}
