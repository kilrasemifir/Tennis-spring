# Tennis Spring

## Le but
Créer une application qui permet de compter les points en spring en utilisant la TDD et les notions de clean code.

## Use case
Un utilisateur peut lancer une nouvelle partie
    Il peut annoncé contre quel joueur il veut jouer. OK
    
Un joueur peut annoncé qu'il a gagné un point
    Au debut tout les joueurs ont 0 points et 0 sets gagné.
    Quand un utilisateur gagne un jeu il gagne des point.
    S'il est a 0 point il passe a 15 puis 30 puis 40
    S'il est a 40 et que son posant n'est pas a 40 alors il gagne le jeu et les points sont reinitialisés
    S'il y a egalité a 40 alors il y a un avantage pour le gagne du jeu.
    S'il y a egalité et que le gagnant a un avantage alors il gagne le jeu
    S'il y a egalité et que le perdant a un avantage il pert l'avantage
Un utilisateur peut demander le score de la partie.


## Evolution
Un utilisateur peut demander qui doit servire.
    
## Entities
* Joueur
* Score
* Partie

## Note
S single responsability: 
    un fx ou cls doit avoir une unique responsabilité, elle ne doit faire qu'une seul chose.
O Open/Close
    ouvert a l'extension, fermer a la modification
L liskov = polymorphisme
    ```Si q(x) est une propriété démontrable pour tout objet x de type T,
     alors q(y) est vraie pour tout objet y de type S tel que S est un sous-type de T.```
     si animal peut manger, alors un chien le peut aussi
     List<?> maList = new ArrayList<>();
     INT var = new CLS;
     
I interface segregation: 

D dependency injection: 
