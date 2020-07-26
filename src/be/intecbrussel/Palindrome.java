package be.intecbrussel;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.next();
        a = a.toUpperCase();

        String reverse = "";
        for(int i = a.length() -1; i >=0; i--){
            reverse += a.charAt(i);
        }

        boolean palindrome = true;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) != reverse.charAt(i)){
                palindrome = false;
            }
        }
        if(palindrome){
            System.out.println("Palindrome.");
        } else{
            System.out.println("Not Palindrome.");
        }
    }
}
