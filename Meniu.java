
import databaseinterface.AdaugareProdus;
import databaseinterface.DataBaseConnection;
import databaseinterface.MagazinOnlineFirstPage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ioana
 */
public class Meniu extends javax.swing.JFrame {

    public Meniu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        conectare = new javax.swing.JButton();
        incarcareProduse = new javax.swing.JButton();
        optiuniProduse = new javax.swing.JButton();
        vanzareProduse = new javax.swing.JButton();
        adaugareProdus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        conectare.setBackground(new java.awt.Color(255, 255, 255));
        conectare.setText("Conectare");
        conectare.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                conectareMouseClicked(evt);
            }
        });
        conectare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectareActionPerformed(evt);
            }
        });

        incarcareProduse.setBackground(new java.awt.Color(255, 255, 255));
        incarcareProduse.setText("Incarcare produse");
        incarcareProduse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incarcareProduseActionPerformed(evt);
            }
        });

        optiuniProduse.setBackground(new java.awt.Color(255, 255, 255));
        optiuniProduse.setText("Operatiuni Produse");
        optiuniProduse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optiuniProduseActionPerformed(evt);
            }
        });

        vanzareProduse.setBackground(new java.awt.Color(255, 255, 255));
        vanzareProduse.setText("Vizualizare Produse");
        vanzareProduse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vanzareProduseActionPerformed(evt);
            }
        });

        adaugareProdus.setBackground(new java.awt.Color(255, 255, 255));
        adaugareProdus.setText("Adaugare Produs");
        adaugareProdus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaugareProdusActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 51, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to  mysql  MagazinOnline!");

        jButton1.setText("Afisare pret produse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vanzareProduse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(optiuniProduse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(conectare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(incarcareProduse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adaugareProdus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(conectare)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(incarcareProduse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(optiuniProduse)
                .addGap(13, 13, 13)
                .addComponent(vanzareProduse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adaugareProdus)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void incarcareProduseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incarcareProduseActionPerformed
        // TODO add your handling code here:
        createDatabase create = new createDatabase();
        create.setVisible(true);
    }//GEN-LAST:event_incarcareProduseActionPerformed

    private void conectareMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conectareMouseClicked
       Connect con = new Connect();
        con.setVisible(true);
        DataBaseConnection c = DataBaseConnection.getInstance();
    }//GEN-LAST:event_conectareMouseClicked

    private void optiuniProduseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optiuniProduseActionPerformed
        operatiuniProduse optiuni = new operatiuniProduse();
        optiuni.setVisible(true);
    }//GEN-LAST:event_optiuniProduseActionPerformed

    private void vanzareProduseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vanzareProduseActionPerformed
        MagazinOnlineFirstPage page = new MagazinOnlineFirstPage();
        page.setVisible(true);
    }//GEN-LAST:event_vanzareProduseActionPerformed

    private void adaugareProdusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaugareProdusActionPerformed
        AdaugareProdus adauga = new AdaugareProdus();
        adauga.setVisible(true);
    }//GEN-LAST:event_adaugareProdusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cautarePret cautare = new cautarePret();
        cautare.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void conectareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectareActionPerformed
         Connect con = new Connect();
        con.setVisible(false);
        DataBaseConnection c = DataBaseConnection.getInstance();
    }//GEN-LAST:event_conectareActionPerformed

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
            java.util.logging.Logger.getLogger(Meniu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Meniu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Meniu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Meniu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Meniu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adaugareProdus;
    private javax.swing.JButton conectare;
    private javax.swing.JButton incarcareProduse;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton optiuniProduse;
    private javax.swing.JButton vanzareProduse;
    // End of variables declaration//GEN-END:variables
}
