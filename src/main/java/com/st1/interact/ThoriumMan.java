/*package com.st1.interact;

import com.st1.core.Context;
import com.st1.inventory.items.McFeast;

public class ThoriumMan extends BaseNpc {
    public ThoriumMan() {
        super("ThoriumMan");
    }

    @Override
    public void firstSightingMessage() {
        System.out.println("Hej " + getName() + ". Velkommen til thorium minerne. \nTag nu ud og find mig en McFeast");
    }

    @Override
    public void normalSightingMessage() {
        if (Game.context.inventory.containsItemOfClass(McFeast.class)) {
            System.out.println("Jamen det er jo en McFeast");
        } else {
            System.out.println("Har du fundet værktøjet?\nNej? Jamen så se at få det fundet");
        }
    }
}

 */


package com.st1.interact;

import com.st1.Game;
import com.st1.interact.quiz.Question;
import com.st1.interact.quiz.Quiz;
import com.st1.inventory.items.Hakke;

public class ThoriumMan extends BaseNpc implements HasQuiz {

    private final Quiz quiz;

    public ThoriumMan() {
        super("Thorium Man");

        Question question1 = new Question("Hvilket brændstof er mere bæredygtigt thorium eller uran? ", 0);
        question1
                .addChoice("Thorium er mere bæredygtigt som brændstof, da det er stort forekommende i naturen og producerer mindre langvarigt radioaktivt affald i forhold til uran.")
                .addChoice("Uran er mere bæredygtigt som brændstof, selvom der ikke findes meget af det i naturen, da det ikke er radioaktivt. ");

        Question question2 = new Question("Hvad er den primære fordel ved thoriumreaktorer i forhold til sikkerhed i sammenligning med uranreaktorer? ", 1);
        question2
                .addChoice("Thoriumreaktorer og uranreaktorer er lige sikre i forhold til risikoen for en kernekraftsulykke, men uran er mere radioaktivt end thorium.  ")
                .addChoice("Thoriumreaktorer er mere sikre og har en lavere risiko for kernekraftulykker og har sværere udvinding af våbenfissilt materiale. ");

        Question question3 = new Question("Hvad er halveringstiden for det thorium der er omdannet til uran? ", 0);
        question3
                .addChoice("160.000 år.")
                .addChoice("14 milliarder år.");

        Question question4 = new Question("Hvis du svarer rigtigt på det sidste spørgsmål får du en hakke, som du skal bruge til at mine med. Hvad kræver mest køling, for at undgå nedsmeltning? ", 1, "rigtigt \n Her er en Hakke");
        question4
                .addChoice("Thorium")
                .addChoice("Uran");


        this.quiz = new Quiz();
        this.quiz
                .addQuestion(question1)
                .addQuestion(question2)
                .addQuestion(question3)
                .addQuestion(question4);
    }

    @Override
    public Quiz getQuiz() {
        return quiz;
    }

    @Override
    public void onQuizComplete() {
        // hakke
        Hakke hakke = new Hakke();
        hakke.setQuantity(1);

        hakke.pickup(Game.context, true);
    }

    public String getImagePath() {return "mineman.png";}

}
