/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class AsientosPrimeraClase extends javax.swing.JDialog {

    /**
     * Creates new form AsientosPrimeraClase
     */
    public AsientosPrimeraClase(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnA1 = new javax.swing.JButton();
        btnA2 = new javax.swing.JButton();
        btnB1 = new javax.swing.JButton();
        btnB2 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Seleccione los asientos que desea:");

        btnA1.setIcon(new javax.swing.ImageIcon("C:\\Users\\sape\\Pictures\\Saved Pictures\\50x50.png")); // NOI18N
        btnA1.setText("A1");
        btnA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA1ActionPerformed(evt);
            }
        });

        btnA2.setIcon(new javax.swing.ImageIcon("C:\\Users\\sape\\Pictures\\Saved Pictures\\50x50.png")); // NOI18N
        btnA2.setText("A2");
        btnA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA2ActionPerformed(evt);
            }
        });

        btnB1.setIcon(new javax.swing.ImageIcon("C:\\Users\\sape\\Pictures\\Saved Pictures\\50x50.png")); // NOI18N
        btnB1.setText("B1");
        btnB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB1ActionPerformed(evt);
            }
        });

        btnB2.setIcon(new javax.swing.ImageIcon("C:\\Users\\sape\\Pictures\\Saved Pictures\\50x50.png")); // NOI18N
        btnB2.setText("B2");

        btnC1.setIcon(new javax.swing.ImageIcon("C:\\Users\\sape\\Pictures\\Saved Pictures\\50x50.png")); // NOI18N
        btnC1.setText("C1");

        btnC2.setIcon(new javax.swing.ImageIcon("C:\\Users\\sape\\Pictures\\Saved Pictures\\50x50.png")); // NOI18N
        btnC2.setText("C2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnC1)
                        .addGap(18, 18, 18)
                        .addComponent(btnC2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnB1)
                        .addGap(18, 18, 18)
                        .addComponent(btnB2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnA1)
                        .addGap(18, 18, 18)
                        .addComponent(btnA2))
                    .addComponent(jLabel1))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnA1)
                    .addComponent(btnA2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnB1)
                    .addComponent(btnB2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnC1)
                    .addComponent(btnC2))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnA1ActionPerformed

    private void btnA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnA2ActionPerformed

    private void btnB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnB1ActionPerformed

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
            java.util.logging.Logger.getLogger(AsientosPrimeraClase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsientosPrimeraClase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsientosPrimeraClase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsientosPrimeraClase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AsientosPrimeraClase dialog = new AsientosPrimeraClase(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA1;
    private javax.swing.JButton btnA2;
    private javax.swing.JButton btnB1;
    private javax.swing.JButton btnB2;
    private javax.swing.JButton btnC1;
    private javax.swing.JButton btnC2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
