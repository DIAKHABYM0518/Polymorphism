public class Instructor extends BSU_Member {
    String department;
    Instructor(){
        this.department = "CS";
        this.status = "Faculty";
    }

    // Create a display method that will print the department and status
    public void display_information(){
            System.out.println("department:" + this.department + "Faculty:" + this.status);
    }
}
