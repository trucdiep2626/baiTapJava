/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de3_sinhvienlophoc;

import com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class FormLopHoc extends javax.swing.JFrame {

    LopHoc lop = new LopHoc();
    DefaultTableModel model;

    /**
     * Creates new form FormLopHoc
     */
    public FormLopHoc() {
        initComponents();
        txtDiemHP.setVisible(false);
        txtDiemQT.setVisible(false);
        txtHoTen.setVisible(false);
        txtMaSV.setVisible(false);
        lbDiemHP.setVisible(false);
        lbDiemQT.setVisible(false);
        lbHoTen.setVisible(false);
        lbMaSV.setVisible(false);
        tableSV.setVisible(false);
        btnThemSV.setVisible(false);
        btnXoa.setVisible(false);
        model = (DefaultTableModel) tableSV.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbTenLop = new javax.swing.JLabel();
        txtTenLop = new javax.swing.JTextField();
        lbSiSo = new javax.swing.JLabel();
        txtSiSo = new javax.swing.JTextField();
        btnNhapSV = new javax.swing.JButton();
        txtHoTen = new javax.swing.JTextField();
        lbMaSV = new javax.swing.JLabel();
        txtMaSV = new javax.swing.JTextField();
        lbHoTen = new javax.swing.JLabel();
        txtDiemHP = new javax.swing.JTextField();
        lbDiemQT = new javax.swing.JLabel();
        txtDiemQT = new javax.swing.JTextField();
        lbDiemHP = new javax.swing.JLabel();
        btnThemSV = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSV = new javax.swing.JTable();

        jButton2.setText("jButton2");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTenLop.setText("Tên lớp:");

        lbSiSo.setText("Sĩ số:");

        btnNhapSV.setText("Nhập sinh viên");
        btnNhapSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapSVActionPerformed(evt);
            }
        });

        lbMaSV.setText("Mã sinh viên:");

        lbHoTen.setText("Họ tên:");

        lbDiemQT.setText("Điểm quá trình:");

        lbDiemHP.setText("Điểm học phần:");

        btnThemSV.setText("Thêm sinh viên");
        btnThemSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSVActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa thông tin");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        tableSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sinh viên", "Họ tên", "Điểm quá trình", "Điểm học phần", "Điểm trung bình"
            }
        ));
        jScrollPane2.setViewportView(tableSV);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(68, 68, 68)
                            .addComponent(btnThemSV)
                            .addGap(55, 55, 55)
                            .addComponent(btnXoa)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lbHoTen)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbMaSV)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbDiemHP)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDiemHP, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbDiemQT)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDiemQT, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbSiSo)
                                .addGap(18, 18, 18)
                                .addComponent(txtSiSo, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbTenLop)
                                .addGap(18, 18, 18)
                                .addComponent(txtTenLop, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNhapSV)
                            .addGap(113, 113, 113))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTenLop)
                            .addComponent(txtTenLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSiSo)
                            .addComponent(txtSiSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(btnNhapSV)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMaSV)
                            .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbHoTen)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDiemQT)
                            .addComponent(txtDiemQT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDiemHP)
                            .addComponent(txtDiemHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThemSV)
                            .addComponent(btnXoa))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNhapSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapSVActionPerformed
        if (txtTenLop.getText().trim().isEmpty() || txtSiSo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin");
        } else {

            try {
                lop.setTenLop(txtTenLop.getText().trim());
                lop.setSiSo(Integer.parseInt(txtSiSo.getText().trim()));
                txtSiSo.setText("");
                txtTenLop.setText("");
                lbSiSo.setVisible(false);
                lbTenLop.setVisible(false);
                txtTenLop.setVisible(false);
                txtSiSo.setVisible(false);
                btnNhapSV.setVisible(false);
                txtDiemHP.setVisible(true);
                txtDiemQT.setVisible(true);
                txtHoTen.setVisible(true);
                txtMaSV.setVisible(true);
                lbDiemHP.setVisible(true);
                lbDiemQT.setVisible(true);
                lbHoTen.setVisible(true);
                lbMaSV.setVisible(true);
                tableSV.setVisible(true);
                btnThemSV.setVisible(true);
                btnXoa.setVisible(true);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Sĩ số không hợp lệ");
            }
        }
    }//GEN-LAST:event_btnNhapSVActionPerformed

    private void btnThemSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSVActionPerformed
        if (txtMaSV.getText().trim().isEmpty() || txtHoTen.getText().trim().isEmpty() || txtDiemHP.getText().trim().isEmpty()
                || txtDiemQT.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin");
        } else {
            boolean hopLe = true;
            String message = "";
            double diemQT = 0;
            double diemHP = 0;
            try {
                diemHP = Double.valueOf(txtDiemHP.getText().trim());
            } catch (NumberFormatException e) {
                hopLe = false;
                message += "Điểm học phần không hợp lệ\n";
            }
            try {
                diemQT = Double.valueOf(txtDiemQT.getText().trim());
            } catch (NumberFormatException e) {
                hopLe = false;
                message += "Điểm quá trình không hợp lệ\n";
            }
            if (diemHP > 10 || diemQT > 10) {
                hopLe = false;
                message += "Điểm không lớn hơn 10\n";
            }
            if (hopLe) {
                SinhVien sv = new SinhVien(txtHoTen.getText().trim(), txtMaSV.getText().trim(), diemHP, diemQT);
                lop.themSv(sv);
                model.addRow(new Object[]{sv.getMaSV(), sv.getHoTen(), sv.getDiemQuaTrinh(), sv.getDiemHocPhan(), sv.getDiemTrungBinh()});
                txtDiemHP.setText("");
                txtDiemQT.setText("");
                txtHoTen.setText("");
                txtMaSV.setText("");
            } else {
                JOptionPane.showMessageDialog(this, message);
            }
        }
    }//GEN-LAST:event_btnThemSVActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        txtDiemHP.setText("");
        txtDiemQT.setText("");
        txtHoTen.setText("");
        txtMaSV.setText("");
    }//GEN-LAST:event_btnXoaActionPerformed

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
            java.util.logging.Logger.getLogger(FormLopHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLopHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLopHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLopHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLopHoc().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNhapSV;
    private javax.swing.JButton btnThemSV;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbDiemHP;
    private javax.swing.JLabel lbDiemQT;
    private javax.swing.JLabel lbHoTen;
    private javax.swing.JLabel lbMaSV;
    private javax.swing.JLabel lbSiSo;
    private javax.swing.JLabel lbTenLop;
    private javax.swing.JTable tableSV;
    private javax.swing.JTextField txtDiemHP;
    private javax.swing.JTextField txtDiemQT;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtSiSo;
    private javax.swing.JTextField txtTenLop;
    // End of variables declaration//GEN-END:variables
}
