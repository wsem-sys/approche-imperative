package fr.operateurs;

public class DeclarationOperateur {
    public static void main(String[] args) {
        // Déclaration des variables
        int a = 10;
        int b = 20;

        // Test des opérateurs logiques && et ||
        boolean testEt = a > 0 && b < 10;
        boolean testOu = a > 0 || b < 10;

        // Affichage des résultats des tests logiques
        System.out.println("Résultat de testEt (a>0 && b<10) : " + testEt);
        System.out.println("Résultat de testOu (a>0 || b<10) : " + testOu);

        // Test des opérateurs combinés
        System.out.println("\nValeur initiale de a : " + a);

        // a = a + 1
        a = a + 1;
        System.out.println("Après a = a + 1, a = " + a);

        // a++
        a++;
        System.out.println("Après a++, a = " + a);

        // a += 1
        a += 1;
        System.out.println("Après a += 1, a = " + a);
    }
}
