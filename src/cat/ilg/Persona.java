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
        try{
            if(this.dni != dni){
                this.dni=dni;
            }
        }catch(Exception e){
            System.out.println("Ya hi ha un dni assignat");
        }
    }

    public void obtenirDades(){
        try{
            if(nom == null && dni == null){
                throw new Exception("No hi ha dades sobre la Persona");
            }
            else{
                System.out.println("PERSONA amb nom: " + nom + " i DNI: " + dni);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
