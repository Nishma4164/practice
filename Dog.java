public class Dog {
    String name;
    
    void bark(){
        System.out.println(name+"is barking");
    }
    public static void main(String[]args){
        Dog d1=new Dog();
        d1.name="Tommy";
        d1.bark();
    }
}
