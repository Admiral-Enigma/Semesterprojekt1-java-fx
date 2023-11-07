package com.st1.old.st1.interact;

import com.st1.interact.quiz.Question;
import com.st1.interact.quiz.Quiz;

public interface HasQuiz {
    Quiz quiz = new Quiz();

    public void renderQuiz();

    public Quiz getQuiz();

    // Hvad skal NPC'en gøre når quizen bliver gennemført?
    // Kan være item drops eller lign
    public void onQuizComplete();
}
