package cat.ilg;

import java.util.Date;

public class ProfessorSubstitut extends Professor{
    private Date dataInici;
    private Date dataFi;


    public void assignarSubstitucio(Date dataInici, Date dataFi){
        this.dataInici=dataInici;
        this.dataFi=dataFi;
    }

    @Override
    public void obtenirDades() {
        System.out.println("PERSONA amb nom: "+ nom + " i dni: " + dni + " (PROFESSOR amb sou: " + sou + " del " + dataInici.getDate() + "/" + dataInici.getMonth() + "/" + dataInici.getYear() + " al " + dataFi.getDate() + "/" + dataFi.getMonth() + "/" + dataFi.getYear() +")");
    }
}
