package Arrays;

public class SingleDimensionArray {

    int[] arr = null;

    public SingleDimensionArray(int sizeOfArray) {
        // Create an array with the specified size
        arr = new int[sizeOfArray];
        // Initialize all elements to the minimum integer value
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insertValue(int location, int valueInsert) {
        try {
            // Check if the specified location is empty (contains Integer.MIN_VALUE)
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueInsert; // Insert the value
                System.out.println("Inserted");
            } else {
                System.out.println("Already Occupied!"); // Location already has a value
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of index!"); // Handle invalid index access
        }

    }

    // output Array
    public void outputArray() {
        // Loop through the array and print each element
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    // Delete value by Index exp arr[1] will be deleted
    public void deleteValue(int valueDeleteIndex) {
        try {
            // Set the specified index back to Integer.MIN_VALUE (mark as empty)
            arr[valueDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("Value Deleted!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Array!"); // Handle invalid index access
        }
    }

    // Find by value
    public void accessValue(int value) {
        // Loop through the array to find the specified value
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("Value Found! -- Index info= " + i);
                return; // Exit the method once the value is found
            }
        }
        System.out.println(value + " Value Not Found!"); // Value is not in the array
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
