package br.com.fiap.model;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	private boolean bissexto;

	public Data(int dia, int mes, int ano) {
		if (ano > 0) {
			this.ano = ano;
		} else {
			System.out.println("Ano invalido");
		}
		if (isBissexto(ano)) {
			this.bissexto = true;
		}
		if (validaMes(mes)) {
			this.mes = mes;
		} else {
			System.out.println("Mes invalido");
		}
		if (validaDia(dia, mes, ano)) {
			this.dia = dia;
		} else {
			System.out.println("Dia invalido");
		}

	}

	public boolean getBissexto() {
		return bissexto;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public boolean validaMes(int mes) {
		if (mes < 1 || mes > 12) {
			return false;
		}
		return true;
	}

	private boolean validaDia(int dia, int mes, int ano) {
		if (dia <= 0 || dia > 31) {
			return false;
		}
		if (mes == 2) {
			if (this.getBissexto()) {
				if (dia > 29) {
					return false;
				}
			} else if (dia > 28) {
				return false;
			}
			return true;
		}
		if (mes > 7 && mes <= 12 && (mes % 2) != 0 && dia >= 31) {
			return false;
		}
		if (mes <= 7 && (mes % 2 == 0) && dia > 30) {
			return false;
		}
		return true;
	}

	private boolean isBissexto(int ano) {
		if (ano % 400 == 0) {
			return true;
		}
		if (ano % 100 == 0) {
			return true;
		}
		if (ano % 4 == 0) {
			return true;
		}
		return false;
	}
}
