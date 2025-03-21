package fr.declaration.variable;

public class DeclarationApp {
    public static void main(String[] args) {
        // Déclaration des variables avec des valeurs différentes de 0
        byte monByte = 10;
        short monShort = 200;
        int monInt = 5000;
        long monLong = 100000L;
        float monFloat = 5.75f;
        double monDouble = 19.99;
        char monChar = 'A';
        boolean monBoolean = true;
        String monString = "Hello, Java!";

        // Affichage des valeurs
        System.out.println("Byte: " + monByte);
        System.out.println("Short: " + monShort);
        System.out.println("Int: " + monInt);
        System.out.println("Long: " + monLong);
        System.out.println("Float: " + monFloat);
        System.out.println("Double: " + monDouble);
        System.out.println("Char: " + monChar);
        System.out.println("Boolean: " + monBoolean);
        System.out.println("String: " + monString);

        // ---------------------
        // Partie : Affichage de la valeur d'une variable
        // ---------------------

        // Déclaration et affichage d'une variable
        int resultat = 10;
        System.out.println("Le résultat est : " + resultat);

        // Affichage d'un littéral directement
        System.out.println("Ceci est un texte affiché directement.");

        // Déclaration et affichage de la chaîne de caractères avec retour à la ligne
        String randomString = "Voici le résultat d’un calcul :\n1+5=6";
        System.out.println(randomString);
    }
}
