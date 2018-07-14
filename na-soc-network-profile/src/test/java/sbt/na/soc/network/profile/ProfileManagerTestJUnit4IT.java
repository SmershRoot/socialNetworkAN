package sbt.na.soc.network.profile;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.sql.Connection;
import java.sql.SQLException;

public class ProfileManagerTestJUnit4IT {
    private static ProfileBasic profileFrom;

    @BeforeClass
    public static void createProfileFrom(){
        profileFrom=new ProfileBasic();
    }

    @Before
    public void testConnection() throws SQLException {
        try(Connection connection=null) {
            Assertions.assertNull(connection,"Отсутствует подключение к БД");
        }
    }

    @Test
    public void TestProfileClass() throws Exception {
        try(Connection connection=null){
            Privilege privilege=new Privilege();
            privilege.setCategory(1);
            privilege.setObjectId(1);
            privilege.setName("test");
            privilege.setNotes("test");

            Assert.assertTrue("Сохранение привелегии вернуло false",PrivilageMapper.savePrivilege(privilege,connection));

            Assert.assertNotNull("Получение привелеги по ИД="+privilege.getId()+" вернуло Null",
                    PrivilageMapper.getPrivilegeById(privilege.getId(),connection));

        }


    }


}
