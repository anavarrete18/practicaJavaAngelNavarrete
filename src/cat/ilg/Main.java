package cat.ilg;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("Introdueix el número de l’acció que vulguis fer:\n");
		int numero = input.nextInt();
		System.out.print("1) Veure la llista d’Instituts\n" +
				"2) Veure la informació completa d’un Institut\n" +
				"3) Afegir persona a un Institut\n" +
				"4) Eliminar un Institut\n" +
				"5) Crear un Institut\n");



		switch (numero){
			case 1:
				//instutut.imprimirInformacio();
				break;
			case 2:
				System.out.println("Escriu el número de l’Institut que vols consultar\n");
				Scanner input2 = new Scanner(System.in);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.out.println("Escriu el nom de l’Institut que vols crear:\n");
				Scanner institut = new Scanner(System.in);
				Institut institut1 = new Institut();
				institut1.canviarNom(institut.toString());
				System.out.println("Institut creat correctament");
				break;
		}
		*/
	}
}

