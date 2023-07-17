package com.alghom.cardme.Main;

import com.alghom.cardme.Shared.Carte;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Main {
    private List<Carte> cartes = new ArrayList<>();

    public Main() {}
    public List<Carte> getCartes() {
        return cartes;
    }

    public void setCartes(List<Carte> cartes) {
        this.cartes = cartes;
    }

    @Override
    public String toString() {
        return "Main{" +
                "cartes=" + cartes +
                '}';
    }
}
