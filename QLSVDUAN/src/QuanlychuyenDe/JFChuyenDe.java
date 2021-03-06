/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanlychuyenDe;

import Quanlynguoihoc.JfQlynguoihoc;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author trany
 */
public class JFChuyenDe extends javax.swing.JFrame {
    ChuyenDeDAO daocd = new ChuyenDeDAO();
    String strHinhAnh = null;
    static int id = 0;

    /**
     * Creates new form JFChuyenDe
     */
    public JFChuyenDe() {
        initComponents();
        setLocationRelativeTo(null);
        filldata();
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
        tab1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblHinhANh = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtmaCD = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txttenCD = new javax.swing.JTextField();
        txtHP = new javax.swing.JTextField();
        txtthoiLuong = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtmtCD = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnEDIT = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLasts = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabBangCD = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(102, 102, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("QUẢN LÝ CHUYÊN ĐỀ");

        tab1.setBackground(new java.awt.Color(102, 102, 255));
        tab1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("HÌNH LOGO");

        lblHinhANh.setBackground(new java.awt.Color(153, 153, 255));
        lblHinhANh.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblHinhANh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhANhMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHinhANhMouseEntered(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Mã chuyên đê");

        txtmaCD.setText("JAV01");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tên chuyên đê");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Thời lượng (giờ)");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Học phí");

        txtthoiLuong.setText("70");
        txtthoiLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtthoiLuongActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Mô tả chuyên đề");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnEDIT.setText("Sửa");
        btnEDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEDITActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnBack.setText("<<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLasts.setText(">|");
        btnLasts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnEDIT)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnMoi)
                        .addGap(149, 149, 149)
                        .addComponent(btnFirst)
                        .addGap(18, 18, 18)
                        .addComponent(btnBack)
                        .addGap(18, 18, 18)
                        .addComponent(btnNext)
                        .addGap(18, 18, 18)
                        .addComponent(btnLasts))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(lblHinhANh, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(32, 32, 32)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(txtmaCD, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(txttenCD, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtHP, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtthoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(txtmtCD)))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHinhANh, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtmaCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttenCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtthoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(txtmtCD, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnEDIT)
                    .addComponent(btnXoa)
                    .addComponent(btnMoi)
                    .addComponent(btnFirst)
                    .addComponent(btnBack)
                    .addComponent(btnNext)
                    .addComponent(btnLasts))
                .addGap(28, 28, 28))
        );

        tab1.addTab("CẬP NHẬT ", jPanel1);

        tabBangCD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MÃ CD", "TÊN CD", "HỌC PHÍ", "THỜI LƯƠNG", "HINH"
            }
        ));
        tabBangCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabBangCDMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabBangCDMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabBangCD);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab1.addTab("DANH SÁCH", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tab1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*
    khu code chính
     */
    public void serset() {
        txtmaCD.setText("");
        txttenCD.setText("");
        txtthoiLuong.setText("");
        txtHP.setText("");
        txtmtCD.setText("");
        lblHinhANh.setText("Hinh Anh");
        lblHinhANh.setIcon(null);
        strHinhAnh = null;
    }

    public ChuyenDe getModel() {
        ChuyenDe cd = new ChuyenDe();
        cd.setMaCD(txtmaCD.getText());
        cd.setTenCD(txttenCD.getText());
        cd.setHocPhi(Float.parseFloat(txtHP.getText()));
        cd.setThoiLuong(Integer.parseInt(txtthoiLuong.getText()));
        if (strHinhAnh == null) {
            cd.setHinh("NO AVATA");
        } else {
            cd.setHinh(strHinhAnh);
        }
        cd.setMoTa(txtmtCD.getText());
        return cd;
    }

    public boolean checkValiData() {
        if (txtmaCD.getText().isEmpty()
                || txttenCD.getText().isEmpty()
                || txtHP.getText().isEmpty()
                || txtthoiLuong.getText().isEmpty()
                || txtmtCD.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    public void filldata() {
        DefaultTableModel tbmodel = (DefaultTableModel) tabBangCD.getModel();
        tbmodel.setRowCount(0);//ham xoa
        for (ChuyenDe cd : daocd.getAllChuyenDe()) {
            Object row[] = new Object[5];
            row[0] = cd.getMaCD();
            row[1] = cd.getTenCD();
            row[2] = cd.getHocPhi();
            row[3] = cd.getThoiLuong();
            row[4] = cd.getHinh();
            tbmodel.addRow(row);
        }
    }

    public void setModel(ChuyenDe cd) {
        int rowdata =id;
        txtmaCD.setText(cd.getMaCD());
        txttenCD.setText(cd.getTenCD());
        txtHP.setText(Float.toString(cd.getHocPhi()));
        txtthoiLuong.setText(Integer.toString(cd.getThoiLuong()));
        if (cd.getHinh().equalsIgnoreCase("NO AVATA")) {
            lblHinhANh.setText("NO AVATA");
            lblHinhANh.setIcon(null);
        } else {
            lblHinhANh.setText("");
            ImageIcon micon = new ImageIcon(getClass().getResource("/images/"+tabBangCD.getValueAt(rowdata, 4).toString()));
            Image img = micon.getImage();
            img.getScaledInstance(lblHinhANh.getWidth(), lblHinhANh.getHeight(), 0);
            lblHinhANh.setIcon(micon);
        }

    }
    private void txtthoiLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtthoiLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtthoiLuongActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if (checkValiData()) {
            try {
                ChuyenDe cd = getModel();
                if (daocd.add(cd)>0) {
                    filldata();
                    JOptionPane.showMessageDialog(this, "BẠN add thành công");
                } else {
                    JOptionPane.showMessageDialog(this, "Thất bại");
                }
            } catch (Exception e) {
                System.out.println("lỗi :" + e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(this, "BẠN CHƯA NHẬP ĐẦY ĐỦ");
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        serset();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnEDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEDITActionPerformed
        // TODO add your handling code here:
        if (txtmaCD.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "YÊU CẦU NHẬP ĐẦY ĐỦ");
        } else {
            try {
                ChuyenDe cd = getModel();
                if (daocd.edit(cd) > 0) {
                    filldata();
                    JOptionPane.showMessageDialog(this, "BẠN ĐÃ CẬP NHẬT THÀNH CÔNG");
                } else {
                    JOptionPane.showMessageDialog(this, "BẠN ĐÃ CẬP NHẬT THẤT BẠI");
                }
            } catch (Exception e) {
                System.out.println("Error:" + e.toString());
            }
        }
    }//GEN-LAST:event_btnEDITActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        if (txtmaCD.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Yeu cau nhap Ma Chuyen de");
        } else {
            try {
                ChuyenDe cd = getModel();
                if (daocd.dell(cd) > 0) {
                    filldata();
                    JOptionPane.showMessageDialog(this, "Ban xoa thanh cong");
                } else {
                    JOptionPane.showMessageDialog(this, "Yeu that bai");
                }
            } catch (Exception e) {
                System.out.println("Error:" + e.toString());
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    public ChuyenDe getChuyenDeNHAtPosition(int pos) {
        ChuyenDe cd = new ChuyenDe();
        cd.setMaCD(tabBangCD.getValueAt(pos, 0).toString());
        cd.setTenCD(tabBangCD.getValueAt(pos, 1).toString());
        cd.setHocPhi(Float.parseFloat(tabBangCD.getValueAt(pos, 2).toString()));
        cd.setThoiLuong(Integer.parseInt(tabBangCD.getValueAt(pos, 3).toString()));
        System.out.println(""+tabBangCD.getValueAt(pos, 4).toString());
        cd.setHinh(tabBangCD.getValueAt(pos, 4).toString());
        return cd;

    }
    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        try {
            id = 0;
            ChuyenDe cd = getChuyenDeNHAtPosition(id);
            setModel(cd);
        } catch (Exception e) {
            System.out.println("Loi"+e.toString());
        }

    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        try {
            id--;
            if (id <= 0) {
                id = 0;
            }
            ChuyenDe cd = getChuyenDeNHAtPosition(id);
            setModel(cd);
        } catch (Exception e) {
            System.out.println("Loi"+e.toString());
        }


    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        try {
            id++;
            if (id >= daocd.getAllChuyenDe().size() - 1) {
                id = daocd.getAllChuyenDe().size() - 1;
            }
            ChuyenDe cd = getChuyenDeNHAtPosition(id);
            setModel(cd);
        } catch (Exception e) {
            System.out.println("Loi"+e.toString());
        }

    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastsActionPerformed
        // TODO add your handling code here:
        try {
            id = daocd.getAllChuyenDe().size() - 1;
            ChuyenDe cd = getChuyenDeNHAtPosition(id);
            setModel(cd);
        } catch (Exception e) {
            System.out.println("Loi"+e.toString());
        }

    }//GEN-LAST:event_btnLastsActionPerformed

    private void lblHinhANhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhANhMouseClicked
        try {
            // TODO add your handling code here:
            JFileChooser fileChooser = new JFileChooser("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\QLSVDUAN\\build\\classes\\images");
            fileChooser.showOpenDialog(null);
            File file = fileChooser.getSelectedFile();
            Image img = ImageIO.read(file);
            lblHinhANh.setText("");
            strHinhAnh = file.getName();
//            int width = lblHinhANh.getWidth();
//            int height = lblHinhANh.getHeight();
            lblHinhANh.setIcon(new ImageIcon(img.getScaledInstance(lblHinhANh.getWidth(), lblHinhANh.getHeight(), 0)));
        } catch (Exception ex) {
            System.out.println("s"+ex.toString());
        }
    }//GEN-LAST:event_lblHinhANhMouseClicked

    private void tabBangCDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabBangCDMouseClicked
        // TODO add your handling code here:
        int id = tabBangCD.rowAtPoint(evt.getPoint());
        String maCD = tabBangCD.getValueAt(id, 0).toString();
        ChuyenDe cd = daocd.getChuyenDeBYID(maCD);
        if (cd == null) {
            return;
        }
        try {
            setModel(cd);
        } catch (Exception e) {
            System.out.println("no avata");
        }


    }//GEN-LAST:event_tabBangCDMouseClicked

    private void tabBangCDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabBangCDMousePressed
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            tab1.setSelectedIndex(0);
            int id = tabBangCD.rowAtPoint(evt.getPoint());
            String maCD = tabBangCD.getValueAt(id, 1).toString();
        }
    }//GEN-LAST:event_tabBangCDMousePressed

    private void lblHinhANhMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhANhMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblHinhANhMouseEntered

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
            java.util.logging.Logger.getLogger(JFChuyenDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFChuyenDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFChuyenDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFChuyenDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFChuyenDe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEDIT;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLasts;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHinhANh;
    private javax.swing.JTabbedPane tab1;
    private javax.swing.JTable tabBangCD;
    private javax.swing.JTextField txtHP;
    private javax.swing.JTextField txtmaCD;
    private javax.swing.JTextField txtmtCD;
    private javax.swing.JTextField txttenCD;
    private javax.swing.JTextField txtthoiLuong;
    // End of variables declaration//GEN-END:variables
}
