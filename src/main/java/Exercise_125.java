
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise_125 extends JFrame {

    private static final long serialVersionUID = 8378542846522822976L;

    private String colores[] = { "rojo", "verde", "azul", "naranja", "amarillo" };
    private JFrame refval = this;
    private JComboBox<String> seleccion;

    public Exercise_125() {
        initComponents();
    }

    public void initComponents() {
        this.setResizable(false);
        this.setSize(300, 100);

        JPanel root = new JPanel();
        this.add(root);

        seleccion = new JComboBox<>(colores);
        seleccion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refval.setTitle(String.valueOf(seleccion.getSelectedItem()));
            }
        });
        root.add(seleccion);

        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Exercise_125();
    }
}