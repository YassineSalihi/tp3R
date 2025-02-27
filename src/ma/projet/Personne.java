package ma.projet;

public class Personne {

	protected int id;
	protected String nom;
	protected String prenom;
	protected String telephone;
	protected String email;

	int comp;

	public Personne(String nom, String prenom, String telephone, String email) {
		super();
		this.id = ++comp;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void affiche() {
		 System.out.println("Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone + ", email=" + email + "]");
	}

}
