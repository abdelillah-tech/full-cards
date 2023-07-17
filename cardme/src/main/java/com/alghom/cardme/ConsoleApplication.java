package com.alghom.cardme;

import com.alghom.cardme.Main.Main;
import com.alghom.cardme.Main.MainOperations;
import com.alghom.cardme.Main.MainOperationsImpl;
import com.alghom.cardme.Paquet.Paquet;
import com.alghom.cardme.Paquet.PaquetOperations;
import com.alghom.cardme.Paquet.PaquetOperationsImpl;

public class ConsoleApplication {
    public static void run() {
        PaquetOperations paquetOperations = new PaquetOperationsImpl(new Paquet());
        System.out.println("paquet non mélangé: " + paquetOperations.getPaquet());
        paquetOperations.melanger();
        System.out.println("paquet mélangé: " + paquetOperations.getPaquet());

        MainOperations mainOperations = new MainOperationsImpl(paquetOperations, new Main());
        mainOperations.avoirNouvellesCartes();
        System.out.println("premiere main: " + mainOperations.getMain());

        mainOperations.trierParCouleur();
        System.out.println("premiere main trié par couleur: " + mainOperations.getMain());

        mainOperations.trierParValeur();
        System.out.println("premiere main trié par valeur: " + mainOperations.getMain());

        MainOperations mainOperations1 = new MainOperationsImpl(paquetOperations, new Main());
        mainOperations1.avoirNouvellesCartes();
        System.out.println("deuxieme main: " + mainOperations1.getMain());

        MainOperations mainOperations2 = new MainOperationsImpl(paquetOperations, new Main());
        mainOperations2.avoirNouvellesCartes();
        System.out.println("troisieme main: " + mainOperations2.getMain());

        MainOperations mainOperations3 = new MainOperationsImpl(paquetOperations, new Main());
        mainOperations3.avoirNouvellesCartes();
        System.out.println("quatrieme main: " + mainOperations3.getMain());

        MainOperations mainOperations4 = new MainOperationsImpl(paquetOperations, new Main());
        mainOperations4.avoirNouvellesCartes();
        System.out.println("cinqieme main: " + mainOperations4.getMain());

        MainOperations mainOperations5 = new MainOperationsImpl(paquetOperations, new Main());
        mainOperations5.avoirNouvellesCartes();
        System.out.println("sixieme main: " + mainOperations5.getMain());

        MainOperations mainOperations6 = new MainOperationsImpl(paquetOperations, new Main());
        mainOperations6.avoirNouvellesCartes();
        System.out.println("septieme main: " + mainOperations6.getMain());

        System.out.println("paquet vidé: " + paquetOperations.getPaquet());
        paquetOperations.reinitPaquet();
        System.out.println("regener les cartes du paquet: " + paquetOperations.getPaquet());
    }
}
