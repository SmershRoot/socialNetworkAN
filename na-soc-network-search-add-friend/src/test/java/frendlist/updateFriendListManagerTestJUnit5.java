package frendlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.sbt.na.soc.network.models.communication.GroupMessage;
import ru.sbt.na.soc.network.models.communication.Message;
import sbt.na.soc.network.constants.ConstantsGeneral;
import sbt.na.soc.network.profile.ProfileBasic;
import sbt.na.soc.network.profile.ProfileManager;
import sbt.na.soc.network.update.frendlist.UpdateFriendListManager;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class updateFriendListManagerTestJUnit5 {
    private static ProfileBasic profileFrom;
    private UpdateFriendListManager updateFriendListManager;

    @BeforeAll
    static void createProfileFrom(){
        profileFrom=new ProfileBasic();

    }

    @BeforeEach
    void TestConnection() {
        updateFriendListManager=new UpdateFriendListManager();
    }

    @Test
    void addFriend(){
        ProfileBasic profileTo = new ProfileBasic();
        Assertions.assertTrue(updateFriendListManager.add(profileFrom,profileTo),
                "Ошибка добавления профиля в список связей");

        List<ProfileBasic> profileBasics=new ArrayList<>();
        profileBasics.add(profileFrom);
        profileBasics.add(profileTo);
        Assertions.assertEquals(0, updateFriendListManager.add(profileFrom, profileBasics).size(), "Ошибка добавления профиля в список связей");

        Message message=new GroupMessage(profileFrom,profileBasics,null);
        updateFriendListManager.add(profileFrom,profileFrom,message);
        Assertions.assertEquals(updateFriendListManager.getErrorMessage().get(0),
                ConstantsGeneral.ERROR_ADD_FREND_MESSAGE_GROUP,
                "Ошибка GroupMessage не получена");

    }

    private List<ProfileBasic> profileBasicsRemove;

    @ParameterizedTest
    @ValueSource(longs = { 1,2,3,4 })
    void TestAll(Long id) {
        ProfileManager profileManager=new ProfileManager();
        ProfileBasic profileBasic=new ProfileBasic();
        profileBasic.setId(id);
        profileBasic.setName("Name-"+id);

        Assertions.assertTrue(updateFriendListManager.add(profileFrom,profileBasic),
                "Ошибка добавления профиля в список связей");

        profileBasicsRemove.add(profileBasic);

        if(id==4){
            updateFriendListManager.remove(profileFrom,profileBasicsRemove);
            for(ProfileBasic profileBasicRemove:profileBasicsRemove){
                Assertions.assertAll(
                        () -> Assertions.assertNotEquals(updateFriendListManager.checkAdd(profileFrom,profileManager.getProfileById(profileBasicRemove.getId())),
                                ConstantsGeneral.ERROR_ADD_FREND_IS_FREND_IN_LIST,
                                "Проверка вернула сообщение о том что Профиль не был удален из Профиля инициатора"),
                        () -> Assertions.assertNotNull(updateFriendListManager.checkAdd(profileFrom,profileManager.getProfileById(profileBasicRemove.getId())),
                                "Проверка вернула ошибку при добавлении Профиля")

                );
            }
        }
    }



}
