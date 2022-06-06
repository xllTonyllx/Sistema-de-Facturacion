package Package;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Factura extends JFrame {

    public Factura(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        calcularTotal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double c1,c2,p_u1,p_u2,vt1,vt2,sub,tot,igv;
                c1=Double.parseDouble(Cant1.getText());
                c2=Double.parseDouble(Cant2.getText());
                p_u1=Double.parseDouble(P_Unit1.getText());
                p_u2=Double.parseDouble(P_Unit2.getText());
                vt1 = c1 * p_u1;
                vt2 = c2 * p_u2;
                sub = vt1 + vt2;
                calculoSubtotal.setText(sub.toString());
                Imp1.setText(vt1.toString());
                Imp2.setText(vt2.toString());
                igv = sub*0.18;
                calculoIGV.setText(igv.toString());
                tot = sub+igv;
                calculoTotal.setText(tot.toString());
            }
        });
    }
    private JPanel mainPanel;
    private JTextField Cant1;
    private JTextField Prod1;
    private JTextField P_Unit1;
    private JTextField Imp1;
    private JTextField Cant2;
    private JTextField Prod2;
    private JTextField P_Unit2;
    private JTextField Imp2;
    private JTextField calculoSubtotal;
    private JTextField calculoIGV;
    private JTextField calculoTotal;
    private JButton calcularTotal;
    private JLabel Subtotal;
    private JLabel IGV;
    private JLabel Total;
    private JLabel Cantidad;
    private JLabel Producto;
    private JLabel Precio_Unitario;
    private JLabel Importe;

    public static void main(String[] args) {
        JFrame frame = new Factura("Factura");
        frame.setVisible(true);
    }
}
