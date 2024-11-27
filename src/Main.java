
import java.util.Random;
import java.util.Scanner;

//    public static void main(String[] args) {
//        String joursDeLaSemaine[] = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};
//        System.out.println("Voici la liste :");
//        printList(joursDeLaSemaine);
//        System.out.println("Première valeur:" + joursDeLaSemaine[0] + "\nDeuxième valeur:" + joursDeLaSemaine[6] + "\nTroisième valeur" + joursDeLaSemaine[3]);
//        joursDeLaSemaine[5] = "Dimanche";
//        String x = joursDeLaSemaine[0];
//        joursDeLaSemaine[0] = joursDeLaSemaine[6];
//        joursDeLaSemaine[6] = x;
//        System.out.println("\nTour de magie, voici la nouvelle liste");
//        printList(joursDeLaSemaine);
//    }
//
//    public static void printList(String[] laListe) {
//        for (int i = 0; i < laListe.length; i++) {
//            System.out.println(laListe[i]);
//        }
//    }
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double quantite[] = {0, 0, 0};
        String unite[] = {"", "", ""};
        System.out.println("Masse de l'objet 1:");
        quantite[0] = scan.nextInt();
        do {
            System.out.println("Unité pour la masse de l'objet 1 (en kg, g, mg, µm ou lb):");
            unite[0] = scan.nextLine();
            if (unite[0] != "kg" || unite[0] != "g" || unite[0] != "mg" || unite[0] != "µg" || unite[0] != "lb") {
                System.out.println("unité invalide (sont acceptées: kg, g, mg, µg ou lb)");
            }
        }
        while (unite[0] != "kg" || unite[0] != "g" || unite[0] != "mg" || unite[0] != "µg" || unite[0] != "lb");
        System.out.println("Masse de l'objet 2:");
        quantite[1] = scan.nextInt();
        do {
            System.out.println("Unité pour la masse de l'objet 2 (kg, g, mg, µm ou lb)");
            unite[1] = scan.nextLine();
            if (unite[1] != "kg" || unite[1] != "g" || unite[1] != "mg" || unite[1] != "µg" || unite[0] != "lb") {
                System.out.println("unité invalide (sont acceptées: kg, g, mg, µg, lb)");
            }
        }
        while (unite[1] != "kg" || unite[1] != "g" || unite[1] != "mg" || unite[1] != "µg" || unite[0] != "lb");
        System.out.println("Distance entre les centres des objets");
        quantite[2] = scan.nextInt();
        do {
            System.out.println("Unité pour la distance entre les centres des objets (en m, cm, mm, µm, ft");
            unite[2] = scan.nextLine();
            if (unite[2] != "m" || unite[2] != "cm" || unite[2] != "mm" || unite[2] != "µm" || unite[2] != "ft") {
                System.out.println("unité invalide (sont acceptées: m, cm, mm, µm, ft)");
            }
        }
        while (unite[2] != "m" || unite[2] != "cm" || unite[2] != "mm" || unite[2] != "µm" || unite[2] != "ft");
        switch (unite[0]) {
            case ("kg"):
                break;
            case ("g"):
                quantite[0] = quantite[0] / 1000;
                break;
            case ("mg"):
                quantite[0] = quantite[0] / 1000000;
                break;
            case ("µg"):
                quantite[0] = quantite[0] / Math.pow(10, 9);
                break;
            case ("lb"):
                quantite[0] = quantite[0] * 0.45;
                break;
        }
        switch (unite[1]) {
            case ("kg"):
                break;
            case ("g"):
                quantite[1] = quantite[1] / 1000;
                break;
            case ("mg"):
                quantite[1] = quantite[1] / 1000000;
                break;
            case ("µg"):
                quantite[1] = quantite[1] / Math.pow(10, 9);
                break;
            case ("lb"):
                quantite[1] = quantite[1] * 0.45;
                break;
        }
        switch (unite[2]) {
            case ("m"):
                break;
            case ("cm"):
                quantite[2] = quantite[2] / 100;
                break;
            case ("mm"):
                quantite[2] = quantite[2] / 1000;
                break;
            case ("µm"):
                quantite[2] = quantite[2] / 1000000;
                break;
            case ("ft"):
                quantite[2] = quantite[2] / 3.2;
                break;
        }
        System.out.println((quantite[0] * quantite[1] * 6.64 * Math.pow(10, -11))/(Math.pow(quantite[2],2)));
    }
}