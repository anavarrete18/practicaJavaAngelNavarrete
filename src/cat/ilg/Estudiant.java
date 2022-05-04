package cat.ilg;

import java.util.ArrayList;
import java.util.List;

public class Estudiant extends Persona{
    //private double nota;
    List<Double> notes = new ArrayList<>();
    private double notaMaxima = 0;
    private double notaMinima;
    private double mitjanaNotes = 0;

    public void posarNota(double nota) throws Exception {
            if( nota > 10 || nota < 0 ){
                throw new Exception("La nota ha de ser entre 0 i 10");
            }
            else{
                notes.add(nota);
            }
    }

    @Override
    public void obtenirDades() throws Exception {
            if(nom == null || dni == null){
                throw new Exception("No hi ha dades sobre la Persona");
            }
            else{
                for (int i = 0; i < notes.size(); i++) {
                    if (notes.get(i) > notaMaxima) {
                        notaMaxima = notes.get(i);
                    }
                }
                notaMinima = notaMaxima;
                for (int i = 0; i < notes.size(); i++) {
                    if (notes.get(i) < notaMinima) {
                        notaMinima = notes.get(i);
                    }
                }
                double sumatori = 0;
                for (int i = 0; i < notes.size(); i++) {
                    sumatori += notes.get(i);;
                }
                mitjanaNotes = sumatori / notes.size();

                System.out.println("PERSONA amb nom: "+ nom + " i dni: " + dni + " (ESTUDIANT amb nota máxima: " + notaMaxima + ", nota minima de: " + notaMinima +" i mitjana de: " + mitjanaNotes + ")");
            }
    }
}
