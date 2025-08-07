import java.util.*;

public class StudentManagementSystem {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(5);
        Set<Student> studentSet = new HashSet<>(5);
        Map<Integer, Student> studentMap = new HashMap<>(5);
        Student s1 = new Student(101,"Nibir", "CSE");
        Student s2 = new Student(102,"Asim", "IIT");
        Student s3 = new Student(103,"Sajib", "IIT");
        Student s4 = new Student(104,"Charu", "EEE");
        Student s5 = new Student(105,"Irfan", "CSE");
        Student s7 = new Student(105, "abc", "CSE");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s5);
        studentSet.add(s1);
        studentSet.add(s7);
        for(Student x : students) {
            studentMap.put(x.getStudentId(), x);
        }
        studentMap.put(105, s7);

        Student s6 = new Student(106, "Sinha", "EEE");

        students.add(2, s6);

//        for(Student x : students) {
//            System.out.println(x);
//        }
//
        students.remove(1);

        System.out.println("After removing:");

        for(Student x : students) {
            System.out.println(x);
        }
        System.out.println("Contains: ");
        System.out.println("If s1 is in the set: "+studentSet.contains(s1));
        System.out.println("If s4 is in the set: "+studentSet.contains(s4));
        System.out.println("Student set: ");
        for(Student y:studentSet) {
            System.out.println(y);
        }
        System.out.println("From map: ");
        System.out.println(studentMap.get(105));
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
