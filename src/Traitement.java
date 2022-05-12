import java.util.ArrayList;

public class Traitement {
    public static void main (String[]args){

        Produit p1 = new Produit (520,"Savon",25,3.20,15);
        p1.setStockDown(12);
        p1.setStockUp(5);
        System.out.println(p1);
        Categorie p2 = new Categorie (400,"Cosmetique");
        Categorie p3 = new Categorie (420,"Cosmetique");
        ArrayList<Produit> inventaire = new ArrayList<Produit>();
        inventaire.add(new Produit (120,"Dentifrice",30,4.20,20,p2));
        inventaire.add(new Produit (700,"Crème hydratante",18,9.95,10,p3));

        for (Produit produit : inventaire){
            System.out.println(produit);
        }

    }
}