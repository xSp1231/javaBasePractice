package customGeneric;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author xushupeng
 * @Date 2023-08-27 20:07
 */
public class GenericFinalTest {
    public static void main(String[] args) {

        DAO<User> dao = new DAO<>();
        dao.save("1",new User("xsp",20));
        dao.save("2",new User("xps",20));
        dao.save("3",new User("pxs",20));
        dao.delete("2");
        dao.update("3",new User("777",666));
        System.out.println(dao.get("1"));
        System.out.println(dao.list());
    }
}
class DAO<T>{
    private  HashMap<String,T> map=new HashMap<>();
    public void save(String id,T entity){
        map.put(id,entity);
    }
    public T get(String id){
        return map.get(id);
    }
    public void update(String id,T entity){
        map.put(id,entity);
    }
    public List<T> list(){
        List<T> list=new ArrayList<>();
        for(String it:map.keySet()){
            //list.add(map.get(it));
            list.add(get(it));
        }
        return list;
    }
    public void delete(String id){
        map.remove(id);
    }
}
class User{
    String name;
    int age;
    public User(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
