public class TestAbstractClass extends AbstractClass{
    @Override
    void printHello() {
        System.out.println("I am inside overriden method in implementation class");
    }

    public static void main(String[] args) {
        TestAbstractClass obj = new TestAbstractClass();
        obj.printHello();
        obj.printHello2();
    }
}
