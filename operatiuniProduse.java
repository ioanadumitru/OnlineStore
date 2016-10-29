
import databaseinterface.DataBaseConnection;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ioana
 */
public class operatiuniProduse extends javax.swing.JFrame {

    /**
     * Creates new form operatiuniProduse
     */
    public operatiuniProduse() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        codBare = new javax.swing.JTextField();
        vanzareProdus = new javax.swing.JButton();
        stergeProdus = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        stocNou = new javax.swing.JTextField();
        incarcaStoc = new javax.swing.JButton();
        componentePc = new javax.swing.JComboBox<>();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        Total = new javax.swing.JTextField();
        calculeazaTotal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 153, 255));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Operatiuni Produse");

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(102, 153, 255));
        jTextField2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Cod de bare:");

        vanzareProdus.setText("Vanzare Produs");
        vanzareProdus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vanzareProdusMouseClicked(evt);
            }
        });

        stergeProdus.setText("Sterge Produs");
        stergeProdus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stergeProdusMouseClicked(evt);
            }
        });

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(102, 153, 255));
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("Stoc nou:");

        stocNou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stocNouActionPerformed(evt);
            }
        });

        incarcaStoc.setBackground(new java.awt.Color(0, 51, 255));
        incarcaStoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        incarcaStoc.setForeground(new java.awt.Color(255, 255, 255));
        incarcaStoc.setText("Incarca Stoc");
        incarcaStoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                incarcaStocMouseClicked(evt);
            }
        });

        componentePc.setBackground(new java.awt.Color(102, 102, 255));
        componentePc.setForeground(new java.awt.Color(255, 255, 255));
        componentePc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Placa Video", "Procesor", "Monitoare", "Carcase", "Boxe", "Placa de baza" }));

        jTextField6.setBackground(new java.awt.Color(102, 153, 255));
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("Afisare suma totala pentru produsele din categoria selectata:");

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(51, 102, 255));
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("Suma totala:");

        Total.setEditable(false);
        Total.setBackground(new java.awt.Color(102, 102, 255));
        Total.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Total.setForeground(new java.awt.Color(255, 255, 255));
        Total.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        calculeazaTotal.setText("Calculare total");
        calculeazaTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculeazaTotalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(componentePc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(calculeazaTotal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(codBare, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(stocNou, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(incarcaStoc))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(vanzareProdus)
                                .addGap(61, 61, 61)
                                .addComponent(stergeProdus))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codBare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vanzareProdus)
                    .addComponent(stergeProdus))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stocNou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(incarcaStoc)
                    .addComponent(jTextField4))
                .addGap(34, 34, 34)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(componentePc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calculeazaTotal))
                .addGap(0, 42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stocNouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stocNouActionPerformed
        
    }//GEN-LAST:event_stocNouActionPerformed

    private void vanzareProdusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vanzareProdusMouseClicked
        DataBaseConnection dataBase = DataBaseConnection.getInstance();
        String cod = codBare.getText();
        dataBase.vanzareProdus(cod);
        setVisible(false);
    }//GEN-LAST:event_vanzareProdusMouseClicked

    private void stergeProdusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stergeProdusMouseClicked
        DataBaseConnection dataBase = DataBaseConnection.getInstance();
        String cod = codBare.getText();
        dataBase.stergereProdus(cod);
        setVisible(false);
    }//GEN-LAST:event_stergeProdusMouseClicked

    private void calculeazaTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculeazaTotalMouseClicked
        DataBaseConnection dataBase = DataBaseConnection.getInstance();
        int selectedItem = componentePc.getSelectedIndex();
        double total = dataBase.calculeazaSumaTotalaComponenta(selectedItem);
        String t = Double.toString(total);
        Total.setText(t);
    }//GEN-LAST:event_calculeazaTotalMouseClicked

    private void incarcaStocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_incarcaStocMouseClicked
        DataBaseConnection dataBase = DataBaseConnection.getInstance();
        String cod = codBare.getText();
        String stoc = stocNou.getText();
        int s = Integer.parseInt(stoc);
        dataBase.incarcareStoc(cod, s);
        setVisible(false);
    }//GEN-LAST:event_incarcaStocMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(operatiuniProduse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(operatiuniProduse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(operatiuniProduse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(operatiuniProduse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new operatiuniProduse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Total;
    private javax.swing.JButton calculeazaTotal;
    private javax.swing.JTextField codBare;
    private javax.swing.JComboBox<String> componentePc;
    private javax.swing.JButton incarcaStoc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JButton stergeProdus;
    private javax.swing.JTextField stocNou;
    private javax.swing.JButton vanzareProdus;
    // End of variables declaration//GEN-END:variables
}
