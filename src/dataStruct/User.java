package dataStruct;

/**
 * @Author forerunner
 * @Date 2025-01-07 15:42
 */
public class User {
    private Integer age;
    private String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
