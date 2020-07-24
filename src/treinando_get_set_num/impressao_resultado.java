package treinando_get_set_num;
import java.util.Scanner;

class impressao_resultado {

	public static void main(String[] args) {
		
		Estrutura_calculo res = new Estrutura_calculo();
		
		Scanner num = new Scanner(System.in);
				
		System.out.println("Digite o primeiro número: " );
		int num_1 = num.nextInt();
		
		System.out.println("Digite o Segundo número: " );
		int num_2 = num.nextInt();
	
		int resultado = num_1 + num_2;
		
		res.setRes(resultado);
		res.mostrar_resultado();
		
		System.out.println("Os números pares do soma são: " );
		res.setFuncao(resultado);
	}

}
