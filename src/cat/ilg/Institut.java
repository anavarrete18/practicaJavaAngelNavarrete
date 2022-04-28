package cat.ilg;

import java.util.ArrayList;
import java.util.List;

public class Institut {
    //atributos
    private String nom;
    //private List<Professor> listaProfessor= new ArrayList<>();
    //private List<Estudiant> listaEstudiant= new ArrayList<>();
    private List<Persona> listaPersona= new ArrayList<>();
    //constructores
    public Institut(){}

    //metodos
    public void canviarNom(String nom){
        this.nom=nom;
    }
    /*public void afegirProfe(Professor profe){
        listaProfessor.add(profe);
    }
    public void afegirEstudiant(Estudiant estudiant){
        listaEstudiant.add(estudiant);
    }
    */
    public void afegirPersona(Persona persona){
        listaPersona.add(persona);
    }
    public void imprimirInformacio(){
        System.out.println("Institut " + nom + ". LLista de persones: ");
    /*
        for (Persona professors: listaProfessor){
            professors.obtenirDades();
        }
        for (Persona estudiants: listaEstudiant){
            estudiants.obtenirDades();
        }
    */
        for (Persona persones: listaPersona){
            persones.obtenirDades();
        }
    }
}
