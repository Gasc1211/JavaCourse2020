
import javax.swing.JOptionPane;

public class Exercise_091 {
    public static void main(String[] args) {
        
        float p = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa el precio del auto: "));

        if (p < 500000) {
            p *= 0.9f;
        } else if (p > 550000 && p < 700000) {
            p *= 0.85f;
        } else {
            p *= 0.8f;
        }

        JOptionPane.showMessageDialog(null, "El precio final es de: L. " + p, "Resultado", 3);
    }
}