package be.kunlabora.dicegame;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class DiceGameTest {
    @Test
    public void playGame() {
        assertThatThrownBy(() -> new DiceGame().playGame())
                .isInstanceOf(UnsupportedOperationException.class)
                .hasMessage("In order to play this game,  you have to build it first. #BuildPlay");
    }
}