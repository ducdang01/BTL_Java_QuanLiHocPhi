/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/AWTForms/Dialog.java to edit this template
 */
package viewsv;

/**
 *
 * @author Chien
 */
public class RutTien extends java.awt.Dialog {

    /**
     * Creates new form RutTien
     */
    
    private SinhVienMain sinhVienMain;
    public RutTien(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        sinhVienMain = (SinhVienMain) parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSoTienCanRut = new javax.swing.JTextField();
        txtMaTaiKhoan = new javax.swing.JTextField();
        btnHuy = new javax.swing.JButton();
        btnRutTien = new javax.swing.JButton();

        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Số tiền cần rút");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 20));

        jLabel2.setText("Nhập mã tài khoản");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 20));
        add(txtSoTienCanRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 140, -1));
        add(txtMaTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 140, -1));

        btnHuy.setBackground(new java.awt.Color(255, 255, 255));
        btnHuy.setText("Hủy");
        add(btnHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 110, 80, -1));

        btnRutTien.setBackground(new java.awt.Color(255, 255, 255));
        btnRutTien.setText("Rút tiền");
        add(btnRutTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RutTien dialog = new RutTien(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnRutTien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtMaTaiKhoan;
    private javax.swing.JTextField txtSoTienCanRut;
    // End of variables declaration//GEN-END:variables
}
