package com.alghom.cardme.Paquet;

import com.alghom.cardme.Shared.Carte;

import java.util.List;

public interface PaquetOperations {
    List<Carte> piocher();
    void melanger();
    Paquet getPaquet();
    void reinitPaquet();
}
