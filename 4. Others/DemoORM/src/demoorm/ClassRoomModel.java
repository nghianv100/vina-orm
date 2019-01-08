package demoorm;

import com.vinaorm.MySQLConnection;
import java.util.ArrayList;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

public class ClassRoomModel implements ListModel {

    private String host = DBConfig.host;
    private int port = DBConfig.port;
    private String dbname = DBConfig.dbname;
    private String username = DBConfig.username;
    private String password = DBConfig.password;
    
    private ArrayList<ClassRoom> list;
    
    public ClassRoomModel() {
        try {
            MySQLConnection.Builder builder = new MySQLConnection.Builder();
            MySQLConnection conn = builder.setHost(host).setPort(port).setDbName(dbname).setUsername(username).setPassword(password).build();
            conn.open();
            list = conn.select(ClassRoom.class, "SELECT * FROM class");
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
    }
    
    public ClassRoom getClassRoom(int index) {
        return list.get(index);
    }
    
    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public Object getElementAt(int index) {
        return list.get(index).className;
    }

    @Override
    public void addListDataListener(ListDataListener l) {
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
    }
    
}
