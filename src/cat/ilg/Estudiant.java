package cat.ilg;

public class Estudiant extends Persona{
    private double nota;

    public void posarNota(double nota){
        try{
            if( nota > 10 || nota < 0 ){
                throw new Exception("La nota ha de ser entre 0 i 10");
            }
            else{
                this.nota=nota;
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
                System.out.println("PERSONA amb nom: "+ nom + " i dni: " + dni + " (ESTUDIANT amb nota:" + nota + ")");
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
