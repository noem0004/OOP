
import MaHoa.Ketnoi;
import MaHoa.GoiGDN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class EditInfoUser extends javax.swing.JFrame {
    private Ketnoi ctn = new Ketnoi();
    private static String maTaiKhoan;
    
    
    //======================================================================================================================================================================
    public EditInfoUser(String goi) {
        this.maTaiKhoan = goi; // Lưu mã tài khoản vào biến toàn cục.
        initComponents(); // Khởi tạo các thành phần giao diện.
        ctn.c(); // Mở kết nối CSDL.
        setLocationRelativeTo(null);
        showcomboxnganh(); // Tải dữ liệu cho ComboBox Ngành.
        showTT(); // Tải thông tin hiện tại của người dùng lên form.
        
        // Tùy chỉnh hành vi khi đóng cửa sổ.
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        // Thêm một bộ lắng nghe sự kiện để xử lý việc đóng cửa sổ.
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                // Khi đóng cửa sổ, quay trở lại giao diện quản lý người dùng.
                new ManageUser().setVisible(true);
                // Đóng form hiện tại.
                dispose();
            }
        });
        
    }
    
    
    
    //======================================================================================================================================================================
    private void showcomboxnganh(){
        try(Connection c = ctn.c()){
            PreparedStatement ps2 = c.prepareStatement("select `TenNganh` from `nganh` where `TenNganh` != ? ");ps2.setString(1,"");
            ResultSet rs2 = ps2.executeQuery();
            cb_nganh.removeAllItems();
            cb_nganh.addItem("Chọn Ngành Học");
            while(rs2.next()){
                cb_nganh.addItem(rs2.getString("TenNganh"));
            }
        }catch(Exception e){}
        
        // Logic ban đầu: nếu chưa chọn ngành nào, thì vô hiệu hóa ComboBox lớp.
        if(cb_nganh.getSelectedIndex() == 0){
            cb_lop.setEnabled(false);
        }else{
            cb_lop.setEnabled(true);
            showComboBox(cb_nganh.getSelectedItem().toString());
        }
    }
    
    private void showComboBox(String chon){
        try(Connection c = ctn.c()){
            // Chuẩn bị câu lệnh SQL để lấy các lớp thuộc ngành đã cho.
            PreparedStatement ps = c.prepareStatement("select tenlop from `lop`,`nganh` where `TenNganh` = ? and `lop`.`MaNganh` = `nganh`.`MaNganh` ");
            ps.setString(1,chon);
            ResultSet rs= ps.executeQuery();
            cb_lop.removeAllItems(); // Xóa các lớp cũ.
            
            while(rs.next()){
                cb_lop.addItem(rs.getString("TenLop")); // Thêm các lớp mới tìm được.
            }
        }catch(Exception e){
            // Khối catch trống.
        }
    }
    
     private void showTT(){
        try(Connection c = ctn.c()){
            // Chuẩn bị câu lệnh SQL để lấy thông tin chi tiết của người dùng.
            PreparedStatement Pst = c.prepareStatement(
                "SELECT `HoTen`, `SDT`, `NgaySinh`, `TenNganh`, `TenLop` " +
                "FROM `ttnguoithi`, `lop`, `nganh` " +
                "WHERE `ttnguoithi`.`MaTaiKhoan` = ? AND `ttnguoithi`.`MaLop` = `lop`.`MaLop` AND `ttnguoithi`.`MaNganh` = `nganh`.`MaNganh`"
            ); 
            Pst.setString(1, maTaiKhoan);
            ResultSet rs = Pst.executeQuery();
            
            // Nếu tìm thấy thông tin.
            if(rs.next()){
                // Điền thông tin vào các ô text.
                txt_Hoten.setText(rs.getString("HoTen"));
                txt_SDT.setText(rs.getString("SDT"));
                txt_Namsinh.setText(rs.getString("NgaySinh"));
                
                // Lấy tên ngành và lớp từ kết quả.
                String tenNganh = rs.getString("TenNganh");
                String tenLop = rs.getString("TenLop");
                
                // Thiết lập giá trị được chọn cho các ComboBox để khớp với dữ liệu hiện tại.
                cb_nganh.setSelectedItem(tenNganh);
                cb_lop.setSelectedItem(tenLop);
            } else {
                JOptionPane.showMessageDialog(null, "Không tìm thấy thông tin người dùng");
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Lỗi khi tải thông tin: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    
    //======================================================================================================================================================================
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_Hoten = new javax.swing.JTextField();
        txt_SDT = new javax.swing.JTextField();
        txt_Namsinh = new javax.swing.JTextField();
        cb_lop = new javax.swing.JComboBox<>();
        cb_nganh = new javax.swing.JComboBox<>();
        bt_CapNhat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chương trình thi trắc nghiệm");

        txt_Hoten.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_Hoten.setForeground(new java.awt.Color(26, 32, 44));
        txt_Hoten.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 224)));

        txt_SDT.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_SDT.setForeground(new java.awt.Color(26, 32, 44));
        txt_SDT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 224)));

        txt_Namsinh.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_Namsinh.setForeground(new java.awt.Color(26, 32, 44));
        txt_Namsinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 224)));

        cb_lop.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cb_lop.setForeground(new java.awt.Color(26, 32, 44));
        cb_lop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 224)));

        cb_nganh.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cb_nganh.setForeground(new java.awt.Color(26, 32, 44));
        cb_nganh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 224)));
        cb_nganh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_nganhActionPerformed(evt);
            }
        });

        bt_CapNhat.setBackground(new java.awt.Color(66, 99, 235));
        bt_CapNhat.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        bt_CapNhat.setForeground(new java.awt.Color(255, 255, 255));
        bt_CapNhat.setText("Cập Nhật Thồng Tin");
        bt_CapNhat.setActionCommand("Cập Nhật Thông Tin");
        bt_CapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CapNhatActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(113, 128, 150));
        jLabel1.setText("Năm Sinh");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(113, 128, 150));
        jLabel2.setText("Lớp");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(113, 128, 150));
        jLabel3.setText("Ngành Học");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(113, 128, 150));
        jLabel4.setText("Số Điện Thoại");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(113, 128, 150));
        jLabel5.setText("Họ Tên");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("CẬP NHẬT THÔNG TIN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cb_nganh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_Hoten, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_SDT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_lop, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Namsinh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bt_CapNhat)
                        .addGap(96, 96, 96))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Hoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Namsinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_nganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_lop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(bt_CapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
   //======================================================================================================================================================================
    private void cb_nganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_nganhActionPerformed
        // Nếu người dùng chọn một ngành cụ thể (không phải mục "Chọn Ngành Học").
        if(!cb_nganh.getSelectedItem().equals("Chọn Ngành Học")){
            cb_lop.setEnabled(true); // Kích hoạt ComboBox lớp.
            String chon = cb_nganh.getSelectedItem().toString();
            cb_lop.removeAllItems(); // Xóa các lớp cũ.
            showComboBox(chon);      // Tải lại danh sách lớp tương ứng với ngành mới.
        }else{
            // Nếu người dùng chọn lại "Chọn Ngành Học", xóa và vô hiệu hóa ComboBox lớp.
            cb_lop.removeAllItems(); 
            cb_lop.setEnabled(false);
        }
    }//GEN-LAST:event_cb_nganhActionPerformed
    
    
    //======================================================================================================================================================================
    private void bt_CapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CapNhatActionPerformed
        try (Connection c = ctn.c()) {
            // BƯỚC 1: Lấy `MaLop` và `MaNganh` (ID) từ tên lớp và tên ngành đã chọn.
            // Điều này là cần thiết vì bảng `ttnguoithi` lưu ID chứ không lưu tên.
            PreparedStatement Ps = c.prepareStatement(
                "SELECT l.MaLop, n.MaNganh " +
                "FROM lop l JOIN nganh n ON l.MaNganh = n.MaNganh " +
                "WHERE l.TenLop = ? AND n.TenNganh = ?"
            );
            Ps.setString(1, cb_lop.getSelectedItem().toString());
            Ps.setString(2, cb_nganh.getSelectedItem().toString());
            ResultSet rs = Ps.executeQuery();
            
            // Nếu tìm thấy cặp Lớp - Ngành hợp lệ.
            if (rs.next()) {
                // BƯỚC 2: Thực hiện lệnh UPDATE với các ID đã lấy được.
                PreparedStatement Pst = c.prepareStatement(
                    "UPDATE ttnguoithi SET " +
                    "HoTen = ?, " +
                    "MaLop = ?, " +
                    "NgaySinh = ?, " +
                    "MaNganh = ?, " +
                    "SDT = ? " +
                    "WHERE MaTaiKhoan = ?"
                );

                // Gán các giá trị từ form vào câu lệnh UPDATE.
                Pst.setString(1, txt_Hoten.getText());
                Pst.setInt(2, rs.getInt("MaLop")); // Dùng MaLop từ Bước 1.
                Pst.setDate(3, java.sql.Date.valueOf(txt_Namsinh.getText())); // Chuyển String thành kiểu Date của SQL.
                Pst.setString(4, rs.getString("MaNganh")); // Dùng MaNganh từ Bước 1.
                Pst.setString(5, txt_SDT.getText());
                Pst.setString(6, maTaiKhoan); // Điều kiện WHERE để cập nhật đúng người dùng.

                // Thực thi lệnh UPDATE.
                Pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cập nhật người dùng thành công!");
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi khi cập nhật người dùng: " + e.getMessage());
        }
    }//GEN-LAST:event_bt_CapNhatActionPerformed

    
    //======================================================================================================================================================================
    public static void main(String args[]) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditInfoUser(maTaiKhoan).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_CapNhat;
    private javax.swing.JComboBox<String> cb_lop;
    private javax.swing.JComboBox<String> cb_nganh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txt_Hoten;
    private javax.swing.JTextField txt_Namsinh;
    private javax.swing.JTextField txt_SDT;
    // End of variables declaration//GEN-END:variables
}
