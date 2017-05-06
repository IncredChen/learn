import netscape.security.ForbiddenTargetException;

import java.util.Scanner;

/**
 * Created  with Intellij IDEA.
 * User: EleChen
 * Date: 17/4/25
 * Time: 18:55
 * Description: 描述.
 */
public class Sneak {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int m, n;
        m = in.nextInt();
        n = in.nextInt();
        int a[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        printSneak(a, m, n);
    }

    private static void printSneak(int[][] a, int m, int n) {

        boolean flag = true;
        int i = 0, j = 0, l = 0, cnt = 0;
        while (cnt < m * n -1 ) {
            while (j < n - l) {
                System.out.print(a[i][j++] + "  ");
                cnt++;
            }
            j--;
            i++;
            while (i < m - l) {
                System.out.print(a[i++][j] + "  ");
                cnt++;
            }
            i--;
            j--;
            while (j >= l) {
                System.out.print(a[i][j--] + "  ");
                cnt++;
            }
            j++;
            i--;
            while (i > l) {
                System.out.print(a[i--][j] + "  ");
                cnt++;
            }
            l++;
            j++;
            i++;
        }
    }
}
