package pw.cotra.aoptest;

public class Student {
    private String age;
    private String name;

    public void setAge(String age) {
        this.age = age;
    }
    public String getAge() {
        System.out.println("Age : " + age );
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        System.out.println("Name : " + name );
        return name;
    }
    public void printThrowException(){
        System.out.println("Exception raised");
        throw new IllegalArgumentException();
    }
}
