
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise_120 extends javax.swing.JFrame {

    private static final long serialVersionUID = 4734769275583274300L;
    private JLabel lbl_n1;
    private JLabel lbl_n2;
    private JTextField txt_n1;
    private JTextField txt_n2;
    private JTextField txt_add;
    private JTextField txt_sub;
    private JTextField txt_mul;
    private JTextField txt_div;
    private JCheckBox chk_add;
    private JCheckBox chk_sub;
    private JCheckBox chk_mul;
    private JCheckBox chk_div;
    private JButton btn_exit;
    private JButton btn_clear;

    public Exercise_120() {
        initComponents();
    }

    public void initComponents() {

        // Frame initial setup

        this.setTitle("Operaciones Matemáticas");
        this.setSize(400, 320);
        this.setResizable(false);

        // Panel & GridBag Layout setup

        Container panel = this.getContentPane();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);

        // Labels

        constraints.fill = GridBagConstraints.LINE_START;

        lbl_n1 = new JLabel("Número 1:");
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(lbl_n1, constraints);

        lbl_n2 = new JLabel("Número 2:");
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(lbl_n2, constraints);

        // Text Boxes

        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        txt_n1 = new JTextField(10);
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(txt_n1, constraints);

        txt_n2 = new JTextField(10);
        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(txt_n2, constraints);

        // Results Panel

        JPanel txt_panel = new JPanel(new GridBagLayout());
        txt_panel.setBorder(BorderFactory.createTitledBorder("Resultados"));
        GridBagConstraints cons_txt = new GridBagConstraints();
        cons_txt.insets = new Insets(7, 5, 7, 5);

        // Results Textboxes

        cons_txt.fill = GridBagConstraints.LINE_START;
        cons_txt.anchor = GridBagConstraints.LINE_START;

        txt_add = new JTextField(15);
        txt_add.setEnabled(false);
        cons_txt.gridx = 0;
        cons_txt.gridy = 0;
        txt_panel.add(txt_add, cons_txt);

        txt_sub = new JTextField(15);
        txt_sub.setEnabled(false);
        cons_txt.gridx = 0;
        cons_txt.gridy = 1;
        txt_panel.add(txt_sub, cons_txt);

        txt_mul = new JTextField(15);
        txt_mul.setEnabled(false);
        cons_txt.gridx = 0;
        cons_txt.gridy = 2;
        txt_panel.add(txt_mul, cons_txt);

        txt_div = new JTextField(15);
        txt_div.setEnabled(false);
        cons_txt.gridx = 0;
        cons_txt.gridy = 3;
        txt_panel.add(txt_div, cons_txt);

        constraints.gridx = 1;
        constraints.gridy = 2;
        panel.add(txt_panel, constraints);

        // Operations Panel

        JPanel chk_panel = new JPanel(new GridBagLayout());
        chk_panel.setBorder(BorderFactory.createTitledBorder("Operaciones"));
        GridBagConstraints cons_chk = new GridBagConstraints();
        cons_chk.insets = new Insets(5, 5, 5, 5);

        // Operations Checkboxes

        cons_chk.fill = GridBagConstraints.LINE_START;
        cons_chk.anchor = GridBagConstraints.LINE_START;

        chk_add = new JCheckBox("Suma");
        chk_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operate(chk_add, txt_add, '+');
            }
        });
        cons_chk.gridx = 0;
        cons_chk.gridy = 0;
        chk_panel.add(chk_add, cons_chk);

        chk_sub = new JCheckBox("Resta");
        chk_sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operate(chk_sub, txt_sub, '-');
            }
        });
        cons_chk.gridx = 0;
        cons_chk.gridy = 1;
        chk_panel.add(chk_sub, cons_chk);

        chk_mul = new JCheckBox("Multiplicación");
        chk_mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operate(chk_mul, txt_mul, '*');
            }
        });
        cons_chk.gridx = 0;
        cons_chk.gridy = 2;
        chk_panel.add(chk_mul, cons_chk);

        chk_div = new JCheckBox("División");
        chk_div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operate(chk_div, txt_div, '/');
            }
        });
        cons_chk.gridx = 0;
        cons_chk.gridy = 3;
        chk_panel.add(chk_div, cons_chk);

        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(chk_panel, constraints);

        // Buttons

        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        btn_exit = new JButton("Salir");
        btn_exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn_exitAction();
            }
        });
        constraints.gridx = 1;
        constraints.gridy = 3;
        panel.add(btn_exit, constraints);

        btn_clear = new JButton("Limpiar");
        btn_clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn_clearAction();
            }
        });
        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(btn_clear, constraints);

        // Frame final setup

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void operate(JCheckBox chk, JTextField txt, char operation) {

        Double n1 = Double.parseDouble(txt_n1.getText());
        Double n2 = Double.parseDouble(txt_n2.getText());
        Double result = 0.0;

        if (chk.isSelected()) {
            switch (operation) {
                case '+':
                    result = n1 + n2;
                    break;
                case '-':
                    result = n1 - n2;
                    break;
                case '*':
                    result = n1 * n2;
                    break;
                case '/':
                    result = n1 / n2;
                    break;
            }
            txt.setText(String.format(" = %.2f", result));
        } else {
            txt.setText("Operación no seleccionada.");
        }
    }

    private void btn_exitAction() {
        System.exit(0);
    }

    private void btn_clearAction() {
        txt_n1.setText("");
        txt_n2.setText("");
        txt_add.setText("");
        txt_sub.setText("");
        txt_mul.setText("");
        txt_div.setText("");
        chk_add.setSelected(false);
        chk_sub.setSelected(false);
        chk_mul.setSelected(false);
        chk_div.setSelected(false);
    }

    public static void main(String[] args) {
        new Exercise_120();
    }
}