class Employee {
    String name;
    int salary;
    String location;

    Employee(String n, int s, String l) {
        name = n;
        salary = s;
        location = l;
    }

    void display() {
        System.out.println( name);
        System.out.println(salary);
        System.out.println(location);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Nishma",400000,"canada");

        e1.display();
    }
}

