package cat.ilg;

public class Main {

    public static void main(String[] args) {
	Institut ins = new Institut("La Guineueta");

	Professor profe1 = new Professor("Marc");
	profe1.assignarDni("1234");
	ins.afegirProfe(profe1);

	Estudiant estudiant1 = new Estudiant();
	estudiant1.canviarNom("Joan");
	estudiant1.assignarDni("6666");
	estudiant1.posarNota(7.5);
	ins.afegirEstudiant(estudiant1);

	profe1.obtenirDades();
	estudiant1.obtenirDades();
	ins.imprimirInformacio();
    }
}
