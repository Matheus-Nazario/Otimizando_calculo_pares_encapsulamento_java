package treinando_get_set_num;
import java.util.Scanner;

class impressao_resultado {

	public static void main(String[] args) {
		
		Estrutura_calculo res = new Estrutura_calculo();
		
		Scanner num = new Scanner(System.in);
				
		System.out.println("Digite o primeiro n�mero: " );
		int num_1 = num.nextInt();
		
		System.out.println("Digite o Segundo n�mero: " );
		int num_2 = num.nextInt();
	
		int resultado = num_1 + num_2;
		
		res.setRes(resultado);
		res.mostrar_resultado();
		
		System.out.println("Os n�meros pares do soma s�o: " );
		res.setFuncao(resultado);
	}

}
