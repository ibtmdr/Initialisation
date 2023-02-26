package module.first.project;

public class Voiture extends vehicule implements Race {

	private int reservoir;
	
	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Voiture(String couleur, String modele, String marque, int longeur, int largeur, int hauteur,
			int kilometrage) {
		super(couleur, modele, marque, longeur, largeur, hauteur, 4, kilometrage);
		// TODO Auto-generated constructor stub
	}

	public Voiture(String couleur, String modele, String marque) {
		super(couleur, modele, marque);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String klaxon() {
		// TODO Auto-generated method stub
		return "tutu";
	}

	@Override
	public void accelerer(int vitesse, int time) {
		// TODO Auto-generated method stub
		this.setKilometrage(this.getKilometrage() + (vitesse*time));
		this.reservoir= this.reservoir-2;
		
	}

	@Override
	public void friner() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void carburant(int litre) {
		// TODO Auto-generated method stub
		this.reservoir= this.reservoir + litre;
		
	}
	
}
