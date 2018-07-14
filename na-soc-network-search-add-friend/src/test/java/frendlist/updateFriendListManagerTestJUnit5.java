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
import sbt.na.soc.network.update.frendlist.UpdateFrendList;
import sbt.na.soc.network.update.frendlist.UpdateFriendListManager;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class updateFriendListManagerTestJUnit5 {
    private static ProfileBasic mockProfileFrom;
    private static ProfileBasic mockProfileTo;
    private static UpdateFrendList mockUpdateFriendList;
    private UpdateFriendListManager updateFriendListManager;

    private ProfileBasic profileFrom;
    private ProfileBasic profileTo;

    @BeforeAll
    static void createProfileFrom(){
        mockProfileFrom = mock( ProfileBasic.class );
        mockProfileTo = mock( ProfileBasic.class );
        mockUpdateFriendList = mock( UpdateFriendListManager.class );
    }

    @BeforeEach
    void TestBeforeTests() {
        updateFriendListManager=new UpdateFriendListManager();
    }

    @Test
    void addFriend(){
        ProfileBasic profileTo = new ProfileBasic();
        Assertions.assertTrue(updateFriendListManager.add(profileFrom,profileTo),
                "Ошибка добавления профиля в список связей");
        verify(mockUpdateFriendList).checkAdd(profileFrom, profileTo);

        when(updateFriendListManager.getErrorMessage().size()).thenReturn(0);
    }

    @Test
    void addFriends(){
        List<ProfileBasic> profileBasics=new ArrayList<>();
        profileBasics.add(profileFrom);
        profileBasics.add(profileTo);
        Assertions.assertEquals(0, updateFriendListManager.add(profileFrom, profileBasics).size(), "Ошибка добавления массива профилей в список связей");

        for(ProfileBasic profileBasic: profileBasics){
            verify(mockUpdateFriendList).checkAdd(profileFrom, profileBasic);
        }
        verify(mockUpdateFriendList, times(2)).checkAdd(any(), any());
    }

    @Test
    void addFriendErrorGroupMessage(){
        List<ProfileBasic> profileBasics=new ArrayList<>();
        profileBasics.add(profileFrom);
        profileBasics.add(profileTo);
        Message message=new GroupMessage(profileFrom,profileBasics,null);
        updateFriendListManager.add(profileFrom,profileFrom,message);
        Assertions.assertEquals(updateFriendListManager.getErrorMessage().get(0),
                ConstantsGeneral.ERROR_ADD_FREND_MESSAGE_GROUP,
                "Ошибка GroupMessage не получена");
    }


    private List<ProfileBasic> profileBasicsRemove=new ArrayList<>();

    @ParameterizedTest
    @ValueSource(longs = { 1,2,3,4 })
    void TestAll(Long id) {
        ProfileManager profileManager=new ProfileManager();
        ProfileBasic profileBasic=new ProfileBasic();
        profileBasic.setId(id);
        profileBasic.setName("Name-"+id);

        Assertions.assertTrue(mockUpdateFriendList.add(profileFrom,profileBasic),
                "Ошибка добавления профиля в список связей");

        profileBasicsRemove.add(profileBasic);

        if(id==4){
            mockUpdateFriendList.remove(profileFrom,profileBasicsRemove);
            for(ProfileBasic profileBasicRemove:profileBasicsRemove){
                Assertions.assertAll(
                        () -> Assertions.assertNotEquals(mockUpdateFriendList.checkAdd(profileFrom,profileManager.getProfileById(profileBasicRemove.getId())),
                                ConstantsGeneral.ERROR_ADD_FREND_IS_FREND_IN_LIST,
                                "Проверка вернула сообщение о том что Профиль не был удален из Профиля инициатора"),
                        () -> Assertions.assertNotNull(mockUpdateFriendList.checkAdd(profileFrom,profileManager.getProfileById(profileBasicRemove.getId())),
                                "Проверка вернула ошибку при добавлении Профиля")
                );

            }
        }

        verify(mockUpdateFriendList,atMost(profileBasicsRemove.size())).remove(any(), (ProfileBasic) any());
    }



}
