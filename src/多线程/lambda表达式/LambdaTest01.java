package 多线程.lambda表达式;

/**
 * @author huzhu
 * @date 2019-05-02 14:27
 */
public class LambdaTest01 {

    static class Like2 implements ILike{

        @Override
        public void lambda() {
            System.out.println("I like lambda2!");
        }
    }

    public static void main(String[] args) {
        ILike like = new Like();
        like.lambda();

        like = new Like2();
        like.lambda();

        like = new ILike() {
            @Override
            public void lambda() {
                System.out.println("I like lambda3!");
            }
        };
        like.lambda();

        like = ()->{
            System.out.println("I like lambda4!");
        };
        like.lambda();
    }

}


interface ILike{
    void lambda();
}

class Like implements ILike{

    @Override
    public void lambda() {
        System.out.println("I like lambda!");
    }
}