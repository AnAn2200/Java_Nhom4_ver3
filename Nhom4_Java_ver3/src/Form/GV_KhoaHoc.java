package Form;


import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class GV_KhoaHoc extends javax.swing.JFrame {
    public GV_KhoaHoc() {
        initComponents();
        setLocationRelativeTo(null);
        tbKhoaHoc.setAutoCreateRowSorter(true);
        KhoaHoc khoaHoc = new KhoaHoc();
        khoaHoc.Load();
        setTitle("Trang giáo viên");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTim = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbKhoaHoc = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtTim = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTim.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTim.setText("Tim kiem");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        tbKhoaHoc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbKhoaHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma mon", "Ma lop", "Ten mon", "So sinh vien"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbKhoaHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbKhoaHocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbKhoaHoc);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel1.setText("THONG TIN KHOA HOC");

        txtTim.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTim.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTimFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTimFocusLost(evt);
            }
        });
        txtTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimActionPerformed(evt);
            }
        });

        btnBack.setText("Quay lại");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnBack)
                .addGap(97, 97, 97)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public ArrayList<KhoaHoc> khoa = new ArrayList<>();
    
    public class KhoaHoc {
        private String MaLop;
        private String MaMon;
        private String TenMon;
        private int SoSinhVien;

        public KhoaHoc(String MaMon,String MaLop,String TenMon, int SoSinhVien) {
            this.MaMon = MaMon;
            this.MaLop = MaLop;
            this.TenMon = TenMon;
            this.SoSinhVien = SoSinhVien;
        }

        public KhoaHoc() {
        }
        public String getMaLop() {
            return MaLop;
        }

        public void setMaLop(String MaLop) {
            this.MaLop = MaLop;
        }

        public String getMaMon() {
            return MaMon;
        }

        public void setMaMon(String MaMon) {
            this.MaMon = MaMon;
        }

        public String getTenMon() {
            return TenMon;
        }

        public void setTenMon(String TenMon) {
            this.TenMon = TenMon;
        }

        public int getSoSinhVien() {
            return SoSinhVien;
        }

        public void setSoSinhVien(int SoSinhVien) {
            this.SoSinhVien = SoSinhVien;
        }

        public void Load(){
            KhoaHoc k1 = new KhoaHoc("IT6019","IT6019.1","Lập trình Java",70);
            KhoaHoc k2 = new KhoaHoc("IT6019","IT6019.2","Lap trinh Java",69);
            KhoaHoc k3 = new KhoaHoc("IT6019","IT6019.3","Lập trình Java",74);
            KhoaHoc k4 = new KhoaHoc("IT6020","IT6020.1","Lập trình C#",73);
            KhoaHoc k5 = new KhoaHoc("IT6020","IT6020.2","Lập trình C#",75);
            KhoaHoc k6 = new KhoaHoc("IT6020","IT6020.3","Lập trình C#",70);
            KhoaHoc k7 = new KhoaHoc("IT6020","IT6020.4","Lập trình C#",71);
            khoa.add(k1);
            khoa.add(k2);
            khoa.add(k3);
            khoa.add(k4);
            khoa.add(k5);
            khoa.add(k6);
            khoa.add(k7);
            DefaultTableModel model = (DefaultTableModel)tbKhoaHoc.getModel();
            for(KhoaHoc item : khoa){
                model.addRow(new Object[]{item.getMaMon(),item.getMaLop(),item.getTenMon(),item.getSoSinhVien()});
            } 
        }
}

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        
        KhoaHoc khoaHoc = new KhoaHoc();
        DefaultTableModel model = (DefaultTableModel)tbKhoaHoc.getModel();
        model.setRowCount(0);

        String maLop = txtTim.getText();
        String tenMon = txtTim.getText();
        String maMon = txtTim.getText();
        for(KhoaHoc item : khoa){
            if(item.getMaLop().equals(maLop) || item.getTenMon().equals(tenMon) || item.getMaMon().equals(maMon)){
                model.addRow(new Object[] {item.getMaMon(), item.getMaLop(), item.getTenMon(), item.getSoSinhVien()});
            }
        }
        if(model.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Không có thông tin lớp học");
        }
    }//GEN-LAST:event_btnTimActionPerformed

    private void tbKhoaHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbKhoaHocMouseClicked

        GV_LopHoc lop = new GV_LopHoc();
        int row = tbKhoaHoc.getSelectedRow();
        int col = tbKhoaHoc.getSelectedColumn();
        
        String maLop = (String) tbKhoaHoc.getValueAt(row, col);
        String maMon = (String) tbKhoaHoc.getValueAt(row, col);
        String tenMon = (String) tbKhoaHoc.getValueAt(row, col);
        
        KhoaHoc khoaHoc = null;
        for (KhoaHoc item : khoa) {
            if (item.getMaMon().equals(maMon) || item.getMaLop().equals(maLop) || item.getTenMon().equals(tenMon)) {
                khoaHoc = item;
                break;
            }
        }
        if(khoaHoc != null){
            lop.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_tbKhoaHocMouseClicked

    private void txtTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimActionPerformed
        
    }//GEN-LAST:event_txtTimActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       
        DangNhap dn = new DangNhap();
        dn.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtTimFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimFocusGained
       
    }//GEN-LAST:event_txtTimFocusGained

    private void txtTimFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimFocusLost
        
    }//GEN-LAST:event_txtTimFocusLost

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
            java.util.logging.Logger.getLogger(KhoaHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhoaHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhoaHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhoaHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GV_KhoaHoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnTim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbKhoaHoc;
    private javax.swing.JTextField txtTim;
    // End of variables declaration//GEN-END:variables
}
