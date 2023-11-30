package com.st1.ui.components;

import com.st1.interact.HasQuiz;
import com.st1.interact.Npc;
import com.st1.interact.quiz.Question;
import com.st1.util.Assets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;


public class NpcComponent {

    private Npc npc;

    private HBox root;

    private boolean hidden = false;

    private double parentWidth = 0;


    public NpcComponent(HBox root, Npc npc) {
        this.root = root;
        this.npc = npc;

        root.widthProperty().addListener(e -> {
            parentWidth = root.getWidth();
        });
    }

    public NpcComponent(HBox root, Npc npc, boolean hidden) {
        this(root, npc);
        this.hidden = hidden;
    }


    public void toogleVisibility() {
        this.hidden = !hidden;
    }


    public void render() {
        this.root.getChildren().clear();

        // Er npc skjult - gør ikke noget
        if (hidden) {
            return;
        }


        ImageView npcMan = new ImageView(Assets.imageFromPath("assets/mcfeast.jpg"));

        npcMan.setFitWidth(parentWidth * 0.30);
        npcMan.preserveRatioProperty();
        this.root.getChildren().add(npcMan);
        this.root.setSpacing(10);



        if (npc instanceof HasQuiz) {
            Question currentQuestion = ((HasQuiz) npc).getQuiz().getCurrentQuestion();

            VBox questionContainer = new VBox();
            questionContainer.setSpacing(10);
            questionContainer.setPrefWidth(parentWidth*0.7);
            Label questionText = new Label(currentQuestion.getQuestion());
            questionText.setFont(new Font("ComicSans", 15));
            questionText.setWrapText(true);

            questionContainer.getChildren().add(questionText);

            for (int i = 0; i < currentQuestion.getChoices().size(); i++) {
                Button choiceButton = new Button(currentQuestion.getChoices().get(i));
                choiceButton.setWrapText(true);
                questionContainer.getChildren().add(choiceButton);
                final int dinmor = i;
                choiceButton.setOnMouseClicked(e -> {
                    boolean correct = ((HasQuiz) npc).getQuiz().processAnswer(dinmor);

                    if (!correct) {
                        choiceButton.setStyle("-fx-border-color: red");
                    } else {
                        if (((HasQuiz) npc).getQuiz().hasBeenCompleted()) {
                            //TODO: give item
                            toogleVisibility();
                            ((HasQuiz) npc).onQuizComplete();

                        }
                        this.render();
                    }

                });
            }

            this.root.getChildren().add(questionContainer);

        }
    }
}
