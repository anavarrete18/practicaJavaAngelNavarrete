package cat.ilg;

public class ProfessorSubstitut extends Professor{
    private date dataInici;
    private date dataFi;

    public void assignarSubstitucio(date dataInici, date dataFi){
        this.dataInici=dataInici;
        this.dataFi=dataFi;
    }

    @Override
    public void obtenirDades() {
        System.out.println("Professor sustitut desde: " + dataInici + " fins " + dataFi);
    }
}
