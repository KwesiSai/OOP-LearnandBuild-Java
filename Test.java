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
        Test newTest = new Test("English", 101);
        newTest.display();
        fece objfac = new fece();
        objfac.facultyData();
        
    }
}

abstract class Faculty {
    private String collegeName = "Engineering";
    private int collegeCode = 140;

    abstract void facultyData();
    
    String getCollegeName() {
        return collegeName;
    }
    int getCollegeCode(){
        return collegeCode;
    }
}

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