/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyKhoaHoc;

import QuanlyNhanVien.NhanVien;
import QuanlychuyenDe.ChuyenDe;
import QuanlychuyenDe.ChuyenDeDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
public class JFKhoaHoc extends javax.swing.JFrame {
    
    KhoaHocDAO daokh = new KhoaHocDAO();
    ChuyenDeDAO daocd = new ChuyenDeDAO();
    SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
    static int maKH = 0;//edit,xoa
    static int rowId = 0;// chưa biết chi để im 
 
    
    static int position = 0; // ham last,next.      

    /**
     * Creates new form KhoaHoc
     */
    public JFKhoaHoc() {
        initComponents();
        setLocationRelativeTo(null);
        getCombobox();
        filldata();
        txtHocphi.setEnabled(false);
        txtThoiluong.setEnabled(false);
        txtNGuoitao.setEnabled(false);
        txtNgaytao.setEnabled(false);
        btnXoa.setEnabled(false);
        btnsua.setEnabled(false);
        btnHocVien.setEnabled(false);
    }
    
    public void getCombobox() {
        DefaultComboBoxModel<ChuyenDe> model = (DefaultComboBoxModel) cboChuyende.getModel();
        model.removeAllElements();
        for (ChuyenDe chuyende : daocd.getAllChuyenDe()) {
            model.addElement(chuyende);
        }
        
    }
    
    public void reset() {
        cboChuyende.setSelectedIndex(0);
        txtGhichu.setText("");
        txtHocphi.setText("");
        txtNGuoitao.setText("");
        txtNkhaiGiang.setText("");
        txtNgaytao.setText("");
        txtThoiluong.setText("");
        
    }
    
    public KhoaHoc getModel() throws ParseException {
        KhoaHoc kh = new KhoaHoc();
        ChuyenDe chuyenDe = (ChuyenDe) cboChuyende.getSelectedItem();
        kh.setMaCD(chuyenDe.getMaCD());
        kh.setHocPhi(Float.parseFloat(txtHocphi.getText()));
        kh.setThoiLuong(Integer.parseInt(txtThoiluong.getText()));
        kh.setNgayKhaiGiang(data.parse(txtNkhaiGiang.getText()));
        kh.setGhiChu(txtGhichu.getText());
        kh.setNgayTao(data.parse(txtNgaytao.getText()));
        kh.setMaNV(new NhanVien(txtNGuoitao.getText()));
        return kh;
    }
    
    public boolean ValiCheckdata() {
        if (txtGhichu.getText().isEmpty() || txtHocphi.getText().isEmpty() || txtNGuoitao.getText().isEmpty()
                || txtNgaytao.getText().isEmpty() || txtNkhaiGiang.getText().isEmpty() || txtThoiluong.getText().isEmpty()) {
            return false;
        }
        return true;
    }
    
    public void filldata() {
        DefaultTableModel model = (DefaultTableModel) tabbangKhoahoc.getModel();
        model.setRowCount(0);
        for (KhoaHoc kh : daokh.getAllkhoaHoc()) {
            Object row[] = new Object[7];
            row[0] = kh.getMaKH();
            row[1] = kh.getMaCD();
            row[2] = Float.toString(kh.getHocPhi());
            row[3] = Integer.toString(kh.getThoiLuong());
            row[4] = data.format(kh.getNgayKhaiGiang());
            row[5] = kh.getMaNV();
            row[6] = data.format(kh.getNgayTao());
            model.addRow(row);
        }
    }
    
