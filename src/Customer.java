public class Customer {
    private String name;
    private int age;
    private String address;
    private String passportNo;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", passportNo='" + passportNo + '\'' +
                '}';
    }

    public Customer(String name, int age, String address, String passportNo) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.passportNo = passportNo;

    }
}
