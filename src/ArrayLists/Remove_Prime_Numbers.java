package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Remove_Prime_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arraylist:- ");
        int n = sc.nextInt();
        ArrayList<Integer> prime = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            prime.add(sc.nextInt());
        }
        
        for (int i = prime.size() - 1; i >= 0; i--) {
            if (isPrime(prime.get(i))) {
                prime.remove(i);
            }
        }
    
        System.out.println(prime);
    }
    
    private static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}