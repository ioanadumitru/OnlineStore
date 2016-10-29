
package databaseinterface;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;


public class MagazinOnlineFirstPage extends javax.swing.JFrame {

    public MagazinOnlineFirstPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        placiVideo = new javax.swing.JTextField();
        Procesoare = new javax.swing.JTextField();
        Monitoare = new javax.swing.JTextField();
        Carcase = new javax.swing.JTextField();
        boxe = new javax.swing.JTextField();
        placiBaza = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        produse = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1000, 1000));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 0, 153));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Componente PC");

        placiVideo.setEditable(false);
        placiVideo.setBackground(new java.awt.Color(0, 51, 255));
        placiVideo.setForeground(new java.awt.Color(255, 255, 255));
        placiVideo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        placiVideo.setText("Placi video");
        placiVideo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                placiVideoMouseClicked(evt);
            }
        });

        Procesoare.setEditable(false);
        Procesoare.setBackground(new java.awt.Color(0, 51, 255));
        Procesoare.setForeground(new java.awt.Color(255, 255, 255));
        Procesoare.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Procesoare.setText("Procesoare");
        Procesoare.setPreferredSize(new java.awt.Dimension(96, 20));
        Procesoare.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProcesoareMouseClicked(evt);
            }
        });
        Procesoare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcesoareActionPerformed(evt);
            }
        });

        Monitoare.setEditable(false);
        Monitoare.setBackground(new java.awt.Color(0, 51, 255));
        Monitoare.setForeground(new java.awt.Color(255, 255, 255));
        Monitoare.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Monitoare.setText("Monitoare");
        Monitoare.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MonitoareMouseClicked(evt);
            }
        });

        Carcase.setEditable(false);
        Carcase.setBackground(new java.awt.Color(0, 51, 255));
        Carcase.setForeground(new java.awt.Color(255, 255, 255));
        Carcase.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Carcase.setText("Carcase");
        Carcase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CarcaseMouseClicked(evt);
            }
        });

        boxe.setEditable(false);
        boxe.setBackground(new java.awt.Color(0, 51, 255));
        boxe.setForeground(new java.awt.Color(255, 255, 255));
        boxe.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        boxe.setText("Boxe");
        boxe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boxeMouseClicked(evt);
            }
        });

        placiBaza.setEditable(false);
        placiBaza.setBackground(new java.awt.Color(0, 51, 255));
        placiBaza.setForeground(new java.awt.Color(255, 255, 255));
        placiBaza.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        placiBaza.setText("Placi de baza");
        placiBaza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                placiBazaMouseClicked(evt);
            }
        });

        produse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ComponentID", "CodProdus", "Pret", "Marca", "An Fabricatie", "Garantie", "Producator", "Tara Provenienta", "Stoc"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(produse);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Procesoare, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                        .addComponent(Monitoare)
                        .addComponent(Carcase)
                        .addComponent(boxe)
                        .addComponent(placiBaza))
                    .addComponent(placiVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
                .addGap(425, 425, 425))
            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(placiVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Procesoare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Monitoare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Carcase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(placiBaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(459, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void populateTableViewModel(int id)
    {
        DataBaseConnection database = DataBaseConnection.getInstance();
        ResultSet result = database.getResultForSpecificComponent(id);
        String columnsName[] = {"ComponentID","Cod Produs", "Pret", "Marca", "An Fabricatie", "Garantie", "Producator", "Tara Provenienta", "Stoc"};
        int columnsNumber = columnsName.length;
        DefaultTableModel tableModel = new DefaultTableModel(columnsName, columnsNumber);
        try
        {
            while(result.next())
            {
             Object[] row = new Object[columnsNumber];
                for(int i=0; i<columnsNumber; i++)
                    row[i]=result.getObject(i+1);
              tableModel.addRow(row);      
            }
            
            produse.setModel(tableModel);
        }catch(Exception e)
        {
            e.toString();
        }
    }
//"placaVideo", "procesor", "monitor", "carcasa", "boxe", "placaDeBaza    
    private void ProcesoareMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProcesoareMouseClicked
        populateTableViewModel(1);
    }//GEN-LAST:event_ProcesoareMouseClicked

    private void placiVideoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placiVideoMouseClicked
        populateTableViewModel(0);
    }//GEN-LAST:event_placiVideoMouseClicked

    private void MonitoareMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MonitoareMouseClicked
        populateTableViewModel(2);
    }//GEN-LAST:event_MonitoareMouseClicked

    private void CarcaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CarcaseMouseClicked
        populateTableViewModel(3);
    }//GEN-LAST:event_CarcaseMouseClicked

    private void boxeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxeMouseClicked
        populateTableViewModel(4);
    }//GEN-LAST:event_boxeMouseClicked

    private void placiBazaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placiBazaMouseClicked
        populateTableViewModel(5);
    }//GEN-LAST:event_placiBazaMouseClicked

    private void ProcesoareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcesoareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProcesoareActionPerformed

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
            java.util.logging.Logger.getLogger(MagazinOnlineFirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MagazinOnlineFirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MagazinOnlineFirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MagazinOnlineFirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MagazinOnlineFirstPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Carcase;
    private javax.swing.JTextField Monitoare;
    private javax.swing.JTextField Procesoare;
    private javax.swing.JTextField boxe;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField placiBaza;
    private javax.swing.JTextField placiVideo;
    private javax.swing.JTable produse;
    // End of variables declaration//GEN-END:variables
}
