package module.first.project;

public class Velo extends vehicule {

	public Velo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Velo(String couleur, String modele, String marque, int longeur, int largeur, int hauteur, int roueux,
			int kilometrage) {
		super(couleur, modele, marque, longeur, largeur, hauteur, roueux, kilometrage);
		// TODO Auto-generated constructor stub
	}

	public Velo(String couleur, String modele, String marque) {
		super(couleur, modele, marque);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String klaxon() {
		// TODO Auto-generated method stub
		return "trin trin";
	}
	
	
	

}
