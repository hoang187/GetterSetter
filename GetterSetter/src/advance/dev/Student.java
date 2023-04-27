package advance.dev;

public class Student {
    private String name;
    private int age;
    private String address;
    private String phoneNumber;
    private float gpa;

    // Khởi tạo lớp Student với các thuộc tính
    public Student(String name, int age, String address, String phoneNumber, float gpa) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.gpa = gpa;
    }

    // Getter và Setter cho các thuộc tính

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
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        if (gpa >= 0) {
            this.gpa = gpa;
        } else {
            System.out.println("Invalid GPA!");
        }
    }
}