public class Car {
    String name;
    int maxspeed;
     int model;

     void printdetail(){
        System.out.println(name);
        System.out.println(model);
         System.out.println(maxspeed);

     }
     public static void main(String[] args) {
        Car c1=new Car();
        c1.name="porche";
        c1.maxspeed=150;
        c1.model=911;

        c1.printdetail();
     }
}
