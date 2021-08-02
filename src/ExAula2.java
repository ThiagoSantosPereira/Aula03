import java.util.Scanner;
public class ExAula2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lado1, lado2, lado3;
		
		Scanner ladotriangulo = new Scanner(System.in);

		
		System.out.println("Digite o lado 1");
		lado1 = ladotriangulo.next();
		
		System.out.println("Digite o lado 2");
		lado2 = ladotriangulo.next();
		
		System.out.println("Digite o lado 2");
		lado3 = ladotriangulo.next();
		
		if (lado1.equals(lado2) & lado2.equals(lado3) & lado3.equals(lado1))
		{
			System.out.println("Triangulo Equilátero");
		} else if (!lado1.equals(lado2) & !lado2.equals(lado3) & !lado3.equals(lado1))
			{
				System.out.println("Triangulo Escaleno");
				
			} else {
					System.out.println("Triangulo Isóceles");
				
				}
			
				
			}
		}
		
		
	

