package com.st1.interact;

import com.st1.Game;
import com.st1.interact.quiz.Question;
import com.st1.interact.quiz.Quiz;
import com.st1.inventory.items.SMRPressurizer;
import com.st1.inventory.items.SMRReactorCore;

public class PripyatMan extends BaseNpc implements HasQuiz {

    private final Quiz quiz;

    public PripyatMan() {
        super("PripyatMan");

        Question question0 = new Question("Velkommen. Når du er klar har jeg nogle spørgsmål til dig. Svare du rigtigt har jeg en ting du kan få", 0);
        question0
                .addChoice("Klar!");

        Question question1 = new Question("Hvilken reaktor var involveret i Tjernobyl-ulykken i 1986?", 0);
        question1
                .addChoice("RBMK")
                .addChoice("SMR")
                .addChoice("PWR")
                .addChoice("BWR");

        Question question2 = new Question("Hvornår blev Tjernobyl-atomkraftværket først taget i brug?", 2, "Du ved meget om vores historie nu! Her er din belønning!");
        question2
                .addChoice("1965")
                .addChoice("1979")
                .addChoice("1977")
                .addChoice("1945");

        this.quiz = new Quiz();
        this.quiz
                .addQuestion(question0)
                .addQuestion(question1)
                .addQuestion(question2);

    }

    @Override
    public void renderQuiz() {
        this.quiz.renderCurrentQuestion();
    }

    @Override
    public Quiz getQuiz() {
        return quiz;
    }

    @Override
    public void onQuizComplete() {
        // Spilleren får Containment vessel ved at besvare quizzen rigtigt.
        SMRReactorCore reactorCore = new SMRReactorCore();
        SMRPressurizer pressurizer = new SMRPressurizer();
        reactorCore.setQuantity(1);
        pressurizer.setQuantity(1);

        reactorCore.pickup(Game.context, true);
        pressurizer.pickup(Game.context, true);
    }

    @Override
    public String getImagePath() {
        return "Pripyat-man.png";
    }
}
