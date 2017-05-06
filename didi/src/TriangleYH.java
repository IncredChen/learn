import java.util.Scanner;

/**
 * Created  with Intellij IDEA.
 * User: EleChen
 * Date: 17/4/25
 * Time: 19:48
 * Description: 描述.
 */
public class TriangleYH {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int h;
        h = in.nextInt();
        int triangle[][] = new int[h][h];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i){
                    triangle[i][j] = 1;
                }else {
                    triangle[i][j] = triangle[i - 1][j] + triangle[i - 1][j - 1];
                }
            }
        }




        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                if (triangle[i][j]!=0) {
                    System.out.print(triangle[i][j] + " ");
                }
            }
            System.out.println();
        }

    }

}
