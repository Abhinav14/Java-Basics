public class Child extends Parent {
    private int phoneNum;

    Child(String name, int age, int phoneNum) {
        super(name, age);
        this.phoneNum = phoneNum;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }
}
