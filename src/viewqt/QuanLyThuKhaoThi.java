/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewqt;

import controller.Controller;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CongNo;
import model.GiaoDich;
import model.Khoa;
import model.SinhVien;
import model.TableModel;
import model.ThuBoSung;
import model.ThuKhaoThi;

public class QuanLyThuKhaoThi extends javax.swing.JFrame {

    private Controller con;
    private TableModel<ThuKhaoThi> tableModelThuKhaoThi;
    private ArrayList<ThuKhaoThi> dsThuKhaoThi;
    private ArrayList<Khoa> dsKhoa;
    private ArrayList<CongNo> dsCongNo;
    private ArrayList<GiaoDich> dsGiaoDich;
    private ArrayList<SinhVien> dsSinhVien;
    private Khoa khoaDuocChon;
    private String maKhoanThu = "";
    private String tenKhoa = "";
    private String tenKhoanThu = "";
    private String khoaCu;
    private double gia = 0;
    private String khoanThuCanSua;
    private boolean check = false;

    /**
     * Creates new form QuanLyThuKhaoThi
     */
    public QuanLyThuKhaoThi() {
        con = new Controller();
        dsKhoa = con.docFile("src/TextJava/khoa.txt");
        dsThuKhaoThi = con.docFile("src/TextJava/thukhaothi.txt");
        dsCongNo = con.docFile("src/TextJava/congno.txt");
        dsSinhVien = con.docFile("src/TextJava/sinhvien.txt");
        dsGiaoDich = con.docFile("src/TextJava/giaodich.txt");

        initComponents();
        showComBox();
        loadDataTable();
        this.setLocationRelativeTo(null);
    }

    public void loadDataTable() {
        dsThuKhaoThi = con.docFile("src/TextJava/thukhaothi.txt");
        String[] tenCot = {"Mã khoản thu", "Tên khoản thu", "Khoa", "Giá"};
        this.tableModelThuKhaoThi = new TableModel<ThuKhaoThi>(this.dsThuKhaoThi, tenCot) {
            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                switch (columnIndex) {
                    case 0:
                        return dsThuKhaoThi.get(rowIndex).getMaKhoanThu();
                    case 1:
                        return dsThuKhaoThi.get(rowIndex).getTenKhoanThu();
                    case 2:
                        return dsThuKhaoThi.get(rowIndex).getKhoa().getTenKhoa();
                    case 3:
                        return dsThuKhaoThi.get(rowIndex).getGia();
                    default:
                        return null;
                }
            }

        };
        tableThuKhaoThi.setModel(this.tableModelThuKhaoThi);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableThuKhaoThi = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTenKhoanThu = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cboKhoa = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KhaoThi manager");

