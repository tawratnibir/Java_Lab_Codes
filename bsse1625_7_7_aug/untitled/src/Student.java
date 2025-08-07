import java.util.Objects;

public class Student {
    private int studentId;
    private String studentName;
    private String major;

    public Student(int studentId, String studentName, String major) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.major = major;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", major='" + major + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student student = (Student) obj;

        return studentId == student.getStudentId() &&
                studentName.equals(student.getStudentName()) &&
                major.equals(student.getMajor());
    }


    @Override
    public int hashCode() {
        return Integer.hashCode(getStudentId());
    }
}
