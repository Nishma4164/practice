public class Studentcons {
    String name;
    int age;
    String collage;
    Studentcons(String name,int age,String collage){
        this.name=name;
        this.age=age;
        this.collage=collage;
    }
    public static void main(String[] args) {
        Studentcons s1=new Studentcons("nishma",20, "dhaanish itech");
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.collage);
    }
}
