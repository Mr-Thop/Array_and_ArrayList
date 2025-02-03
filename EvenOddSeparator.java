// EvenOddSeparator.java
import java.util.* ; 

class EvenOddSeparator {
    public static void processNumbers() {
        Scanner scan = new Scanner(System.in);
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        
        System.out.println("Enter numbers (type -1 to stop):");
        while (true) {
            int num = scan.nextInt();
            if (num == -1) break;
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
        scan.close();
    }

}