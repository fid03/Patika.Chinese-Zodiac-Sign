package PracticeTasks;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        String chineseZodiacSign = "";
        System.out.println("Dogum yilinizi giriniz");
        age = sc.nextInt();
        if (age % 12 == 0) {
            chineseZodiacSign = "Maymun";
        } else if (age % 12 == 1) {
            chineseZodiacSign = "Horoz";
        } else if (age % 12 == 2) {
            chineseZodiacSign = "Kopek";
        } else if (age % 12 == 3) {
            chineseZodiacSign = "Domuz";
        } else if (age % 12 == 4) {
            chineseZodiacSign = "Fare";
        } else if (age % 12 == 5) {
            chineseZodiacSign = "Okuz";
        } else if (age % 12 == 6) {
            chineseZodiacSign = "Kaplan";
        } else if (age % 12 == 7) {
            chineseZodiacSign = "Tavsan";
        } else if (age % 12 == 8) {
            chineseZodiacSign = "Ejderha";
        } else if (age % 12 == 9) {
            chineseZodiacSign = "Yilan";
        } else if (age % 12 == 10) {
            chineseZodiacSign = "At";
        } else if (age % 12 == 11) {
            chineseZodiacSign = "Koyun";
        }
        System.out.print("Çin Zodyağı Burcunuz:" + chineseZodiacSign);
    }
}
