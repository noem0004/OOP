
package TMH;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class MaHoa_AD {
    
    private String password;
    private boolean check;
    
    public MaHoa_AD(){}
    public MaHoa_AD(String passwrod) {
        this.password = passwrod;
        new Ketnoi().c();
    }
    
     public String getMH(){
        return MHAccount_Admin();
    } 
    
    public void getTMH_Admin(boolean check){
        this.check = check;
    }
    
    public boolean getKey(){
        return dangnhap();
    }
    
    private boolean dangnhap(){
        if(!check)
            return true;
        else
            return false;
    }
    
    private String MHAccount_Admin(){
        try {
            
            MessageDigest MaHoa = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = MaHoa.digest(password.getBytes());
            StringBuilder SB = new StringBuilder();
            
                for (byte BYTE : hashedBytes) SB.append(String.format("%02x", BYTE)); /*Chuyển byte sang hex*/return SB.toString();
                
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }   
}
    
