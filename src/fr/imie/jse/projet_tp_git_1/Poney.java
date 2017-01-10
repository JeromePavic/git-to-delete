package fr.imie.jse.projet_tp_git_1;

public class Poney {

	private double poids;
	private double taille;
	private String nom;
	private double vitesse;
	private String couleur;
	private String SUPERPOWERSMEGA;

	public Poney() {
		super();
	}

	public String GetCouleur() {
		return couleur;
	}

	public void SetCouleur(String couleur) {
		this.couleur = couleur;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public double getTaille() {
		return taille;
	}

	public void setTaille(double taille) {
		this.taille = taille;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


}
