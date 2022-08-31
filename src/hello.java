/**
 * @author wyw
 * @date 2022/8/31 - 15:08
 */
public class hello {
    public static void main(String[] args) {
        System.out.println("hello");
        String[] arr = new String[]{"1", "2", "3"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        if (arr == null) {
            if (arr != null) {

            }
        }
    }

}
