package cat.ilg;

import java.util.Date;

public class Main {
	public static void main(String[] args) throws Exception {
		try{
			Institut ins = new Institut();
			ins.canviarNom("La Guineueta");

			Professor profe1 = new Professor();
			profe1.canviarNom("Marc");
			profe1.assignarDni("1234");
			//profe1.assignarDni("12345");
			//profe1.canviarSou(3050);
			//profe1.canviarSou(-60);
			profe1.canviarSou(2500);
			//ins.afegirProfe(profe1);
			ins.afegirPersona(profe1);

			ProfessorSubstitut profe2 = new ProfessorSubstitut();
			profe2.canviarNom("Laura");
			profe2.assignarDni("8888");
			profe2.canviarSou((float) 2500.0);
			Date dataInici = new Date(2021, 11, 1);
			Date dataFi = new Date(2022, 6, 30);
			profe2.assignarSubstitucio(dataInici, dataFi);
			//ins.afegirProfe(profe2);
			ins.afegirPersona(profe2);

			Estudiant estudiant1 = new Estudiant();
			estudiant1.canviarNom("Joan");
			estudiant1.assignarDni("6666");
			estudiant1.posarNota(7.5);
			//estudiant1.posarNota(-4);
			//estudiant1.posarNota(14);
			estudiant1.posarNota(8);
			estudiant1.posarNota(10);
			estudiant1.posarNota(3);

			Estudiant estudiant2 = new Estudiant();
			//estudiant2.obtenirDades();

			Estudiant estudiant3 = new Estudiant();
			estudiant3.canviarNom("Angel");
			estudiant3.assignarDni("12345678A");
			estudiant3.posarNota(8);
			estudiant3.posarNota(9.5);
			estudiant3.posarNota(7.7);
			estudiant3.posarNota(4);
			ins.afegirPersona(estudiant3);
			//ins.afegirEstudiant(estudiant1);

			ins.imprimirInformacio();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

