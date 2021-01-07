package com.tdd.tennis.metier;

import com.tdd.tennis.entities.Joueur;
import com.tdd.tennis.entities.PartieDeTennis;

public interface TennisScoreCalculator {
    public PartieDeTennis creerNouvellePartieDeTennis(Joueur joueur1, Joueur joueur2);
    public void joueurGagne1Point(Joueur joueur);
}
