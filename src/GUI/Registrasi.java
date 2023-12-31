/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Class.Akun;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.sql.Statement;
import java.sql.Connection;  
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Class untuk membuat sebuah akun baru
 */
public class Registrasi extends javax.swing.JFrame {
    
    
    /**
     * Creates new form Registrasi
     */
    
    public Registrasi() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        namaTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        saldoTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kembaliBtn = new javax.swing.JButton();
        daftarBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        nomorHPTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        konfPIN = new javax.swing.JTextField();
        PIN = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bank Code - Daftar");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(607, 460));
        setSize(new java.awt.Dimension(607, 460));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("  REGISTRASI");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(221, 182, 70)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 230, -1));

        jLabel2.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Nama");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 120, 30));

        namaTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        namaTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(221, 182, 70)));
        namaTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                namaTxtFocusGained(evt);
            }
        });
        namaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaTxtActionPerformed(evt);
            }
        });
        getContentPane().add(namaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 150, 30));

        jLabel3.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Pin");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 130, 30));

        saldoTxt.setFont(new java.awt.Font("Swis721 WGL4 BT", 0, 11)); // NOI18N
        saldoTxt.setForeground(new java.awt.Color(153, 153, 153));
        saldoTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        saldoTxt.setText("Minimal Rp.50.000");
        saldoTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(221, 182, 70)));
        saldoTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                saldoTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                saldoTxtFocusLost(evt);
            }
        });
        saldoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoTxtActionPerformed(evt);
            }
        });
        getContentPane().add(saldoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 150, 30));

        jLabel4.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Rp");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, 30));

        jLabel5.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Konfirmasi Pin");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 160, 30));

        jLabel6.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Saldo awal");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 100, 30));

        kembaliBtn.setBackground(new java.awt.Color(221, 182, 70));
        kembaliBtn.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 14)); // NOI18N
        kembaliBtn.setForeground(new java.awt.Color(255, 255, 255));
        kembaliBtn.setText("Login");
        kembaliBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
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
        getContentPane().add(kembaliBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 80, 40));

        daftarBtn.setBackground(new java.awt.Color(221, 182, 70));
        daftarBtn.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 14)); // NOI18N
        daftarBtn.setForeground(new java.awt.Color(255, 255, 255));
        daftarBtn.setText("Daftar");
        daftarBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        daftarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(daftarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 80, 40));

        jLabel10.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Nomor HP");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 120, 30));

        nomorHPTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nomorHPTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(221, 182, 70)));
        nomorHPTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomorHPTxtActionPerformed(evt);
            }
        });
        getContentPane().add(nomorHPTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 150, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Xiangyun PNG Image, Xiangyun Traditional Pattern, Classical Clouds Pattern, Golden Clouds, Traditional Pattern PNG Image For Free Download.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 30));

        konfPIN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        konfPIN.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(221, 182, 70)));
        konfPIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konfPINActionPerformed(evt);
            }
        });
        getContentPane().add(konfPIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 150, 30));

        PIN.setFont(new java.awt.Font("Swis721 WGL4 BT", 0, 11)); // NOI18N
        PIN.setForeground(new java.awt.Color(153, 153, 153));
        PIN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PIN.setText("Minimal 5 Angka");
        PIN.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(221, 182, 70)));
        PIN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PINFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PINFocusLost(evt);
            }
        });
        getContentPane().add(PIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 150, 30));

        jLabel11.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Email");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 130, 30));

        emailTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(221, 182, 70)));
        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });
        emailTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailTxtKeyPressed(evt);
            }
        });
        getContentPane().add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 150, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Xiangyun PNG Image, Xiangyun Traditional Pattern, Classical Clouds Pattern, Golden Clouds, Traditional Pattern PNG Image For Free Download.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 610, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bank_1.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 530, 460));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background23.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaTxtActionPerformed

    private void saldoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saldoTxtActionPerformed
    
    /**
     * Method untuk mengatur agar saat user
     * menekan tombol "Kembali" maka akan
     * terbuka tampilan dari class login
     * @param evt 
     */
    private void kembaliBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembaliBtnMouseClicked
        login log = new login();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_kembaliBtnMouseClicked
    
    /**
     * Method untuk mendaftarkan akun bank baru 
     * @param evt 
     */
    private void daftarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarBtnActionPerformed
        //Inisialisasi Variabel yang diperlukann untuk membuat akun bank
        String nama, pin, noHp, email, saldo, konfPin;
        ArrayList<String> dataUser = new ArrayList<>();
        Akun akunBaru = new Akun();
        pin = PIN.getText();
        konfPin = konfPIN.getText();
        nama = namaTxt.getText();
        noHp = nomorHPTxt.getText();
        email = emailTxt.getText();
        saldo = saldoTxt.getText();
        double saldoUser = Double.parseDouble(saldo);
            
        //Kondisi jika semua data yang dimasukkan user sesuai syarat
        if(saldoUser >= 50000 && (pin.equals(konfPin)) && pin.length()==5){
            dataUser.add(pin);
            dataUser.add(saldo);
            dataUser.add(nama);
            dataUser.add(noHp);
            dataUser.add(email); 
          
        //Kondisi jika ada data yang tidak sesuai syarat  
        }else {
            //Kondisi jika pin != 5
            if(pin.length()!=5){
                JOptionPane.showMessageDialog(null, "Format Pin Tidak Sesuai");
                konfPIN.setText("");
                PIN.setText("");
            //Kondisi jika pin dan konfpin tidak sama
            }else if(!pin.equals(konfPin)){
                JOptionPane.showMessageDialog(null, "Pin Tidak Sesuai");
                konfPIN.setText("");
                PIN.setText("");
            //Kondisi jika saldo < Rp.50.000    
            }else if(saldoUser < 50000){
                JOptionPane.showMessageDialog(null, "Saldo Anda Kurang");
                konfPIN.setText("");
                PIN.setText("");
            }              
        }

        try {
            akunBaru.akunBaru(dataUser);
        } catch (IOException e) {  
        }
         JOptionPane.showMessageDialog(this, "No Rek Anda:  " + akunBaru.getNomorRekening() + "\nPassword Anda " + pin);
         //Untuk mengatur agar semua text field kembali kosong
         PIN.setText("");
         konfPIN.setText("");
         namaTxt.setText("");
         nomorHPTxt.setText("");
         emailTxt.setText("");
         saldoTxt.setText("");
         
    }//GEN-LAST:event_daftarBtnActionPerformed

    private void nomorHPTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomorHPTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomorHPTxtActionPerformed

    private void konfPINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konfPINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_konfPINActionPerformed

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void kembaliBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kembaliBtnActionPerformed

    private void namaTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namaTxtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_namaTxtFocusGained

    private void PINFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PINFocusGained
        String username=PIN.getText();
        if(username.equals("Minimal 5 Angka")) {
            PIN.setText("");
        }
    }//GEN-LAST:event_PINFocusGained

    private void PINFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PINFocusLost
        String username=PIN.getText();
        if(username.equals("") || username.equals("Username")){
            PIN.setText("Minimal 5 Angka");
        }
    }//GEN-LAST:event_PINFocusLost

    private void saldoTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_saldoTxtFocusGained
        String username=saldoTxt.getText();
        if(username.equals("Minimal Rp.50.000")) {
            saldoTxt.setText("");
        }
    }//GEN-LAST:event_saldoTxtFocusGained

    private void saldoTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_saldoTxtFocusLost
        String username=saldoTxt.getText();
        if(username.equals("") || username.equals("Username")){
            saldoTxt.setText("Minimal Rp.50.000");
        }
    }//GEN-LAST:event_saldoTxtFocusLost

    private void emailTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTxtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtKeyPressed

    
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
            java.util.logging.Logger.getLogger(Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PIN;
    private javax.swing.JButton daftarBtn;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton kembaliBtn;
    private javax.swing.JTextField konfPIN;
    private javax.swing.JTextField namaTxt;
    private javax.swing.JTextField nomorHPTxt;
    private javax.swing.JTextField saldoTxt;
    // End of variables declaration//GEN-END:variables
}
