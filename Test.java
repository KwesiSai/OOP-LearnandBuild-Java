public class Test {
    //Instance variables
    int code;
    String name;

    //Constructor
    public Test(String course, int courseCode){
        this.name = course;
        this.code = courseCode;
    }
    //class method
    public void display(){
        System.out.println(name);
        System.out.println(code);

    }
    public static void main(String[] args){
        // Test newTest = new Test("English", 101);
        // newTest.display();
        // fece objfac = new fece();
        // objfac.facultyData();
        // Amphibian Frog = new Reptile();
        // Frog.showname();
        employee newEmployee = new employee();
        employee.department newdpt = newEmployee.new department();
        newdpt.profile();

        
    }
}
//Polymorphism
class Amphibian {
    protected String scientificName = "aculutaoi";
    protected String defaultNick = "bagayenra";

    public void showname() {
        System.out.println(scientificName + " " + defaultNick);
    }
}

class Reptile extends Amphibian{
    String orderName = "Reptilia";
    public void showname(){
        System.out.println(scientificName + " " + defaultNick + " " + orderName);
    }

}
//Abstraction
abstract class Faculty {
    //Access modifiers
    private String collegeName = "Engineering";
    private int collegeCode = 140;

    abstract void facultyData(); //abstract method
    
    String getCollegeName() {
        return collegeName;
    }
    int getCollegeCode(){
        return collegeCode;
    }
}

//Inheritance 
class fece extends Faculty {
    String facultyName = "Electrical";
    int facultyCode = 505;

    void facultyData() {
        System.out.println(getCollegeName());
        System.out.println(getCollegeCode());
        System.out.println(facultyName);
        System.out.println(facultyCode);
    }
}

//Inner Classes
class employee {
    String firstname = "Jacob";
    int age = 23;

    class department{
        String name = "Engineering";
        int office = 301;
        
        protected void profile(){
            System.out.println(firstname);
            System.out.println(age);
            System.out.println(name);
            System.out.println(office);
        }
    }
}

