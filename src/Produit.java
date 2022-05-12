public class Produit {
    private int CodeProd;
    private String nom;
    private int stockQte;
    private double prix;
    private int stockSte;
    private Categorie categorie;

    public Produit (int CodeProd, String nom, int stockQte, double prix, int stockSte){
        this.CodeProd = CodeProd;
        this.nom = nom;
        this.stockQte = stockQte;
        this.prix = prix;
        this.stockSte = stockSte;
    }

    public Produit (int CodeProd, String nom, int stockQte, double prix, int stockSte, Categorie categorie){
        this.CodeProd = CodeProd;
        this.nom = nom;
        this.stockQte = stockQte;
        this.prix = prix;
        this.stockSte = stockSte;
        this.categorie = categorie;
    }

    //Tout les getters
    public String getNom(){
        return nom;

    }

    public int getCodeProd() {
        return CodeProd;
    }

    public int getStockQte(){
        return stockQte;
    }

    public double getPrix() {
        return prix;
    }

    public int getStockSte() {
        return stockSte;
    }

    //Tout les setters

    public void setStockQte (int stockQte) {
        this.stockQte = stockQte;
    }

    public void setStockSte (int stockSte){
        this.stockSte = stockSte;
    }



    //Tout les ajouts et diminussion

    public void setStockUp (int valeur){
        this.stockQte += valeur;
    }

    public void setStockDown (int valeur){
        this.stockQte -= valeur;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "CodeProd=" + CodeProd +
                ", nom='" + nom + '\'' +
                ", stockQte=" + stockQte +
                ", prix=" + prix +
                ", stockSte=" + stockSte +
                ", categorie=" + categorie +
                '}';
    }
}


