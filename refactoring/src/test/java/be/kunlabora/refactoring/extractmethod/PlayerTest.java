package be.kunlabora.refactoring.extractmethod;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static java.lang.Math.random;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.assertj.core.api.Assertions.assertThat;

public class PlayerTest {
    private static final double SCORE = random();
    private static final String NAME = randomAlphabetic(5);
    private Player player;

    @Before
    public void setup() {
        player = new Player(NAME, SCORE);
    }

    @Test
    public void test_PrintEndScreen() {
        final OutputStream outputStream = new ByteArrayOutputStream();
        final PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        player.printEndScreen();

        assertThat(outputStream.toString()).isEqualTo("** The Refactoring Game **\n" +
                "**************************\n" +
                "name: " + NAME + "\n" +
                "score: " + SCORE + "\n");
    }
}