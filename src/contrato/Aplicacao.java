package contrato;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		int aux, ano, mes;
		double renda, salario;
		String depart, nome, nivel, mesAno;

		Scanner sc = new Scanner(System.in);

		System.out.print("Nome do departamento: ");
		depart = sc.nextLine();

		System.out.print("\nDados do Trabalhador:\n");

		System.out.println("Nome:");
		nome = sc.nextLine();

		System.out.println("Nivel:");
		nivel = sc.nextLine();

		System.out.println("Salario Base:");
		salario = sc.nextDouble();

		Trabalhador t1 = new Trabalhador(nome, Nivel.valueOf(nivel), salario, new Departamento(depart));

		System.out.print("\n\nDigite a quantidade de contratos a serem cadastrados:");
		aux = sc.nextInt();

		for (int i = 1; i <= aux; i++) {
			System.out.print("\nDigite os dados do Contrato " + i + ":\n");
			t1.AdicionarContrato(ContratoHora.AdicionarContrato());

		}

		System.out.println("Digite o mes e o ano para calcular: (mm/YYYY): ");
		mesAno = sc.next();
		int mees = Integer.parseInt(mesAno.substring(0, 2));
		int anno = Integer.parseInt(mesAno.substring(3));

		System.out.println("Nome: " + t1.getName());
		System.out.println("Departamento: " + t1.getDepartamento().getNameDepartament());
		System.out.println("O Trabalhador recebeu em " + mesAno + " o valor de R$ "
				+ String.format("%.2f", t1.RendaMensal(anno, mees)));

		sc.close();

	}

}
