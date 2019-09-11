package Java基础;

/**
 * @author huzhu
 * @date created in 2019-03-17 21:15
 * @explaination
 */
public class ParameterTest {
    int id;
    String name;

    public ParameterTest(int id,String name){
        this.id = id;
        this.name = name;
    }

    public void parameterTransfor1(ParameterTest a){
        a.name = "huzhu";
    }

    public void parameterTransfor2(ParameterTest a){
        a = new ParameterTest(100,"xiaohuzi");
    }

    public static void main(String[] args) {
        ParameterTest a = new ParameterTest(100,"hz");

        a.parameterTransfor1(a);
        System.out.println(a.name);

        a.parameterTransfor2(a);
        System.out.println(a.name);
    }

}
