
import java.util.Random;

public class Exercise_081{
    public static void main(String[] args) {
        
        Random r = new Random();
        int n = r.nextInt(10) + 5 ;

        System.out.printf("El número es: %d.\n", n);

        System.out.printf("Las posibles combinaciones que dan %d son:\n", n);
        for(int i = 0; i < (n / 2) + 1; i++){
            System.out.printf("%d + %d = %d.\n", i, (n - i), n);
        }
        
    }
}