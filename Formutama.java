/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author Jon
 */
public class Formutama extends javax.swing.JFrame {

    /**
     * Creates new form Formutama
     */
    koneksi k;
    
    public Formutama() {
        initComponents();
         k = new koneksi();
    }

         
        
        
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmenupaket = new javax.swing.JMenuItem();
        jmenukeluar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmenutransaksi = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/un.png"))); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/MENU copy.png"))); // NOI18N
        jMenu1.setText("Pilihan");

        jmenupaket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/edit_f2.png"))); // NOI18N
        jmenupaket.setText("Paket Makanan");
        jmenupaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenupaketActionPerformed(evt);
            }
        });
        jMenu1.add(jmenupaket);

        jmenukeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/2leftarrow.png"))); // NOI18N
        jmenukeluar.setText("Keluar");
        jmenukeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenukeluarActionPerformed(evt);
            }
        });
        jMenu1.add(jmenukeluar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Transaksi");

        jmenutransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/absen.png"))); // NOI18N
        jmenutransaksi.setText("Transaksi Penjualan");
        jmenutransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenutransaksiActionPerformed(evt);
            }
        });
        jMenu2.add(jmenutransaksi);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmenukeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenukeluarActionPerformed
            
        Login lgn = new Login();
        this.setVisible(false);
        lgn.setVisible(true);
    }//GEN-LAST:event_jmenukeluarActionPerformed

    private void jmenupaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenupaketActionPerformed
            this.setVisible(false);
            new Makanan().setVisible(true);
    }//GEN-LAST:event_jmenupaketActionPerformed

    private void jmenutransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenutransaksiActionPerformed
        this.setVisible(false);
        new Transaksi().setVisible(true);
    }//GEN-LAST:event_jmenutransaksiActionPerformed

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
            java.util.logging.Logger.getLogger(Formutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formutama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmenukeluar;
    private javax.swing.JMenuItem jmenupaket;
    private javax.swing.JMenuItem jmenutransaksi;
    // End of variables declaration//GEN-END:variables
}
