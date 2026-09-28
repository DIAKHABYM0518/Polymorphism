public class Instructor extends BSU_Member {
    String department;

    // Default constructor
    Instructor() {
        this.department = "CS";
        this.status = "Faculty";
    }

    // Overloaded constructor
    Instructor(String department) {
        this.department = department;
        this.status = "Faculty";
    }

    // Getter
    public String get_Department() {
        return this.department;
    }

    // Setter
    public void set_Department(String department) {
        this.department = department;
    }

    // Display method
    @Override
    public void display_information() {
        System.out.println("Inside Instructor-------Department: "
                + this.department + " Faculty: " + this.status);
    }
}