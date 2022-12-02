public class MyContractClass implements MyInterface{
    @Override
    public void printHello() {
        System.out.println("Printing Hello ...");
    }

    @Override
    public String getMyName() {
        return "The name is Anant...Abhinav Anant";
    }

    @Override
    public void setName(String name) {
        System.out.println(getMyName());
    }
}
