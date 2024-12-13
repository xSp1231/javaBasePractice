package generic;

/**
 * @Author xushupeng
 * @Date 2023-08-27 17:00
*/
class Employee{
    private String name;
    private double salary;
    private MyDate birthday;
    public Employee(String name,double salary,MyDate birthday){
        this.name=name;
        this.salary=salary;
        this.birthday=birthday;
    }

    @Override //重载
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", birthday=" + birthday +
                '}';
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }
}



