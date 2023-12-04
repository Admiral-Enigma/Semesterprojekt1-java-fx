package com.st1.ui.components;

import com.st1.interact.HasQuiz;
import com.st1.interact.Npc;
import com.st1.interact.quiz.Question;
import com.st1.util.Assets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;


public class NpcComponent {

    private Npc npc;

    private HBox root;

    private boolean hidden = false;

    private double parentWidth = 0;
    private double parentHeight = 0;


    public NpcComponent(HBox root, Npc npc) {
        this.root = root;
        this.npc = npc;

        root.widthProperty().addListener(e -> {
            if (parentWidth == 0) {
                parentWidth = root.getWidth();
                this.renderIfRootInitialized();
            }
        });

        root.heightProperty().addListener(e -> {
            if (parentHeight == 0) {
                parentHeight = root.getHeight();
                this.renderIfRootInitialized();
            }
        });


    }

    private void renderIfRootInitialized() {
        // We can only render npc once the parent element's width and height has been set
        if (parentWidth != 0 && parentHeight != 0) {
            this.render();
        }
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

        if (hidden) {
            return;
        }

        Image image = Assets.imageFromPath("assets/"+ npc.getImagePath());
        double aspectRatio = image.getWidth() / image.getHeight();
        ImageView npcManImage = new ImageView(image);
        Button npcMan = new Button();

        npcMan.setStyle("-fx-background-color: transparent");

        // Make width 30% of the root container
        double width = (parentWidth * 0.30);
        npcManImage.setFitWidth(width);

        // Calculate correct height so image is not stretched
        double height = width / aspectRatio;
        npcManImage.setFitHeight(height);
        npcMan.setGraphic(npcManImage);
        this.root.getChildren().add(npcMan);
        this.root.setSpacing(10);


        if (npc instanceof HasQuiz) {
            renderQuiz();
        } else {
            // Show info box once again if player clicks on Npc image
            npcMan.setOnMouseClicked(e -> {
                render();
            });

            // Render the message box with dismiss button
            renderMessage();
        }
    }

    private void renderMessage() {
        VBox messageContainer = new VBox();
        messageContainer.setSpacing(10);
        messageContainer.setPrefWidth(parentWidth*0.7);

        Label message = new Label(npc.firstSightingMessage());
        message.setStyle("-fx-background-color: white; -fx-padding: 5px; -fx-background-radius: 5px");
        message.setFont(new Font("ComicSans", 15));
        message.setWrapText(true);

        Button dismissButton = new Button("Okay");
        dismissButton.setOnMouseClicked(e -> {
            messageContainer.getChildren().removeAll(message, dismissButton);
        });

        messageContainer.getChildren().addAll(message, dismissButton);

        this.root.getChildren().add(messageContainer);
    }

    private void renderQuiz() {
        Question currentQuestion = ((HasQuiz) npc).getQuiz().getCurrentQuestion();

        VBox questionContainer = new VBox();
        questionContainer.setSpacing(10);
        questionContainer.setPrefWidth(parentWidth*0.7);
        Label questionText = new Label(currentQuestion.getQuestion());
        questionText.setStyle("-fx-background-color: white; -fx-padding: 5px; -fx-background-radius: 5px");
        questionText.setFont(new Font("ComicSans", 15));
        questionText.setWrapText(true);

        questionContainer.getChildren().add(questionText);

        for (int i = 0; i < currentQuestion.getChoices().size(); i++) {
            Button choiceButton = new Button(currentQuestion.getChoices().get(i));
            choiceButton.setWrapText(true);
            questionContainer.getChildren().add(choiceButton);
            final int answerIndex = i;
            choiceButton.setOnMouseClicked(e -> {
                boolean correct = ((HasQuiz) npc).getQuiz().processAnswer(answerIndex);

                if (!correct) {
                    choiceButton.setStyle("-fx-border-color: red");
                } else {
                    if (((HasQuiz) npc).getQuiz().hasBeenCompleted()) {
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
