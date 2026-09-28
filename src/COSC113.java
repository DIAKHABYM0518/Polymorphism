// Parent/Super/Base class: Course
// Child/Sub/Derived class: COSC113

public class COSC113 extends Course {

    String syllabus;
    String coding_language;
    Instructor i1;
    Student[] students;

    // Default constructor
    COSC113() {
        this.syllabus = "Java";
        this.coding_language = "Java";
        this.i1 = null;
        this.students = null;
        this.course_number = 113;
        this.credit = 4;
        this.name = "COSC113";
    }

    // Overloaded constructor
    COSC113(int course_number, int credit, String name) {
        super(course_number, credit, name);

        this.syllabus = "Java";
        this.coding_language = "Java";
        this.i1 = null;
        this.students = null;
    }

    // Getter and Setter for syllabus
    public String get_Syllabus() {
        return this.syllabus;
    }

    public void set_Syllabus(String syllabus) {
        this.syllabus = syllabus;
    }

    // Getter and Setter for coding language
    public String get_Coding_Language() {
        return this.coding_language;
    }

    public void set_Coding_Language(String coding_language) {
        this.coding_language = coding_language;
    }

    // Getter and Setter for instructor
    public Instructor get_I1() {
        return this.i1;
    }

    public void set_I1(Instructor i1) {
        this.i1 = i1;
    }

    // Getter and Setter for students
    public Student[] get_Students() {
        return this.students;
    }

    public void set_Students(Student[] students) {
        this.students = students;
    }

    // Method overriding
    @Override
    public void display_course_information() {

        // Using super to access inherited attributes
        System.out.println("Course name: " + super.name
                + " Course number: " + super.course_number);

        System.out.println("Syllabus: " + this.syllabus
                + " Language: " + this.coding_language
                + " Instructor: " + this.i1
                + " Students: " + this.students);
    }
}
