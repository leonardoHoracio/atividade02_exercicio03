/* Criar uma aplica��o em Java que tenha uma fun��o recursiva que,
recebendo um n�mero inteiro (N), apresente a sa�da da somat�ria
ss = 1 +
1
2 +
1
3 +
1
4 + � +
1
 O C�digo deve apresentar, em formato de coment�rio, como foi definida a
condi��o de parada;
 O C�digo deve apresentar, em formato de coment�rio, como foi definida a
rela��o de chamada dos passos;*/


public class main {

	public static void main(String[] args) {
		double n = 3;
		double total = funcaoRecursiva(n);
		System.out.println(total);

	}

	private static double funcaoRecursiva(double n) {
		if (n == 1) { //cond de parada
			return 1;
		}
		else {
			double div = 1 / n;
			n = n - 1;
			return div + funcaoRecursiva(n); //calculo funcao
		}	
	}
}
