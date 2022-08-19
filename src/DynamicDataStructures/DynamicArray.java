package DynamicDataStructures;

/*

 */
public class DynamicArray {
    int[] data = {};

    public void add(int index, int elementValue) {
        int[] newdata = new int[data.length + 1];
        System.arraycopy(data, 0, newdata, 0, index);
        System.arraycopy(data, 0, newdata, 0, data.length - index);
        newdata[index] = elementValue;
        this.data = newdata;
        //return newdata;
    }

}
