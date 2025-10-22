
import MaHoa.Ketnoi;
import MaHoa.GoiGDN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class HomeUser extends javax.swing.JFrame {
    private Ketnoi kn = new Ketnoi();
    private static String MTK;
    private static int made;
    
    
    //======================================================================================================================================================================
    public HomeUser(String MTK, int mde) {
        this.MTK = MTK;
        this.made = mde;
        initComponents(); // Khởi tạo các thành phần giao diện.
        kn.c(); // Mở kết nối CSDL.
        setLocationRelativeTo(null);
        // Kiểm tra xem người dùng đã làm bài thi này trước đó chưa.
        if (!kiemtraBaiLam()) {
            // Nếu đã làm rồi (hàm trả về false), vô hiệu hóa nút "THI NGAY".
            bt_thi.setEnabled(false);
        } else {
            // Nếu chưa làm, cho phép nhấn nút "THI NGAY".
            bt_thi.setEnabled(true);
        }
        
        // Tải và hiển thị thông tin của người dùng và đề thi lên giao diện.
        xuatthongtinUSER();
        xuatDethi();
    }
    
    
    //======================================================================================================================================================================
    private void xuatthongtinUSER() {
        try (Connection c = kn.c()) {
            // Chuẩn bị câu lệnh SQL để lấy thông tin từ nhiều bảng.
            // Cú pháp JOIN bằng dấu phẩy là cú pháp cũ, nên dùng JOIN...ON để rõ ràng hơn.
            PreparedStatement Pst = c.prepareStatement(
                "select HoTen, ttnguoithi.MaTaiKhoan, TenNganh, TenLop, NoidungDeThi, ThoiGian "
                + "from ttnguoithi, lop, nganh, dethi, thi "
                + "where ttnguoithi.MaTaiKhoan = ? "
                + "and ttnguoithi.MaLop = lop.MaLop and ttnguoithi.MaNganh = nganh.MaNganh "
                + "and ttnguoithi.MaTaiKhoan = thi.MaTaiKhoan and thi.MD = dethi.MD"
            );
            Pst.setString(1, MTK);
            ResultSet rs = Pst.executeQuery();
            
            // Nếu tìm thấy thông tin, cập nhật các label trên giao diện.
            if (rs.next()) {
                lbl_ten.setText("Họ và Tên Người Thi: " + rs.getString("HoTen"));
                lbl_mtk.setText("Mã Tài Khoản: " + rs.getString("MaTaiKhoan"));
                lbl_nganh.setText("Ngành: " + rs.getString("TenNganh"));
                lbl_lop.setText("Lớp: " + rs.getString("TenLop"));
                lbl_dethi.setText(rs.getString("Noidungdethi"));
                lbl_time.setText("Thời Gian Làm Bài: " + rs.getInt("ThoiGian") + " phút");
            }
        } catch (Exception e) {
            // Khối catch trống, nên thêm e.printStackTrace() để dễ debug.
            e.printStackTrace();
        }
    }
     private void xuatDethi() {
        try (Connection c = kn.c()) {
            String sql = "select NoidungDeThi from dethi, thi where dethi.MD = thi.MD and MaTaiKhoan = ?";

            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, MTK); // MTK là mã tài khoản hiện tại

            ResultSet rs = pst.executeQuery();

            cbde.removeAllItems();
            while (rs.next()) {
                cbde.addItem(rs.getString("NoidungDeThi"));
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, 
                "Lỗi khi tải danh sách đề thi: " + e.getMessage());
        }
    }

    
    //======================================================================================================================================================================
    private boolean kiemtraBaiLam() {
        try (Connection c = kn.c()) {
            // Truy vấn bảng `dakt` (có thể là "đã kiểm tra") để tìm bản ghi.
            PreparedStatement pst = c.prepareStatement(
                "SELECT * FROM lichsuthi WHERE MaTaiKhoan = ? AND MaDe = ?"
            );
            pst.setString(1, MTK);
            pst.setInt(2, made);
            ResultSet rs = pst.executeQuery();

            // Nếu rs.next() trả về true, nghĩa là có kết quả -> sinh viên đã thi.
            if (rs.next()) {
                bt_thi.setText("ĐÃ LÀM BÀI"); // Cập nhật text của nút.
                return false; // Trả về false để vô hiệu hóa nút.
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Nếu không tìm thấy bản ghi nào, nghĩa là sinh viên chưa thi.
        return true;
    }
    //======================================================================================================================================================================
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        bt_thi = new javax.swing.JButton();
        lbl_ten = new javax.swing.JLabel();
        lbl_lop = new javax.swing.JLabel();
        lbl_nganh = new javax.swing.JLabel();
        lbl_mtk = new javax.swing.JLabel();
        lbl_dethi = new javax.swing.JLabel();
        lbl_time = new javax.swing.JLabel();
        bt_LichSu = new javax.swing.JButton();
        cbde = new javax.swing.JComboBox<>();
        lb_trangthai = new javax.swing.JLabel();
        bt_LichSu1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_thi.setBackground(new java.awt.Color(66, 99, 235));
        bt_thi.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        bt_thi.setForeground(new java.awt.Color(255, 255, 255));
        bt_thi.setText("BẮT ĐẦU THI");
        bt_thi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_thiActionPerformed(evt);
            }
        });

        lbl_ten.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_ten.setForeground(new java.awt.Color(113, 128, 150));
        lbl_ten.setText("Họ Tên Người Thi:");

        lbl_lop.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_lop.setForeground(new java.awt.Color(113, 128, 150));
        lbl_lop.setText("Lớp:");

        lbl_nganh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_nganh.setForeground(new java.awt.Color(113, 128, 150));
        lbl_nganh.setText("Ngành: ");

        lbl_mtk.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_mtk.setForeground(new java.awt.Color(113, 128, 150));
        lbl_mtk.setText("Mã Tài Khoản:");

        lbl_dethi.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_dethi.setText("-");
        lbl_dethi.setToolTipText("");
        lbl_dethi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl_time.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_time.setForeground(new java.awt.Color(113, 128, 150));
        lbl_time.setText("THỜI GIAN LÀM BÀI: ");

        bt_LichSu.setBackground(new java.awt.Color(66, 99, 235));
        bt_LichSu.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        bt_LichSu.setForeground(new java.awt.Color(255, 255, 255));
        bt_LichSu.setText("LỊCH SỬ THI");
        bt_LichSu.setFocusPainted(false);
        bt_LichSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_LichSuActionPerformed(evt);
            }
        });

        cbde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbdeActionPerformed(evt);
            }
        });

        lb_trangthai.setText("Trạng Thái:");

        bt_LichSu1.setBackground(new java.awt.Color(66, 99, 235));
        bt_LichSu1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        bt_LichSu1.setForeground(new java.awt.Color(255, 255, 255));
        bt_LichSu1.setText("ĐĂNG XUẤT");
        bt_LichSu1.setFocusPainted(false);
        bt_LichSu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_LichSu1ActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_ten, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                            .addComponent(lbl_nganh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lbl_time)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_lop, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_mtk, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_thi, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_dethi, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bt_LichSu1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_LichSu)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbde, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(lb_trangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_LichSu)
                    .addComponent(bt_LichSu1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ten)
                    .addComponent(lbl_mtk))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nganh)
                    .addComponent(lbl_lop))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_trangthai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbde, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_dethi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_thi, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_time))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private boolean KTtrangthaithi(){
        try(Connection c = kn.c()){
            PreparedStatement Pst = c.prepareStatement("select thi.* from thi, dethi "
                                                     + "where MaTaiKhoan = ? and dethi.NoidungDeThi = ? "
                                                     + "and thi.MD = dethi.MD"); 
            Pst.setString(1,MTK);
            Pst.setString(2,cbde.getSelectedItem().toString());
            ResultSet rs = Pst.executeQuery();
            if(rs.next()){
                if(rs.getInt("trangthai") == 0){
                    lb_trangthai.setText("Bài thi chưa sẵn sàng");
                    return false;
                }
            }
        }catch(Exception e){
            
        }
        return true;
    }
    
    //======================================================================================================================================================================
    private void bt_thiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_thiActionPerformed
         try (Connection c = kn.c()) {
            // 1. Lấy lại mã đề thi được gán cho tài khoản này (để đảm bảo chắc chắn).
            PreparedStatement pst = c.prepareStatement("SELECT MD FROM thi WHERE MaTaiKhoan = ?");
            pst.setString(1, MTK);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                made = rs.getInt("MD");
                
                // 2. GHI NHẬN LƯỢT LÀM BÀI (quan trọng)
                // Chèn một bản ghi vào bảng `dakt` để đánh dấu rằng người dùng đã bắt đầu làm bài.
                // Việc này ngăn người dùng thoát ra và vào lại để làm lại bài thi.
                // GHI CHÚ: Logic này đã được chuyển sang `kiemtraBaiLam` và bảng `lichsuthi`.
                // Việc insert vào `dakt` có thể là một cơ chế riêng.
                PreparedStatement pst1 = c.prepareStatement(
                    "INSERT INTO dakt(MD, MaTaiKhoan, TrangThai) VALUES (?, ?, ?)"
                );
                pst1.setInt(1, made);
                pst1.setString(2, MTK);
                pst1.setString(3, "Đã làm!");
                // pst1.executeUpdate(); // Có thể bật lại dòng này nếu cần.

                // 3. Chuyển sang form làm bài thi.
                new GoiGDN(new Questionform(made, MTK));
                this.dispose(); // Đóng form hiện tại.
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_bt_thiActionPerformed
    
    
    //======================================================================================================================================================================
    private void bt_LichSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_LichSuActionPerformed
        // Mở form Lịch sử thi và truyền vào mã tài khoản, mã đề.
        new GoiGDN(new EXHistory(MTK, made));
        this.dispose(); // Đóng form hiện tại.
    }//GEN-LAST:event_bt_LichSuActionPerformed

    private void cbdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbdeActionPerformed
        try (Connection c = kn.c()) {
            String sql = "SELECT thi.MD, thi.trangthai, NoidungDeThi, ThoiGian " +
                         "FROM dethi, thi " +
                         "WHERE dethi.MD = thi.MD " +
                         "AND dethi.NoidungDeThi = ? " +
                         "AND thi.MaTaiKhoan = ?";

            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, cbde.getSelectedItem().toString());
            pst.setString(2, MTK);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                if (!KTtrangthaithi()){
                    lbl_dethi.setText("Tên Đề Thi: "+rs.getString("NoidungDeThi").toUpperCase());
                    lbl_time.setText("Thời Gian Làm Bài: "+rs.getInt("ThoiGian"));
                    lb_trangthai.setText("Bài Thi Chưa Sẵn Sàng");
                    bt_thi.setEnabled(false);
                } else {
                    lbl_dethi.setText("Tên Đề Thi: "+rs.getString("NoidungDeThi").toUpperCase());
                    lbl_time.setText("Thời Gian Làm Bài: "+rs.getInt("ThoiGian"));
                    lb_trangthai.setText("Bài Thi Sẵn Sàng");
                    made = rs.getInt("MD");
                    // Cập nhật thông tin đề thi đã chọn
                    if (!kiemtraBaiLam()) {
                        // Nếu đã làm rồi (hàm trả về false), vô hiệu hóa nút "THI NGAY".
                        lb_trangthai.setText("Bài Thi Đã Thực Hiện");
                        bt_thi.setEnabled(false);
                    } else {
                        // Nếu chưa làm, cho phép nhấn nút "THI NGAY".
                        bt_thi.setEnabled(true);
                        xuatthongtinUSER();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, 
                "Lỗi khi kiểm tra trạng thái đề thi: " + e.getMessage());
        }
            // TODO add your handling code here:
    }//GEN-LAST:event_cbdeActionPerformed

    private void bt_LichSu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_LichSu1ActionPerformed
        new GoiGDN(new Login());
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_LichSu1ActionPerformed

    
    //======================================================================================================================================================================
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new HomeUser(MTK,made).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_LichSu;
    private javax.swing.JButton bt_LichSu1;
    private javax.swing.JButton bt_thi;
    private javax.swing.JComboBox<String> cbde;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lb_trangthai;
    private javax.swing.JLabel lbl_dethi;
    private javax.swing.JLabel lbl_lop;
    private javax.swing.JLabel lbl_mtk;
    private javax.swing.JLabel lbl_nganh;
    private javax.swing.JLabel lbl_ten;
    private javax.swing.JLabel lbl_time;
    // End of variables declaration//GEN-END:variables
}
