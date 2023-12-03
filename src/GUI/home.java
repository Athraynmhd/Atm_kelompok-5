/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 * Class untuk memperlihatkan menu home bagi nasabah yang sudah login
 */
public class home extends javax.swing.JFrame {
    private static String norek;
    /**
     * Creates new form home
     */
    public home(String norek) {
        this.norek = norek;
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SetorBTN = new javax.swing.JButton();
        tarikTunaiBTN = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        saldoBTN = new javax.swing.JButton();
        transferBTN = new javax.swing.JButton();
        ubahPINbtn = new javax.swing.JButton();
        KeluarBTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        KeluarBTN1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(580, 480));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("  BERANDA");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(221, 182, 70)));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 160, 40));

        SetorBTN.setBackground(new java.awt.Color(221, 182, 70));
        SetorBTN.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 18)); // NOI18N
        SetorBTN.setForeground(new java.awt.Color(255, 255, 255));
        SetorBTN.setText("Setor");
        SetorBTN.setBorderPainted(false);
        SetorBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SetorBTNMouseClicked(evt);
            }
        });
        SetorBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetorBTNActionPerformed(evt);
            }
        });
        jPanel2.add(SetorBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 200, 40));

        tarikTunaiBTN.setBackground(new java.awt.Color(221, 182, 70));
        tarikTunaiBTN.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 18)); // NOI18N
        tarikTunaiBTN.setForeground(new java.awt.Color(255, 255, 255));
        tarikTunaiBTN.setText(" Tarik");
        tarikTunaiBTN.setBorderPainted(false);
        tarikTunaiBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tarikTunaiBTNMouseClicked(evt);
            }
        });
        tarikTunaiBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarikTunaiBTNActionPerformed(evt);
            }
        });
        jPanel2.add(tarikTunaiBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 200, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Xiangyun PNG Image, Xiangyun Traditional Pattern, Classical Clouds Pattern, Golden Clouds, Traditional Pattern PNG Image For Free Download.jpg"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Xiangyun PNG Image, Xiangyun Traditional Pattern, Classical Clouds Pattern, Golden Clouds, Traditional Pattern PNG Image For Free Download.jpg"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 620, 30));

        saldoBTN.setBackground(new java.awt.Color(221, 182, 70));
        saldoBTN.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 18)); // NOI18N
        saldoBTN.setForeground(new java.awt.Color(255, 255, 255));
        saldoBTN.setText(" Informasi Saldo");
        saldoBTN.setBorderPainted(false);
        saldoBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saldoBTNMouseClicked(evt);
            }
        });
        saldoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoBTNActionPerformed(evt);
            }
        });
        jPanel2.add(saldoBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 200, 40));

        transferBTN.setBackground(new java.awt.Color(221, 182, 70));
        transferBTN.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 18)); // NOI18N
        transferBTN.setForeground(new java.awt.Color(255, 255, 255));
        transferBTN.setText("Transfer");
        transferBTN.setBorderPainted(false);
        transferBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transferBTNMouseClicked(evt);
            }
        });
        transferBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferBTNActionPerformed(evt);
            }
        });
        jPanel2.add(transferBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 200, 40));

        ubahPINbtn.setBackground(new java.awt.Color(221, 182, 70));
        ubahPINbtn.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 18)); // NOI18N
        ubahPINbtn.setForeground(new java.awt.Color(255, 255, 255));
        ubahPINbtn.setText("Ubah PIN");
        ubahPINbtn.setBorderPainted(false);
        ubahPINbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ubahPINbtnMouseClicked(evt);
            }
        });
        ubahPINbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahPINbtnActionPerformed(evt);
            }
        });
        jPanel2.add(ubahPINbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 200, 40));

        KeluarBTN.setBackground(new java.awt.Color(221, 182, 70));
        KeluarBTN.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 18)); // NOI18N
        KeluarBTN.setForeground(new java.awt.Color(255, 255, 255));
        KeluarBTN.setText("Profil");
        KeluarBTN.setBorderPainted(false);
        KeluarBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KeluarBTNMouseClicked(evt);
            }
        });
        KeluarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarBTNActionPerformed(evt);
            }
        });
        jPanel2.add(KeluarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 200, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/LOGOK (1).png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 130, 100));

        KeluarBTN1.setBackground(new java.awt.Color(221, 182, 70));
        KeluarBTN1.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 18)); // NOI18N
        KeluarBTN1.setForeground(new java.awt.Color(255, 255, 255));
        KeluarBTN1.setText("Keluar");
        KeluarBTN1.setBorderPainted(false);
        KeluarBTN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KeluarBTN1MouseClicked(evt);
            }
        });
        KeluarBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarBTN1ActionPerformed(evt);
            }
        });
        jPanel2.add(KeluarBTN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 160, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background_1.jpg"))); // NOI18N
        jLabel2.setToolTipText("");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SetorBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetorBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SetorBTNActionPerformed

    private void tarikTunaiBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarikTunaiBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tarikTunaiBTNActionPerformed

    private void saldoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saldoBTNActionPerformed

    private void transferBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transferBTNActionPerformed

    private void ubahPINbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahPINbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ubahPINbtnActionPerformed

    private void KeluarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KeluarBTNActionPerformed
    
    /**
     * Method untuk menampilkan design dari class tarikTunai
     * ketika button "Tarik Tunai" di click
     * @param evt 
     */
    private void tarikTunaiBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tarikTunaiBTNMouseClicked
        tariktunai tariktunai = new tariktunai(norek);
        tariktunai.setVisible(true);
        dispose();
    }//GEN-LAST:event_tarikTunaiBTNMouseClicked
    
    /**
     * Method untuk menampilkan design dari class Profil
     * ketika button "Profil" di click
     * @param evt 
     */
    private void KeluarBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KeluarBTNMouseClicked
        profil profil = new profil(norek);
        profil.setVisible(true);
        dispose();
    }//GEN-LAST:event_KeluarBTNMouseClicked
    
    /**
     * Method untuk menampilkan design dari class Saldo
     * ketika button "Informasi Saldo" di click
     * @param evt 
     */
    private void saldoBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saldoBTNMouseClicked
        saldo Saldo = new saldo(norek);
        Saldo.setVisible(true);
        dispose();
    }//GEN-LAST:event_saldoBTNMouseClicked
    
    /**
     * Method untuk menampilkan design dari class Transfer
     * ketika button "Transfer" di click
     * @param evt 
     */
    private void transferBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferBTNMouseClicked
        transfer tf = new transfer(norek);
        tf.setVisible(true);
        dispose();
    }//GEN-LAST:event_transferBTNMouseClicked
    
    /**
     * Method untuk menampilkan design dari class setorTunai
     * ketika button "Setor Tunai" di click
     * @param evt 
     */
    private void SetorBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SetorBTNMouseClicked
        setorTunai setor = new setorTunai(norek);
        setor.setVisible(true);
        dispose();
    }//GEN-LAST:event_SetorBTNMouseClicked
    
    /**
     * Method untuk menampilkan design dari class ubahPIN
     * ketika button "Ubah PIN" di click
     * @param evt 
     */
    private void ubahPINbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ubahPINbtnMouseClicked
        ubahPIN ubah = new ubahPIN(norek);
        ubah.setVisible(true);
        dispose();
    }//GEN-LAST:event_ubahPINbtnMouseClicked
    
    /**
     * Method untuk menampilkan design dari class login
     * ketika button "Keluar" di click
     * @param evt 
     */
    private void KeluarBTN1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KeluarBTN1MouseClicked
        login log = new login();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_KeluarBTN1MouseClicked

    private void KeluarBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarBTN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KeluarBTN1ActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home(norek).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton KeluarBTN;
    private javax.swing.JButton KeluarBTN1;
    private javax.swing.JButton SetorBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton saldoBTN;
    private javax.swing.JButton tarikTunaiBTN;
    private javax.swing.JButton transferBTN;
    private javax.swing.JButton ubahPINbtn;
    // End of variables declaration//GEN-END:variables
}
