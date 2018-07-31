package be.kunlabora.tennis;

public interface TennisGame {
    void wonPoint(final String playerName);

    String getScore();
}