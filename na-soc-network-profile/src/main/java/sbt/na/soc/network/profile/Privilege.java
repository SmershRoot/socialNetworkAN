package sbt.na.soc.network.profile;

import java.io.Serializable;

public class Privilege extends ProfileObject implements Serializable {
    private int category;
    private long objectId;

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public long getObjectId() {
        return objectId;
    }

    public void setObjectId(long objectId) {
        this.objectId = objectId;
    }
}
