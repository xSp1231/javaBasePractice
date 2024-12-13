package 封装;

/**
 * @Author xushupeng
 * @Date 2024-12-04 22:20
 */
class Person{
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phone;
    private String email;

    public int  id=1;

    public Person(String name, int age, String gender, String address, String phone, String email) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
        this.email = email;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}



public class fengzhuang {


    public static void main(String[] args) {
        Person person=new Person("xsp",22,"男","deyang","18783863882","dsdsd");
        System.out.println(person.getAddress());
        System.out.println(person.id);

    }
}
