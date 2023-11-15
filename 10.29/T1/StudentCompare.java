package T1;

public class StudentCompare {
    public static void main(String[] args) {
        Student s1 = new Student("MIT","HKT3291");
        Student s2 = new Student("HKU","T89");
        Student s3 = new Student("HKU","T89");

        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s2));

    }

}

class Student{
    private String school;
    private String id;

    public Student(String school, String id) {
        this.school = school;
        this.id = id;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean equals(Object obj){
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student s = (Student) obj;
        return (this.school.equals(s.school) && this.id.equals(s.id));
    }
}
