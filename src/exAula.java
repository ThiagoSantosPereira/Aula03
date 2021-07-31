import java.util.Scanner;
public class exAula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lado1, lado2, lado3;
		
		Scanner ladotriangulo = new Scanner(System.in);

		
		System.out.println("Digite o lado 1");
		lado1 = ladotriangulo.nextInt();
		
		System.out.println("Digite o lado 2");
		lado2 = ladotriangulo.nextInt();
		
		System.out.println("Digite o lado 2");
		lado3 = ladotriangulo.nextInt();
		
		if ((lado1 + lado2) < lado3 && (lado2 + lado3) < lado2 && (lado3 + lado1) < lado2)
		{
			System.out.println("Triangulo Existe");
		} else {
			System.out.println("Triangulo Não Existe");
		}
		
		
	}

}
