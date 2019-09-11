import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {

        //正则表达式匹配
        String content = "I am Elvan form Hust";
        String pattern = ".*Elvan.*";
        boolean isMatch = Pattern.matches(pattern,content);
        System.out.println(isMatch);

        //捕获组
        String line = "This order was placed for QT3000! OK?";
        pattern = "(\\D*)(\\d+)(.*)";
        Pattern r = Pattern.compile(pattern);

        //创建matcher对象
        Matcher m = r.matcher(line);
        if(m.find()){
            System.out.println(m.group(0));
            System.out.println(m.group(1));
            System.out.println(m.group(2));
            System.out.println(m.group(3));
        }else{
            System.out.println("NO MATCH!");
        }

        //start和end方法
        String REGEX = "\\bcat\\b";  //b表示匹配边界
        String INPUT = "cat cat cat cattie cat";
        Pattern p = Pattern.compile(REGEX);
        m = p.matcher(INPUT);
        int count = 0;
        while(m.find()){
            count++;
            System.out.println("Match number:" + count);
            System.out.println("Start():" + m.start());
            System.out.println("End():" + m.end());
        }

    }
}
