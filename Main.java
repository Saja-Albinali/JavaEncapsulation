public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Saja");
        student.setAge(24);
        student.setGpa(4.0);

        System.out.println("student name: " + student.getName());
        System.out.println("student age: " + student.getAge());
        System.out.println("gpa: " + student.getGpaStatus());
    }
}