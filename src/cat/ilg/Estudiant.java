package cat.ilg;

import java.util.ArrayList;
import java.util.List;

public class Estudiant extends Persona{
    //private double nota;
    List<Double> notes = new ArrayList<>();

    public void posarNota(double nota) throws Exception {
            if( nota > 10 || nota < 0 ){
                throw new Exception("La nota ha de ser entre 0 i 10");
            }
            else{
                notes.add(nota);
            }
    }

    public double obtenirNotaMaxima(){
        double notaMaxima = 0;
        for (Double nota : notes) {
            if (nota > notaMaxima) {
                notaMaxima = nota;
            }
        }
        return notaMaxima;
    }
    public double obtenirNotaMinima(){
        double notaMinima = this.obtenirNotaMaxima();
        for (Double nota : notes) {
            if (nota < notaMinima) {
                notaMinima = nota;
            }
        }
        return notaMinima;
    }
    public double obtenirMitjana(){
        double mitjanaNotes;
        double sumatori = 0;
        for (Double nota : notes) {
            sumatori += nota;
        }
        mitjanaNotes = sumatori / notes.size();
        return mitjanaNotes;
    }

    @Override
    public void obtenirDades() throws Exception {
            if(nom == null || dni == null){
                throw new Exception("No hi ha dades sobre la Persona");
            }
            else{
                System.out.println("PERSONA amb nom: " + nom + " i dni: " + dni + " (ESTUDIANT amb nota máxima: " + this.obtenirNotaMaxima() + ", nota minima de: " + this.obtenirNotaMinima() +" i mitjana de: " + this.obtenirMitjana() + ")");
            }
    }
}
