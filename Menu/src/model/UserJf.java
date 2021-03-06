/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author trany
 */
public class UserJf extends javax.swing.JFrame {

    UserDAO dao = new UserDAO();

    /**
     * Creates new form UserJf
     */
    public UserJf() {
        initComponents();
        setLocationRelativeTo(null);
        filldata();
    }

    //code chinh
    public void reset() {
        txtusername.setText("");
        txtpassword.setText("");
        txtnhaplaipasss.setText("");
        rdTruongphong.setSelected(true);
    }

    //ham save
    public User getModel() {
        User u = new User();
        u.setUsername(txtusername.getText());
        u.setPassword(txtpassword.getText());
        boolean cv = false;
        if (rdTruongphong.isSelected()) {
            cv = true;
        }
        u.setRole(cv);
        if (txtpassword.getText().equals(txtnhaplaipasss.getText())) {
            return u;
          
        }

        return null;
    }

    public boolean checkvalidata() {
        if (txtusername.getText().isEmpty() || txtpassword.getText().isEmpty() || txtnhaplaipasss.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    //ham filldata
    public void filldata() {
        DefaultTableModel tbmodel = (DefaultTableModel) tabbang.getModel();
        tbmodel.setRowCount(0);//xoa
        for (User u : dao.getAllNhanVien()) {
            Object rowdata[] = new Object[3];
            rowdata[0] = u.getUsername();
            rowdata[1] = u.getPassword();
            String cv = "Nhan Vien";
            if (u.isRole()) {
                cv = "Truong phong";
            }
            rowdata[2] = cv;
            tbmodel.addRow(rowdata);
        }
    }

    //ham setmodel
    public void setModel(User u) {
        txtusername.setText(u.getUsername());
        txtpassword.setText(u.getPassword());
//    txtnhaplaipasss.setText(u.getRepassword());
        rdTruongphong.setSelected(u.isRole());
        rdNhanvien.setSelected(!u.isRole());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rdTruongphong = new javax.swing.JRadioButton();
        rdNhanvien = new javax.swing.JRadioButton();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabbang = new javax.swing.JTable();
        txtnhaplaipasss = new javax.swing.JTextField();
        btnedit = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        lblstatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("USERS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Username:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Password:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Retype Password");

        buttonGroup1.add(rdTruongphong);
        rdTruongphong.setSelected(true);
        rdTruongphong.setText("Truong phong");
        rdTruongphong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdTruongphongActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdNhanvien);
        rdNhanvien.setText("Nhan vien");

        tabbang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "UserName:", "Password", "Role"
            }
        ));
        tabbang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabbangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabbang);

        btnedit.setText("EDIT");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnsave.setText("SAVE");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnadd.setText("ADD");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnexit.setText("EXIT");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        btnxoa.setText("DELETE");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        lblstatus.setText("STATUS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(rdTruongphong)
                                        .addGap(13, 13, 13)
                                        .addComponent(rdNhanvien))
                                    .addComponent(txtnhaplaipasss, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnedit)
                                    .addComponent(btnsave)
                                    .addComponent(btnadd)
                                    .addComponent(btnxoa)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblstatus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnexit))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsave))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtnhaplaipasss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnedit)))
                    .addComponent(btnadd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnxoa)
                    .addComponent(rdNhanvien)
                    .addComponent(rdTruongphong))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnexit)
                    .addComponent(lblstatus))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
//       dao.add(getModel());
        if (checkvalidata()) {
            try {
                if (getModel()==null) {
                    JOptionPane.showMessageDialog(this, "BẠN NHẬP KHÔNG TRÙNG PASS");
                    
                }else{
                
                
                User u = getModel();
                if (dao.add(u) < 0) {
                    JOptionPane.showMessageDialog(this, "BAN LUU THANH CONG");
                    filldata();
                    lblstatus.setText("BAN DA LUU THANH CONG");
                    lblstatus.setForeground(Color.blue);
                } else {
                
                    JOptionPane.showMessageDialog(this, "BAN LUU THAT BAI");
                    lblstatus.setText("BAN DA LUU THANH BAI");
                    lblstatus.setForeground(Color.red);
                }}
            } catch (Exception e) {
                System.out.println("Error:" + e.toString());
            }

        } else {
            JOptionPane.showMessageDialog(this, "BAN LUU THAT BAI");
        }

    }//GEN-LAST:event_btnsaveActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        if (txtusername.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "BAN CHUA CAP NHAT NHAN VIEN");

        } else {
            try {
                User u = getModel();
                if (dao.edit(u) < 0) {
                    JOptionPane.showMessageDialog(this, "BAN AN OKE DE CAP NHAT");
                    lblstatus.setText("BAN DANG CAP NHAT THANH CONG");
                    lblstatus.setForeground(Color.blue);
                    filldata();
                } else {
                    JOptionPane.showMessageDialog(this, "BAN EDIT THAT BAI");
                    lblstatus.setText("BAN KHONG TIM THAY");
                    lblstatus.setForeground(Color.red);
                }
            } catch (Exception ex) {
                System.out.println("Error:" + ex.toString());;
            }
        }
    }//GEN-LAST:event_btneditActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        if (txtusername.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "BAN CHUA NHAP ID DE XOA");
        } else {
            try {
                User u = getModel();
                if (dao.del(u) < 0) {
                    JOptionPane.showMessageDialog(this, "VUI LONG CHON ẤN OKE DE TIEP TUC XOA");
                    JOptionPane.showMessageDialog(this, "BAN DA XOA THANH CONG");
                    lblstatus.setText("BAN DA XOA THANH CONG");
                    lblstatus.setForeground(Color.blue);
                    filldata();
                } else {
                    {
                        lblstatus.setText("KHONG TIM THAY YEU CAU CUA BAN");
                        lblstatus.setForeground(Color.red);
                    }
                }
            } catch (Exception e) {
                System.out.println("Error:" + e.toString());
            }

        }


    }//GEN-LAST:event_btnxoaActionPerformed

    private void rdTruongphongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdTruongphongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdTruongphongActionPerformed

    private void tabbangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabbangMouseClicked
        // TODO add your handling code here:
        int point = tabbang.rowAtPoint(evt.getPoint());
        txtusername.setText(tabbang.getValueAt(point, 0).toString());
        txtpassword.setText(tabbang.getValueAt(point, 1).toString());
        txtnhaplaipasss.setText(tabbang.getValueAt(point, 1).toString());
        if (tabbang.getValueAt(point, 2).toString().equalsIgnoreCase("Truong phong")) {
            rdTruongphong.setSelected(true);

        } else {
            rdNhanvien.setSelected(true);
        }
    }//GEN-LAST:event_tabbangMouseClicked

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
            java.util.logging.Logger.getLogger(UserJf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserJf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserJf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserJf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserJf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnxoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblstatus;
    private javax.swing.JRadioButton rdNhanvien;
    private javax.swing.JRadioButton rdTruongphong;
    private javax.swing.JTable tabbang;
    private javax.swing.JTextField txtnhaplaipasss;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
