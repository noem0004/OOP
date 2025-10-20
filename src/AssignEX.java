
import MaHoa.Ketnoi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class AssignEX extends javax.swing.JFrame {
    private static int LMD;
    private Ketnoi kn = new Ketnoi();
    
    
    //======================================================================================================================================================================
    public AssignEX(int MD) {
        this.LMD = MD; // Lưu mã đề thi vào biến toàn cục.
        initComponents(); // Khởi tạo các thành phần giao diện.
        kn.c(); // Mở kết nối CSDL.
        setLocationRelativeTo(null);
        showNguoiThi(); // Tải và hiển thị danh sách tất cả các thí sinh.
        showLop();
        // Tùy chỉnh hành vi khi đóng cửa sổ.
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        // Thêm một bộ lắng nghe sự kiện để xử lý việc đóng cửa sổ.
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                new HomeAD().setVisible(true); // Mở lại form chính.
                dispose(); // Đóng form hiện tại.
            }
        });
    }


    
    //======================================================================================================================================================================
    private void showNguoiThi() {
        // Cập nhật tiêu đề để người dùng biết đang gán đề thi nào.
        lbl_Dethi.setText("Gán Mã Đề Thi Số: " + LMD);
        
        // Chuẩn bị câu lệnh SQL để lấy thông tin chi tiết của tất cả người thi.
        // LEFT JOIN với bảng `thi` là mấu chốt:
        // - Nó sẽ lấy TẤT CẢ người thi từ bảng `ttnguoithi`.
        // - Nếu người thi đã có đề trong bảng `thi`, cột `MaDeThi` sẽ có giá trị.
        // - Nếu người thi CHƯA có đề, cột `MaDeThi` sẽ là NULL.
        String sql = 
            "SELECT " +
            "dn.MaTaiKhoan, " +
            "dn.TenDangNhap, " +
            "tt.HoTen, " +
            "l.TenLop, " +
            "n.TenNganh, " +
            "t.MD AS MaDeThi " + // Lấy mã đề đã được gán (nếu có)
            "FROM ttnguoithi tt " +
            "JOIN dang_nhap dn ON tt.MaTaiKhoan = dn.MaTaiKhoan " +
            "JOIN lop l ON tt.MaLop = l.MaLop " +
            "JOIN nganh n ON tt.MaNganh = n.MaNganh " +
            "LEFT JOIN thi t ON dn.MaTaiKhoan = t.MaTaiKhoan " +
            "WHERE dn.phanloai = 'NT'"; // Chỉ lấy những tài khoản là 'Người Thi'

        try (Connection c = kn.c();
             PreparedStatement pst = c.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            DefaultTableModel tm = (DefaultTableModel) tb.getModel();
            tm.setRowCount(0); // Xóa dữ liệu cũ trên bảng.

            while (rs.next()) {
                Object maDe = rs.getObject("MaDeThi"); // Dùng getObject để xử lý NULL dễ dàng.
                // Tạo chuỗi trạng thái dựa trên việc mã đề có NULL hay không.
                String trangThai = (maDe == null) ? "Chưa có đề" : "Đã có đề (" + maDe + ")";
                
                // Thêm một dòng mới vào bảng với thông tin đã xử lý.
                tm.addRow(new Object[]{
                    trangThai,
                    rs.getString("MaTaiKhoan"),
                    rs.getString("TenDangNhap"),
                    rs.getString("HoTen"),
                    rs.getString("TenLop"),
                    rs.getString("TenNganh")
                });
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi tải danh sách thí sinh.", "Lỗi SQL", JOptionPane.ERROR_MESSAGE);
        }
    }
    

    //======================================================================================================================================================================
    private void showLop(){
        try(Connection c = kn.c()){
            PreparedStatement Pst = c.prepareStatement("select * from lop");
            ResultSet rs = Pst.executeQuery();
            while(rs.next()){
                cb_Lop.addItem(rs.getString("TenLop"));
            }
        
        }catch(Exception e){
            
        }
    }
    
    
    //======================================================================================================================================================================
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        lbl_Dethi = new javax.swing.JLabel();
        bt_GanDT = new javax.swing.JButton();
        cb_Lop = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chương trình thi trắc nghiệm");
        setBackground(new java.awt.Color(255, 255, 255));

        tb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Đề Thi", "Mã Tài Khoản", "Tên Tài Khoản", "Họ Tên Sinh Viên", "Lớp", "Ngành Học"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb.setRowHeight(35);
        jScrollPane1.setViewportView(tb);

        lbl_Dethi.setText(" ");

        bt_GanDT.setBackground(new java.awt.Color(66, 99, 235));
        bt_GanDT.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        bt_GanDT.setForeground(new java.awt.Color(255, 255, 255));
        bt_GanDT.setText("Gán");
        bt_GanDT.setBorderPainted(false);
        bt_GanDT.setFocusPainted(false);
        bt_GanDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_GanDTActionPerformed(evt);
            }
        });

        cb_Lop.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb_Lop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn Lớp " }));
        cb_Lop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_LopActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(74, 85, 104));
        jLabel1.setText("Gán Theo Lớp");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(26, 32, 44));
        jLabel2.setText("Quản lý gán đề thi");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 599, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_Lop, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(bt_GanDT, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Dethi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bt_GanDT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbl_Dethi))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_Lop, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    //======================================================================================================================================================================
    private void bt_GanDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_GanDTActionPerformed
       // Lấy tất cả các hàng đang được chọn trong bảng (hỗ trợ chọn nhiều sinh viên cùng lúc).
        int[] selectedRows = tb.getSelectedRows();

        // Nếu không có sinh viên nào được chọn, thông báo và dừng lại.
        if (selectedRows.length == 0) {
            JOptionPane.showMessageDialog(this, "Hãy chọn ít nhất một sinh viên để gán đề.");
            return;
        }

        // Hiển thị hộp thoại xác nhận trước khi thực hiện hành động quan trọng.
        int confirm = JOptionPane.showConfirmDialog(this, 
            "Gán đề số " + LMD + " cho " + selectedRows.length + " sinh viên đã chọn?",
            "Xác nhận", JOptionPane.YES_NO_OPTION);

        // Nếu người dùng không chọn "YES", dừng lại.
        if (confirm != JOptionPane.YES_OPTION) return;

        // Chuẩn bị các câu lệnh SQL cho việc "UPSERT" (UPDATE hoặc INSERT).
        String checkSql = "SELECT * FROM thi WHERE MaTaiKhoan = ?"; // Kiểm tra sự tồn tại
        String insertSql = "INSERT INTO thi (MaTaiKhoan, MD) VALUES (?, ?)"; // Thêm mới nếu chưa có
        String updateSql = "UPDATE thi SET MD = ? WHERE MaTaiKhoan = ?"; // Cập nhật nếu đã có

        int countInsert = 0; // Đếm số lượng gán mới.
        int countUpdate = 0; // Đếm số lượng cập nhật.

        try (Connection c = kn.c()) {
            // Lặp qua từng hàng đã được chọn.
            for (int row : selectedRows) {
                // Lấy mã tài khoản từ cột thứ 2 (index 1) của hàng được chọn.
                String maTK = tb.getValueAt(row, 1).toString();

                // 1. KIỂM TRA: Sinh viên này đã có bản ghi trong bảng `thi` chưa?
                PreparedStatement checkPst = c.prepareStatement(checkSql);
                checkPst.setString(1, maTK);
                ResultSet rs = checkPst.executeQuery();

                if (rs.next()) {
                    // 2a. CẬP NHẬT (UPDATE): Nếu đã tồn tại, cập nhật lại mã đề thi.
                    PreparedStatement updatePst = c.prepareStatement(updateSql);
                    updatePst.setInt(1, LMD);
                    updatePst.setString(2, maTK);
                    updatePst.executeUpdate();
                    countUpdate++;
                } else {
                    // 2b. THÊM MỚI (INSERT): Nếu chưa tồn tại, tạo một bản ghi mới.
                    PreparedStatement insertPst = c.prepareStatement(insertSql);
                    insertPst.setString(1, maTK);
                    insertPst.setInt(2, LMD);
                    insertPst.executeUpdate();
                    countInsert++;
                }
            }

            // Hiển thị thông báo tổng kết kết quả.
            JOptionPane.showMessageDialog(this,
                " Đã gán mới cho " + countInsert + " SV, cập nhật cho " + countUpdate + " SV.");

            // Tải lại danh sách để cập nhật trạng thái trên giao diện ngay lập tức.
            showNguoiThi();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, " Lỗi khi gán đề thi.\n" + e.getMessage(),
                    "Lỗi SQL", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_GanDTActionPerformed

    private void cb_LopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_LopActionPerformed

        lbl_Dethi.setText("Gán Mã Đề Thi Số: " + LMD);
 
        try (Connection c = kn.c()){
            PreparedStatement pst = c.prepareStatement("SELECT dn.MaTaiKhoan, dn.TenDangNhap, tt.HoTen, l.TenLop, n.TenNganh, t.MD AS MaDeThi " + 
                "FROM ttnguoithi tt " +
                "JOIN dang_nhap dn ON tt.MaTaiKhoan = dn.MaTaiKhoan " +
                "JOIN lop l ON tt.MaLop = l.MaLop " +
                "JOIN nganh n ON tt.MaNganh = n.MaNganh " +
                "JOIN thi t ON dn.MaTaiKhoan = t.MaTaiKhoan " +
                "WHERE dn.phanloai = ? AND TenLop = ?"); 
                pst.setString(1,"NT");
                pst.setString(2,cb_Lop.getSelectedItem().toString());
                ResultSet rs = pst.executeQuery();

            DefaultTableModel tm = (DefaultTableModel) tb.getModel();
            tm.setRowCount(0); // Xóa dữ liệu cũ trên bảng.

            while (rs.next()) {
                Object maDe = rs.getObject("MaDeThi"); // Dùng getObject để xử lý NULL dễ dàng.
                // Tạo chuỗi trạng thái dựa trên việc mã đề có NULL hay không.
                String trangThai = (maDe == null) ? "Chưa có đề" : "Đã có đề (" + maDe + ")";
                
                // Thêm một dòng mới vào bảng với thông tin đã xử lý.
                tm.addRow(new Object[]{
                    trangThai,
                    rs.getString("MaTaiKhoan"),
                    rs.getString("TenDangNhap"),
                    rs.getString("HoTen"),
                    rs.getString("TenLop"),
                    rs.getString("TenNganh")
                });
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi tải danh sách thí sinh.", "Lỗi SQL", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_cb_LopActionPerformed

    
    //======================================================================================================================================================================
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new AssignEX(LMD).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_GanDT;
    private javax.swing.JComboBox<String> cb_Lop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Dethi;
    private javax.swing.JTable tb;
    // End of variables declaration//GEN-END:variables
}
