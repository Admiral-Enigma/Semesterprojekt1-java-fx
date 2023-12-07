package com.st1.interact;
import com.st1.Game;
public class PripyatGirl extends BaseNpc {

    public PripyatGirl() {
        super("PripyatGirl");
    }

    @Override
    public String firstSightingMessage() {
        return
                "Velkommen til Pripyat! \n"
                + "Pripyat var engang en blomstrende by - hjemsted for arbejderne ved Tjernobyl-kernekraftværket. \n"
                + "Før katastrofen i 1986 havde byen et pulserende samfund med mennesker, der arbejdede i forskellige sektorer som f.eks. landbrug, undervisning og industri. \n"
                + "Reaktor 1 ved Tjernobyl-atomkraftværket blev først taget i brug i 1977, 23 år efter den første kommercielle atomkraftreaktor i verden blev taget i brug i 1954. \n"
                + "Katastrofen, der ramte Tjernobyl i 1986 under en sikkerhedsprøve, ændrede vores opfattelse af denne kraftfulde, men komplekse energiform. \n"
                + "En blanding af sovjetisk stolthed og flere fejl under sikkerhedsprøver, samt et personale med manglende træning og erfaring førte til en kæmpe miljømæssig katastrofe. \n"
                + "Katastrofen spredte sig over et stort område af Europa, og var skyld i alvorlige sundhedsskader hos mennesker, dyr og ikke mindst for miljøet. \n"
                + "Efter eksplosionen på reaktor 4, der anvendte RBMK-teknologien, blev Pripyat evakueret for at minimere risikoen for radioaktivt nedfald. \n"
                + "Evakueringen blev beordret flere dage efter katastrofen, hvilket resulterede i en pludselig forladelse af byen. Livet ændrede sig dramatisk for beboerne, og området blev til en spøgelsesby.\n"
                + "Ulykken fik stor opmærksomhed og havde en betydelig virkning på folks syn på atomkraft. \n"
                + "Mange lande valgte at revurdere deres atomkraftspolitik, hvilket førte til udfasning eller helt bremset udvikling af nye atomkraftværker \n"
                + "På trods af at denne ulykke kunne have været stoppet, før den begyndte.";

    }


    @Override
    public String getImagePath() {
        return "pripyatgirl.png";
    }
}
