
import MaHoa.Ketnoi;
import MaHoa.GoiGDN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class CreateEX2 extends javax.swing.JFrame {
    private Ketnoi kn = new Ketnoi();
    
    
    //======================================================================================================================================================================
     public CreateEX2() {
        initComponents(); // Khởi tạo các thành phần giao diện.
        kn.c(); // Mở kết nối CSDL.
        setLocationRelativeTo(null);
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_noidung = new javax.swing.JTextField();
        txt_time = new javax.swing.JTextField();
        txt_ngay = new javax.swing.JTextField();
        txt_thang = new javax.swing.JTextField();
        txt_nam = new javax.swing.JTextField();
        txt_namthi = new javax.swing.JTextField();
        txt_thangthi = new javax.swing.JTextField();
        txt_ngaythi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        bt_taoDT = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chương trình thi trắc nghiệm");
        setBackground(new java.awt.Color(255, 255, 255));

        txt_noidung.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_noidung.setForeground(new java.awt.Color(26, 32, 44));
        txt_noidung.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        txt_time.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_time.setForeground(new java.awt.Color(26, 32, 44));
        txt_time.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        txt_ngay.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_ngay.setForeground(new java.awt.Color(26, 32, 44));
        txt_ngay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        txt_thang.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_thang.setForeground(new java.awt.Color(26, 32, 44));
        txt_thang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        txt_nam.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_nam.setForeground(new java.awt.Color(26, 32, 44));
        txt_nam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        txt_namthi.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_namthi.setForeground(new java.awt.Color(26, 32, 44));
        txt_namthi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        txt_thangthi.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_thangthi.setForeground(new java.awt.Color(26, 32, 44));
        txt_thangthi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        txt_ngaythi.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_ngaythi.setForeground(new java.awt.Color(26, 32, 44));
        txt_ngaythi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(113, 128, 150));
        jLabel1.setText("Nội Dung Đề Thi");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(113, 128, 150));
        jLabel2.setText("Thời Gian Thi:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(113, 128, 150));
        jLabel9.setText("Ngày Tạo:");
        jLabel9.setToolTipText("");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(113, 128, 150));
        jLabel10.setText("Ngày Thi:");

        bt_taoDT.setBackground(new java.awt.Color(66, 99, 235));
        bt_taoDT.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        bt_taoDT.setForeground(new java.awt.Color(255, 255, 255));
        bt_taoDT.setText("TẠO ĐỀ THI MỚI");
        bt_taoDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_taoDTActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("CREATE EXAM");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(113, 128, 150));
        jLabel4.setText("Phút");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(113, 128, 150));
        jLabel5.setText("Ngày");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(113, 128, 150));
        jLabel6.setText("Tháng");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(113, 128, 150));
        jLabel7.setText("Năm");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(113, 128, 150));
        jLabel8.setText("Ngày");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(113, 128, 150));
        jLabel11.setText("Tháng");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(113, 128, 150));
        jLabel12.setText("Năm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_noidung)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_ngay, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_ngaythi, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_thang, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_thangthi, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_nam, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_namthi))))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_time, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(bt_taoDT)
                                .addGap(124, 124, 124)))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_noidung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addComponent(txt_ngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_thang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(txt_ngaythi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txt_thangthi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txt_namthi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(bt_taoDT, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    //======================================================================================================================================================================
    private void bt_taoDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_taoDTActionPerformed
        // Lấy và chuyển đổi ngày, tháng, năm tạo đề từ các ô text thành số nguyên.
        int namtao = Integer.parseInt(txt_nam.getText());
        int thangtao = Integer.parseInt(txt_thang.getText());
        int ngaytao = Integer.parseInt(txt_ngay.getText());

        // Sử dụng LocalDate để tạo đối tượng ngày tạo, đây là cách làm rất tốt và hiện đại.
        LocalDate ngaytaodethi = LocalDate.of(namtao, thangtao, ngaytao);
        
        // Lấy và chuyển đổi ngày, tháng, năm thi từ các ô text.
        int namthi = Integer.parseInt(txt_namthi.getText());
        int thangthi = Integer.parseInt(txt_thangthi.getText());
        int ngaythi = Integer.parseInt(txt_ngaythi.getText());

        // Tạo đối tượng LocalDate cho ngày thi.
        LocalDate ngaybatdauthi = LocalDate.of(namthi, thangthi, ngaythi);
        
        // ========================= LỖI QUAN TRỌNG TRONG VALIDATION =========================
        // Khối `if` dưới đây có một vài lỗi:
        // 1. `getText().equals(null)` sẽ luôn gây ra lỗi NullPointerException nếu bạn muốn so sánh với null.
        //    Cách đúng để kiểm tra rỗng là `getText().trim().isEmpty()`.
        // 2. `JOptionPane.showConfirmDialog` dùng để hiển thị hộp thoại Yes/No, không phải để hiển thị thông báo.
        //    Để hiển thị thông báo, bạn nên dùng `JOptionPane.showMessageDialog`.
        // Do đó, khối kiểm tra này sẽ không hoạt động như mong đợi.
        if(txt_noidung.getText().equals(null) || txt_time.getText().equals(null) ||
           txt_thang.getText().equals(null) || txt_thang.getText().equals(null) ||
           txt_ngay.getText().equals(null) || txt_ngaythi.getText().equals(null) ||
           txt_namthi.getText().equals(null) || txt_thangthi.getText().equals(null)){
            JOptionPane.showConfirmDialog(null, "Nhap thong tin de thi!");
            return;
        }else{
            // Nếu validation (dù bị lỗi) được bỏ qua, thực hiện thêm vào CSDL.
            try(Connection c = kn.c()){
                // Chuẩn bị câu lệnh SQL INSERT để thêm một đề thi mới vào bảng `dethi`.
                PreparedStatement Pst = c.prepareStatement("INSERT INTO `dethi`(`NoidungDeThi`, `ThoiGian`, `NgayTao`, `NgayThi`) "
                        + "VALUES (?,?,?,?)");
                // Gán các giá trị từ form vào câu lệnh.
                Pst.setString(1,txt_noidung.getText());
                Pst.setInt(2,Integer.parseInt(txt_time.getText()));
                // Chuyển đối tượng LocalDate thành java.sql.Date để lưu vào CSDL.
                Pst.setDate(3,java.sql.Date.valueOf(ngaytaodethi));
                Pst.setDate(4,java.sql.Date.valueOf(ngaybatdauthi));
                // Thực thi lệnh INSERT.
                Pst.executeUpdate();
                new GoiGDN(new ManageEX());
                this.dispose();
                JOptionPane.showMessageDialog(null, "Thêm Đề Thì Mới Thành Công!");
                // GHI CHÚ: Sau khi tạo thành công, nên có một thông báo cho người dùng
                // ví dụ: JOptionPane.showMessageDialog(this, "Tạo đề thi thành công!");
            }catch(Exception e){
                // Khối catch trống, lỗi sẽ bị bỏ qua trong im lặng.
                // Nên thêm e.printStackTrace() hoặc một thông báo lỗi ở đây.
            }
        }
    }//GEN-LAST:event_bt_taoDTActionPerformed
    
    
    //======================================================================================================================================================================
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new CreateEX2().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_taoDT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_nam;
    private javax.swing.JTextField txt_namthi;
    private javax.swing.JTextField txt_ngay;
    private javax.swing.JTextField txt_ngaythi;
    private javax.swing.JTextField txt_noidung;
    private javax.swing.JTextField txt_thang;
    private javax.swing.JTextField txt_thangthi;
    private javax.swing.JTextField txt_time;
    // End of variables declaration//GEN-END:variables

}
