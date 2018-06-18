package sbt.na.soc.network.profile;

import java.sql.Connection;
import java.util.List;

//TODO Если нужны будут еще методы - добавляй смело
/**
 * Интерфейс для работы с профилями.
 *
 * @author Scherbakov_A_A
 */
public interface ProfileManagerInterface {
    /**
     * Возвращает все профили
     *
     * @param conn - Коннект к базе
     * @return список профилей
     * @throws Exception - ошибка
     */
    List<ProfileBasic> getProfiles(Connection conn) throws Exception;

    /**
     * Возвращает профиль пользователя по его идентификатору
     *
     * @param id идентификатор пользователя
     * @param conn подключение к БД
     * @return Возвращает профиль пользователя
     * @throws Exception - ошибка
     */
    ProfileBasic getProfileById(long id, Connection conn) throws Exception;

    /**
     * Возвращает профиль пользователя по его наименованию
     *
     * @param login login пользователя
     * @param conn подключение к БД
     * @return Возвращает профиль пользователя
     * @throws Exception - ошибка
     */
    ProfileBasic getProfileByLogin(String login, Connection conn) throws Exception;

    /**
     * Возвращает профили пользователей по его наименованию
     *
     * @param userName имя пользователя
     * @param conn подключение к БД
     * @return Возвращает профиkb пользоватеktq
     * @throws Exception - ошибка
     */
    List<ProfileBasic> getProfileByName(String userName, Connection conn) throws Exception;

    /**
     * Возвращает все профили относящиеся к организации
     *
     * @param orgId - Идентификатор организации
     * @param conn - Коннект к базе
     * @return Возвращает все профили относящиеся к организации
     * @throws Exception - ошибка
     */
    List<ProfileBasic> getProfilesForOrg(Long orgId, Connection conn) throws Exception;

    /**
     * Возвращает все профили имеющие конкретную роль
     *
     * @param roleId - Идентификатор роли
     * @param conn - Коннект к базе
     * @return Возвращает все профили имеющие конкретную роль
     * @throws Exception - ошибка
     */
    List<ProfileBasic> getProfilesForRole(Long roleId, Connection conn) throws Exception;

    /**
     * Возвращает все профили имеющие конкретный статус
     *
     * @param statusId - Идентификатор роли
     * @param conn - Коннект к базе
     * @return Возвращает все профили имеющие конкретный статус
     * @throws Exception - ошибка
     */
    List<ProfileBasic> getProfilesForStatus(Long statusId, Connection conn) throws Exception;

    /**
     * Возвращает все профили имеющие конкретную роль
     *
     * @param profileId - Идентификатор профиля
     * @param conn - Коннект к базе
     * @return Возвращает все профили имеющие конкретную роль
     * @throws Exception - ошибка
     */
    List<Role> getRolesForProfile(Long profileId, Connection conn) throws Exception;

    /**
     * Удаляем профиль
     *
     * @param profileId - Идентификатор профиля
     * @param conn - Коннект к базе
     * @param profileBasicParent - Профиль пользователя который удаляет целевой профиль
     * @throws Exception - ошибка
     */
    void deleteProfile(Long profileId, Connection conn, ProfileBasic profileBasicParent) throws Exception;

    /**
     * Сохраняет новый профиль
     *
     * @param profileBasic - Новый профиль
     * @param conn - Коннект к базе
     * @param profileBasicParent - Профиль пользователя который добавляет целевой профиль
     * @throws Exception - ошибка
     */
    void saveUser(ProfileBasic profileBasic, Connection conn, ProfileBasic profileBasicParent) throws Exception;

    /** Добавляет роль в профиль
     * @param profileBasic Целевой профиль
     * @param role Роль
     * @param conn подключение к БД
     * @param profileBasicParent Профиль пользователя добавляющий роль
     * @throws Exception - ошибка
     */
    void addRoleToProfile(ProfileBasic profileBasic, Role role, Connection conn, ProfileBasic profileBasicParent) throws Exception;

    /** Добавляет список ролей в профиль
     * @param profileBasic Целевой профиль
     * @param roles ССписок ролей которые добавляем
     * @param conn подключение к БД
     * @param profileBasicParent Профиль пользователя добавляющий роль
     * @throws Exception - ошибка
     */
    void addRoleToProfile(ProfileBasic profileBasic, List<Role> roles, Connection conn, ProfileBasic profileBasicParent) throws Exception;

    /** Удаляет роль из профиля
     * @param profileBasic Целевой профиль
     * @param role Роль
     * @param conn подключение к БД
     * @param profileBasicParent Профиль пользователя удаляющиц роль
     * @throws Exception - ошибка
     */
    void removeRoleToProfile(ProfileBasic profileBasic, Role role, Connection conn, ProfileBasic profileBasicParent) throws Exception;

    /** Удаляет список ролей из профиля
     * @param profileBasic Целевой профиль
     * @param role Роль
     * @param conn подключение к БД
     * @param profileBasicParent Профиль пользователя удаляющий роли
     * @throws Exception - ошибка
     */
    void removeRoleToProfile(ProfileBasic profileBasic, List<Role> role, Connection conn, ProfileBasic profileBasicParent) throws Exception;

    /** Возвращает все роли по организации
     * @param org Организация
     * @param conn подключение к БД
     * @return Список ролей
     * @throws Exception - ошибка
     */
    List<Role> getRolesForOrganization(Organization org, Connection conn) throws Exception;

    /** Возвращает все статусы имеющиеся в организации
     * @param org Организация
     * @param conn подключение к БД
     * @return Список статусов
     * @throws Exception - ошибка
     */
    List<Long> getStatusesForOrganization(Organization org, Connection conn) throws Exception;

//TODO По мере развития добавлю методы те что необходимы для функционирования проекта

}
