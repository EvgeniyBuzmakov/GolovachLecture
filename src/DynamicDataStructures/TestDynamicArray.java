package DynamicDataStructures;

import java.util.Arrays;

/*

 */
public class TestDynamicArray {

    public static void main(String[] args) {
//        int[] arr1 = new int[11];
//        int[] arr2 = new int[11];
//
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i] = i;
//            arr2[i] = i;
//        }
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//        System.out.println("***********************************************************");
//
//        System.arraycopy(arr1, 3,arr2,6,2);
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));

        DynamicArray dynArr1 = new DynamicArray();
        dynArr1.add(0, 22);
        for (int i = 0; i < 1; i++) {
            System.out.println(dynArr1);
        }
        //System.out.println(Arrays.toString(dynArr1));
    }
}
