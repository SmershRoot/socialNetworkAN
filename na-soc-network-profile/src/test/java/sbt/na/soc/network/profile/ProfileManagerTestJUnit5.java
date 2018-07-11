package sbt.na.soc.network.profile;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

class ProfileManagerTestJUnit5 {
    private ProfileManager profileManager;

    @BeforeAll
    void beforeTestAll(){
        profileManager = new ProfileManager();
    }


    @BeforeEach
    void TestConnection() throws SQLException{
        try(Connection connection=null) {
            Assertions.assertNull(connection,"Отсутствует подключение к БД");
        }
    }

    @Test
    @DisplayName("Общий класс тестирования Класса")
    void TestAll() throws Exception {
        try(Connection connection=null) {
            List<ProfileBasic> profileBasics = profileManager.getProfiles(connection);
            Assertions.assertNull(profileBasics,"Не удалось получить ни одного Профиля");
            Assertions.assertTrue(profileBasics.size()>0,"Не удалось получить ни одного Профиля");

            ProfileBasic profileBasic = profileBasics.get(0);

            Assertions.assertNull( profileManager.getProfileById(profileBasic.getId()),
                    "Не удалось получить Профиль по ИД="+profileBasic.getId());

            Assertions.assertNull( profileManager.getProfileById(profileBasic.getId(),connection),
                    "Не удалось получить Профиль по ИД="+profileBasic.getId()+" и подключению к БД");

            Assertions.assertNull( profileManager.getProfileByLogin(profileBasic.getLogin(),connection),
                    "Не удалось получить Профиль по Логину="+profileBasic.getLogin()+" и подключению к БД");

            Assertions.assertTrue(profileManager.getProfileByName(profileBasic.getName(),connection).size()>0,
                    "Не удалось получить Профиль по Наименованию="+profileBasic.getName()+" и подключению к БД");

            saveUser(profileBasic);
        }

    }

    private void saveUser(ProfileBasic profileBasic) {
        Throwable thrown = Assertions.assertThrows(Exception.class, () -> {
            profileManager.saveUser(profileBasic,null,null);
        });
        assertNotNull(thrown.getMessage(),"Преднамеренная ошибка не была получена из метода saveUser");
    }

}