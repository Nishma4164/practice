import java. util.Scanner; 
public class family {
  public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println("enter name:father");
    String father =sc.nextLine();
    System.out.println("enter name:mother");
    String mother =sc.nextLine();
    System.out.println("enter name:brother");
    String brother=sc.nextLine();
    System.out.println("enter name:daughter1");
    String daughter1 =sc.nextLine();
    System.out.println("enter nam  e:daughter2");
    String daughter2=sc.nextLine();
    
    System.out.println("\n family details");
    System.out.println("father:"+father);
   System.out.println("mother:"+mother);
    System.out.println("brother:"+brother);
    System.out.println("daughter1:"+daughter1);
    System.out.println("daughter2:"+daughter2);
sc.close();
  }
}
