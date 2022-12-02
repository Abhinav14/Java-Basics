public class Test extends TestStatic{


    public static void main(String[] args) {
        Child ch = new Child("Abhinav", 38, 12345);

        System.out.println("Name = "+ch.getName() + " Age = "+ch.getAge()+ " Phone Number = "+ch.getPhoneNum());

        TestStatic.add(5, 10);




    }
}