    public void setModeL(KhoaHoc kh) {
        cboChuyende.setToolTipText(String.valueOf(kh.getMaKH()));
        cboChuyende.setSelectedIndex(daocd.MaCD(tabbangKhoahoc.getValueAt(position, 1).toString()));
        txtGhichu.setText(kh.getGhiChu());
        txtHocphi.setText(Float.toString(kh.getHocPhi()));
        txtNgaytao.setText(data.format(kh.getNgayTao()));
        txtNkhaiGiang.setText(data.format(kh.getNgayKhaiGiang()));
        txtThoiluong.setText(Integer.toString(kh.getThoiLuong()));
        txtNGuoitao.setText(kh.getMaNV().toString());
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
        tabkhoc = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cboChuyende = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHocphi = new javax.swing.JTextField();
        txtNGuoitao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtGhichu = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNkhaiGiang = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtThoiluong = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNgaytao = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnHocVien = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabbangKhoahoc = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("QUẢN LÝ KHÓA HỌC");

        tabkhoc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Chuyên đề");

        cboChuyende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboChuyendeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Học phí");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Người tạo");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Ghi chú");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Ngày khai giảng");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Thời lượng (Giờ)");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Ngày tạo");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
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

        btnHocVien.setText("Học viên");
        btnHocVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHocVienActionPerformed(evt);
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

        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGhichu)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNGuoitao)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(txtHocphi, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cboChuyende, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtThoiluong)
                            .addComponent(txtNgaytao)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtNkhaiGiang)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnsua)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnMoi)
                        .addGap(18, 18, 18)
                        .addComponent(btnHocVien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFirst)
                        .addGap(18, 18, 18)
                        .addComponent(btnBack)
                        .addGap(18, 18, 18)
                        .addComponent(btnNext)
                        .addGap(18, 18, 18)
                        .addComponent(btnLast)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboChuyende, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNkhaiGiang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHocphi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtThoiluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNGuoitao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgaytao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGhichu, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnsua)
                    .addComponent(btnXoa)
                    .addComponent(btnMoi)
                    .addComponent(btnHocVien)
                    .addComponent(btnFirst)
                    .addComponent(btnBack)
                    .addComponent(btnNext)
                    .addComponent(btnLast))
                .addGap(26, 26, 26))
        );

        tabkhoc.addTab("CẬP NHẬT", jPanel1);

        tabbangKhoahoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "MÃ KH", "CHUYÊN ĐỀ", "HỌC PHÍ", "THỜI LƯỢNG", "KHAI GIẢNG", "TẠO BỞI", "NGÀY TẠO"
            }
        ));
        tabbangKhoahoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabbangKhoahocMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabbangKhoahocMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabbangKhoahoc);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE))
        );

        tabkhoc.addTab("DANH SÁCH", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(tabkhoc)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabkhoc))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboChuyendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboChuyendeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboChuyendeActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if (ValiCheckdata()) {
            
            try {
                KhoaHoc kh = getModel();
                if (daokh.add(kh) > 0) {
                    filldata();
                    JOptionPane.showMessageDialog(this, "BAN VUA THEM THANH CONG");
                } else {
                    JOptionPane.showMessageDialog(this, "BAN VUA THEM THAT BAI");
                }
            } catch (ParseException ex) {
                System.out.println("error" + ex.toString());
            }
        } else {
            JOptionPane.showMessageDialog(this, "YEU CAU BAN NHAP DAY DU");
        }
    }//GEN-LAST:event_btnThemActionPerformed
    

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        maKH = Integer.valueOf(tabbangKhoahoc.getValueAt(rowId, 0).toString());
        KhoaHoc kh = new KhoaHoc();
        if (daokh.edit(kh) > 0) {
            JOptionPane.showMessageDialog(this, "BAN EDIT THANH CONG");
            filldata();
        }
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        maKH = Integer.valueOf(tabbangKhoahoc.getValueAt(rowId, 0).toString());
//        KhoaHoc kh = new KhoaHoc();
        if (daokh.dell(maKH) > 0) {
            JOptionPane.showMessageDialog(this, "BAN XOA THANH CONG");
            filldata();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnHocVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHocVienActionPerformed
        // TODO add your handling code here:
        HocVienDiaLog hv = new HocVienDiaLog(this,true);
        hv.setVisible(true);
      btnHocVien.setEnabled(true);
                
    }//GEN-LAST:event_btnHocVienActionPerformed
    public KhoaHoc getKhoaHocNHAtPosition(int pos) throws ParseException {
        KhoaHoc kh = new KhoaHoc();
        cboChuyende.setSelectedIndex(daocd.MaCD(tabbangKhoahoc.getValueAt(position, 1).toString()));
        kh.setHocPhi(Float.parseFloat(tabbangKhoahoc.getValueAt(pos, 2).toString()));
        kh.setThoiLuong(Integer.parseInt(tabbangKhoahoc.getValueAt(pos, 3).toString()));
        kh.setNgayKhaiGiang(data.parse(tabbangKhoahoc.getValueAt(pos, 4).toString()));
        kh.setMaNV(new NhanVien(tabbangKhoahoc.getValueAt(pos, 5).toString()));
        kh.setNgayTao(data.parse(tabbangKhoahoc.getValueAt(pos, 6).toString()));
        return kh;
        
    }
    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        try {
            // TODO add your handling code here:
            position = 0;
            KhoaHoc kh = getKhoaHocNHAtPosition(position);
            setModeL(kh);
        } catch (ParseException ex) {
            Logger.getLogger(JFKhoaHoc.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        try {
            // TODO add your handling code here:
            position -- ;
            if (position <= 0) {
                position = 0;
            }
            KhoaHoc kh = getKhoaHocNHAtPosition(position);
            setModeL(kh);
        } catch (ParseException ex) {
            Logger.getLogger(JFKhoaHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            position++;
            if (position >= daokh.getAllkhoaHoc().size() - 1) {
                position = daokh.getAllkhoaHoc().size() - 1;
            }
            KhoaHoc kh = getKhoaHocNHAtPosition(position);
            setModeL(kh);
        } catch (ParseException ex) {
            Logger.getLogger(JFKhoaHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        try {
            // TODO add your handling code here:
            position = daokh.getAllkhoaHoc().size() - 1;
            KhoaHoc kh = getKhoaHocNHAtPosition(position);
            setModeL(kh);
        } catch (ParseException ex) {
            Logger.getLogger(JFKhoaHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLastActionPerformed

    private void tabbangKhoahocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabbangKhoahocMouseClicked
        // TODO add your handling code here:
        KhoaHoc kh = new KhoaHoc();
        int position = tabbangKhoahoc.rowAtPoint(evt.getPoint());
        cboChuyende.setSelectedIndex(daocd.MaCD(tabbangKhoahoc.getValueAt(position, 1).toString()));
        txtHocphi.setText(tabbangKhoahoc.getValueAt(position, 2).toString());
        txtThoiluong.setText(tabbangKhoahoc.getValueAt(position, 3).toString());
        txtNkhaiGiang.setText(tabbangKhoahoc.getValueAt(position, 4).toString());
        txtNGuoitao.setText(tabbangKhoahoc.getValueAt(position, 5).toString());
        txtNgaytao.setText(tabbangKhoahoc.getValueAt(position, 6).toString());
//        setModeL(kh);
//        String maChuyende= tabbangKhoahoc.getValueAt(rowId, 1).toString();
//        cboChuyende.setSelectedIndex(ChuyendeHashMap.get(maChuyende));

//        setModeL(kh);

    }//GEN-LAST:event_tabbangKhoahocMouseClicked

    private void tabbangKhoahocMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabbangKhoahocMousePressed
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            tabkhoc.setSelectedIndex(0);
            int rowID = tabbangKhoahoc.rowAtPoint(evt.getPoint());
            cboChuyende.setSelectedItem(daocd.getChuyenDeBYID(tabbangKhoahoc.getValueAt(rowID, 1).toString()));
            
        }
    }//GEN-LAST:event_tabbangKhoahocMousePressed

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
            java.util.logging.Logger.getLogger(JFKhoaHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFKhoaHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFKhoaHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFKhoaHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFKhoaHoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnHocVien;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnsua;
    private javax.swing.JComboBox<String> cboChuyende;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabbangKhoahoc;
    private javax.swing.JTabbedPane tabkhoc;
    private javax.swing.JTextField txtGhichu;
    private javax.swing.JTextField txtHocphi;
    private javax.swing.JTextField txtNGuoitao;
    private javax.swing.JTextField txtNgaytao;
    private javax.swing.JTextField txtNkhaiGiang;
    private javax.swing.JTextField txtThoiluong;
    // End of variables declaration//GEN-END:variables
}
