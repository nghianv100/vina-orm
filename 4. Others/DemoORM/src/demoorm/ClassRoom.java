package demoorm;

import com.vinaorm.annotations.*;

@Table(name="class")
public class ClassRoom {
    
    @PrimaryKey
    @Column(name="id_class", type=ColumnType.CHARACTER)
    public String classId;
    
    @Column(name="number_of_students", type=ColumnType.INTEGER)
    public int numberOfStudents;
    
    @Column(name="name", type=ColumnType.CHARACTER)
    public String className;

    public ClassRoom() {}
    
    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    
    
}
