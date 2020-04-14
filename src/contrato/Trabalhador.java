package contrato;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Trabalhador {

	private String name;
	private Nivel nivel;
	private double salario_base;
	public List<ContratoHora> contratos = new ArrayList<>();
	Departamento departamento;

	public Trabalhador(String name, Nivel nivel, double salario_base, Departamento departamento) {
		this.name = name;
		this.nivel = nivel;
		this.salario_base = salario_base;
		this.departamento = departamento;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	public double getSalario_base() {
		return salario_base;
	}

	public void setSalario_base(double salario_base) {
		this.salario_base = salario_base;
	}

	public List<ContratoHora> getContratos() {
		return contratos;
	}

	Scanner sc = new Scanner(System.in);

	public void AdicionarContrato(ContratoHora h) {
		contratos.add(h);
	}

	public void RemoverContrato(ContratoHora h) {
		contratos.remove(h);
	}

	public double RendaMensal(int ano, int mes) {

		Calendar cal = Calendar.getInstance();

		double soma = this.salario_base;
		int c_ano, c_mes;

		for (ContratoHora c : contratos) {

			cal.setTime(c.getData());

			c_ano = cal.get(Calendar.YEAR);
			c_mes = 1 + cal.get(Calendar.MONTH);

			if (ano == c_ano && mes == c_mes) {
				soma += c.Valortotal();
			}

		}

		return soma;
	}

	
}
