package com.st1.interact;

import com.st1.Game;

public class PripyatMan extends BaseNpc {

    public PripyatMan() {
        super("PripyatMan");
    }

    @Override
    public String firstSightingMessage() {
        return "Hej " + getName() + ". Velkommen til Pripyat. \nPripyat var engang en blomstrende by, hjemsted for arbejderne ved Tjernobyl-kernekraftværket. Før katastrofen i 1986 havde byen et pulserende samfund med mennesker, der arbejdede i forskellige sektorer som landbrug, undervisning og industri.  \n" +
                "Reaktor 1 ved Tjernobyl-atomkraftværket blev først taget i brug i 1977, mens den første kommercielle atomkraftreaktorer blev taget i brug fra 1954. Dog ændrede katastrofen der ramte Tjernobyl i 1986 under en sikkerhedsprøve, vores opfattelse af denne kraftfulde, men komplekse energiform. \n" +
                "En blanding af sovjetisk stolthed og flere fejl undersikkerhedsprøver samt et personale med manglende træning og erfaring førte til en kæmpe miljømæssig katastrofe som spredte sig over et kæmpe område af Europa, hvilket var skyld i alvorlige sundhedsskader hos menneske, dyr og ikke mindst for miljøet. \n" +
                "Efter eksplosionen på reaktor 4, der anvendte RBMK-teknologien, blev Pripyat evakueret for at minimere risikoen for radioaktivt nedfald. Evakueringen blev beordret flere dage efter katastrofen, hvilket resulterede i en pludselig forladelse af byen. Livet ændrede sig dramatisk, og området blev forladt som en spøgelsesby.\n" +
                "Ulykken fik meget opmærksomhed og havde en betydelig indvirkning på folks syn på atomkraft, hvor mange lande valgte at revurdere deres atomkraftspolitik som førte til udfasning eller bremset udviklingen af nye atomkraftværker. \n";
    }



    @Override
    public String getImagePath() {
        return "Pripyat-man.png";
    }
}
