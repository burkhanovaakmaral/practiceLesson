public class Main {
    public static void main(String[] args) {
        int[]array=new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(getIndex(array,4));

    }
    static int getIndex(int[] array, int z) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= z) {
                return i;
            }
        }
        return array.length;
    }
}
