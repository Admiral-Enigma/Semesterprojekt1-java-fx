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

    public boolean processAnswer(String answer) {
        try {
            Integer answerIndex = Integer.parseInt(answer);
            Question currentQuestion = this.getCurrentQuestion();

            if (answerIndex < 1 || answerIndex > currentQuestion.getChoices().size()) {
                throw new NumberFormatException();
            }

            // Nu kan vi antage at spilleren har valgt et muligt svar

            // Er dette det korrekte svar?
           if (currentQuestion.isCorrectChoice(answerIndex - 1)) {
               System.out.println(currentQuestion.getCorrectAnswerMessage());

               // Var dette det sidste spørgsmål i quizen?
               if (currentQuestionIndex + 1 == questions.size()) {
                   completed = true;
               } else {
                   // Print næste spørgsmål
                   currentQuestionIndex++;
                   this.renderCurrentQuestion();
               }
           } else {
               System.out.println("Hmm, det var ikke det rigtige svar");
           }

        } catch (NumberFormatException e) {
            System.out.println("Hmm, det svar forstår jeg ikke");
        }

        return completed;

    }

}
