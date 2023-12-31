/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Class.Akun;
import javax.swing.JOptionPane;

/**
 * Class untuk mengubah PIN
 */
public class ubahPIN extends javax.swing.JFrame {
    private static String norek;
    /**
     * Creates new form transfer
     */
    public ubahPIN(String norek) {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pinlamatxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pinBarutxt = new javax.swing.JTextField();
        kembaliBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ubahBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset-password (1).png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 370, 400));

        jLabel2.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PIN Lama");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 70, 38));

        pinlamatxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pinlamatxt.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(221, 182, 70)));
        pinlamatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinlamatxtActionPerformed(evt);
            }
        });
        jPanel2.add(pinlamatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 270, 32));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Xiangyun PNG Image, Xiangyun Traditional Pattern, Classical Clouds Pattern, Golden Clouds, Traditional Pattern PNG Image For Free Download.jpg"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 620, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Xiangyun PNG Image, Xiangyun Traditional Pattern, Classical Clouds Pattern, Golden Clouds, Traditional Pattern PNG Image For Free Download.jpg"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 30));

        jLabel3.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PIN Baru");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 70, 38));

        pinBarutxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pinBarutxt.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(221, 182, 70)));
        pinBarutxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinBarutxtActionPerformed(evt);
            }
        });
        jPanel2.add(pinBarutxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 270, 32));

        kembaliBtn.setBackground(new java.awt.Color(221, 182, 70));
        kembaliBtn.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 14)); // NOI18N
        kembaliBtn.setForeground(new java.awt.Color(255, 255, 255));
        kembaliBtn.setText("Kembali");
        kembaliBtn.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        kembaliBtn.setBorderPainted(false);
        kembaliBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kembaliBtnMouseClicked(evt);
            }
        });
        kembaliBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliBtnActionPerformed(evt);
            }
        });
        jPanel2.add(kembaliBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 350, 80, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/LOGOK (1).png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 130, 170));

        ubahBtn.setBackground(new java.awt.Color(221, 182, 70));
        ubahBtn.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 14)); // NOI18N
        ubahBtn.setForeground(new java.awt.Color(255, 255, 255));
        ubahBtn.setText("Ubah");
        ubahBtn.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        ubahBtn.setBorderPainted(false);
        ubahBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahBtnActionPerformed(evt);
            }
        });
        jPanel2.add(ubahBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 80, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background_1.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, -7, 630, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kembaliBtnActionPerformed

    private void pinlamatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinlamatxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinlamatxtActionPerformed
    
    //Method untuk mengubah PIN
    private void ubahBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahBtnActionPerformed
        //Memanggil method constructor tanpa parameter
        Akun akun = new Akun();
        akun.isiDataAkun(norek);
        //getText untuk mendapatkan text yang diinputkan oleh user 
        //pada text field
        String pinB = pinBarutxt.getText();
        
        //Kondisi jika inputan di textfield "PIN lama" = PIN nasabah di database
        if(pinlamatxt.getText().equals(akun.getPin())){
            try{
                akun.setPin(pinB);
                
            }
            catch (Exception e){
            
            }
            JOptionPane.showMessageDialog(this, "Pin berhasil diubah");
            pinlamatxt.setText("");
            pinBarutxt.setText("");
        } else{
            JOptionPane.showMessageDialog(this, "Sandi salah");
        }
    }//GEN-LAST:event_ubahBtnActionPerformed
    
    /**
     * Method untuk menampilkan design dari class Home
     * ketika button "Kembali" di click
     * @param evt 
     */
    private void kembaliBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembaliBtnMouseClicked
        home hom = new home(norek);
        hom.setVisible(true);
        dispose();
    }//GEN-LAST:event_kembaliBtnMouseClicked

    private void pinBarutxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinBarutxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinBarutxtActionPerformed

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
            java.util.logging.Logger.getLogger(ubahPIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ubahPIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ubahPIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ubahPIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ubahPIN(norek).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton kembaliBtn;
    private javax.swing.JTextField pinBarutxt;
    private javax.swing.JTextField pinlamatxt;
    private javax.swing.JButton ubahBtn;
    // End of variables declaration//GEN-END:variables
}
