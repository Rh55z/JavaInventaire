public class Categorie {
        private int codeProd;
        private String nom;

        public Categorie (int codeProd,String nom){
            this.codeProd = codeProd;
            this.nom = nom;
        }

        public int getCodeProd() {
            return codeProd;
        }

        public String getNom() {
            return nom;
        }

        public void setCodeProd(int codeProd) {
            this.codeProd = codeProd;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

}
