public class Student{
        private String name;
        private int age;
        private double gpa;

    public String getGpaStatus() {
        if (gpa > 3.0) {
            return "Excellent";
        } else if (gpa >= 2.0) {
            return "Good";
        } else {
            return "Needs Improvement";
        }
    }
    public void setGpa(double gpa){
        if(gpa>=0.0 && gpa<=4.0){
            this.gpa = gpa;
        }else{
            this.gpa=0.0;
        }

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}



