package jdbc_connection;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class BoardDao {
    private Connection conn; //DB 커넥션 연결 객체
    private static final String USERNAME = "root";
    private static final String PASSWORD = "kme254254";
    private static final String URL = "jdbc:mysql://localhost:3308/BBS";
    
    public BoardDao() {
        try {
            System.out.println("생성자");
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("드라이버 로딩 성공");
        } catch (Exception e) {
            System.out.println("드라이버 로딩 실패 ");
            try {
                conn.close();
            } catch (SQLException e1) {    }
        }
        
        
    }
}
 