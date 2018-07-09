package sbt.na.soc.network.update.frendlist;

import sbt.na.soc.network.profile.ProfileBasic;
import ru.sbt.na.soc.network.models.communication.Message;

import java.util.ArrayList;
import java.util.List;

public interface updateFrendList {

    String checkAdd(ProfileBasic profileInitiator, ProfileBasic profile);

    boolean add (ProfileBasic profileInitiator, ProfileBasic profile);

    void remove (ProfileBasic profileInitiator, ProfileBasic profile);

    default List<String> add (ProfileBasic profileInitiator, List<ProfileBasic> profiles){
        List<String> messages=new ArrayList<>();
        for(ProfileBasic profile:profiles){
            messages.add(checkAdd (profileInitiator, profile));
            add (profileInitiator, profile);
        }
        return messages;
    }

    void remove (ProfileBasic profileInitiator, List<ProfileBasic> profiles);

    boolean add (ProfileBasic profileInitiator, ProfileBasic profile, Message message);
}
