package com.myjava.ocp.lab02;

public class ParkingSystem {
    public static void main(String[] args) {
        int parking = 0b101010;
        System.out.println("車位狀態: " + Integer.toBinaryString(parking));
        int no = 2;
        System.out.print("no=" + no + "車位, ");
        no = (int)Math.pow(2, no);
        int check = parking & no;
        System.out.println(check == 0 ? "可停車" : "不可停車");
        if (check == 0) {
            // 停車
            parking += no;
            System.out.println("車位狀態: " + Integer.toBinaryString(parking));
        }
        
        
    }
}
