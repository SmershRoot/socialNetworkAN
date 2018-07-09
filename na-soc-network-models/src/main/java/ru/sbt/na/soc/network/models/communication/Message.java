package ru.sbt.na.soc.network.models.communication;

import sbt.na.soc.network.profile.ProfileBasic;

import java.util.Date;

/**
 * Интерфейс сообщения.
 *
 * @author Scherbakov_A_A
 */
public interface Message {

    Long getId();

    void setId(Long id);

    /**
     * @return Возвращает содержимое сообщения
     */
    Object getValue();

    /** Задает собержимое сообщения
     * @param value содержимое сообщения
     */
    void setValue(Object value);

    /** Можно ли редактировать сообщение после публикации
     * @return да или нет
     */
    boolean isEditable(ProfileBasic profileBasic);

    Date getDateCreate();

    void setDateCreate(Date dateCreate);

    ProfileBasic getProfileFrom();

    void setProfileFrom(ProfileBasic profileBasic);

}
