package cat.ilg;

public class Professor extends Persona {
    private float sou;

    public Professor(){}
    public Professor(String nom){
        this.nom=nom;
    }
    @Override
    public void canviarSou(float nouSou) {
        this.sou=nouSou;
    }

    @Override
    public void obtenirDades() {
        System.out.println("PROFESSOR amb sou: " + sou);
    }
}
