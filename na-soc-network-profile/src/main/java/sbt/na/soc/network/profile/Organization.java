package sbt.na.soc.network.profile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Organization extends ProfileObject {
    private static final Logger LOGGER = LoggerFactory.getLogger(Organization.class);

    public Organization() {
        super();
    }

    public Organization(long id, String name, String notes) {
        super(id, name, notes);
    }

    public Organization(String name, String notes) {
        super(name, notes);
    }
}
