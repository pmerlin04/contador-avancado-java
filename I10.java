package exerciciosComandoFor;
import java.util.Scanner;
public class I10 {

	public static void main(String[] args) {
      int cont, n1, n2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero");
		n1 = sc.nextInt();
		
		System.out.println("Digite o ultimo n�mero");
		n2 = sc.nextInt();
	

		for (cont = n1; cont <= n2; cont++) {
			System.out.println(cont);
		}
		
		if (n1<n2) {
			System.out.println("O n�mero " + n1 + " � o menor, e o n�mero " + n2 + " � o maior");
		}else {
			System.out.println("O n�mero " + n2 + " � o menor, e o n�mero " + n1 + " � o maior");
		}
			

	}

}
