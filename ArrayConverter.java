// ArrayConverter.java
import java.util.* ;

class ArrayConverter {
    public static void convertArrayAndArrayList() {
        Scanner scan = new Scanner(System.in);
        
        // Convert array to ArrayList
        System.out.println("Enter size of array:");
        int n = scan.nextInt();
        Integer[] array = new Integer[n];
        
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println("Array converted to ArrayList: " + arrayList);
        
        // Convert ArrayList back to array
        Integer[] newArray = arrayList.toArray(new Integer[0]);
        System.out.println("ArrayList converted back to array: " + Arrays.toString(newArray));
        
        scan.close();
    }

}