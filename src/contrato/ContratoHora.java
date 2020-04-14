package contrato;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ContratoHora {

	private Date data;
	private double valorHora;
	private int horas;

	static String data1;
	static double valor;
	static int hora;
	static Date dataFormatada;

	static SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	static Scanner sc = new Scanner(System.in);

	public ContratoHora() {

	}

	public ContratoHora(Date data, double valorHora, int horas) {
		this.data = data;
		this.valorHora = valorHora;
		this.horas = horas;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double Valortotal() {
		return this.valorHora * this.horas;
	}

	@Override
	public String toString() {
		return "ContratoHora [data=" + data + ", valorHora=" + valorHora + ", horas=" + horas + "]";
	}

	public static ContratoHora AdicionarContrato() throws ParseException {
		System.out.printf("--------Adicionar novo contrato:--------- \n");
		System.out.printf("Digite a Data: \n");
		data1 = sc.next();
		dataFormatada = formato.parse(data1);
		System.out.printf("Digite o valor da Hora: \n");
		valor = sc.nextDouble();
		System.out.printf("Digite a quantidade de horas trabalhadas: \n");
		hora = sc.nextInt();

		ContratoHora c = new ContratoHora(dataFormatada, valor, hora);

		System.out.println("Contrato adicionado!");

		return c;
	}
}
