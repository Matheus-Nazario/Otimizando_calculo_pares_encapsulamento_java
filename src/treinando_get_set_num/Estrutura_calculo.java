package treinando_get_set_num;

class Estrutura_calculo {
	
	private int resultado;
	
	public void setRes(int res) {
		
		this.resultado = res;
	
	}
	
	public int getRes() {
		return resultado;
	}
	
	public void mostrar_resultado() {
		System.out.printf("O Resultado da conta é %s\n", getRes() );
	}
	
	private void funcao(int num) {
		for (int i = 0; i <= num ; i++ ) {
			if( i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public void setFuncao(int numero ) {
		this.funcao(numero);
	}
	
}
