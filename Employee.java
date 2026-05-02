class Employee {
    String name;
    int year;
    int salary;
    String address;

    Employee(String n, int y, int s, String a) {
        name = n;
        year = y;
        salary = s;
        address = a;
    }

    void display() {
        System.out.println(name + " " + year + " " + salary + " " + address);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("M. Umar", 2021, 30000, "Islamabad");
        Employee e2 = new Employee("Adil Khan", 2010, 50000, "Lahore");
        Employee e3 = new Employee("Zubair", 1999, 20000, "D.I.Khan");

        e1.display();
        e2.display();
        e3.display();
    }
}