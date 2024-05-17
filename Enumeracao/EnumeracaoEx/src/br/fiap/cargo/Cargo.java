package br.fiap.cargo;

import br.fiap.calcular.calcularcomissao;

public enum  Cargo implements calcularcomissao{
	
	Atendente {
		public double calcularComissao(double valor) {
			return valor * 0.10;
		}
	},
	
	Vendedor{	
		public double calcularComissao(double valor) {
		return valor * 0.15 + 5;
	}
},
	
	Gerente{	
		public double calcularComissao(double valor) {
		return valor * 0.20 + 10;
	}
}
	
	

}
