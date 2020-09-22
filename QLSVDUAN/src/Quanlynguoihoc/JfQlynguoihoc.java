/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quanlynguoihoc;

import QuanlyNhanVien.NhanVien;
import QuanlyNhanVien.NhanVienDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author trany
 */
public class JfQlynguoihoc extends javax.swing.JFrame {

    NguoiHocDAO daonh = new NguoiHocDAO();
    SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/yyyy");
    static int id = 0;

    /**
     * Creates new form JfQlynguoihoc
     */
    public JfQlynguoihoc() {
        initComponents();
        setLocationRelativeTo(null);
        filldata();

    }
//public void getDataCombobox(){
//    DefaultComboBoxModel<Quanlynguoihoc> model = (DefaultComboBoxModel) cboGioitinh.getModel();
//    model.removeAllElements();
//    for (Nguoihoc nh : daonh.getAllQlNguoiHoc()) {
//        model.addElement(nh);
//    }
//}
    //code chinh

    public void reset() {
        txtmaNH.setText("");
        txthoVT.setText("");
        cboGioitinh.setSelectedIndex(0);
        txtngaySinh.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
        txtghiChu.setText("");
    }

    public Nguoihoc getModell() throws ParseException {
        Nguoihoc nh = new Nguoihoc();
        nh.setMaNH(txtmaNH.getText());
        nh.setHovaTen(txthoVT.getText());
        boolean gt = false;
        if (cboGioitinh.getSelectedIndex() == 0) {
            gt = true;
        }
        nh.setGioiTinh(gt);
        nh.setNgaySinh(date1.parse(txtngaySinh.getText().toString()));
//        nh.setNgaySinh(DateHelps.toDate(txtngaySinh.getText()));
        nh.setPhone(txtPhone.getText());
        nh.setEmail(txtEmail.getText());
        nh.setGhiChu(txtghiChu.getText());
        NhanVien n = new NhanVien();
        n.setMaNV("");
        nh.setMaNV(n);
        nh.setNgayDk(date1.parse(txtngaySinh.getText().toString()));

        return nh;
    }

    public boolean CheckValiData() {
        if (txtmaNH.getText().isEmpty() || txthoVT.getText().isEmpty() || txtngaySinh.getText().isEmpty()
                || txtghiChu.getText().isEmpty() || txtEmail.getText().isEmpty()
                || txtPhone.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    public void filldata() {
        DefaultTableModel Model = (DefaultTableModel) tabBangNHoc.getModel();
        Model.setRowCount(0);
        for (Nguoihoc n : daonh.getAllQlNguoiHoc()) {
            Object rowdata[] = new Object[8];
            rowdata[0] = n.getMaNH();
            rowdata[1] = n.getHovaTen();
            String gt = "Nu";
            if (n.isGioiTinh()) {
                gt = "Nam";
            }
            rowdata[2] = gt;
//            rowdata[3] = DateHelps.toString(n.getNgaySinh());
            rowdata[3] = date1.format(n.getNgaySinh());
            rowdata[4] = n.getPhone();
            rowdata[5] = n.getEmail();
            rowdata[6] = n.getMaNV();
            rowdata[7] = date1.format(n.getNgayDk());
            Model.addRow(rowdata);
        }
    }

    public void filldataFind(ArrayList<Nguoihoc> ls) {
        DefaultTableModel Model = (DefaultTableModel) tabBangNHoc.getModel();
        Model.setRowCount(0);
        for (Nguoihoc n : ls) {
            Object rowdata[] = new Object[6];
            rowdata[0] = n.getMaNH();
            rowdata[1] = n.getHovaTen();
            String gt = "Nu";
            if (n.isGioiTinh()) {
                gt = "Nam";
            }
            rowdata[2] = gt;
            rowdata[3] = DateHelps.toString(n.getNgaySinh());
            rowdata[3] = date1.format(n.getNgaySinh());
            rowdata[4] = n.getPhone();
            rowdata[5] = n.getEmail();
            rowdata[6] = n.getMaNV();
            rowdata[7] = date1.format(n.getNgayDk());
            Model.addRow(rowdata);
        }
    }

    public void setModell(Nguoihoc nh) {
        int rowdata = id;
        txtmaNH.setText(nh.getMaNH());
        txthoVT.setText(nh.getHovaTen());
        cboGioitinh.setSelectedItem(nh.isGioiTinh());
        txtngaySinh.setText(DateHelps.toString(nh.getNgaySinh()));
//        txtngaySinh.setText(date1.p(nh.getNgaySinh().toString()));
        txtPhone.setText(nh.getPhone());
        txtEmail.setText(nh.getEmail());
        txtghiChu.setText(nh.getGhiChu());

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
        tab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        cboGioitinh = new javax.swing.JComboBox<>();
        btnDELETE = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnADD = new javax.swing.JButton();
        txtngaySinh = new javax.swing.JTextField();
        btnFrist = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        txtPhone = new javax.swing.JTextField();
        btnLast = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtmaNH = new javax.swing.JTextField();
        txtghiChu = new javax.swing.JTextField();
        txthoVT = new javax.swing.JTextField();
        btnSAVE = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnEDIT = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabBangNHoc = new javax.swing.JTable();
        btntimkiem = new javax.swing.JButton();
        txtTimkiem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("QUẢN LÝ NGƯỜI HỌC");

        cboGioitinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", " " }));
        cboGioitinh.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cboGioitinhPopupMenuWillBecomeVisible(evt);
            }
        });

