
package viewsv;

import controller.Controller;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.CongNo;
import model.HocPhan;
import model.LopHocPhan;
import model.SinhVien;
import model.TableModel;
import model.ThuTheoDangKy;


public class DangKyMonHoc extends java.awt.Dialog {

    private SinhVienMain sinhVienMain;
    private SinhVien sinhVien;
    private TableModel<HocPhan> tableMonHoc;
    private ArrayList<HocPhan> hocPhans = new ArrayList<>();
    private ArrayList<LopHocPhan> lopHocPhans = new ArrayList<>();
    private ArrayList<ThuTheoDangKy> dsThuTheoDangKy = new ArrayList<>();
    private ArrayList<CongNo> congNos = new ArrayList<>();
    private Controller con;
    private String maMonDangKy="";
    private String tenMonDangKi="";
    private int tinChi;
    private double gia;

    public DangKyMonHoc(java.awt.Frame parent, boolean modal, SinhVien sinhVien) {
        super(parent, modal);
        this.sinhVienMain = (SinhVienMain) parent;
        this.sinhVien = sinhVien;
        this.con = new Controller();
        this.hocPhans = con.docFile("src/TextJava/hocphan.txt");
        this.lopHocPhans = con.docFile("src/TextJava/lophocphan.txt");
        this.congNos = con.docFile("src/TextJava/congno.txt");
        this.dsThuTheoDangKy = con.docFile("src/TextJava/thutheodangky.txt");

        initComponents();
        String[] tenCot = {"Mã học phần", "Tên học phần", "Tín chỉ", "Giá"};
        this.tableMonHoc = new TableModel<HocPhan>(this.hocPhans, tenCot) {
            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                switch (columnIndex) {
                    case 0:
                        return hocPhans.get(rowIndex).getMaHocPhan();
                    case 1:
                        return hocPhans.get(rowIndex).getTenHocPhan();
                    case 2:
                        return hocPhans.get(rowIndex).getTinChi();
                    case 3:
                        return hocPhans.get(rowIndex).getGia();
                    default:
                        return null;
                }
            }
        };
        tableDangKyHocPhan.setModel(this.tableMonHoc);
        this.setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        btnDangKy = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDangKyHocPhan = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(500, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Đăng ký môn học");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        btnDangKy.setText("Đăng ký");
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyActionPerformed(evt);
            }
        });
        add(btnDangKy, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        tableDangKyHocPhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDangKyHocPhanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDangKyHocPhan);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void tableDangKyHocPhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDangKyHocPhanMouseClicked
        // TODO add your handling code here:
        int row = tableDangKyHocPhan.getSelectedRow();
        maMonDangKy = (String) tableDangKyHocPhan.getValueAt(row, 0);
        System.out.println(maMonDangKy);
    }//GEN-LAST:event_tableDangKyHocPhanMouseClicked

    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed
        // TODO add your handling code here:
        try {
            if (maMonDangKy.equals("")) {
                throw new Exception("Bạn chưa chọn học để đăngký");
            }
            HocPhan hp = new HocPhan(maMonDangKy, "", 0, "");
            LopHocPhan lhp = new LopHocPhan(sinhVien, hp);
            if (lopHocPhans.contains(lhp)) {
                throw new Exception("Môn học này đã được bạn đăng ký");
            }
            hp = hocPhans.get(hocPhans.indexOf(hp));
            lhp = new LopHocPhan(sinhVien, hp);

            ThuTheoDangKy maDangKyHocPhanMax = Collections.max(dsThuTheoDangKy, new Comparator<ThuTheoDangKy>() {
                @Override
                public int compare(ThuTheoDangKy o1, ThuTheoDangKy o2) {
                    if (o1.getSoDanhMaTuDong() > o2.getSoDanhMaTuDong()) {
                        return 1;
                    } else if (o1.getSoDanhMaTuDong() > o2.getSoDanhMaTuDong()) {
                        return 0;
                    }
                    return -1;
                }
            });
            ThuTheoDangKy thuTheoDK = new ThuTheoDangKy(maDangKyHocPhanMax.getSoDanhMaTuDong() + 1, lhp, sinhVien.getMaSinhVien());
            CongNo congNo = new CongNo(sinhVien, thuTheoDK, false);
            lopHocPhans.add(lhp);
            dsThuTheoDangKy.add(thuTheoDK);
            congNos.add(congNo);
            con.ghiFile(lopHocPhans, "src/TextJava/lophocphan.txt");
            con.ghiFile(dsThuTheoDangKy, "src/TextJava/thutheodangky.txt");
            con.ghiFile(congNos, "src/TextJava/congno.txt");
            sinhVienMain.loadData();
            throw new Exception("Đăng ký thành công môn học " + hp.getTenHocPhan());
        } catch (Exception e) {
            Frame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, e.getMessage(), "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnDangKyActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnThoatActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKy;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableDangKyHocPhan;
    // End of variables declaration//GEN-END:variables
}
