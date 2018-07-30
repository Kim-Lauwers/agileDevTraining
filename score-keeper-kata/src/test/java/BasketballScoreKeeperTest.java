import be.kunlabora.scorekeeper.BasketballScoreKeeper;
import be.kunlabora.scorekeeper.ScoreKeeper;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BasketballScoreKeeperTest {
    @Test
    public void scoreKeeper_getScore_Default() {
        final ScoreKeeper scoreKeeper = new BasketballScoreKeeper();

        assertThat(scoreKeeper.getScore()).isEqualTo("000:000");
    }
}