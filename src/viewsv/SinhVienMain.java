package viewsv;

import model.SinhVien;

public class SinhVienMain extends javax.swing.JFrame {

    private SinhVien sinhVien;

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public SinhVienMain(SinhVien sv) {
        this.sinhVien = sv;
        initComponents();
        System.out.println(sinhVien.toString());
        loadData();
        this.setLocationRelativeTo(null);
    }

    public void loadData() {
        lblHoTen.setText(sinhVien.getHoTen());
        lblMaSinhVien.setText(sinhVien.getMaSinhVien());
        lblSoDuTK.setText(String.format("%.2f", sinhVien.getSoTienTK()));
        lblTenLop.setText(sinhVien.getLop().getTenLop());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblHoTen = new javax.swing.JLabel();
        lblMaSinhVien = new javax.swing.JLabel();
        lblTenLop = new javax.swing.JLabel();
        lblSoDuTK = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnLichSuGiaoDich = new javax.swing.JButton();
        btnNopHocPhi = new javax.swing.JButton();
        btnNapTienVaoTaiKhoan = new javax.swing.JButton();
        btnDangKyMonHoc = new javax.swing.JButton();
        btnRutHocPhan = new javax.swing.JButton();
        btnRutTien = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnDangXuat = new javax.swing.JToggleButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sinh Viên");
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Họ tên");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Mã sinh viên");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Lớp");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Số dư tài khoản");

        lblHoTen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblMaSinhVien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblTenLop.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblSoDuTK.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnLichSuGiaoDich.setBackground(new java.awt.Color(255, 255, 255));
        btnLichSuGiaoDich.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnLichSuGiaoDich.setText("Lịch sử giao dịch");
        btnLichSuGiaoDich.setBorder(null);
        btnLichSuGiaoDich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLichSuGiaoDichActionPerformed(evt);
            }
        });

        btnNopHocPhi.setBackground(new java.awt.Color(255, 255, 255));
        btnNopHocPhi.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnNopHocPhi.setText("Nộp học phí");
        btnNopHocPhi.setBorder(null);
        btnNopHocPhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNopHocPhiActionPerformed(evt);
            }
        });

        btnNapTienVaoTaiKhoan.setBackground(new java.awt.Color(255, 255, 255));
        btnNapTienVaoTaiKhoan.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnNapTienVaoTaiKhoan.setText("Nạp tiền vào tài khoản");
        btnNapTienVaoTaiKhoan.setBorder(null);
        btnNapTienVaoTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNapTienVaoTaiKhoanActionPerformed(evt);
            }
        });

        btnDangKyMonHoc.setBackground(new java.awt.Color(255, 255, 255));
        btnDangKyMonHoc.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnDangKyMonHoc.setText("Đăng ký môn học");
        btnDangKyMonHoc.setBorder(null);
        btnDangKyMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyMonHocActionPerformed(evt);
            }
        });

        btnRutHocPhan.setBackground(new java.awt.Color(255, 255, 255));
        btnRutHocPhan.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnRutHocPhan.setText("Rút học phần");
        btnRutHocPhan.setBorder(null);
        btnRutHocPhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutHocPhanActionPerformed(evt);
            }
        });

        btnRutTien.setBackground(new java.awt.Color(255, 255, 255));
        btnRutTien.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnRutTien.setText("Rút tiền");
        btnRutTien.setBorder(null);
        btnRutTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutTienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDangKyMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRutHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLichSuGiaoDich, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnNopHocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNapTienVaoTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRutTien, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLichSuGiaoDich, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNopHocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNapTienVaoTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangKyMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRutHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRutTien, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Chức năng");

        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblTenLop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSoDuTK, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)))))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(lblTenLop, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(lblMaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSoDuTK, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDangXuat)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLichSuGiaoDichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLichSuGiaoDichActionPerformed
        // TODO add your handling code here:
        LichSuGiaoDich lichSuGiaoDich = new LichSuGiaoDich(this, rootPaneCheckingEnabled, sinhVien);
        lichSuGiaoDich.setVisible(true);
    }//GEN-LAST:event_btnLichSuGiaoDichActionPerformed

    private void btnNopHocPhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNopHocPhiActionPerformed
        // TODO add your handling code here:
        NopHocPhi nopHocPhi = new NopHocPhi(this, rootPaneCheckingEnabled, sinhVien);
        nopHocPhi.setVisible(true);
    }//GEN-LAST:event_btnNopHocPhiActionPerformed

    private void btnNapTienVaoTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNapTienVaoTaiKhoanActionPerformed
        // TODO add your handling code here:
        NapTienVaoTaiKhoan napTienVaoTaiKhoan = new NapTienVaoTaiKhoan(this, rootPaneCheckingEnabled, sinhVien, this);
        napTienVaoTaiKhoan.setVisible(true);
    }//GEN-LAST:event_btnNapTienVaoTaiKhoanActionPerformed

    private void btnDangKyMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyMonHocActionPerformed
        // TODO add your handling code here:
        DangKyMonHoc dangKyMonHoc = new DangKyMonHoc(this, rootPaneCheckingEnabled, sinhVien);
        dangKyMonHoc.setVisible(true);
    }//GEN-LAST:event_btnDangKyMonHocActionPerformed

    private void btnRutHocPhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutHocPhanActionPerformed
        // TODO add your handling code here:
        RutHocPhan rutHocPhan = new RutHocPhan(this, rootPaneCheckingEnabled, sinhVien);
        rutHocPhan.setVisible(true);
    }//GEN-LAST:event_btnRutHocPhanActionPerformed

    private void btnRutTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutTienActionPerformed
        // TODO add your handling code here:
        RutTien rutTien = new RutTien(this, rootPaneCheckingEnabled, sinhVien);
        rutTien.setVisible(true);
    }//GEN-LAST:event_btnRutTienActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        login.Login dangnhap = new login.Login();
        dangnhap.setVisible(true);
    }//GEN-LAST:event_btnDangXuatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKyMonHoc;
    private javax.swing.JToggleButton btnDangXuat;
    private javax.swing.JButton btnLichSuGiaoDich;
    private javax.swing.JButton btnNapTienVaoTaiKhoan;
    private javax.swing.JButton btnNopHocPhi;
    private javax.swing.JButton btnRutHocPhan;
    private javax.swing.JButton btnRutTien;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblMaSinhVien;
    private javax.swing.JLabel lblSoDuTK;
    private javax.swing.JLabel lblTenLop;
    // End of variables declaration//GEN-END:variables
}
