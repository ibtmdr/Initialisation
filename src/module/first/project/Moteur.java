package module.first.project;

public class Moteur extends vehicule implements Race {
    
	private int reservoir;
	
	public Moteur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Moteur(String couleur, String modele, String marque, int longeur, int largeur, int hauteur,
			int kilometrage) {
		super(couleur, modele, marque, longeur, largeur, hauteur, 2, kilometrage);
		// TODO Auto-generated constructor stub
	}

	public Moteur(String couleur, String modele, String marque) {
		super(couleur, modele, marque);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String klaxon() {
		return "titi";
	}

	@Override
	public void accelerer(int vitesse, int time) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void friner() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void carburant(int litre) {
		// TODO Auto-generated method stub
		
	}
	
	

	
}

	
	


