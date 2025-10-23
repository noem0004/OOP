
import MaHoa.Ketnoi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class AssignEX extends javax.swing.JFrame {
    private static int getMD;
    private Ketnoi kn = new Ketnoi();
    
    
    //======================================================================================================================================================================
    public AssignEX(int MD) {
        this.getMD = MD; // Lưu mã đề thi vào biến toàn cục.
        initComponents(); // Khởi tạo các thành phần giao diện.
        kn.c(); // Mở kết nối CSDL.
        setLocationRelativeTo(null);
        LoadNT(); // Tải và hiển thị danh sách tất cả các thí sinh.
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
    private void LoadNT() {
        // Cập nhật tiêu đề để người dùng biết đang gán đề thi nào.
        lbl_Dethi.setText("Gán Mã Đề Thi Số: " + getMD);
        
        // Chuẩn bị câu lệnh SQL để lấy thông tin chi tiết của tất cả người thi.
        // LEFT JOIN với bảng `thi` là mấu chốt:
        // - Nó sẽ lấy TẤT CẢ người thi từ bảng `ttnguoithi`.
        // - Nếu người thi đã có đề trong bảng `thi`, cột `MaDeThi` sẽ có giá trị.
        // - Nếu người thi CHƯA có đề, cột `MaDeThi` sẽ là NULL.
        String sql = 
            "SELECT dn.MaTaiKhoan, dn.TenDangNhap, tt.HoTen, l.TenLop, n.TenNganh, GROUP_CONCAT(t.MD SEPARATOR ', ') AS MaDeThi " +
            "FROM dang_nhap dn " +
            "JOIN ttnguoithi tt ON dn.MaTaiKhoan = tt.MaTaiKhoan " +
            "JOIN lop l ON tt.MaLop = l.MaLop " +
            "JOIN nganh n ON tt.MaNganh = n.MaNganh " +
            "LEFT JOIN thi t ON dn.MaTaiKhoan = t.MaTaiKhoan " +
            "WHERE dn.phanloai = 'NT' " +
            "GROUP BY dn.MaTaiKhoan, dn.TenDangNhap, tt.HoTen, l.TenLop, n.TenNganh " +
            "ORDER BY (t.MD IS NULL), t.MD ASC"; // Chỉ lấy những tài khoản là 'Người Thi'

        try (Connection c = kn.c();
             PreparedStatement pst = c.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            DefaultTableModel tm = (DefaultTableModel) tb.getModel();
            tm.setRowCount(0); // Xóa dữ liệu cũ trên bảng.

            while (rs.next()) {
                Object maDe = rs.getObject("MaDeThi"); // Dùng getObject để xử lý NULL dễ dàng.
                // Tạo chuỗi trạng thái dựa trên việc mã đề có NULL hay không.
                String trangThai = (maDe == null) ? "Chưa có" : "Đã có (" + maDe + ")";
                
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
        bt_GanDT1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chương trình thi trắc nghiệm");
        setBackground(new java.awt.Color(255, 255, 255));

        tb.setBackground(new java.awt.Color(204, 204, 204));
        tb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
        tb.setSelectionForeground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(tb);

        lbl_Dethi.setText(" ");

        bt_GanDT.setBackground(new java.awt.Color(66, 99, 235));
        bt_GanDT.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        bt_GanDT.setForeground(new java.awt.Color(255, 255, 255));
        bt_GanDT.setText("Assign");
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
        jLabel1.setText("Class");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Manage Assign Exam");

        bt_GanDT1.setBackground(new java.awt.Color(66, 99, 235));
        bt_GanDT1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        bt_GanDT1.setForeground(new java.awt.Color(255, 255, 255));
        bt_GanDT1.setText("Un Assign");
        bt_GanDT1.setBorderPainted(false);
        bt_GanDT1.setFocusPainted(false);
        bt_GanDT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_GanDT1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_Lop, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_GanDT1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_GanDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Dethi, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbl_Dethi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_GanDT1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_GanDT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_Lop, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    //======================================================================================================================================================================
    private void bt_GanDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_GanDTActionPerformed
          int[] selectedRows = tb.getSelectedRows();

        // Nếu không có sinh viên nào được chọn, thông báo và dừng lại.
        if (selectedRows.length == 0) {
            JOptionPane.showMessageDialog(this, "Hãy chọn ít nhất một sinh viên để gán đề.");
            return;
        }

        // Hiển thị hộp thoại xác nhận trước khi thực hiện hành động quan trọng.
        int confirm = JOptionPane.showConfirmDialog(this, 
            "Gán đề số " + getMD + " cho " + selectedRows.length + " sinh viên đã chọn?",
            "Xác nhận", JOptionPane.YES_NO_OPTION);

        // Nếu người dùng không chọn "YES", dừng lại.
        if (confirm != JOptionPane.YES_OPTION) return;

        // Chuẩn bị các câu lệnh SQL cho việc "UPSERT" (UPDATE hoặc INSERT).
        String checkSql = "SELECT * FROM thi WHERE MaTaiKhoan = ? AND MD = ?"; 
        String insertSql = "INSERT INTO thi (MaTaiKhoan, MD, trangthai) VALUES (?, ?, ?)"; 


        int countInsert = 0;

        try (Connection c = kn.c()) {
            for (int row : selectedRows) {
                String maTK = tb.getValueAt(row, 1).toString();

                PreparedStatement checkPst = c.prepareStatement(checkSql);
                checkPst.setString(1, maTK);
                checkPst.setInt(2, getMD);
                ResultSet rs = checkPst.executeQuery();

                if (!rs.next()) {
                    PreparedStatement insertPst = c.prepareStatement(insertSql);
                    insertPst.setString(1, maTK);
                    insertPst.setInt(2, getMD);
                    insertPst.setInt(3, 0); // trạng thái ban đầu (nếu có)
                    insertPst.executeUpdate();
                    countInsert++;
                }
            }

            JOptionPane.showMessageDialog(this,
                "Đã gán mới " + countInsert + " đề thi cho các sinh viên được chọn.");

            LoadNT();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, 
                "Lỗi khi gán đề thi.\n" + e.getMessage(),
                "Lỗi SQL", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_GanDTActionPerformed

    private void cb_LopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_LopActionPerformed

        lbl_Dethi.setText("Gán Mã Đề Thi Số: " + getMD);
 
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

    private void bt_GanDT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_GanDT1ActionPerformed
        
        int[] selectedRows = tb.getSelectedRows();

        if (selectedRows.length == 0) {
            JOptionPane.showMessageDialog(this, "Hãy chọn ít nhất một sinh viên để bỏ gán đề.");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, 
            "Bạn có chắc muốn BỎ GÁN đề số " + getMD + " cho " + selectedRows.length + " sinh viên đã chọn?",
            "Xác nhận", JOptionPane.YES_NO_OPTION);

        if (confirm != JOptionPane.YES_OPTION) return;

        String checkSql = "SELECT * FROM thi WHERE MaTaiKhoan = ? AND MD = ?"; 
        String deleteSql = "DELETE FROM thi WHERE MaTaiKhoan = ? AND MD = ?"; 

        int countDelete = 0;

        try (Connection c = kn.c()) {
            for (int row : selectedRows) {
                String maTK = tb.getValueAt(row, 1).toString();

                PreparedStatement checkPst = c.prepareStatement(checkSql);
                checkPst.setString(1, maTK);
                checkPst.setInt(2, getMD);
                ResultSet rs = checkPst.executeQuery();

                // 🔹 Nếu có bản ghi thì mới thực hiện xóa
                if (rs.next()) {
                    PreparedStatement deletePst = c.prepareStatement(deleteSql);
                    deletePst.setString(1, maTK);
                    deletePst.setInt(2, getMD);
                    deletePst.executeUpdate();
                    countDelete++;
                }
            }

            JOptionPane.showMessageDialog(this,
                "Đã bỏ gán " + countDelete + " đề thi cho các sinh viên được chọn.");

            LoadNT(); // Cập nhật lại danh sách hiển thị
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, 
                "Lỗi khi bỏ gán đề thi.\n" + e.getMessage(),
                "Lỗi SQL", JOptionPane.ERROR_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_GanDT1ActionPerformed

    
    //======================================================================================================================================================================
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new AssignEX(getMD).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_GanDT;
    private javax.swing.JButton bt_GanDT1;
    private javax.swing.JComboBox<String> cb_Lop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Dethi;
    private javax.swing.JTable tb;
    // End of variables declaration//GEN-END:variables
}
