package be.kunlabora.scorekeeper;

public interface ScoreKeeper {
    void scoreTeamA1();

    void scoreTeamA2();

    void scoreTeamA3();

    void scoreTeamB1();

    void scoreTeamB2();

    void scoreTeamB3();

    String getScore();
}