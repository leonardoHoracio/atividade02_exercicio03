/* Criar uma aplicação em Java que tenha uma função recursiva que,
recebendo um número inteiro (N), apresente a saída da somatória
ss = 1 +
1
2 +
1
3 +
1
4 + … +
1
 O Código deve apresentar, em formato de comentário, como foi definida a
condição de parada;
 O Código deve apresentar, em formato de comentário, como foi definida a
relação de chamada dos passos;*/


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
