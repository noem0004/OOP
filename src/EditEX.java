
import MaHoa.Ketnoi;
import MaHoa.Ketnoi;
import MaHoa.GoiGDN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class EditEX extends javax.swing.JFrame {
    private Ketnoi ctn = new Ketnoi();
    private static int MADE;
    
    
    //======================================================================================================================================================================
    public EditEX(int Made) {
        this.MADE = Made;
        initComponents();
        ctn.c();
        setLocationRelativeTo(null);
        xuatthongtinDeThi();
        // Thiết lập hành vi khi đóng cửa sổ.
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        // Thêm một bộ lắng nghe sự kiện để xử lý việc đóng cửa sổ.
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                // GHI CHÚ VỀ LOGIC ĐIỀU HƯỚNG:
                // Dòng code bên dưới đang mở lại `FormQuanLiUser`.
                // Tuy nhiên, form này có thể được mở từ `FormQuanLiDeThi`, vì vậy logic đúng
                // nên là quay trở về `FormQuanLiDeThi`.
                
                // Khi đóng cửa sổ, quay trở lại giao diện quản lý người dùng.
                new ManageEX().setVisible(true);

                // Đóng form hiện tại.
                dispose();
            }
        });
    }
    
    
    //======================================================================================================================================================================
    private void xuatthongtinDeThi(){
        try(Connection c = ctn.c()){
            PreparedStatement Pst = c.prepareStatement("SELECT `NoidungDeThi`, `ThoiGian`, `NgayTao`, `NgayThi` FROM `dethi` WHERE MD = ?");Pst.setInt(1,MADE);
            ResultSet rs = Pst.executeQuery();
            if(rs.next()){
                txt_noidung.setText(rs.getString("NoidungDeThi"));
                txt_time.setText(rs.getInt("ThoiGian")+"");
                txt_ngay.setText(rs.getString("NgayTao"));
                txt_ngaythi.setText(rs.getString("NgayThi"));
            }
        }catch(Exception e){
            
        }
    }
    
    
    
    //======================================================================================================================================================================
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_ngaythi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_noidung = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_time = new javax.swing.JTextField();
        bt_CapNhatDT = new javax.swing.JButton();
        txt_ngay = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chương trình thi trắc nghiệm");

        txt_ngaythi.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_ngaythi.setForeground(new java.awt.Color(26, 32, 44));
        txt_ngaythi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 224)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(113, 128, 150));
        jLabel1.setText("Tên Đề Thi");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(113, 128, 150));
        jLabel2.setText("Thời Gian Thi:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(113, 128, 150));
        jLabel9.setText("Ngày Tạo: ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(113, 128, 150));
        jLabel10.setText("Ngày Thi: ");

        txt_time.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_time.setForeground(new java.awt.Color(26, 32, 44));
        txt_time.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 224)));

        bt_CapNhatDT.setBackground(new java.awt.Color(66, 99, 235));
        bt_CapNhatDT.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        bt_CapNhatDT.setForeground(new java.awt.Color(255, 255, 255));
        bt_CapNhatDT.setText("CẬP NHẬT ĐỀ THI");
        bt_CapNhatDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CapNhatDTActionPerformed(evt);
            }
        });

        txt_ngay.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_ngay.setForeground(new java.awt.Color(26, 32, 44));
        txt_ngay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 224)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CẬP NHẬT ĐỀ THI");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(113, 128, 150));
        jLabel4.setText("Phút");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_time, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addComponent(txt_noidung)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_CapNhatDT)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_ngay, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                .addComponent(txt_ngaythi)))))
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_noidung, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_time, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(1, 1, 1)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_ngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ngaythi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(bt_CapNhatDT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    //======================================================================================================================================================================
    private void bt_CapNhatDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CapNhatDTActionPerformed
        if(txt_noidung.getText().equals(null) || txt_time.getText().equals(null) ||
            txt_ngay.getText().equals(null) || txt_ngaythi.getText().equals(null)){
            JOptionPane.showConfirmDialog(null, "Nhap thong tin de thi!");
            return;
        }else{
            
            try(Connection c = ctn.c()){
                
                PreparedStatement Pst = c.prepareStatement("UPDATE `dethi` SET "
                        + "`NoidungDeThi`= ?,"
                        + "`ThoiGian`= ?,"
                        + "`NgayTao`= ?,"
                        + "`NgayThi`= ? WHERE `MD` = ?");
                
                Pst.setString(1,txt_noidung.getText());
                Pst.setInt(2,Integer.parseInt(txt_time.getText()));
                Pst.setString(3,txt_ngay.getText());
                Pst.setString(4,txt_ngaythi.getText());
                Pst.setInt(5, MADE);
                Pst.executeUpdate();
                new GoiGDN(new ManageEX());
                this.dispose();
                JOptionPane.showMessageDialog(null, "Cập Nhật Đề Thì Thành Công!");
            }catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_bt_CapNhatDTActionPerformed

    
    //======================================================================================================================================================================
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(() -> new EditEX(MADE).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_CapNhatDT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_ngay;
    private javax.swing.JTextField txt_ngaythi;
    private javax.swing.JTextField txt_noidung;
    private javax.swing.JTextField txt_time;
    // End of variables declaration//GEN-END:variables
}
