package sbt.na.soc.network.profile;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class PrivilageMapper {

    public static Privilege getPrivilegeById(long privilegeId, Connection conn) throws SQLException {
        return  null;
    }

    public static Privilege getPrivilegeByAttributes(int categoty, long objectId, Connection conn) throws SQLException {
        return  null;
    }

    public static boolean savePrivilege(Privilege privilege, Connection conn) throws Exception {
        return false;
    }

    public static List<Privilege> getPrivilegeListForRole(long roleId, Connection conn) throws SQLException {
        return null;
    }

    private static boolean updatePrivilege(Privilege privilege, Connection conn) throws SQLException {
        return false;
    }

    public static boolean deletePrivilege(long privilegeId, Connection conn) throws SQLException {
        return false;
    }

    public static boolean addPrivilegeToRole(long roleId, long privId, Connection conn) throws Exception {
        return false;
    }

    public static boolean removePrivilegeFromRole(long roleId, long privId, Connection conn) throws Exception {
        return false;
    }
}
