public class Student {
 
    private String name;
    private String major;
    private String testPass;
    private String parentName;
    private int age;
 
    public Student(String name, String major, String testPass, String parentName, int age) {
        this.name = name;
        this.major = major;
        this.testPass = testPass;
        this.parentName = parentName;
        this.age = age;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getMajor() {
        return major;
    }
 
    public void setMajor(String major) {
        this.major = major;
    }
 
    public String getTestPass() {
        return testPass;
    }
 
    public void setTestPass(String testPass) {
        this.testPass = testPass;
    }
 
    public String getParentName() {
        return parentName;
    }
 
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }
 
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
}
