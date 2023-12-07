package com.st1.interact;

import com.st1.Game;
import com.st1.interact.quiz.Question;
import com.st1.interact.quiz.Quiz;
import com.st1.inventory.items.SMRContainment;

public class PowerPlantMan extends BaseNpc implements HasQuiz {

    private final Quiz quiz;

    public PowerPlantMan() {
        super("Power plant man");

        Question question1 = new Question("Hvad står SMR for?", 0);
        question1
                .addChoice("Små Modulære Reaktorer (Small Modular Reactor).")
                .addChoice("Semi-automatisk Maskine Reaktor (Semi-Automatic Machine Reactor).");

        Question question2 = new Question("Hvor meget energi kan en SMR producere, for at den er kvalificeret som en SMR?", 1, "Jeg er glad for, vi har dig som konsulent! Her er din belønning!");
        question2
                .addChoice("500 megawatt?")
                .addChoice("300 megawatt?");

        this.quiz = new Quiz();
        this.quiz
                .addQuestion(question1)
                .addQuestion(question2);
    }

    @Override
    public Quiz getQuiz() {
        return quiz;
    }

    @Override
    public void onQuizComplete() {
        // Spilleren får Containment vessel ved at besvare quizzen rigtigt.
        SMRContainment containmentvessel = new SMRContainment();
        containmentvessel.setQuantity(1);

        containmentvessel.pickup(Game.context, true);
    }
    public String getImagePath() {return "Powerplantman.png";}


}
