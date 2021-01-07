package com.tdd.tennis.metier;

import com.tdd.tennis.entities.Joueur;
import com.tdd.tennis.entities.PartieDeTennis;
import com.tdd.tennis.entities.Score;

import java.util.List;
import java.util.Scanner;

public class TennisScoreCalculatorService implements TennisScoreCalculator{

    static {
        List<String> lst = List.of("a", "b");
    }
    private PartieDeTennis partieDeTennis;

    public PartieDeTennis creerNouvellePartieDeTennis(Joueur joueur1, Joueur joueur2){
        partieDeTennis =  new PartieDeTennis(joueur1, joueur2);
        return partieDeTennis;
    }

    private boolean egualiteA40Point(){
        return partieDeTennis.getScoreJoueur1() == Score.TROISIEME_POINT
                && partieDeTennis.getScoreJoueur1() == partieDeTennis.getScoreJoueur2();
    }

    public void joueurGagne1Point(Joueur joueur){
        if (egualiteA40Point()){
            partieDeTennis.setJoueurAvecUnAvantage(joueur);
        }
        if (joueur.equals(partieDeTennis.getPremierJoueur())){
            partieDeTennis.incrementScoreJoueur1();
        }
        if (joueur.equals(partieDeTennis.getDeuxiemeJoueur())){
            partieDeTennis.incrementScoreJoueur2();
        }


    }
}
