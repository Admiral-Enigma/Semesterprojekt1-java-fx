package com.st1.interact;

import com.st1.interact.quiz.Question;
import com.st1.interact.quiz.Quiz;

public class AirstripWoman extends BaseNpc implements HasQuiz {

    private final Quiz quiz;

    public AirstripWoman() {
        super("Airstrip woman");

        Question question1 = new Question("Hvor ønsker du at tage til idag?", 0);
        question1
                .addChoice("Pripyat")
                .addChoice("Fukushima")
                .addChoice("Power plant")
                .addChoice("Thorium mine");

        this.quiz = new Quiz();
        this.quiz.addQuestion(question1);
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
        System.out.println("Dog ville jeg ik anbefale at du tog derhen min ven");
    }


}
