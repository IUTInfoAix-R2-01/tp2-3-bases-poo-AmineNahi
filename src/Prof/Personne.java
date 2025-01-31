package Prof;

public class Personne {
	private String nom;
	private String prenom;
	
	public Personne(String prenom, String nom){
		this.prenom = prenom;
		this.nom = nom;
	}
	
	public Personne (String prenom) {
		this.prenom = prenom;
	}
	
	public String getNom() {
		if (this.nom == null) {
			return "La personne n'a pas de nom";
		}
		return nom;
	}
	
	public String getPrenom() {
		if (this.prenom == null) {
			return "La personne n'a pas de prenom";
		}
		return prenom;
	}
	
	public String toString() {
		if (this.prenom == null ) {
		   return "Personne[nom=" + this.nom + "]";
		}
		
		if (this.nom == null) {
		   return "Personne[prenom=" + this.prenom + "]";
		}
		
		return "Personne[prenom = " + this.prenom + " nom = " + this.nom + "]";
	}
		
}
