package com.tn;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Person person=new Person();
        System.out.print("Nhap ten: ");
        person.name=sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        person.gender=sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        person.date=sc.nextLine();
        System.out.print("Nhap dia chi: ");
        person.address=sc.nextLine();
        System.out.print("Info: ");
        System.out.println(" ");
        person.showInfo();
    }
}
