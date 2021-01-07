package com.tdd.tennis.entities;

public class PartieDeTennis {
    private Joueur premierJoueur;
    private Joueur deuxiemeJoueur;
    private Score scoreJoueur1 = new Score();
    private Score scoreJoueur2 = new Score();
    private Joueur joueurAvecUnAvantage;

    public PartieDeTennis() {
    }

    public PartieDeTennis(Joueur premierJoueur, Joueur deuxiemeJoueur) {
        this.premierJoueur = premierJoueur;
        this.deuxiemeJoueur = deuxiemeJoueur;
    }

    public int getScoreJoueur1() {
        return scoreJoueur1.getScore();
    }

    public int incrementScoreJoueur1(){
        return scoreJoueur1.incrementScore();
    }

    public void setScoreJoueur1(Score scoreJoueur1) {
        this.scoreJoueur1 = scoreJoueur1;
    }

    public int getScoreJoueur2() {
        return scoreJoueur2.getScore();
    }

    public int incrementScoreJoueur2(){
        return scoreJoueur2.incrementScore();
    }

    public void setScoreJoueur2(Score scoreJoueur2) {
        this.scoreJoueur2 = scoreJoueur2;
    }

    public Joueur getPremierJoueur() {
        return premierJoueur;
    }

    public void setPremierJoueur(Joueur premierJoueur) {
        this.premierJoueur = premierJoueur;
    }

    public Joueur getDeuxiemeJoueur() {
        return deuxiemeJoueur;
    }

    public void setDeuxiemeJoueur(Joueur deuxiemeJoueur) {
        this.deuxiemeJoueur = deuxiemeJoueur;
    }

    public Joueur getJoueurAvecUnAvantage() {
        return joueurAvecUnAvantage;
    }

    public void setJoueurAvecUnAvantage(Joueur joueurAvecUnAvantage) {
        if (this.joueurAvecUnAvantage != null && this.joueurAvecUnAvantage != joueurAvecUnAvantage)
            this.joueurAvecUnAvantage = null;
        else
            this.joueurAvecUnAvantage = joueurAvecUnAvantage;
    }

    public Joueur joueurAvecAvantage() {
        return this.joueurAvecUnAvantage;
    }

    public void supprimerAvantage() {
        this.joueurAvecUnAvantage = null;
    }
}