        tableThuKhaoThi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tableThuKhaoThi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableThuKhaoThi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableThuKhaoThiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableThuKhaoThi);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Danh sách khoản thu KT:");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nhập thông tin cho KT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Số tiền khoản thu KT:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Tên khoản khảo thí cần thu:");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Khoa:");

        cboKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboKhoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(83, 83, 83)
                            .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(33, 33, 33)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtGia, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                .addComponent(txtTenKhoanThu, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                .addComponent(cboKhoa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(364, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenKhoanThu, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(cboKhoa))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(btnThem)
                    .addComponent(btnThoat))
                .addGap(20, 20, 20))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("QUẢN LÝ THU KHẢO THÍ");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(366, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(353, 353, 353)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(739, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        Frame frame = new Frame();

        try {
            if(!check){
                throw new Exception("Vui lòng chọn thông tin cần sửa");
            }
            if (txtTenKhoanThu.getText().equals("") || txtGia.getText().equals("") || khoaDuocChon == null || khoanThuCanSua == null) {
                throw new Exception("Vui lòng nhập đầy đủ thông tin");
            }
            int output = JOptionPane.showConfirmDialog(frame,
                    "Xác nhận sửa", "Lựa chọn", JOptionPane.YES_NO_OPTION);
            if (output == JOptionPane.YES_OPTION) {
                ThuKhaoThi thuKhaoThu = new ThuKhaoThi(khoanThuCanSua, "", 0);
                thuKhaoThu = dsThuKhaoThi.get(dsThuKhaoThi.indexOf(thuKhaoThu));
                double giaSua = Double.parseDouble(txtGia.getText());
                String tenKhoanThuSua = txtTenKhoanThu.getText();
                double giaCu = thuKhaoThu.getGia();
                thuKhaoThu.setGia(giaSua);
                thuKhaoThu.setTenKhoanThu("Thu khảo thí : " + tenKhoanThuSua);
                thuKhaoThu.setKhoa(khoaDuocChon);

                if (khoaDuocChon.getTenKhoa().equals(khoaCu)) {
                    for (int i = 0; i < dsSinhVien.size(); i++) {
                        SinhVien get = dsSinhVien.get(i);
                        if (get.getLop().getKhoa().getMaKhoa().equals(khoaDuocChon.getMaKhoa())) {
                            CongNo congNo = new CongNo(get, thuKhaoThu, false);
                            CongNo checkNopTien = dsCongNo.get(dsCongNo.indexOf(congNo));
                            if (checkNopTien.isKiemTraThu()) {
                                get = new SinhVien(get.getMaSinhVien(), get.getHoTen(), get.getLop(), get.getSoTienTK() + giaCu, get.getDiaChi(), get.getTaiKhoanTien());
                                dsSinhVien.set(dsSinhVien.indexOf(get), get);
                                GiaoDich giaoDich = new GiaoDich(get, "Khoản thu bị sửa đổi", get.getTaiKhoanTien(), new Date(), "+ " + giaCu);
                                dsGiaoDich.add(giaoDich);
                                con.ghiFile(dsGiaoDich, "src/TextJava/giaodich.txt");
                            }
                            dsThuKhaoThi.set(dsThuKhaoThi.indexOf(thuKhaoThu), thuKhaoThu);
                            dsCongNo.set(dsCongNo.indexOf(congNo), congNo);
                        }
                    }
                } else {
                    for (int i = 0; i < dsSinhVien.size(); i++) {
                        SinhVien get = dsSinhVien.get(i);
                        if (get.getLop().getKhoa().getMaKhoa().equals(khoaDuocChon.getMaKhoa())) {
                            CongNo congNo = new CongNo(get, thuKhaoThu, false);
                            dsCongNo.add(congNo);
                        }
                        if (get.getLop().getKhoa().getTenKhoa().equals(khoaCu)) {
                            CongNo congNo = new CongNo(get, thuKhaoThu, false);
                            CongNo checkNopTien = dsCongNo.get(dsCongNo.indexOf(congNo));
                            if (checkNopTien.isKiemTraThu()) {
                                get = new SinhVien(get.getMaSinhVien(), get.getHoTen(), get.getLop(), get.getSoTienTK() + giaCu, get.getDiaChi(), get.getTaiKhoanTien());
                                dsSinhVien.set(dsSinhVien.indexOf(get), get);
                                GiaoDich giaoDich = new GiaoDich(get, "Khoản thu bị sửa đổi", get.getTaiKhoanTien(), new Date(), "+ " + giaCu);
                                dsGiaoDich.add(giaoDich);
                                con.ghiFile(dsGiaoDich, "src/TextJava/giaodich.txt");
                            }
                            dsThuKhaoThi.set(dsThuKhaoThi.indexOf(thuKhaoThu), thuKhaoThu);
                            dsCongNo.remove(dsCongNo.indexOf(congNo));
                        }

                    }
                }
                khoaCu = null;
                con.ghiFile(dsSinhVien, "src/TextJava/sinhvien.txt");
                con.ghiFile(dsThuKhaoThi, "src/TextJava/thukhaothi.txt");
                con.ghiFile(dsCongNo, "src/TextJava/congno.txt");
                loadDataTable();
                check = false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, e.getMessage(), "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSuaActionPerformed


    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        Frame frame = new Frame();

        try {
            if (txtTenKhoanThu.getText().equals("") || txtGia.getText().equals("") || khoaDuocChon == null) {
                throw new Exception("Vui lòng nhập đầy đủ thông tin");
            }

            int soMax;
            if (dsThuKhaoThi.size() != 0) {
                ThuKhaoThi maThuChiKhaoThiMax = Collections.max(dsThuKhaoThi, new Comparator<ThuKhaoThi>() {
                    @Override
                    public int compare(ThuKhaoThi o1, ThuKhaoThi o2) {
                        if (o1.getSoDanhMaTuDong() > o2.getSoDanhMaTuDong()) {
                            return 1;
                        } else if (o1.getSoDanhMaTuDong() > o2.getSoDanhMaTuDong()) {
                            return 0;
                        }
                        return -1;
                    }
                });
                soMax = maThuChiKhaoThiMax.getSoDanhMaTuDong();
            } else {
                soMax = 0;
            }
            ThuKhaoThi thuKhaoThi = new ThuKhaoThi(khoaDuocChon, soMax + 1, txtTenKhoanThu.getText(), Double.parseDouble(txtGia.getText()));
            dsThuKhaoThi.add(thuKhaoThi);
            for (int i = 0; i < dsSinhVien.size(); i++) {
                SinhVien get = dsSinhVien.get(i);
                if (get.getLop().getKhoa().getMaKhoa().equals(khoaDuocChon.getMaKhoa())) {
                    CongNo congNo = new CongNo(get, thuKhaoThi, false);
                    dsCongNo.add(congNo);
                }
            }
            con.ghiFile(dsThuKhaoThi, "src/TextJava/thukhaothi.txt");
            con.ghiFile(dsCongNo, "src/TextJava/congno.txt");
            this.loadDataTable();
            maKhoanThu = "";
            tenKhoa = "";
            tenKhoanThu = "";
            gia = 0;
            khoanThuCanSua = null;
            check = false;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, e.getMessage(), "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void tableThuKhaoThiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableThuKhaoThiMouseClicked
        // TODO add your handling code here:
        int row = tableThuKhaoThi.getSelectedRow();
        maKhoanThu = (String) tableThuKhaoThi.getValueAt(row, 0);
        tenKhoanThu = (String) tableThuKhaoThi.getValueAt(row, 1);
        tenKhoanThu = tenKhoanThu.substring(15);
        tenKhoa = (String) tableThuKhaoThi.getValueAt(row, 2);
        if(khoaCu == null)
            khoaCu = tenKhoa;
        gia = (double) tableThuKhaoThi.getValueAt(row, 3);
        khoanThuCanSua = maKhoanThu;
        check = true;
        txtTenKhoanThu.setText(tenKhoanThu);
        txtGia.setText(String.valueOf(gia));
        cboKhoa.setSelectedItem(tenKhoa);
    }//GEN-LAST:event_tableThuKhaoThiMouseClicked

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void cboKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboKhoaActionPerformed
        // TODO add your handling code here:
        String tenKhoa = cboKhoa.getItemAt(cboKhoa.getSelectedIndex());
        for (int i = 0; i < dsKhoa.size(); i++) {
            Khoa get = dsKhoa.get(i);
            if (get.getTenKhoa().equals(tenKhoa)) {
                khoaDuocChon = get;
                break;
            }
        }
    }//GEN-LAST:event_cboKhoaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyThuKhaoThi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JComboBox<String> cboKhoa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableThuKhaoThi;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtTenKhoanThu;
    // End of variables declaration//GEN-END:variables

    private void showComBox() {
        for (int i = 0; i < dsKhoa.size(); i++) {
            Khoa get = dsKhoa.get(i);
            cboKhoa.addItem(get.getTenKhoa());
        }
    }
}
