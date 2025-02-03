// SmallestDistanceFinder.java
import java.util.* ;

class SmallestDistanceFinder {
    public static void findSmallestDistance() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter size of array:");
        int n = scan.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        
        int minIndex = 0;
        int minDiff = Integer.MAX_VALUE;
        
        for (int i = 0; i < n - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);
            if (diff < minDiff) {
                minDiff = diff;
                minIndex = i;
            }
        }
        
        System.out.println("Index of first number in closest pair: " + minIndex);
        scan.close();
    }

}