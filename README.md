# Au Resto
## - Description :
Programme simple en Java permettant à un utilisateur de passer des commandes depuis un menu.  
L'utilisateur sélectionne le numéro associé à un élément jusqu'à la fin du menu.  
Une fois toute les commandes complétés le programme se termine et il ne reste plus qu'à apprécier votre repas numérique !

-----

## - Principe :
Demande à l'utilisateur le nombre de commande à passer.  
Le programme va afficher chaque partie du menu étape par étape dans cette ordre :
  > Entrée > Plat > Accompagnement > Boisson > Dessert.

L'utilisateur à juste besoin d'entrer le chiffre qui correspond à l'élément du menu.  
Si celui-ci ne souhaite pas commander dans l'une des étapes l'option 0 permet de passer.  
Une fois arrivé à la fin, le programme affiche le résumé de la commande actuelle et passe à la suivante.  

-----

## - Exemple en console :
```
Hello, how many orders do you want ?
1
Starting order 1
[0 - None][1 - Salad][2 - Soup][3 - Quiche]
Select entry :
1
[0 - None][1 - Chicken][2 - Beef][3 - Fish][4 - Vegan]
Select main course :
4
[0 - None][1 - Rice][2 - Pasta][3 - Fries][4 - Vegetables]
Select accompaniment :
2
[0 - None][1 - Water][2 - Soda][3 - Wine]
Select drink :
1
[0 - None][1 - Pie][2 - Chocolate Mousse][3 - Tiramisu]
Select desert :
1
[Salad, Vegan, Pasta, Water, Pie]

Enjoy your meal !

```
