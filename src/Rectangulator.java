 public class Rectangulator{

public static void main(String args[]){
int length= Integer.parseInt(args[0]);
int width = Integer.parseInt(args[1]);
Rectangle myRectangle= new Rectangle(length,width);
System.out.println("My rectangle area = "+myRectangle.getArea());
System.out.println("My rectangle perimeter = "+myRectangle.getPerimeter());

}
}
