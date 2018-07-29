package be.kunlabora.war;

import org.apache.commons.lang3.Validate;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

public class Soldier {
    private String name;

    public Soldier(final String name) {
        Validate.isTrue(isNotBlank(name));

        this.name = name;
    }

    String getName() {
        return this.name;
    }
}