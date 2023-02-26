package module.first.project;

public  abstract class  vehicule {
	private String couleur, modele, marque; 
	private int longeur, largeur, hauteur, roueux, kilometrage;
	public vehicule(String couleur, String modele, String marque, int longeur, int largeur, int hauteur, int roueux, int kilometrage) {
		super();
		this.couleur = couleur;
		this.modele = modele;
		this.marque = marque;
		this.longeur = longeur;
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.roueux = roueux;
		this.kilometrage = kilometrage;
	}
	public vehicule() {
		
		
	}
	public vehicule(String couleur, String modele, String marque) {
		super();
		this.couleur = couleur;
		this.modele = modele;
		this.marque = marque;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public int getLongeur() {
		return longeur;
	}
	public void setLongeur(int longeur) {
		this.longeur = longeur;
	}
	public int getLargeur() {
		return largeur;
	}
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}
	public int getHauteur() {
		return hauteur;
	}
	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}
	public int getRoueux() {
		return roueux;
	}
	public void setRoueux(int roueux) {
		this.roueux = roueux;
	}
	
	
	
	public int getKilometrage() {
		return kilometrage;
	}
	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}
	public String klaxon(){
		return "toto";
	}
	
	public int avance(int kilometre) {
		return this.kilometrage + kilometre;
		
	}
	@Override
	public String toString() {
		return "vehicule [couleur=" + couleur + ", modele=" + modele + ", marque=" + marque + ", longeur=" + longeur
				+ ", largeur=" + largeur + ", hauteur=" + hauteur + ", roueux=" + roueux + ", kilometrage="
				+ kilometrage + "]";
	}
	 
	
		
	
	
	

}
