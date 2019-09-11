package 注解.自定义注解;

/**
 * @author huzhu
 * @date 2019-06-06 11:48
 */
@STable(value="tb_student")
public class Student {
    @SField(columnName = "id",type = "int",length = 10)
    private int id;
    @SField(columnName = "sname",type = "varchar",length = 10)
    private String name;
    @SField(columnName = "age",type = "int",length = 3)
    private int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
