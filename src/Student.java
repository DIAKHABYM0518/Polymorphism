public class Student extends BSU_Member {
    double gpa;
    Course[] enrolled_courses;

    // Default constructor
    Student() {
        this.gpa = 0;
        this.enrolled_courses = new Course[6];
        this.status = "Student";
    }

    // Overloaded constructor
    Student(double gpa, Course[] enrolled_courses) {
        this.gpa = gpa;
        this.enrolled_courses = enrolled_courses;
        this.status = "Student";
    }

    // Getter for enrolled courses
    public Course[] get_Enrolled_Courses() {
        return this.enrolled_courses;
    }

    // Setter for enrolled courses
    public void set_Enrolled_Courses(Course[] enrolled_courses) {
        this.enrolled_courses = enrolled_courses;
    }

    // Getter for GPA
    public double get_Gpa() {
        return this.gpa;
    }

    // Setter for GPA
    public void set_Gpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void display_information() {
        System.out.println("Inside Student ------ Status: " + status);
    }
}