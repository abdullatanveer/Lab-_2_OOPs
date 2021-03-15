package rectanglerunner;

/**
 *
 * @author abdul
 */
public class Rectanglerunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        recta r1=new recta();
        r1.length=7;
        r1.breadth=6;
        r1.area();
        r1.display();
    }
    
}

package rectanglerunner;

/**
 *
 * @author abdul
 */
public class recta {
    int length;
    int breadth;
     public recta(){
         
     }
     public void setarea(int l, int b){
         length=l;
         breadth=b;
     }
     public int area(){
         return length*breadth;
     }
     public void display(){
         System.out.println("Area of rectangle is "+ " " +area());
     }
    
}
