
/**
 * Created  with Intellij IDEA.
 * User: EleChen
 * Date: 17/4/25
 * Time: 20:06
 * Description: 快速排序（范型化）.
 */
public class QSort<T> {

    private static <T extends Comparable<? super T>> void doQsort(T[] arr, int l, int r) {

        if (r <= l) {
            return;
        }

        //寻找标定元素的位置
        int point = partition(arr, l, r);

        //递归
        doQsort(arr, l, point - 1);
        doQsort(arr, point + 1, r);

    }

    private static <T extends Comparable<? super T>> int partition(T[] arr, int l, int r) {
        T aux = arr[l];
        int i = l + 1, j = r;
        while (true) {

            while (i <= r && arr[i].compareTo(aux) < 0) {
                i++;
            }

            while (j >= l + 1 && arr[j].compareTo(aux) > 0) {
                j--;
            }

            if (j < i) {
                break;
            }

            T t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;

            i++;
            j--;
        }
        arr[l] = arr[j];
        arr[j] = aux;
        return j;
    }

    public static void main(String[] args) {
        //Double[] arr = {3.1, 2.0, 5.0, 8.0, 4.0, 7.0, 6.0, 9.0};
        //Long[] arr = {3L,2L,5L,8L,4L,7L,6L,9L};
        Integer[] arr = {3,2,5,8,4,7,6,9};

        QSort.doQsort(arr, 0, arr.length - 1);
        for (Integer i : arr) {
            System.out.println(i + " ");
        }
    }
}
