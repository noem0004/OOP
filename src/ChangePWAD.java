
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import MaHoa.Ketnoi;
import MaHoa.GoiGDN;
import MaHoa.MaHoa_AD;

public class ChangePWAD extends javax.swing.JFrame {
    private Ketnoi kn = new Ketnoi();
    private static String mataikhoan;
    public ChangePWAD(String MTK) {
        this.mataikhoan = MTK;
        initComponents();
        setLocationRelativeTo(null);
        kn.c();
         setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        // Thêm một bộ lắng nghe sự kiện để xử lý việc đóng cửa sổ.
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                // Khi đóng cửa sổ, quay trở lại giao diện chính của admin.
                new HomeAD().setVisible(true);
                // Đóng form hiện tại.
                dispose();
            }
        });
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_MKC = new javax.swing.JTextField();
        txt_MKM = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bt_CapNhatMK = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chương trình thi trắc nghiệm");

        txt_MKC.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_MKC.setForeground(new java.awt.Color(26, 32, 44));
        txt_MKC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txt_MKM.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_MKM.setForeground(new java.awt.Color(26, 32, 44));
        txt_MKM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(113, 128, 150));
        jLabel1.setText("Nhập Mật Khẩu Cũ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(113, 128, 150));
        jLabel2.setText("Nhập Mật Khẩu Mới");

        bt_CapNhatMK.setBackground(new java.awt.Color(66, 99, 235));
        bt_CapNhatMK.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        bt_CapNhatMK.setForeground(new java.awt.Color(255, 255, 255));
        bt_CapNhatMK.setText("ĐỔI MẬT KHẨU");
        bt_CapNhatMK.setBorderPainted(false);
        bt_CapNhatMK.setFocusPainted(false);
        bt_CapNhatMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CapNhatMKActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CHANGE PASSWORD ADMIN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txt_MKC, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_MKM, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bt_CapNhatMK)
                        .addGap(152, 152, 152))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_MKC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_MKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_CapNhatMK, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_CapNhatMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CapNhatMKActionPerformed
        if(txt_MKC.getText().isEmpty() || txt_MKM.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Hãy Nhập Mật Khẩu!");
        }else{
            MaHoa_AD TMH = new MaHoa_AD(txt_MKC.getText());
            MaHoa_AD MKM = new MaHoa_AD(txt_MKM.getText());
            try(Connection c = kn.c()){
                PreparedStatement Pst = c.prepareStatement("select MatKhau from dang_nhap where MaTaiKhoan = ?");Pst.setString(1,mataikhoan);
                ResultSet rs = Pst.executeQuery();
                if(rs.next()){
                    if(rs.getString("MatKhau").equals(TMH.getMH())){
                        PreparedStatement Pst1 = c.prepareStatement("UPDATE `dang_nhap` SET `MatKhau`= ? WHERE `MaTaiKhoan` = ?");
                        Pst1.setString(1,MKM.getMH());
                        Pst1.setString(2,mataikhoan);
                        Pst1.executeUpdate();
                        this.dispose();
                        new GoiGDN(new HomeAD());
                        JOptionPane.showMessageDialog(null, "Đổi Mật Khẩu Thành Công!");
                        
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Mật Khẩu Cũ Không Đúng!");
                }
            }catch(Exception e){

            }
        }
    }//GEN-LAST:event_bt_CapNhatMKActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new ChangePWAD(mataikhoan).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_CapNhatMK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txt_MKC;
    private javax.swing.JTextField txt_MKM;
    // End of variables declaration//GEN-END:variables
}
