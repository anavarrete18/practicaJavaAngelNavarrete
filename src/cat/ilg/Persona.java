package cat.ilg;

public class Persona {
    //atributs
    private String dni;
    private String nom;

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
    public void obtenirDades(){}
}
