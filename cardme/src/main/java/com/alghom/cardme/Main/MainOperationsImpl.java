package com.alghom.cardme.Main;

import com.alghom.cardme.Paquet.PaquetOperations;
import com.alghom.cardme.Shared.Carte;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class MainOperationsImpl implements MainOperations {
    private Main main;
    private final PaquetOperations paquetOperations;

    public MainOperationsImpl(PaquetOperations paquetOperations, Main main) {
        this.paquetOperations = paquetOperations;
        this.main = main;
    }

    @Override
    public void trierParCouleur() {
        List<Carte> cartes = main.getCartes();
        cartes.sort(Comparator.comparing(Carte::getColor));
        main.setCartes(cartes);
    }

    @Override
    public void trierParValeur() {
        List<Carte> cartes = main.getCartes();
        cartes.sort(Comparator.comparing(Carte::getValue));
        main.setCartes(cartes);
    }

    @Override
    public Main avoirNouvellesCartes() {
        this.main.setCartes(this.paquetOperations.piocher());
        return main;
    }

    @Override
    public Main getMain() {
        return main;
    }
}
