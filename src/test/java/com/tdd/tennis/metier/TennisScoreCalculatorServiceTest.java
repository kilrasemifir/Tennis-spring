package com.tdd.tennis.metier;

import com.tdd.tennis.entities.Joueur;
import com.tdd.tennis.entities.PartieDeTennis;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import  static org.junit.jupiter.api.Assertions.*;

public class TennisScoreCalculatorServiceTest{

    private TennisScoreCalculator tennisScoreCalculator = new TennisScoreCalculatorService();
    private PartieDeTennis partie;
    private Joueur joueur1;
    private Joueur joueur2;

    @BeforeEach
    public void init(){
        joueur1 = new Joueur();
        joueur2 = new Joueur();
        partie = tennisScoreCalculator.creerNouvellePartieDeTennis(joueur1, joueur2);
    }

    @Test
    @DisplayName("On peut creer une partie et definir les joueurs")
    public void testCreationNouvellePartie(){
        assertEquals(joueur1, partie.getPremierJoueur());
        assertEquals(joueur2, partie.getDeuxiemeJoueur());
    }

    @Test
    @DisplayName("En debut de partie les joueur ont 0 points")
    public void testDebutDePartie0Points(){
        assertEquals(0, partie.getScoreJoueur1());
        assertEquals(0, partie.getScoreJoueur2());
    }

    @Test
    @DisplayName("Un joueur peut annoncé qu'il a gagné un point, ce qui augmente son score")
    public void testJoueurGagne1point(){
        tennisScoreCalculator.joueurGagne1Point(joueur1);
        assertEquals(15, partie.getScoreJoueur1());
        assertEquals(0, partie.getScoreJoueur2());
        tennisScoreCalculator.joueurGagne1Point(joueur2);
        assertEquals(15, partie.getScoreJoueur1());
        assertEquals(15, partie.getScoreJoueur2());
    }

    @Test
    @DisplayName("Quand un joueur gagne un point, il passe de 0 a 15, puis a 30 puis 40")
    public void testGagne15Puis30Puis40(){
        tennisScoreCalculator.joueurGagne1Point(joueur1);
        assertEquals(15, partie.getScoreJoueur1());
        tennisScoreCalculator.joueurGagne1Point(joueur1);
        assertEquals(30, partie.getScoreJoueur1());
        tennisScoreCalculator.joueurGagne1Point(joueur1);
        assertEquals(40, partie.getScoreJoueur1());
    }

    @Test
    @DisplayName("Si les deux joueurs ont 40 en point, le gagnant gagne un avantage")
    public void testAvantage(){
        assertNull(partie.joueurAvecAvantage());
        tennisScoreCalculator.joueurGagne1Point(joueur1);
        tennisScoreCalculator.joueurGagne1Point(joueur1);
        tennisScoreCalculator.joueurGagne1Point(joueur1);

        tennisScoreCalculator.joueurGagne1Point(joueur2);
        tennisScoreCalculator.joueurGagne1Point(joueur2);
        tennisScoreCalculator.joueurGagne1Point(joueur2);

        tennisScoreCalculator.joueurGagne1Point(joueur1);
        assertEquals(joueur1, partie.joueurAvecAvantage());
    }

    @Test
    @DisplayName("S'il y a egalité et que le perdant a un avantage, il pert sont avantage")
    public void testPerteAvantage(){
        tennisScoreCalculator.joueurGagne1Point(joueur1);
        tennisScoreCalculator.joueurGagne1Point(joueur1);
        tennisScoreCalculator.joueurGagne1Point(joueur1);
        tennisScoreCalculator.joueurGagne1Point(joueur2);
        tennisScoreCalculator.joueurGagne1Point(joueur2);
        tennisScoreCalculator.joueurGagne1Point(joueur2);
        tennisScoreCalculator.joueurGagne1Point(joueur2);
        assertEquals(joueur2, partie.joueurAvecAvantage());
        tennisScoreCalculator.joueurGagne1Point(joueur1);
        assertEquals(null, partie.joueurAvecAvantage());
    }


}