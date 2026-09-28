public class Main {
    public static void main(String[] args) {

        Course c1 = new Course();
        c1.display_course_information();

        COSC113 section1 = new COSC113();
        section1.display_course_information();

        // Polymorphism
        Course cosc214 = new Course();
        Course section2 = new COSC113();

        // IS-A relationship between Course and COSC113
        cosc214.display_course_information();
        section2.display_course_information();

        // Student object
        Student arturo = new Student();

        Course math141 = new Course();
        Course frac = new Course();
        Course cosc107 = new Course();
        Course eng102 = new Course();
        Course soc101 = new Course();

        arturo.enrolled_courses[0] = math141;

        // Lab-work: Populate index 1 to 4
        arturo.enrolled_courses[1] = frac;
        arturo.enrolled_courses[2] = cosc107;
        arturo.enrolled_courses[3] = eng102;
        arturo.enrolled_courses[4] = soc101;

        // BSU Member array
        BSU_Member[] members = new BSU_Member[10];

        // Creating Student and Instructor objects
        BSU_Member b1 = new Student();
        BSU_Member b2 = new Instructor();

        members[0] = b1;
        members[1] = b2;

        System.out.println("===========================================");

        // Create multiple Student, Instructor, and BSU_Member objects
        members[2] = new Student();
        members[3] = new Instructor();
        members[4] = new BSU_Member();
        members[5] = new Student();
        members[6] = new Instructor();
        members[7] = new BSU_Member();
        members[8] = new Student();
        members[9] = new Instructor();

        System.out.println("===========================================");

        // Display information
        for (int j = 0; j < 10; j++) {
            members[j].display_information();
        }
    }
}
