# Projet Scala

## Sujet

La société MowItNow a décidé de développer une tondeuse à gazon automatique, destinée aux
surfaces rectangulaires.

La tondeuse peut être programmée pour parcourir l'intégralité de la surface.
La position de la tondeuse est représentée par une combinaison de coordonnées `(x,y)` et d'une
lettre indiquant l'orientation selon la notation cardinale anglaise `(N,E,W,S)`. La pelouse est
divisée en grille pour simplifier la navigation.

Par exemple, la position de la tondeuse peut être `0, 0, N`, ce qui signifie qu'elle se situe
dans le coin inférieur gauche de la pelouse, et orientée vers le Nord.

Pour contrôler la tondeuse, on lui envoie une séquence simple de lettres.
Les lettres possibles sont `D`, `G` et `A`.
`D` et `G` font pivoter la tondeuse de 90° à droite ou à gauche respectivement, sans la déplacer. 
`A` signifie que l'on avance la tondeuse d'une case dans la direction à laquelle elle fait face, et sans modifier son orientation.

Si la position après mouvement est en dehors de la pelouse, la tondeuse ne bouge pas,
conserve son orientation et traite la commande suivante.

On assume que la case directement au Nord de la position `(x, y)` a pour coordonnées `(x, y+1)`.

Pour programmer la tondeuse, on lui fournit un fichier d'entrée construit comme suit :

* La première ligne correspond aux coordonnées du coin supérieur droit de la pelouse, celles
du coin inférieur gauche sont supposées être (0,0)
* La suite du fichier permet de piloter toutes les tondeuses qui ont été déployées. Chaque
tondeuse a deux lignes la concernant :
* la première ligne donne la position initiale de la tondeuse, ainsi que son orientation. La
position et l'orientation sont fournies sous la forme de 2 chiffres et une lettre, séparés
par un espace
* la seconde ligne est une série d'instructions ordonnant à la tondeuse d'explorer la
pelouse. Les instructions sont une suite de caractères sans espaces.

Chaque tondeuse se déplace de façon séquentielle, ce qui signifie que la seconde tondeuse ne
bouge que lorsque la première a exécuté intégralement sa série d'instructions.

Lorsqu'une tondeuse achève une série d'instruction, elle communique sa position et son
orientation.

## Objectif 

Concevoir et écrire un programme en Scala, implémentant la spécification ci-dessus et passant le test ci-après.

## Test

Le fichier suivant est fourni en entrée : <br>
<br>
5 5 <br>
1 2 N <br>
GAGAGAGAA <br>
3 3 E <br>
AADAADADDA <br>

On attend le résultat suivant (position finale des tondeuses) : <br>
<br>
Tondeuse 1 : 1 3 N <br>
Tondeuse 2 : 5 1 E <br>

## Solution 

### Parser 

Cette classe permet de lire le fichier d'entrée. Elle conserve les coordonnées du jardin (première ligne) et deux listes selon le nombre de tondeuse : 
- <i>commandes</i> : la liste des instructions de chaque tondeuse
- <i>position</i> : la position de chaque tondeuse 

### Tondeuse 

Cette classe permet de constuire une tondeuse. Elle contient plusieurs fonctions : 
- <i>avancer</i> : la tondeuse avance selon son orientation actuelle 
- <i>tournerDroite</i> : la tondeuse pivote à 90° vers la droite 
- <i>tournerDroite</i> : la tondeuse pivote à 90° vers la gauche
- <i>maPosition</i> : affiche la position de la tondeuse (coordonnées et orientation) 
- <i>faireCommandes</i> : selon une liste de commande fournit, la tondeuse fait les actions précédentes (avancer, tournerDroite, tournerGauche).

### Run 

Cet objet permet de lancer les tondeuses selon le fichier fournit par l'utilisateur.

## Auteurs 
Thierry <b>GAMEIRO MARTINS</b> <br>
Romain <b>KRAWCZYK</b> <br>
