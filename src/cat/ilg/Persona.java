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

    public void assignarDni(String dni) throws Exception {
        if(this.dni == null){
            this.dni=dni;
        }
        else {
            throw new Exception("La Persona ya te DNI");
        }
    }

    public void obtenirDades() throws Exception {
        if(nom == null || dni == null){
            throw new Exception("No hi ha dades sobre la Persona");
        }
        else{
            System.out.println("PERSONA amb nom: " + nom + " i DNI: " + dni);
        }
    }
}
