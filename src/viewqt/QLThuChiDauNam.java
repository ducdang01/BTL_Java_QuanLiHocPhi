package viewqt;

import controller.Controller;
import java.awt.Frame;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.TableModel;
import model.ThuChiDauNam;

public class QLThuChiDauNam extends javax.swing.JFrame {

    private Controller con;
    private TableModel<ThuChiDauNam> tableModelThuChiDauNam;
    private ArrayList<ThuChiDauNam> dsThuChiDauNam;
    private String maKhoanThu = "";
    private String tenKhoa = "";
    private String tenKhoanThu = "";
    private String gia = "";

    public QLThuChiDauNam() {
        con = new Controller();
        dsThuChiDauNam = con.docFile("src/TextJava/thuchidaunam.txt");
        initComponents();

        loadDataTable();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    public void loadDataTable() {
        dsThuChiDauNam = con.docFile("src/TextJava/thuchidaunam.txt");
        String[] tenCot = {"Mã khoản thu", "Tên khoản thu", "Khoa", "Giá"};
        this.tableModelThuChiDauNam = new TableModel<ThuChiDauNam>(this.dsThuChiDauNam, tenCot) {
            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                switch (columnIndex) {
                    case 0:
                        return dsThuChiDauNam.get(rowIndex).getMaKhoanThu();
                    case 1:
                        return dsThuChiDauNam.get(rowIndex).getTenKhoanThu();
                    case 2:
                        return dsThuChiDauNam.get(rowIndex).getKhoa().getTenKhoa();
                    case 3:
                        return dsThuChiDauNam.get(rowIndex).getGia();
                    default:
                        return null;
                }
            }

        };
        tableThuChiDauNam.setModel(this.tableModelThuChiDauNam);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableThuChiDauNam = new javax.swing.JTable();
        btnThem = new javax.swing.JToggleButton();
        btnSua = new javax.swing.JToggleButton();
        btnThoat = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        tableThuChiDauNam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableThuChiDauNamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableThuChiDauNam);

        btnThem.setBackground(new java.awt.Color(255, 255, 255));
        btnThem.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(255, 255, 255));
        btnSua.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(255, 255, 255));
        btnThoat.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnThoat.setText("Thoat");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(249, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(410, 410, 410)
                            .addComponent(btnThoat)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(350, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua))
                .addGap(56, 56, 56))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(btnThoat)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        ThemThuChiDauNam themThuChiDauNam = new ThemThuChiDauNam(this, rootPaneCheckingEnabled);
        themThuChiDauNam.setVisible(true);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        try {
            if (maKhoanThu.equals("")) {
                throw new Exception("Vui lòng chọn khoản thu cần sửa");
            }
            SuaThuChiDauNam suaThuChiDauNam = new SuaThuChiDauNam(this, rootPaneCheckingEnabled, maKhoanThu, tenKhoa, tenKhoanThu, gia);
            suaThuChiDauNam.setVisible(true);
        } catch (Exception e) {
            Frame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, e.getMessage(), "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void tableThuChiDauNamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableThuChiDauNamMouseClicked
        // TODO add your handling code here:
        int row = tableThuChiDauNam.getSelectedRow();
        maKhoanThu = (String) tableThuChiDauNam.getValueAt(row, 0);
        tenKhoanThu = (String) tableThuChiDauNam.getValueAt(row, 1);
        tenKhoa = (String) tableThuChiDauNam.getValueAt(row, 2);
        System.out.println(gia);
    }//GEN-LAST:event_tableThuChiDauNamMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLThuChiDauNam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnSua;
    private javax.swing.JToggleButton btnThem;
    private javax.swing.JToggleButton btnThoat;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableThuChiDauNam;
    // End of variables declaration//GEN-END:variables
}