        btnDELETE.setText("Xóa");
        btnDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELETEActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Ngày sinh");

        btnADD.setText("Mới");
        btnADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDActionPerformed(evt);
            }
        });

        txtngaySinh.setText("12/12/2019");

        btnFrist.setText("|<");
        btnFrist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFristActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Điện thoại");

        btnBack.setText("<<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Địa chỉ Email");

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });

        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mã người học ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Họ và tên");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Ghi chú");

        btnSAVE.setText("Thêm");
        btnSAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAVEActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Giới tính");

        btnEDIT.setText("Sửa");
        btnEDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEDITActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(211, 211, 211))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cboGioitinh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(25, 25, 25)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(txtngaySinh)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(txtEmail))
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSAVE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEDIT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDELETE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnADD)
                        .addGap(93, 93, 93)
                        .addComponent(btnFrist)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLast))
                    .addComponent(txtghiChu)
                    .addComponent(txthoVT)
                    .addComponent(txtmaNH))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(txtmaNH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txthoVT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboGioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(txtghiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSAVE)
                    .addComponent(btnEDIT)
                    .addComponent(btnDELETE)
                    .addComponent(btnADD)
                    .addComponent(btnFrist)
                    .addComponent(btnBack)
                    .addComponent(btnNext)
                    .addComponent(btnLast))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        tab.addTab("CẬP NHẬT", jPanel1);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("TÌM KIẾM ");

        tabBangNHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MÃ NGƯỜI HỌC", "HỌ VÀ TÊN", "GIỚI TÍNH", "NGÀY SINH", "ĐIỆN THOẠI", "EMAIL", "MÃ NHÂN VIÊN", "NGÀY DK"
            }
        ));
        tabBangNHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabBangNHocMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabBangNHocMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabBangNHoc);

        btntimkiem.setText("TÌM KIẾM");
        btntimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimkiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtTimkiem))
                .addGap(18, 18, 18)
                .addComponent(btntimkiem)
                .addGap(35, 35, 35))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btntimkiem)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tab.addTab("DANH SÁCH", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(tab)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tab))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnADDActionPerformed

    private void btnSAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAVEActionPerformed
        // TODO add your handling code here:
        if (CheckValiData()) {
            try {
                Nguoihoc nh = getModell();
                if (daonh.add(nh) > 0) {
                    JOptionPane.showMessageDialog(this, "BẠN THÊM THÀNH CÔNG");
                    filldata();
                } else {
                    JOptionPane.showMessageDialog(this, "BẠN THÊM THẤT BẠI");
                }
            } catch (ParseException ex) {
                Logger.getLogger(JfQlynguoihoc.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "YEU CAU NHAP DAY DU");
        }
//        if (CheckValiData()) {
//            try {
//                Nguoihoc nh = getModell();
//                if (daonh.add(nh) > 0) {
//                    JOptionPane.showMessageDialog(this, "BẠN THÊM THÀNH CÔNG");
//                } else {
//                    JOptionPane.showMessageDialog(this, "BẠN THÊM THẤT BẠI");
//                }
//            } catch (ParseException ex) {
//                
//            }
//        } else {
//            JOptionPane.showMessageDialog(this, "YEU CAU NHAP DAY DU");
//        }
    }//GEN-LAST:event_btnSAVEActionPerformed

    private void btnEDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEDITActionPerformed
        // TODO add your handling code here:
        if (txtmaNH.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "BAN CHUA NHAP MA NGUOI HOC");
        } else {
            try {
                Nguoihoc nh = getModell();
                if (daonh.edit(nh) > 0) {
                    filldata();
                    JOptionPane.showMessageDialog(this, "BAN UPDATE THÀNH CÔNG");
                } else {
                    JOptionPane.showMessageDialog(this, "BAN CẬP NHẬT BỊ TRÙNG TÊN");
                }
            } catch (Exception e) {
                System.out.println("loi" + e.toString());
            }
        }
    }//GEN-LAST:event_btnEDITActionPerformed

    private void btnDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELETEActionPerformed
        // TODO add your handling code here:
        if (txtmaNH.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "BẠN CHƯA NHẬP MÃ NGƯỜI HỌC");
        } else {
            try {
                Nguoihoc nh = getModell();
                if (daonh.dell(nh) > 0) {
                    filldata();
                    JOptionPane.showMessageDialog(this, "BẠN ĐÃ XÓA THÀNH CÔNG");
                } else {
                    JOptionPane.showMessageDialog(this, "BẠN XÓA THẤT BẠI");
                }
            } catch (Exception e) {
                System.out.println("loi" + e.toString());
            }
        }
    }//GEN-LAST:event_btnDELETEActionPerformed
    public Nguoihoc getNguoiHocAtPosition(int pos) throws ParseException {
        Nguoihoc nh = new Nguoihoc();
        nh.setMaNH(tabBangNHoc.getValueAt(pos, 0).toString());
        nh.setHovaTen(tabBangNHoc.getValueAt(pos, 1).toString());
        nh.setGioiTinh(tabBangNHoc.getValueAt(pos, 2).toString().equalsIgnoreCase("Nam"));
//        nh.setNgaySinh(DateHelps.toDate(tabBangNHoc.getValueAt(pos, 3).toString()));
        nh.setNgaySinh(date1.parse(tabBangNHoc.getValueAt(pos, 3).toString()));
        nh.setPhone(tabBangNHoc.getValueAt(pos, 4).toString());
        nh.setEmail(tabBangNHoc.getValueAt(pos, 5).toString());
//        nh.setMaNV(new NhanVien(tabBangNHoc.getValueAt(pos, 6).toString()));
//        nh.setNgayDk(DateHelps.toDate(tabBangNHoc.getValueAt(pos, 7).toString()));
        return nh;
    }
    private void btnFristActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFristActionPerformed
        try {
            id = 0;
            Nguoihoc nh = getNguoiHocAtPosition(id);
            setModell(nh);
        } catch (ParseException ex) {
            Logger.getLogger(JfQlynguoihoc.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnFristActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        try {
            // TODO add your handling code here:
            id--;
            if (id <= 0) {
                id = 0;
            }
            Nguoihoc n = getNguoiHocAtPosition(id);
            setModell(n);
        } catch (ParseException ex) {
            Logger.getLogger(JfQlynguoihoc.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            id++;
            if (id >= daonh.getAllQlNguoiHoc().size() - 1) {
                id = daonh.getAllQlNguoiHoc().size() - 1;
            }
            Nguoihoc nh = getNguoiHocAtPosition(id);
            setModell(nh);
        } catch (ParseException ex) {
            Logger.getLogger(JfQlynguoihoc.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        try {
            // TODO add your handling code here:
            id = daonh.getAllQlNguoiHoc().size() - 1;
            Nguoihoc nh = getNguoiHocAtPosition(id);
            setModell(nh);
        } catch (ParseException ex) {
            Logger.getLogger(JfQlynguoihoc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLastActionPerformed

    private void tabBangNHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabBangNHocMouseClicked
        // TODO add your handling code here:
        int maNH = tabBangNHoc.rowAtPoint(evt.getPoint());
        txtmaNH.setText(tabBangNHoc.getValueAt(maNH, 0).toString());
        txthoVT.setText(tabBangNHoc.getValueAt(maNH, 1).toString());
        cboGioitinh.setSelectedItem(tabBangNHoc.getValueAt(maNH, 2).toString());
        txtngaySinh.setText(tabBangNHoc.getValueAt(maNH, 3).toString());
        txtPhone.setText(tabBangNHoc.getValueAt(maNH, 4).toString());
        txtEmail.setText(tabBangNHoc.getValueAt(maNH, 5).toString());


    }//GEN-LAST:event_tabBangNHocMouseClicked

    private void cboGioitinhPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboGioitinhPopupMenuWillBecomeVisible
        // TODO add your handling code here:

    }//GEN-LAST:event_cboGioitinhPopupMenuWillBecomeVisible

    private void btntimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimkiemActionPerformed
        // TODO add your handling code here:

        String a = txtTimkiem.getText();
        filldataFind(daonh.find(a));


    }//GEN-LAST:event_btntimkiemActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void tabBangNHocMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabBangNHocMousePressed
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            tab.setSelectedIndex(0);
            int id = tabBangNHoc.rowAtPoint(evt.getPoint());
            String maNh = tabBangNHoc.getValueAt(id, 1).toString();
        }
    }//GEN-LAST:event_tabBangNHocMousePressed

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
            java.util.logging.Logger.getLogger(JfQlynguoihoc.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfQlynguoihoc.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfQlynguoihoc.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfQlynguoihoc.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfQlynguoihoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnADD;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDELETE;
    private javax.swing.JButton btnEDIT;
    private javax.swing.JButton btnFrist;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSAVE;
    private javax.swing.JButton btntimkiem;
    private javax.swing.JComboBox<String> cboGioitinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTable tabBangNHoc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtTimkiem;
    private javax.swing.JTextField txtghiChu;
    private javax.swing.JTextField txthoVT;
    private javax.swing.JTextField txtmaNH;
    private javax.swing.JTextField txtngaySinh;
    // End of variables declaration//GEN-END:variables

    private void setModel(Nguoihoc nh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
