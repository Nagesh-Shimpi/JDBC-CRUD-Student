package Project_1;

public class Student {
    private int id;
    private String name;
    private String email;
    private double marks;

    public Student() {
    }
    public Student(String name, String email, double marks) {
        this.name = name;
        this.email = email;
        this.marks = marks;
    }

    public Student(int id, String name, String email, double marks) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.marks = marks;
    }

    public int getId() {
        return id;    }
    public void setId(int id) {
        this.id = id;
    }
public String getName(){
    return name;}
    public String getEmail(){
        return email;
    }
    public double getMarks(){
        return marks;
    }
    public void setName(String name){
        this.name=name;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
    }
    public void setEmail(String Email){
        this.email = email;
    }
    public double getMarks(double marks){
        return marks;
    }
    }