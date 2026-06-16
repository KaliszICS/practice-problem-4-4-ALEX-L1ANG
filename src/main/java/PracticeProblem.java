/*
File Name: Lesson 4.4 - Assumptions
Author: Alex Liang
Date Created: June 16, 2026
Date Last Modified: June 16, 2026
*/

public class PracticeProblem {

	public static void main(String args[]) {
		
	}

	public static boolean hasCapital(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

	public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i < num; i++) {
            if (num % i ==0) {
                return false;
            }
        }
        return true;
    }

}
