import java.util.Scanner;

public class TesteEntradaDados {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int x;
		String s1, s2, s3;
		
		x = teclado.nextInt();
		teclado.nextLine();
		s1 = teclado.nextLine();
		s2 = teclado.nextLine();
		s3 = teclado.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		teclado.close();
	}

}
