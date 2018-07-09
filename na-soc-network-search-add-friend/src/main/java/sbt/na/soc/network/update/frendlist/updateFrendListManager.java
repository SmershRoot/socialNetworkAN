package sbt.na.soc.network.update.frendlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.sbt.na.soc.network.models.communication.GroupMessage;
import ru.sbt.na.soc.network.models.communication.Message;
import sbt.na.soc.network.constants.ConstantSystemPrivate;
import sbt.na.soc.network.constants.ConstantsGeneral;
import sbt.na.soc.network.profile.ProfileBasic;

import java.util.ArrayList;
import java.util.List;

public class updateFrendListManager implements updateFrendList {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProfileBasic.class);

    private List<String> errorMessage;

    public updateFrendListManager() {
        this.errorMessage=new ArrayList<>();
    }

    @Override
    public String checkAdd(ProfileBasic profileInitiator, ProfileBasic profile) {
        return null;
    }

    @Override
    public boolean add(ProfileBasic profileInitiator, ProfileBasic profile) {
        return false;
    }

    @Override
    public void remove(ProfileBasic profileInitiator, ProfileBasic profile) {

    }

    @Override
    public void remove(ProfileBasic profileInitiator, List<ProfileBasic> profiles) {

    }

    @Override
    public boolean add(ProfileBasic profileInitiator, ProfileBasic profile, Message message) {
        if(message instanceof GroupMessage){
            errorMessage.add(ConstantsGeneral.ERROR_ADD_FREND_MESSAGE_GROUP);
            LOGGER.error(ConstantSystemPrivate.ERROR_ADD_FREND_MESSAGE_GROUP);
            return false;
        }

        return false;
    }
}
