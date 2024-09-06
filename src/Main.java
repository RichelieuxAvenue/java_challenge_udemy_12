public class Main {
    /*
    Convertisseur de Minutes en Années et Jours

Écrivez une méthode appelée printYearsAndDays avec un paramètre de type long nommé minutes.

La méthode ne doit rien retourner (type void) et doit calculer le nombre d’années et de jours à partir du paramètre minutes.

Si le paramètre est inférieur à 0, imprimez le texte "Invalid Value".

Sinon, si le paramètre est valide, la méthode doit imprimer un message au format "XX min = YY y and ZZ d", où :

	•	XX représente la valeur initiale de minutes.
	•	YY représente le nombre d’années calculé.
	•	ZZ représente le nombre de jours calculé.

EXEMPLES D’ENTRÉE/SORTIE :

	•	printYearsAndDays(525600); → doit imprimer "525600 min = 1 y and 0 d".
	•	printYearsAndDays(1051200); → doit imprimer "1051200 min = 2 y and 0 d".
	•	printYearsAndDays(561600); → doit imprimer "561600 min = 1 y and 25 d".

CONSEILS :

	•	Soyez très attentif aux espaces dans le message imprimé.
	•	Utilisez l’opérateur modulo pour obtenir les jours restants après avoir calculé les années.
	•	1 heure = 60 minutes
	•	1 jour = 24 heures
	•	1 an = 365 jours

REMARQUES :

	•	La méthode printYearsAndDays doit être définie comme public static, comme nous l’avons fait jusqu’à présent dans le cours.
	•	N’ajoutez pas de méthode main au code de la solution.
	•	La solution ne sera pas acceptée s’il y a des espaces supplémentaires dans le message imprimé.
     */
    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }
        else {
            long nbAnnees = minutes /(365 * 24 * 60);
            long resteNbAnnees = minutes % (365 * 24 * 60);
            long nbJours = resteNbAnnees / (24 * 60);
            System.out.printf("%d min = %d y %d d", minutes, nbAnnees, nbJours);
        }

    }
    public static void main(String[]args){
    printYearsAndDays(897368);
    }
}
