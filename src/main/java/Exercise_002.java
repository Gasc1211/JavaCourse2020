
import java.util.Scanner;

public class Exercise_002 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float n1,n2,n3,n4;
		
		System.out.println("Ingresa cuatro números: ");
		
		n1 = sc.nextFloat();
		n2 = sc.nextFloat();
		n3 = sc.nextFloat();
		n4 = sc.nextFloat();
		
		System.out.printf("Los resultados son: %.2f, %.2f.",(n1+n2), (n3*n4));
		
		sc.close();
	}

}
