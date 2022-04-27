package cat.ilg;

import java.util.ArrayList;
import java.util.List;

public class Institut {
    private String nom;
    private List<Professor> listaProfessor= new ArrayList<>();
    private List<Estudiant> listaEstudiant= new ArrayList<>();
    //constructors
    public Institut(){}
    public Institut(String nom){
        this.nom=nom;
    }
    public void afegirProfe(Professor profe){
        listaProfessor.add(profe);
    }
    public void afegirEstudiant(Estudiant estudiant){
        listaEstudiant.add(estudiant);
    }
    public void imprimirInformacio(){
        for (int i=0; i<listaEstudiant.size(); i++) {
            System.out.println(listaEstudiant.get(i).toString());
        }
        for (int i=0; i<listaProfessor.size(); i++) {
            System.out.println(listaProfessor.get(i).toString());
        }
        System.out.println();

    }
}
