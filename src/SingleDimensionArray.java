import java.util.Arrays;

public class SingleDimensionArray {

    int[] arr = null;

    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insertValue(int location, int valueInsert) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueInsert;
                System.out.println("Inserted");
            } else {
                System.out.println("Already Occupied!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of index!");
        }

    }

    // output Array
    public void outputArray(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    // Delete value by Index exp arr[1] will be deleted
    public void deleteValue(int valueDeleteIndex){
        try{
            arr[valueDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("Value Deleted!");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of Array!");
        }
    }

    // Find by value
    public void accessValue(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("Value Found! -- Index info= " + i);
                return;
            }
        }
        System.out.println(value + " Value Not Found!");
    }


    public static void main(String[] args) {
        SingleDimensionArray myArray = new SingleDimensionArray(5);
        myArray.insertValue(1, 10);
        myArray.insertValue(1, 15);
        myArray.insertValue(2, 12);
        myArray.insertValue(100, 10);

        System.out.println();

        myArray.accessValue(10);

        System.out.println();
        myArray.deleteValue(1);
        System.out.println();
        myArray.outputArray();
    }


}
