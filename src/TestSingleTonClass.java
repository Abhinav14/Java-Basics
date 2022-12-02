public class TestSingleTonClass {

    public static void main(String[] args) {

        SingleTonClass obj1 = SingleTonClass.getInstance();
        SingleTonClass obj2 = SingleTonClass.getInstance();

        System.out.println("Hashcode for Object-1 is "+obj1.hashCode()+" and Hashcode for Object-2 is "+obj2.hashCode());
    }

}
