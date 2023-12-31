package com.st1.interact;

import com.st1.Game;
import com.st1.interact.quiz.Question;
import com.st1.interact.quiz.Quiz;
import com.st1.inventory.items.SMRTurbine;

public class FukushimaKid extends BaseNpc implements HasQuiz {

    private final Quiz quiz;

    public FukushimaKid() {
        super("Fukushima Kid");

        Question question1 = new Question("Hvilken naturkatastrofe ramte Fukushima d. 11. marts 2011? ", 1);
        question1
                .addChoice("Tornado")
                .addChoice("Tsunami");

        Question question2 = new Question("Hvad kunne man have gjort for at undgå lignende ulykker for fremtidige kraftværker?", 0, "Her er en SMRTurbine.");
        question2
                .addChoice("Foretage flere sikkerhedstest og have regelmæssige tjek på konstruktionen og selve kraftværket.")
                .addChoice("Færre reglementer, så arbejderne har mindre stress. ");

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
        // SMRTurbine
        SMRTurbine smrTurbine = new SMRTurbine();
        smrTurbine.setQuantity(1);

        smrTurbine.pickup(Game.context, true);
    }

    public String getImagePath() {return "fukushimakid.png";}

}

