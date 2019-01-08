package demoorm;

import com.vinaorm.annotations.*;

@Table(name="student")
public class Student {
    
    @PrimaryKey
    @Column(name="id_student", type=ColumnType.CHARACTER)
    public String studentId;
    
    @Column(name="name_student", type=ColumnType.CHARACTER)
    public String studentName;
    
    @Column(name="class", type=ColumnType.CHARACTER)
    public String studentClass;
    
    @Column(name="GPA", type=ColumnType.DECIMAL)
    public double studentGPA;

    public Student() {
        
    }
    
    public Student(String studentId, String studentName, String studentClass, double studentGPA) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentClass = studentClass;
        this.studentGPA = studentGPA;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public double getStudentGPA() {
        return studentGPA;
    }

    public void setStudentGPA(double studentGPA) {
        this.studentGPA = studentGPA;
    }
}
