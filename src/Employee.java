public class Employee extends Person{

    Employee(int age, String name, String nickName) {
        super(age, name, nickName);
    }

    public void printSomething(Employee employee){
        System.out.println(employee);
    }

    public void printSomething(String name, int age){
        System.out.println("name = "+name+ " age = "+age);
    }

    public void printSomething(){
        super.printSomething();
        System.out.println("I am in Employee Class");
    }

    public static void main(String[] args) {
        Employee employee = new Employee(40, "Karan", "Malhotra");
        Person person = new Employee(48, "Karan", "Kumar");

        Person person2 = new Person(54, "Shashi", "Tharoor");



        employee.printSomething();
        //person.printSomething();
        //person2.printSomething();
        employee.randomMethod();


        //System.out.println(employee);

        //employee.printSomething(employee);
        //employee.printSomething(employee.getName(), employee.getAge());
    }

}
