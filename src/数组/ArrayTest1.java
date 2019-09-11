package 数组;

/**
 * @author huzhu
 * @date created in 2019-03-30 15:59
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        String[] arr2 = new String[10];

        arr2[0] = "10";
        User[] arr3 = new User[3];

        arr3[0] = new User(10,"huzhu");
        arr3[1] = new User(10,"huzhu2");
        arr3[2] = new User(10,"huzhu3");

        for(User user : arr3){
            System.out.println(user.toString());
        }
    }
}

class User{
    private int id;
    private String name;

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
