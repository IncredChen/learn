import java.util.Scanner;

/**
 * Created  with Intellij IDEA.
 * User: EleChen
 * Date: 17/5/5
 * Time: 15:13
 * Description: 剔除子串.
 */
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();

        a = fun(a,b);
        System.out.println(a);
    }

    private static String fun(String a, String b) {

        if ("".equals(a)){
            return "";
        }

        if ("".equals(b)){
            return a;
        }

        while(a.contains(b)){
            a = a.replace(b,"");
        }

        return a;
    }
}
