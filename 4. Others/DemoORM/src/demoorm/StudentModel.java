package demoorm;

import com.vinaorm.MySQLConnection;
import java.util.ArrayList;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

public class StudentModel implements ListModel {
    
    private String host = DBConfig.host;
    private int port = DBConfig.port;
    private String dbname = DBConfig.dbname;
    private String username = DBConfig.username;
    private String password = DBConfig.password;
    
    private ArrayList<Student> list;
    
    public StudentModel() {
        try {
            MySQLConnection.Builder builder = new MySQLConnection.Builder();
            MySQLConnection conn = builder.setHost(host).setPort(port).setDbName(dbname).setUsername(username).setPassword(password).build();
            conn.open();
            list = conn.select(Student.class, "SELECT * FROM student");
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
    }
    
    public Student getStudent(int index) {
        return list.get(index);
    }

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public Object getElementAt(int index) {
        return list.get(index).studentName;
    }

    @Override
    public void addListDataListener(ListDataListener l) {
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
    }
    
}
