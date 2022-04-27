package cat.ilg;

public class ProfessorSubstitut extends Professor{
    private int dataInici;
    private int dataFi;

    public void assignarSubstitucio(int dataInici, int dataFi){
        this.dataInici=dataInici;
        this.dataFi=dataFi;
    }

    @Override
    public void obtenirDades() {
        System.out.println("Professor sustitut desde: " + dataInici + " fins " + dataFi);
    }
}
