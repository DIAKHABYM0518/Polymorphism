public class Student extends BSU_Member {
    double gpa;
    Course [] enrolled_courses;

    Student(){
        this.gpa = 0;
        this.enrolled_courses = new Course[6];
        this.status = "Student";
    }

    // Lab work: Create a getter method for enrolled_courses attribute
    public Course[] get_Enrolled_courses() {
        return this.enrolled_courses;
    }

    @Override
    public void display_information(){
        System.out.println("Status:" + status);
    }

    // Setter
    public void setEnrolled_courses(Course[] enrolled_courses){
        this.enrolled_courses = enrolled_courses;
    }
}
