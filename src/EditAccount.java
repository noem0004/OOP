
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import MaHoa.Ketnoi;
import MaHoa.GoiGDN;


public class EditAccount extends javax.swing.JFrame {
    private static String id;
    private Ketnoi ctn = new Ketnoi();
    
    
    //======================================================================================================================================================================
    public EditAccount(String id) {
        initComponents(); // Khởi tạo các thành phần giao diện.
        this.id = id; // Lưu mã tài khoản vào biến toàn cục.
        ctn.c(); // Mở kết nối CSDL.
        setLocationRelativeTo(null);
        thongtincapnhat(); // Gọi phương thức để tải dữ liệu của tài khoản này lên form.
        
        // Tùy chỉnh hành vi khi đóng cửa sổ.
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        // Thêm một bộ lắng nghe sự kiện để xử lý việc đóng cửa sổ.
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                // Khi đóng cửa sổ, quay trở lại giao diện quản lý tài khoản.
                new ManageAccount().setVisible(true);
                // Đóng form hiện tại.
                dispose();
            }
        });
    }
    
 
    //======================================================================================================================================================================
    public void thongtincapnhat(){
        // Sử dụng try-with-resources để đảm bảo kết nối CSDL được đóng tự động.
        try(Connection c = ctn.c() ){
            // Chuẩn bị câu lệnh SQL để lấy thông tin từ hai bảng `dang_nhap` và `ttnguoithi`.
            PreparedStatement Pst = c.prepareStatement(""
                + "select `TenDangNhap`, `MatKhau`, `HoTen`, `PhanLoai` from `dang_nhap`, `ttnguoithi` "
                + "where `dang_nhap`.`MaTaiKhoan` = `ttnguoithi`.`MaTaiKhoan` and `dang_nhap`.`MaTaiKhoan` = ?");
            Pst.setString(1, id); // Gán mã tài khoản vào câu lệnh.
            ResultSet rs = Pst.executeQuery();
            
            // Nếu tìm thấy tài khoản.
            if(rs.next()){
                // Điền thông tin lấy được vào các thành phần trên giao diện.
                txt_TenTaikhoan.setText(rs.getString("TenDangNhap"));
                txt_Matkhau.setText(rs.getString("MatKhau")); // GHI CHÚ: Mật khẩu hiển thị ở đây có thể là dạng đã mã hóa.
                txt_TenTaikhoan.setText(rs.getString("HoTen"));
                // Kiểm tra vai trò và chọn mục tương ứng trong ComboBox.
                if(rs.getString("PhanLoai").equals("NT"))
                    cb_vaitro.setSelectedItem("Sinh Viên");
                // GHI CHÚ: Thiếu trường hợp `else if` để xử lý vai trò "Giảng Viên" (GV).
            }
        }catch(Exception e){
            // Khối catch trống.
        }
    }
    
    
    //======================================================================================================================================================================
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_TenTaikhoan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_Matkhau = new javax.swing.JTextField();
        cb_vaitro = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bt_CapNhat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chương trình thi trắc nghiệm");

        txt_TenTaikhoan.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_TenTaikhoan.setForeground(new java.awt.Color(26, 32, 44));
        txt_TenTaikhoan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 224)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(113, 128, 150));
        jLabel1.setText("Tên Đăng Nhập");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(113, 128, 150));
        jLabel2.setText("Mật Khẩu");

        txt_Matkhau.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_Matkhau.setForeground(new java.awt.Color(26, 32, 44));

        cb_vaitro.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cb_vaitro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giảng Viên", "Sinh Viên" }));
        cb_vaitro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 213, 224)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(113, 120, 150));
        jLabel4.setText("Vai Trò");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(26, 32, 44));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SỬA TÀI KHOẢN");

        bt_CapNhat.setBackground(new java.awt.Color(66, 99, 235));
        bt_CapNhat.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        bt_CapNhat.setForeground(new java.awt.Color(255, 255, 255));
        bt_CapNhat.setText("CẬP NHẬT THÔNG TIN");
        bt_CapNhat.setToolTipText("");
        bt_CapNhat.setBorderPainted(false);
        bt_CapNhat.setFocusPainted(false);
        bt_CapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CapNhatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_TenTaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(txt_Matkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(cb_vaitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(bt_CapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_TenTaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Matkhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_vaitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(bt_CapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    //======================================================================================================================================================================
    private void bt_CapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CapNhatActionPerformed
        String vaitro = "NT"; // Mặc định vai trò là "NT" (Người Thi / Sinh Viên).
        
        try(Connection c = ctn.c()){
            // Chuẩn bị câu lệnh SQL UPDATE để cập nhật bảng `dang_nhap`.
            PreparedStatement Pst = c.prepareStatement(""
                + "UPDATE `dang_nhap` SET "
                + "`TenDangNhap`= ? ,"
                + "`MatKhau`= ? ,"
                + "`PhanLoai`= ? "
                + "WHERE `MaTaiKhoan` = ?");
            
            // GHI CHÚ VỀ LỖI LOGIC:
            // Điều kiện `if(txt_TenTaikhoan != null)` sẽ luôn đúng vì đối tượng JTextField đã được tạo.
            // Để kiểm tra người dùng có nhập liệu hay không, nên dùng: `!txt_TenTaikhoan.getText().isEmpty()`
            if(txt_TenTaikhoan != null && txt_Matkhau != null){
                // Kiểm tra vai trò được chọn trong ComboBox.
                if(cb_vaitro.getSelectedItem().toString().equals("Giảng Viên"))
                    vaitro = "GV";
                
                // ========================= LỖI QUAN TRỌNG =========================
                // Khối `else` dưới đây bị đặt sai vị trí.
                // Nó làm cho code cập nhật chỉ được thực thi khi vai trò được chọn KHÔNG PHẢI là "Giảng Viên".
                // Nếu bạn chọn "Giảng Viên", `vaitro` sẽ được đổi thành "GV" và sau đó không có gì xảy ra cả.
                // BẠN CẦN XÓA `else` VÀ ĐƯA KHỐI LỆNH BÊN DƯỚI RA NGOÀI.
                else
                    // Các dòng code này chỉ chạy khi vai trò là "Sinh Viên".
                    Pst.setString(1, txt_TenTaikhoan.getText());
                    // Dòng này có vẻ đang gọi một lớp để mã hóa mật khẩu trước khi lưu.
                    Pst.setString(2, new MaHoa.MaHoa_AD(txt_Matkhau.getText()).getMH());
                    Pst.setString(3, vaitro); // Gán vai trò (NT hoặc GV).
                    Pst.setString(4, id); // Dùng `id` làm điều kiện WHERE.
                    Pst.executeUpdate(); // Thực thi lệnh UPDATE.
                    JOptionPane.showMessageDialog(null, "Cập Nhật Thành Công");
            }
            // Sau khi cập nhật, quay về form quản lý tài khoản.
            ManageAccount FQLTK = new ManageAccount();
            new GoiGDN(FQLTK);
            this.dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Cập Nhật Không Thành Công");
        }
    }//GEN-LAST:event_bt_CapNhatActionPerformed

    
    //======================================================================================================================================================================
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditAccount(id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_CapNhat;
    private javax.swing.JComboBox<String> cb_vaitro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt_Matkhau;
    private javax.swing.JTextField txt_TenTaikhoan;
    // End of variables declaration//GEN-END:variables
}
