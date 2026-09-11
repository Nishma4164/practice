public class Employe2 {
    String name;
    int salary;
    String location;
    Employe2(String name,int salary,String location){
        this.name=name;
        this.salary=salary;
        this.location=location;
    }
    public static void main(String[] args) {
        Employe2 e1=new Employe2("sonu",500000,"canada");
        Employe2 e2=new Employe2("sinu",300000,"london");

        System.out.println(e1.name);
        System.out.println(e1.salary);
        System.out.println(e1.location);

        System.out.println(e2.name);
        System.out.println(e2.salary);
        System.out.println(e2.location);
    }
    
}
