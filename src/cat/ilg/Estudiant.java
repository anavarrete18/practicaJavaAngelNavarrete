package cat.ilg;

public class Estudiant extends Persona{
    private double nota;

    public void posarNota(double nota){
        this.nota=nota;
    }

    @Override
    public void obtenirDades() {
        System.out.println("ESTUDIANT amb nota:" + nota);
    }
}
