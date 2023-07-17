package com.alghom.cardme.Paquet;

import com.alghom.cardme.Shared.Carte;
import com.alghom.cardme.Shared.Color;
import com.alghom.cardme.Shared.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class Paquet {
    private List<Carte> cartes;
    public Paquet() {
        this.cartes = genererPaquet();
    }

    public Paquet(List<Carte> cartes) {
        this.cartes = cartes;
    }

    private static List<Carte> genererPaquet() {
        List<Carte> initCartes = new ArrayList<>();
        Arrays.stream(Value.values()).forEach(value ->
                Arrays.stream(Color.values()).forEach(color ->
                        initCartes.add(new Carte(color, value))
                )
        );
        return initCartes;
    }

    public void remplirPaquet() {
        this.cartes = genererPaquet();
    }

    public List<Carte> getCartes() {
        return cartes;
    }

    public void setCartes(List<Carte> cartes) {
        this.cartes = cartes;
    }

    @Override
    public String toString() {
        return "Paquet{" +
                "cartes=" + cartes +
                '}';
    }
}
