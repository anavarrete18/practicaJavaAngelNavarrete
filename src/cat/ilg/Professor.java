package cat.ilg;

public class Professor extends Persona {
    protected float sou;

    public Professor(){}
    public Professor(String nom){
        this.nom=nom;
    }

    public void canviarSou(float nouSou) {
        try{
            if (nouSou > 3000) {
                throw new Exception("Els Professors no poden cobrar mes de 3000€");
            }
            else{
                this.sou = nouSou;
            }
            if (nouSou < 0){
                throw new Exception("No pot ser un numero negatiu");
            }
            else{
                this.sou = nouSou;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void obtenirDades() {
        try{
            if(nom == null && dni == null){
                throw new Exception("No hi ha dades sobre la Persona");
            }
            else{
                System.out.println("PERSONA amb nom: "+ nom + " i dni: " + dni + " (PROFESSOR amb sou: " + sou + ")");
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
