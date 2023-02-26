package module.first.project;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {
		 
		
	   Scanner ss = new Scanner(System.in);
       int i;
       ArrayList<vehicule> vehicules = new ArrayList<vehicule>();
       do {
       System.out.println("Menu : \n 1) Ajouter une voiture \n 2) Ajouter un moto \n 3) Ajouter une vélo \n 4) Afficher les vehicules \n 5) Supprimer une vehicule par Index \n 6) Quitter" );
       System.out.println("donner un chiffre");
        i = ss.nextInt();
       System.out.println("le chiffre est : " + i);
      
       switch (i) {
	case 1: {
		   Scanner s = new Scanner(System.in);
		   System.out.println("donner la couleur");
	       String v = s.nextLine();
	       System.out.println("donner la marque");
	       String m = s.nextLine();
	       System.out.println("donner le model");
	       String d = s.nextLine();
	       vehicule t = new Voiture(v, d, m);
	       vehicules.add(t);
	       break;
	       	
	}
case 2: {
	Scanner s = new Scanner(System.in);
	System.out.println("donner la couleur");
    String v = s.nextLine();
    System.out.println("donner la marque");
    String m = s.nextLine();
    System.out.println("donner le model");
    String d = s.nextLine();
    vehicule tt = new Moteur(v, d, m);
    vehicules.add(tt);
    break;
		
	
	}
case 3: {
	Scanner s = new Scanner(System.in);
	System.out.println("donner la couleur");
    String v = s.nextLine();
    System.out.println("donner la marque");
    String m = s.nextLine();
    System.out.println("donner le model");
    String d = s.nextLine();
    vehicule ttt = new Velo(v, d, m);
    vehicules.add(ttt);
    break;
	
	
}
case 4: {
	 for(vehicule e : vehicules)
     {
		 
  	  
  	   System.out.println(" vehicule numéro " + vehicules.indexOf(e) + " de type " + e.getClass().getSimpleName()+ " : " + e.toString() + " klaxon : " + e.klaxon());
  	 
     }
     break;
	
	
}
case 5: { 
	Scanner s = new Scanner(System.in);
	System.out.println("donner l'index de vehicule à supprimer");
    int v = s.nextInt();
    vehicules.remove(v);
    break;
    
	
	
}
	

	default:
		
		
		
	}
       
       
       }while ( i>= 1 && i< 6); 
       
       
       
       
       
       
       
       
       
         
	}

}
  /*
   * vehicule v = new Voiture("rouge", "C5", "BM", 2, 3, 1, 0);
		Moteur m = new Moteur("bleu", "R1", "huanday", 1, 2, 3, 5);
		Voiture vo = new Voiture("blanch", "C4","RONGE" , 1, 2, 3, 0);
		
       
       ArrayList<vehicule> vehicules = new ArrayList<vehicule>();
       vehicules.add(v);
       vehicules.add(m);
       vehicules.add(vo);
       
       for(vehicule e : vehicules)
       {
    	   System.out.println(e.klaxon());
    	   System.out.println(e.toString());
       }
       
       vehicules.remove(0);
   */
