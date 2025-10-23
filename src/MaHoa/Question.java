package MaHoa;

public class Question {
    private int md;
    private int mc; // Mã câu hỏi
    private String noiDung;
    private String dapAnA;
    private String dapAnB;
    private String dapAnC;
    private String dapAnD;
    private String dapAnDung;
    private int loaiDa; // 1: chọn 1, 2: chọn nhiều

    public Question(int mc, String noiDung, String dapAnA, String dapAnB, String dapAnC, String dapAnD, String dapAnDung, int loaiDA) {
        this.mc = mc;
        this.noiDung = noiDung;
        this.dapAnA = dapAnA;
        this.dapAnB = dapAnB;
        this.dapAnC = dapAnC;
        this.dapAnD = dapAnD;
        this.dapAnDung = dapAnDung;
        this.loaiDa = loaiDA;
    }
    public Question(int mc, int md){
        this.mc = mc;
        this.md = md;
    }

    // Thêm các hàm getter cho tất cả các thuộc tính
    public int getMc() { return mc; }
    public String getNoiDung() { return noiDung; }
    public String getDapAnA() { return dapAnA; }
    public String getDapAnB() { return dapAnB; }
    public String getDapAnC() { return dapAnC; }
    public String getDapAnD() { return dapAnD; }
    public String getDapAnDung() { return dapAnDung; }
    public int getLoaida() { return loaiDa; }
}