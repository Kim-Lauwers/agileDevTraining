package be.kunlabora.war;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class SoldierTest {
    @Test
    public void construction_ASoldierMustHaveAName() {
        final Soldier soldier = new Soldier("name");

        assertThat(soldier.getName()).isEqualTo("name");
    }

    @Test
    public void construction_ASoldierMustHaveAName_CannotBeNull() {
        assertThatThrownBy(() -> new Soldier(null).getName())
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("The validated expression is false");
    }

    @Test
    public void construction_ASoldierMustHaveAName_CannotBeEmpty() {
        assertThatThrownBy(() -> new Soldier("").getName())
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("The validated expression is false");
    }

    @Test
    public void construction_ASoldierMustHaveAName_CannotBeBlank() {
        assertThatThrownBy(() -> new Soldier("     ").getName())
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("The validated expression is false");
    }
}