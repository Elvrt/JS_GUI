/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kalkulator;

/**
 *
 * @author elva
 */
public class TugasKalkulator extends javax.swing.JFrame {

    String angka;
    double jumlah, bilangan1, bilangan2;
    int pilih;
    
    
    public TugasKalkulator() {
        initComponents();
        angka="";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layar = new javax.swing.JTextField();
        btnangka0 = new javax.swing.JButton();
        btnangka1 = new javax.swing.JButton();
        btnangka2 = new javax.swing.JButton();
        btnangka3 = new javax.swing.JButton();
        btnangka4 = new javax.swing.JButton();
        btnangka5 = new javax.swing.JButton();
        btnangka6 = new javax.swing.JButton();
        btnangka7 = new javax.swing.JButton();
        btnangka9 = new javax.swing.JButton();
        btnangka8 = new javax.swing.JButton();
        btntitik = new javax.swing.JButton();
        btntambah = new javax.swing.JButton();
        btnkurang = new javax.swing.JButton();
        btnkali = new javax.swing.JButton();
        btnbagi = new javax.swing.JButton();
        btnsamadengan = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        layar.setText("0");
        layar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                layarActionPerformed(evt);
            }
        });

        btnangka0.setText("0");
        btnangka0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka0ActionPerformed(evt);
            }
        });

        btnangka1.setText("1");
        btnangka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka1ActionPerformed(evt);
            }
        });

        btnangka2.setText("2");
        btnangka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka2ActionPerformed(evt);
            }
        });

        btnangka3.setText("3");
        btnangka3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka3ActionPerformed(evt);
            }
        });

        btnangka4.setText("4");
        btnangka4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka4ActionPerformed(evt);
            }
        });

        btnangka5.setText("5");
        btnangka5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka5ActionPerformed(evt);
            }
        });

        btnangka6.setText("6");
        btnangka6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka6ActionPerformed(evt);
            }
        });

        btnangka7.setText("7");
        btnangka7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka7ActionPerformed(evt);
            }
        });

        btnangka9.setText("9");
        btnangka9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka9ActionPerformed(evt);
            }
        });

        btnangka8.setText("8");
        btnangka8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnangka8ActionPerformed(evt);
            }
        });

        btntitik.setText(".");
        btntitik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntitikActionPerformed(evt);
            }
        });

        btntambah.setText("+");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnkurang.setText("-");
        btnkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkurangActionPerformed(evt);
            }
        });

        btnkali.setText("*");
        btnkali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkaliActionPerformed(evt);
            }
        });

        btnbagi.setText("/");
        btnbagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbagiActionPerformed(evt);
            }
        });

        btnsamadengan.setText("=");
        btnsamadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsamadenganActionPerformed(evt);
            }
        });

        btnclear.setText("C");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnangka4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnangka5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnangka6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnangka7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnangka8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnangka0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnangka9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btntitik, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnangka1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnangka2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnangka3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnbagi, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnkali, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnkurang, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btntambah, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnsamadengan, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(layar, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(layar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnkali)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnangka4)
                                .addComponent(btnangka5)
                                .addComponent(btnangka6)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnangka1)
                            .addComponent(btnangka2)
                            .addComponent(btnangka3)
                            .addComponent(btnkurang))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnangka0)
                            .addComponent(btntitik)
                            .addComponent(btnclear)
                            .addComponent(btntambah)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnbagi)
                        .addComponent(btnangka7)
                        .addComponent(btnangka8)
                        .addComponent(btnangka9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsamadengan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void layarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_layarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_layarActionPerformed

    private void btnangka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka1ActionPerformed
        // TODO add your handling code here:
        angka += "1";
        layar.setText(angka);
    }//GEN-LAST:event_btnangka1ActionPerformed

    private void btnangka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka2ActionPerformed
        // TODO add your handling code here:
        angka += "2";
        layar.setText(angka);
    }//GEN-LAST:event_btnangka2ActionPerformed

    private void btnangka3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka3ActionPerformed
        // TODO add your handling code here:
        angka += "3";
        layar.setText(angka);
    }//GEN-LAST:event_btnangka3ActionPerformed

    private void btnangka4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka4ActionPerformed
        // TODO add your handling code here:
        angka += "4";
        layar.setText(angka);
    }//GEN-LAST:event_btnangka4ActionPerformed

    private void btnangka5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka5ActionPerformed
        // TODO add your handling code here:
        angka += "5";
        layar.setText(angka);
    }//GEN-LAST:event_btnangka5ActionPerformed

    private void btnangka6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka6ActionPerformed
        // TODO add your handling code here:
        angka += "6";
        layar.setText(angka);
    }//GEN-LAST:event_btnangka6ActionPerformed

    private void btnangka7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka7ActionPerformed
        // TODO add your handling code here:
        angka += "7";
        layar.setText(angka);
    }//GEN-LAST:event_btnangka7ActionPerformed

    private void btnangka9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka9ActionPerformed
        // TODO add your handling code here:
        angka += "9";
        layar.setText(angka);
    }//GEN-LAST:event_btnangka9ActionPerformed

    private void btnangka8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka8ActionPerformed
        // TODO add your handling code here:
        angka += "8";
        layar.setText(angka);
    }//GEN-LAST:event_btnangka8ActionPerformed

    private void btntitikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntitikActionPerformed
        // TODO add your handling code here:
        angka += ".";
        layar.setText(angka);
    }//GEN-LAST:event_btntitikActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        // TODO add your handling code here:
        bilangan1=Double.parseDouble(angka);
        layar.setText("+");
        angka="";
        pilih=1;
    }//GEN-LAST:event_btntambahActionPerformed

    private void btnkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkurangActionPerformed
        // TODO add your handling code here:
        bilangan1=Double.parseDouble(angka);
        layar.setText("-");
        angka="";
        pilih=2;
    }//GEN-LAST:event_btnkurangActionPerformed

    private void btnkaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkaliActionPerformed
        // TODO add your handling code here:
        bilangan1=Double.parseDouble(angka);
        layar.setText("*");
        angka="";
        pilih=3;
    }//GEN-LAST:event_btnkaliActionPerformed

    private void btnbagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbagiActionPerformed
        // TODO add your handling code here:
        bilangan1=Double.parseDouble(angka);
        layar.setText("/");
        angka="";
        pilih=4;
    }//GEN-LAST:event_btnbagiActionPerformed

    private void btnangka0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnangka0ActionPerformed
        // TODO add your handling code here:
        angka += "0";
        layar.setText(angka);
    }//GEN-LAST:event_btnangka0ActionPerformed

    private void btnsamadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsamadenganActionPerformed
        // TODO add your handling code here:
        switch (pilih) {
        case 1:
            bilangan2 = Double.parseDouble(angka);
            jumlah = bilangan1 + bilangan2;
            angka = Double.toString(jumlah);
            layar.setText(angka);
            break;
        case 2:
            bilangan2 = Double.parseDouble(angka);
            jumlah = bilangan1 - bilangan2;
            angka = Double.toString(jumlah);
            layar.setText(angka);
            break;
         case 3:
            bilangan2 = Double.parseDouble(angka);
            jumlah = bilangan1 * bilangan2;
            angka = Double.toString(jumlah);
            layar.setText(angka);
            break;
         case 4:
            bilangan2 = Double.parseDouble(angka);
            jumlah = bilangan1 / bilangan2;
            angka = Double.toString(jumlah);
            layar.setText(angka);
            break;
            default:
            break;
       }
    }//GEN-LAST:event_btnsamadenganActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        layar.setText("");
        bilangan1=0.0;
        bilangan2=0.0;
        jumlah=0.0;
        angka="";
    }//GEN-LAST:event_btnclearActionPerformed

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
            java.util.logging.Logger.getLogger(TugasKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TugasKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TugasKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TugasKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TugasKalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnangka0;
    private javax.swing.JButton btnangka1;
    private javax.swing.JButton btnangka2;
    private javax.swing.JButton btnangka3;
    private javax.swing.JButton btnangka4;
    private javax.swing.JButton btnangka5;
    private javax.swing.JButton btnangka6;
    private javax.swing.JButton btnangka7;
    private javax.swing.JButton btnangka8;
    private javax.swing.JButton btnangka9;
    private javax.swing.JButton btnbagi;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnkali;
    private javax.swing.JButton btnkurang;
    private javax.swing.JButton btnsamadengan;
    private javax.swing.JButton btntambah;
    private javax.swing.JButton btntitik;
    private javax.swing.JTextField layar;
    // End of variables declaration//GEN-END:variables
}
