package sbt.na.soc.network.profile;

import java.sql.Connection;
import java.util.List;

public class ProfileManager implements ProfileManagerInterface {
//TODO Реализацию создаю только ту что нужна, оставляя множество без реализации. Почти всё, т.к. подключения к базе не реализовано
    public List<ProfileBasic> getProfiles(Connection conn) throws Exception {
        return null;
    }

    public ProfileBasic getProfileById(long id, Connection conn) throws Exception {
        return null;
    }

    public ProfileBasic getProfileById(long id) throws Exception {
        try(Connection connection=null) {
            return getProfileById(id, connection);
        }
    }

    public ProfileBasic getProfileByLogin(String login, Connection conn) throws Exception {
        return null;
    }

    public List<ProfileBasic> getProfileByName(String userName, Connection conn) throws Exception {
        return null;
    }

    public List<ProfileBasic> getProfilesForOrg(Long orgId, Connection conn) throws Exception {
        return null;
    }

    public List<ProfileBasic> getProfilesForRole(Long roleId, Connection conn) throws Exception {
        return null;
    }

    public List<ProfileBasic> getProfilesForStatus(Long statusId, Connection conn) throws Exception {
        return null;
    }

    public List<Role> getRolesForProfile(Long profileId, Connection conn) throws Exception {
        return null;
    }

    public void deleteProfile(Long profileId, Connection conn, ProfileBasic profileBasicParent) throws Exception {

    }

    public void saveUser(ProfileBasic profileBasic, Connection conn, ProfileBasic profileBasicParent) throws Exception {

    }

    public void addRoleToProfile(ProfileBasic profileBasic, Role role, Connection conn, ProfileBasic profileBasicParent) throws Exception {

    }

    public void addRoleToProfile(ProfileBasic profileBasic, List<Role> roles, Connection conn, ProfileBasic profileBasicParent) throws Exception {

    }

    public void removeRoleToProfile(ProfileBasic profileBasic, Role role, Connection conn, ProfileBasic profileBasicParent) throws Exception {

    }

    public void removeRoleToProfile(ProfileBasic profileBasic, List<Role> role, Connection conn, ProfileBasic profileBasicParent) throws Exception {

    }

    public List<Role> getRolesForOrganization(Organization org, Connection conn) throws Exception {
        return null;
    }

    public List<Long> getStatusesForOrganization(Organization org, Connection conn) throws Exception {
        return null;
    }


}
