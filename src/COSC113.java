// Parent/ class: Course
// Child class: COSC113
public class COSC113 extends Course{
    // Public, default, protected attributes are inherited
    // Not inherited,
     String syllabus;

     String coding_language;

     Instructor i1;

     Student[]
             students;
     COSC113(){
         this.syllabus = "java";
         this.coding_language = "java";
         this.i1 = null;
         this.students = null;
         this.course_number = 113;
         this.credit = 4;
         this.name = "COSC113";


     }


    // Parent class Constructors are not inherited, but can be invoked/called
    COSC113(int course_number, int credit, String name){
        // super() will invoke the parent class's default constructor-course()
        //super();

        super(course_number, credit, name);
        this.syllabus = "java";
        this.coding_language = "java";
        this.i1 = null;
        this.students = null;

    }
    // Methods: Public, default, protected methods are inherited
    // Setters and Getters - Lab work

    // Method Overriding: Defining a method with the same method signature from the parent class
    @Override
    public void display_course_information (){
         // Lab Work - use super.ATTRIBUTE_NAMEinside a print statement

         super.display_course_information();
         System.out.println("Syllabus:" + this.syllabus + "Language:" + this.coding_language + " Instructor: " + this.i1 + " Students:" + this.students);


    }

    // Package: java files under same folder are considered to be in a same package
}
