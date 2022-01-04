package exerciciosComandoFor;
import java.util.Scanner;
public class I10 {

	public static void main(String[] args) {
      int cont, n1, n2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número");
		n1 = sc.nextInt();
		
		System.out.println("Digite o ultimo número");
		n2 = sc.nextInt();
	

		for (cont = n1; cont <= n2; cont++) {
			System.out.println(cont);
		}
		
		if (n1<n2) {
			System.out.println("O número " + n1 + " é o menor, e o número " + n2 + " é o maior");
		}else {
			System.out.println("O número " + n2 + " é o menor, e o número " + n1 + " é o maior");
		}
			

	}

}
