public class Customer {
    private String name;
    private int age;
    private String address;
    private String passportNo;
    private String expiredDate;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", passportNo='" + passportNo + '\'' +
                ", expiredDate='" + expiredDate + '\'' +
                '}';
    }

    public Customer(String name, int age, String address, String passportNo, String expiredDate) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.passportNo = passportNo;
        this.expiredDate = expiredDate;
    }
}

