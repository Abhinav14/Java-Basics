import java.util.HashMap;
import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private String nickName;

    Person(int age, String name, String nickName){
        this.age = age;
        this.name = name;
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, nickName);
    }

    public void printSomething(){
        System.out.println("In Person class.");
    }

    public void randomMethod(){
        System.out.println("I am inside Parent class and doing some random things.");
    }

    public static void main(String[] args) {
        Person obj1 = new Person(32, "Anusha", "Fudaaki");

        Person obj2 = new Person(32, "Anusha", "Fudakiya");

        System.out.println(obj1);
        System.out.println(obj2);

        System.out.println(obj1.equals(obj2));

        HashMap<Person, Boolean> hashMap = new HashMap<>();
        hashMap.put(obj1, true);
        hashMap.put(obj2, true);

        System.out.println(hashMap);
        System.out.println(obj1.hashCode()+"  "+obj2.hashCode()+"  "+obj1.equals(obj2));
    }

}
