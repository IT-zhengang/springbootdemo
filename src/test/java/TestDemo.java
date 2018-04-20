/**
 * 数组的排序功能
 */
public class TestDemo {
    public static void main(String[] args) {
        int[] arr = {1, 8, 4, 6, 7, 2, 5};
        selectSort(arr);
        int i1 = halfSearch(arr, 4);
        System.out.println(i1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }
    }

    /**
     * 进行数组元素的交换
     *
     * @param a
     * @param i
     * @param j
     */
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /**
     * 冒泡排序
     *
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    /**
     * 选择排序
     *
     * @param arr
     */
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] >arr[j])
                    swap(arr, i, j);
            }
        }

    }

    /**
     * 折半查找：在升序排列的情况下，进行查找
     * @param arr
     * @param key
     * @return
     */
    public static int halfSearch(int[] arr, int key) {
        System.out.println(arr.length-1);
        int max = arr.length - 1,
                min = 0,
                mid = (max + min) / 2;
        while (arr[mid] != key) {
            if (arr[mid] > key)
                max = mid - 1;
            else if (arr[mid] < key)
                min = mid + 1;
            if (min > max)
                return -1;
            mid = (max + min) / 2;
        }
        return mid;
    }

    /**
     * 折半查找方法二
     * @param arr
     * @param key
     * @return
     */
    public static int halfSearch1(int[] arr, int key) {
        int max = arr.length - 1, min = 0, mid;
        while (min <= max) {
            mid = (max + min) >> 1;
            if (arr[mid] > key)
                max = mid - 1;
            else if (arr[mid] < key)
                min = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}


