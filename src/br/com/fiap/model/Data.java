package br.com.fiap.model;

public class Data {
	private int dia;
	private int mes;
	private int ano;

	public Data(int dia, int mes, int ano) {
		this.ano = ano;
		this.dia = dia;
		this.mes = mes;
	}

	public Data() {

	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean validaMes(int mes) {
		if (mes < 1 || mes > 12) {
			return false;
		} else {
			return true;
		}
	}

	public boolean validaDia(int dia, int mes) {
		if (dia <= 0) {
			return false;
		}
		if (mes == 2) {
			
		}
		if(validaMes(mes)) {
			return false;
		}
		
		if (mes > 7 && mes <= 12) {
			if ((mes % 2) != 0 && dia >= 31) {
				return false;
			}
		}
		if(mes <= 7 && (mes% 2 == 0) && dia > 30 ) {
			return false;
		}
		return true;
	}
}
