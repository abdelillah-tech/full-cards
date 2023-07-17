package com.alghom.cardme.Packet;

import com.alghom.cardme.Paquet.Paquet;
import com.alghom.cardme.Paquet.PaquetOperations;
import com.alghom.cardme.Paquet.PaquetOperationsImpl;
import com.alghom.cardme.Shared.Carte;
import com.alghom.cardme.Shared.Color;
import com.alghom.cardme.Shared.Value;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PacketOperationsImplTest {
    List<Carte> cartes = initCartes();
    PaquetOperations paquetOperations = new PaquetOperationsImpl(new Paquet(cartes));

    @Test
    public void testPiocher() {
        assertEquals(paquetOperations.piocher(), initCartes().subList(0, 10));
        assertEquals(paquetOperations.getPaquet().getCartes(), initCartes().subList(10, 11));
    }

    @Test
    public void testMelanger() {
        paquetOperations.melanger();
        assertEquals(paquetOperations.getPaquet().getCartes().size(), initCartes().size());
        assertNotEquals(paquetOperations.getPaquet().getCartes(), initCartes());
    }

    @Test
    public void testReinitPaquet() {
        paquetOperations.piocher();
        assertEquals(paquetOperations.getPaquet().getCartes().size(), 1);
        paquetOperations.reinitPaquet();
        assertEquals(paquetOperations.getPaquet().getCartes().size(), 52);
    }

    List<Carte> initCartes() {
        List<Carte> cartes = new ArrayList<>();
        Carte carte1 = new Carte(Color.PIQUE, Value.AS);
        cartes.add(carte1);
        Carte carte2 = new Carte(Color.PIQUE, Value.DAME);
        cartes.add(carte2);
        Carte carte3 = new Carte(Color.CARREAUX, Value.DEUX);
        cartes.add(carte3);
        Carte carte4 = new Carte(Color.TRÈFLE, Value.ROI);
        cartes.add(carte4);
        Carte carte5 = new Carte(Color.CARREAUX, Value.NEUF);
        cartes.add(carte5);
        Carte carte6 = new Carte(Color.PIQUE, Value.NEUF);
        cartes.add(carte6);
        Carte carte7 = new Carte(Color.COEUR, Value.CINQ);
        cartes.add(carte7);
        Carte carte8 = new Carte(Color.TRÈFLE, Value.NEUF);
        cartes.add(carte8);
        Carte carte9 = new Carte(Color.TRÈFLE, Value.TROIS);
        cartes.add(carte9);
        Carte carte10 = new Carte(Color.COEUR, Value.NEUF);
        cartes.add(carte10);
        Carte carte11 = new Carte(Color.COEUR, Value.SIX);
        cartes.add(carte11);
        return cartes;
    }
}