public class Main
{
	public static void main(String[] args) {
        int[] arr = {70, 32, 45, 90, 98};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("smallest element is: " + min);
    }
}
