package cat.ilg;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		Institut ins = new Institut();
		ins.canviarNom("La Guineueta");

		Professor profe1 = new Professor();
		profe1.canviarNom("Marc");
		profe1.assignarDni("1234");
		profe1.assignarDni("12345");
		profe1.canviarSou(3050);
		profe1.canviarSou(-60);
		profe1.canviarSou(2500);
		ins.afegirProfe(profe1);

		ProfessorSubstitut profe2 = new ProfessorSubstitut();
		profe2.canviarNom("Laura");
		profe2.assignarDni("8888");
		profe2.canviarSou((float) 2500.0);
		Date dataInici = new Date(2021, 11, 1);
		Date dataFi = new Date(2022, 6, 30);
		profe2.assignarSubstitucio(dataInici, dataFi);
		ins.afegirProfe(profe2);

		Estudiant estudiant1 = new Estudiant();
		estudiant1.canviarNom("Joan");
		estudiant1.assignarDni("6666");
		estudiant1.posarNota(7.5);
		estudiant1.posarNota(-4);
		estudiant1.posarNota(14);
		Estudiant estudiant2 = new Estudiant();
		estudiant2.obtenirDades();

		ins.afegirEstudiant(estudiant1);

		ins.imprimirInformacio();


	}
}

