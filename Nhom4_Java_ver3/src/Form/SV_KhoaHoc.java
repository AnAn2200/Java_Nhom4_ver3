package Form;
import java.util.*;
import javax.swing.table.DefaultTableModel;
public class SV_KhoaHoc extends javax.swing.JFrame {

    public SV_KhoaHoc() {
        initComponents();
        setLocationRelativeTo(null);
        Load();
        setTitle("Trang sinh viên");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTim = new javax.swing.JButton();
        txtTim = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbKhoaHoc = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTim.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTim.setText("Tim kiem");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        txtTim.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel1.setText("THONG TIN KHOA HOC");

        tbKhoaHoc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbKhoaHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma mon", "Ma lop", "Ten mon"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
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

        jButton1.setText("Quay lai");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton1)
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public ArrayList<KhoaHoc> khoa = new ArrayList<>();
    public void Load(){
        KhoaHoc k1 = new KhoaHoc("IT6019","IT6019.2","Lap trinh Java");
        KhoaHoc k2 = new KhoaHoc("IT6030","IT6030.5","He dieu hanh");
        KhoaHoc k3 = new KhoaHoc("IT6040","IT6040.2","Mang may tinh");
        khoa.add(k3);
        khoa.add(k2);
        khoa.add(k1);
        
        DefaultTableModel model = (DefaultTableModel)tbKhoaHoc.getModel();
        for(KhoaHoc item : khoa){
            model.addRow(new Object[]{item.getMaMon(), item.getMaLop(), item.getTenMon()});
        }
    }
    public class KhoaHoc{
        private String MaMon;
        private String MaLop;
        private String TenMon;

        public String getMaMon() {
            return MaMon;
        }

        public void setMaMon(String MaMon) {
            this.MaMon = MaMon;
        }

        public String getMaLop() {
            return MaLop;
        }

        public void setMaLop(String MaLop) {
            this.MaLop = MaLop;
        }

        public String getTenMon() {
            return TenMon;
        }

        public void setTenMon(String TenMon) {
            this.TenMon = TenMon;
        }

        public KhoaHoc() {
        }

        public KhoaHoc(String MaMon, String MaLop, String TenMon) {
            this.MaMon = MaMon;
            this.MaLop = MaLop;
            this.TenMon = TenMon;
        }           
    }
    
    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed

        DefaultTableModel model = (DefaultTableModel)tbKhoaHoc.getModel();
        model.setRowCount(0);

        String tenMon = txtTim.getText();

        for(KhoaHoc item : khoa){
            if(item.getTenMon().equals(tenMon)){
                model.addRow(new Object[]{item.getMaMon(), item.getMaLop(), item.getTenMon()});
            }
        }
    }//GEN-LAST:event_btnTimActionPerformed

    private void tbKhoaHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbKhoaHocMouseClicked
        SV_DanhSach ds = new SV_DanhSach();
        int row = (int) tbKhoaHoc.getSelectedRow();
        int col = (int) tbKhoaHoc.getSelectedColumn();
        String tenMon = (String)tbKhoaHoc.getValueAt(row,col);
        KhoaHoc khoaHoc = null;
        for(KhoaHoc item : khoa){
            if(item.getTenMon().equals(tenMon)){
                khoaHoc = item;
                break;
            }
        }
        if(khoaHoc != null){
            ds.setVisible(true);
            setVisible(false);
        }

    }//GEN-LAST:event_tbKhoaHocMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DangNhap dn = new DangNhap();
        dn.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(SV_KhoaHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SV_KhoaHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SV_KhoaHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SV_KhoaHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SV_KhoaHoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTim;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbKhoaHoc;
    private javax.swing.JTextField txtTim;
    // End of variables declaration//GEN-END:variables
}
