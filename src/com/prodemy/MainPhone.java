package com.prodemy;

import java.util.Scanner;

public class MainPhone {
    public static void main(String[] args) {
        // membuat object untuk class Samsung
        Phone samsungGalaxyS21 = new Samsung();

        // membuat object user
        PhoneUser jerry = new PhoneUser(samsungGalaxyS21);
        
        // user menyalakan hp
        jerry.turnOnThePhone();

        // interface untuk fitur hp
        Scanner input = new Scanner(System.in);
        String action;

        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            action = input.nextLine();
            
            if(action.equalsIgnoreCase("1")){
                jerry.turnOnThePhone();
            } else if (action.equalsIgnoreCase("2")){
                jerry.turnOffThePhone();
            } else if (action.equalsIgnoreCase("3")){
                jerry.volumeLouder();
            } else if (action.equalsIgnoreCase("4")){
                jerry.volumeSofter();
            } else if (action.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Undefined command");
            }
        }
    }
}
