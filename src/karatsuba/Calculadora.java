package karatsuba;

import java.math.BigInteger;
import javax.swing.JOptionPane;

public class Calculadora extends javax.swing.JFrame {

    public static BigInteger numA, numB, valorFinal, neg;
    public Calculadora() {
        neg = BigInteger.valueOf(1);
        initComponents();
    }

    public static BigInteger Karatsuba(BigInteger a, BigInteger b){
    BigInteger a1, a0, b1, b0, z0, z1, z2;
    int n, base = 10;
        if (a.compareTo(BigInteger.valueOf(10)) < 0 &&
                b.compareTo(BigInteger.valueOf(10)) < 0)
            return a.multiply(b);
        if (a.compareTo(b)== 1)
            n = a.toString().length();
        else
            n = b.toString().length();
        n = n / 2 + n % 2;
        a1 = a.divide(BigInteger.valueOf(10).pow(n));
        a0 = a.mod(BigInteger.valueOf(10).pow(n));
        b1 = b.divide(BigInteger.valueOf(10).pow(n));
        b0 = b.mod(BigInteger.valueOf(10).pow(n));
        z2 = Karatsuba(a1, b1);
        z0 = Karatsuba(a0, b0);
        z1 = Karatsuba(a1.add(a0),(b1.add(b0))).subtract(z2).subtract(z0);
        valorFinal = z2.multiply(BigInteger.valueOf((int)Math.pow(base,2*n)))
            .add(z1.multiply(BigInteger.valueOf((int)Math.pow(base,n)))).add(z0);
        return valorFinal;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        numA_txt = new javax.swing.JTextField();
        numB_txt = new javax.swing.JTextField();
        numA_lb = new javax.swing.JLabel();
        numB_lb = new javax.swing.JLabel();
        multip_btn = new javax.swing.JButton();
        salir_btn = new javax.swing.JButton();
        res_lb = new javax.swing.JLabel();
        res_txt = new javax.swing.JTextField();
        limpiar_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Multiplicador de Karatsuba");
        setAlwaysOnTop(true);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        numA_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numA_txtKeyPressed(evt);
            }
        });

        numB_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numB_txtKeyPressed(evt);
            }
        });

        numA_lb.setText("Número A");

        numB_lb.setText("Número B");

        multip_btn.setText("Multiplicar");
        multip_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multip_btnActionPerformed(evt);
            }
        });

        salir_btn.setText("SALIR");
        salir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir_btnActionPerformed(evt);
            }
        });

        res_lb.setText("Resultado");

        res_txt.setBackground(new java.awt.Color(255, 255, 255));
        res_txt.setEditable(false);
        res_txt.setFocusable(false);

        limpiar_btn.setText("LIMPIAR");
        limpiar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numA_lb)
                    .addComponent(numB_lb)
                    .addComponent(res_lb)
                    .addComponent(numA_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numB_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(res_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(multip_btn)
                .addGap(108, 108, 108))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(limpiar_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(salir_btn)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(numA_lb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numA_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(numB_lb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numB_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(multip_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(res_lb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(res_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiar_btn)
                    .addComponent(salir_btn))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir_btnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salir_btnActionPerformed

    private void numA_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numA_txtKeyPressed
        char key=evt.getKeyChar();
        if (key < 45 || key > 57 || key == 46 || key == 47){
            JOptionPane.showMessageDialog(this, "Debe ingresar solo números");
            evt.setKeyChar(' ');
            numA_txt.setText(null);
        }
    }//GEN-LAST:event_numA_txtKeyPressed

    private void numB_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numB_txtKeyPressed
        char key=evt.getKeyChar();
        if (key < 45 || key > 57 || key == 46 || key == 47){
            JOptionPane.showMessageDialog(this, "Debe ingresar solo números");
            evt.setKeyChar(' ');
            numB_txt.setText(null);
        }
    }//GEN-LAST:event_numB_txtKeyPressed

    private void limpiar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar_btnActionPerformed
            numA_txt.setText(null);
            numB_txt.setText(null);
            res_txt.setText(null);
            neg = BigInteger.valueOf(1);
            multip_btn.setEnabled(true);
    }//GEN-LAST:event_limpiar_btnActionPerformed

    private void multip_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multip_btnActionPerformed
        if (numA_txt.getText().isEmpty() || numB_txt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe ingresar los dos números");
        }
        else {
            if (numA_txt.getText().startsWith("-")){
                neg = neg.multiply(BigInteger.valueOf(-1));
            }
            if (numB_txt.getText().startsWith("-")){
                neg = neg.multiply(BigInteger.valueOf(-1));
            }
        }
        numA = BigInteger.valueOf(Integer.parseInt(numA_txt.getText().replace("-", "").toString()));
        numB = BigInteger.valueOf(Integer.parseInt(numB_txt.getText().replace("-", "").toString()));
        valorFinal = BigInteger.valueOf(0);
        res_txt.setText(Karatsuba(numA, numB).multiply(neg).toString());
        multip_btn.setEnabled(false);
    }//GEN-LAST:event_multip_btnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiar_btn;
    private javax.swing.JButton multip_btn;
    private javax.swing.JLabel numA_lb;
    private javax.swing.JTextField numA_txt;
    private javax.swing.JLabel numB_lb;
    private javax.swing.JTextField numB_txt;
    private javax.swing.JLabel res_lb;
    private javax.swing.JTextField res_txt;
    private javax.swing.JButton salir_btn;
    // End of variables declaration//GEN-END:variables

}
