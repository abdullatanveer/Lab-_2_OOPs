public class Studentrunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student a1= new student();
        a1.studentname="ali";
        a1.sid=123;
        a1.gpa=3.91;
        a1.department="CS";
        a1.display();
                student a2=new student();
        
        a2.getname("Al hamid");
        a2.getid(432);
        a2.getdep("bba");
        a2.getgpa(3.5);
        a2.display();
        
        
        
    }
    
}
public class student {
     String studentname;
     int sid;
     String department;
     double gpa;
     public void getname(String n){
         studentname=n;
     }
     public void getid(int id){
         sid=id;
     }
     public void getdep(String d){
         department=d;
         
     }
     public void getgpa(double g){
         gpa=g;
     }
     public void display(){
         System.out.println("Student name is :" + " "  +studentname+ "  "+ "Student id is"+sid+ " "+
                 "student department is"+" "+department+ " "+"student gpa is"+" "+gpa);
     }
    
}














package carrunner;

/**
 *
 * @author abdul
 */
public class Carrunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        car c1=new car();
        c1.name="Ferrari";
        c1.color="red";
        c1.model="F32";
        c1.price=45000;
        c1.slow();
        c1.display();
    }
    
}
public class car {
    String name;
    String color;
    String model;
    int price;
    public void moving(){
        System.out.println("Car is moving with very high velocity");
        
    }
    public void slow(){
        System.out.println("CAAR is very slow....");
    }
    public void display(){
         System.out.println("CAR name is "+" "+name+" "+"car color is color"+" "+color+" "+"car price is "+" "+price+" "+"car model is"+" " +model);
        
    }
    
}