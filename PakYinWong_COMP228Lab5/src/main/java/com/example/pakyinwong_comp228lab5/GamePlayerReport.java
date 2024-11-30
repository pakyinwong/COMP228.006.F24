package com.example.pakyinwong_comp228lab5;

import java.time.LocalDate;

public class GamePlayerReport {
    private String gameTitle;
    private String firstName;
    private String lastName;
    private int score;
    LocalDate playing_date;

    public GamePlayerReport(String gameTitle, String firstName, String lastName, int score, LocalDate playing_date) {
        this.gameTitle = gameTitle;
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
        this.playing_date = playing_date;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getScore() {
        return score;
    }

    public LocalDate getPlayingDate() {
        return playing_date;
    }
}
