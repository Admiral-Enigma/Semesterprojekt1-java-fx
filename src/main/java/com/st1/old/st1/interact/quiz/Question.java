package com.st1.old.st1.interact.quiz;

import java.util.ArrayList;
import java.util.Collection;

public class Question {

    public String getQuestion() {
        return question;
    }

    private final String question;

    public String getCorrectAnswerMessage() {
        return correctAnswerMessage;
    }

    private final String correctAnswerMessage;
    private boolean done = false;

    public Collection<String> getChoices() {
        return choices;
    }

    private final ArrayList<String> choices = new ArrayList<>();
    private final Integer correctChoice;

    public Question(String question, Integer correctChoice) {
        this.question = question;
        this.correctChoice = correctChoice;
        this.correctAnswerMessage = "Ahh ja det var rigtigt";
    }

    public Question(String question, Integer correctChoice, String correctAnswerMessage) {
        this.question = question;
        this.correctChoice = correctChoice;
        this.correctAnswerMessage = correctAnswerMessage;
    }

    public Question addChoice(String choice) {
        this.choices.add(choice);
        return this;
    }

    public boolean isCorrectChoice(Integer selectedChoice) {
        return this.correctChoice == selectedChoice;
    }

    public boolean isDone() {
        return done;
    }


}
