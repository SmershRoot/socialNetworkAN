package ru.sbt.na.soc.network.models.communication;

import sbt.na.soc.network.profile.ProfileBasic;

import java.util.Date;

public class PrivateMessage implements Message {
    private Long id;
    private Object messageObject;
    private boolean editable=true;
    private Date dateCreate;
    private Date dateModify;
    private ProfileBasic profileTo;
    private ProfileBasic profileFrom;

    public PrivateMessage(ProfileBasic profileFrom,ProfileBasic profileTo, Object messageObject) {
       this.profileFrom=profileFrom;
       this.profileTo=profileTo;
       this.messageObject=messageObject;
       //....
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
    } public void setEditable(boolean editable){
        this.editable=editable;
    }

    public boolean isEditable(ProfileBasic profileBasic) {
        if(profileBasic.getId().equals(profileFrom.getId())){
            return editable;
        }
        return false;
    }



    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate=dateCreate;
    }

    public Date getDateModify() {
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

    public ProfileBasic getProfileTo() {
        return profileTo;
    }

    public void setProfileTo(ProfileBasic profileTo) {
        this.profileTo = profileTo;
    }
}
