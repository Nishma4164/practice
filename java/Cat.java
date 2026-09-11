public class Cat {
    String name;

    void sound(){
        System.out.println(name+"is meowing");
    }
      public static void main(String[] args) {
        Cat c1=new Cat();
          c1.name="kitty";
          c1.sound();
      }
}
