import java.util.Scanner;

public class TesteDebug {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double largura = teclado.nextDouble();
		double comprimento = teclado.nextDouble();
		double metroQuadrado = teclado.nextDouble();
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		teclado.close();
	}

}
