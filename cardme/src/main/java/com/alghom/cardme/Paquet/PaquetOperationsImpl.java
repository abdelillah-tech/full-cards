package com.alghom.cardme.Paquet;

import com.alghom.cardme.Shared.Carte;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@Scope("singleton")
public class PaquetOperationsImpl implements PaquetOperations {
    private Paquet paquet;

    public PaquetOperationsImpl(Paquet paquet) {
        this.paquet = paquet;
    }

    @Override
    public List<Carte> piocher() {
        List<Carte> anciennesCartes = paquet.getCartes();
        List<Carte> cartes = new ArrayList<>();

        if(anciennesCartes.size() < 10) {
            paquet.setCartes(cartes);
            return anciennesCartes;
        }

        for (int i = 0; i < 10; i++) {
            cartes.add(anciennesCartes.remove(0));
        }
        paquet.setCartes(anciennesCartes);
        return cartes;
    }

    @Override
    public void melanger() {
        List<Carte> cartes = paquet.getCartes();
        Collections.shuffle(cartes);
        paquet.setCartes(cartes);
    }

    @Override
    public Paquet getPaquet() {
        return paquet;
    }

    @Override
    public void reinitPaquet() {
        this.paquet.remplirPaquet();
    }
}
