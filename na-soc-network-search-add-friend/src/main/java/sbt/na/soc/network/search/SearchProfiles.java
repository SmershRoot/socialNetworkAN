package sbt.na.soc.network.search;

import sbt.na.soc.network.profile.ProfileBasic;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

public interface SearchProfiles {

    /** Поиск профилей на основе заданных условий
     * @param profileInitiator Инициатор запроса на поиск
     * @param parameters Параметры для поиска
     * @param conn Коннектион к базе
     * @return Профили удовлетворяющие условиям
     * @throws Exception Ошибка
     */
    List<ProfileBasic> search(ProfileBasic profileInitiator, Map<Object,Object> parameters, Connection conn) throws Exception;

    /** Поиск профилей на основе заданных условий. Без инициатора. Позже может быть убран.
     * Считаю не корректным такой поиск на уровне клиентской части, но сам функционал имеет право на жизнь.
     *
     * @param parameters Параметры для поиска
     * @param conn Коннектион к базе
     * @return Профили удовлетворяющие условиям
     * @throws Exception Ошибка
     */
    @Deprecated
    List<ProfileBasic> search(Map<Object,Object> parameters, Connection conn) throws Exception;

    /** Поиск профилей из массива профилей на основе заданных условий
     * @param profileInitiator Инициатор запроса на поиск
     * @param profiles Массив профилей
     * @param parameters Параметры для поиска
     * @param conn Коннектион к базе
     * @return Профили удовлетворяющие условиям
     * @throws Exception Ошибка
     */
    List<ProfileBasic> search(ProfileBasic profileInitiator, List<ProfileBasic> profiles, Map<Object,Object> parameters, Connection conn) throws Exception;

    /** Поиск профилей из массива профилей на основе заданных условий. Без инициатора. Позже может быть убран.
     * Считаю не корректным такой поиск на уровне клиентской части, но сам функционал имеет право на жизнь
     *
     * @param profiles Массив профилей
     * @param parameters Параметры для поиска
     * @param conn Коннектион к базе
     * @return Профили удовлетворяющие условиям
     * @throws Exception Ошибка
     */
    @Deprecated
    List<ProfileBasic> search(List<ProfileBasic> profiles, Map<Object,Object> parameters, Connection conn) throws Exception;

}
