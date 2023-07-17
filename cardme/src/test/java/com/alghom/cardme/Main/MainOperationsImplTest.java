package com.alghom.cardme.Main;

import com.alghom.cardme.Paquet.Paquet;
import com.alghom.cardme.Paquet.PaquetOperationsImpl;
import com.alghom.cardme.Shared.Carte;
import com.alghom.cardme.Shared.Color;
import com.alghom.cardme.Shared.Value;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainOperationsImplTest {
    List<Carte> cartes = initCartes();
    MainOperations mainOperations = new MainOperationsImpl(new PaquetOperationsImpl(new Paquet(cartes)), new Main());

    @Test
    public void avoirNouvellesCartes() {
        mainOperations.avoirNouvellesCartes();
        assertEquals(mainOperations.getMain().getCartes(), initCartes());
    }

    @Test
    public void trierParCouleur() {
        mainOperations.avoirNouvellesCartes();
        mainOperations.trierParCouleur();
        assertEquals(mainOperations.getMain().getCartes(), cartesTrieParCouleur());
    }

    @Test
    public void trierParValeur() {
        mainOperations.avoirNouvellesCartes();
        mainOperations.trierParValeur();
        assertEquals(mainOperations.getMain().getCartes(), cartesTrieParValeurs());
    }

    List<Carte> initCartes() {
        List<Carte> cartes = new ArrayList<>();
        Carte carte1 = new Carte(Color.PIQUE, Value.AS);
        cartes.add(carte1);
        Carte carte2 = new Carte(Color.PIQUE, Value.AS);
        cartes.add(carte2);
        Carte carte3 = new Carte(Color.CARREAUX, Value.DEUX);
        cartes.add(carte3);
        Carte carte4 = new Carte(Color.TRÈFLE, Value.ROI);
        cartes.add(carte4);
        Carte carte5 = new Carte(Color.COEUR, Value.NEUF);
        cartes.add(carte5);
        return cartes;
    }

    List<Carte> cartesTrieParValeurs() {
        List<Carte> cartes = new ArrayList<>();
        Carte carte1 = new Carte(Color.PIQUE, Value.AS);
        cartes.add(carte1);
        Carte carte2 = new Carte(Color.PIQUE, Value.AS);
        cartes.add(carte2);
        Carte carte3 = new Carte(Color.TRÈFLE, Value.ROI);
        cartes.add(carte3);
        Carte carte4 = new Carte(Color.COEUR, Value.NEUF);
        cartes.add(carte4);
        Carte carte5 = new Carte(Color.CARREAUX, Value.DEUX);
        cartes.add(carte5);

        return cartes;
    }

    List<Carte> cartesTrieParCouleur() {
        List<Carte> cartes = new ArrayList<>();
        Carte carte1 = new Carte(Color.PIQUE, Value.AS);
        cartes.add(carte1);
        Carte carte2 = new Carte(Color.PIQUE, Value.AS);
        cartes.add(carte2);
        Carte carte3 = new Carte(Color.COEUR, Value.NEUF);
        cartes.add(carte3);
        Carte carte4 = new Carte(Color.CARREAUX, Value.DEUX);
        cartes.add(carte4);
        Carte carte5 = new Carte(Color.TRÈFLE, Value.ROI);
        cartes.add(carte5);

        return cartes;
    }
}