package com.st1.interact.quiz;

import java.util.ArrayList;
import java.util.Collection;

public class Quiz {

    private ArrayList<Question> questions = new ArrayList<>();
    private boolean completed = false;
    private Integer currentQuestionIndex = 0;

    public Quiz() {

    }

    public Quiz addQuestion(Question question) {
        this.questions.add(question);

        return this;
    }

    public boolean hasBeenCompleted() {
        return this.completed;
    }

    public Question getCurrentQuestion() {
        return this.questions.get(currentQuestionIndex);
    }


    public void renderCurrentQuestion() {
        Question question = getCurrentQuestion();

        System.out.println("Sprøgsmål: " + question.getQuestion());
        Collection<String> choices = question.getChoices();

        for (int i = 0; i < choices.size(); i++){
            System.out.println(i + 1 + ". " + choices.toArray()[i]);
        }
    }

    public boolean processAnswer(int answer) {
        Question currentQuestion = this.getCurrentQuestion();
        if (currentQuestion.isCorrectChoice(answer)) {
            System.out.println(currentQuestion.getCorrectAnswerMessage());

            // Var dette det sidste spørgsmål i quizen?
            if (currentQuestionIndex + 1 == questions.size()) {
                completed = true;
            } else {
                currentQuestionIndex++;
            }

            return true;
        } else {
            return  false;
        }
    }

}
