public class Course {

    String name;
    int course_number;
    int credit;

    private String classroom;

    // Default constructor
    Course() {
        name = "";
        course_number = 0;
        credit = 0;
    }

    // Overloaded constructor
    Course(int course_number, int credit, String name) {
        this.course_number = course_number;
        this.credit = credit;
        this.name = name;
    }

    // Setter for name
    public void set_Name(String name) {
        this.name = name;
    }

    // Getter for name
    public String get_Name() {
        return this.name;
    }

    // Setter for course number
    public void set_Course_Number(int course_number) {
        this.course_number = course_number;
    }

    // Getter for course number
    public int get_Course_Number() {
        return this.course_number;
    }

    // Setter for credit
    public void set_Credit(int credit) {
        this.credit = credit;
    }

    // Getter for credit
    public int get_Credit() {
        return this.credit;
    }

    // Setter for classroom
    public void Set_Classroom(String classroom) {
        this.classroom = classroom;
    }

    // Getter for classroom
    public String get_Classroom() {
        return this.classroom;
    }

    // Display method
    public void display_course_information() {
        System.out.println("Course name: " + this.name
                + " Course number: " + this.course_number);
    }
}


