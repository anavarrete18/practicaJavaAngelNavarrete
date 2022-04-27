package cat.ilg;

public class Persona {
    //atributs
    protected String dni;
    protected String nom;

    //metodes
    public void canviarNom(String nom){
        this.nom=nom;
    }

    public String getNom() {
        return nom;
    }

    public void assignarDni(String dni){
        this.dni=dni;
    }
    public void obtenirDades(){
        System.out.println("PERSONA amb nom: " + nom + " i DNI: " + dni);
    }
}
