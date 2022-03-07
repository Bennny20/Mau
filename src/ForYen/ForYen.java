package ForYen;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phien
 */
public class ForYen {

    public static void main(String[] args) {
        int numA = 20;
        int numB = 32;
        int numC = 62;
        //Bai 1
        EvenOdd(numA);
        //Bai 2
        biggestNum(numA, numB, numC);
        //Cau 3
        boolean check = check(numA);
        if (check) {
            System.out.println("Num A trong khoang 10 den 100");
        } else {
            System.out.println("Num A khong trong khoang 10 den 100");
        }
        //cau 4
        sortNum(numA, numB, numC);
        //Cau 5
        int month = 20;
        double TNCT = TNCT(month);
        System.out.println("Luong: " + TNCT);
        //Cau 6
        giaiPT(numA, numB);
        //Cau 7
        ngay(2, 2022);
    }

    public static void EvenOdd(int numA) {
        if (numA % 2 == 0) {
            System.out.println("So Num A:  " + numA + " la so chan.");
        } else {
            System.out.println("So Num A" + numA + " la so le.");
        }
    }

    public static void biggestNum(int numA, int numB, int numC) {
        if (numA >= numB && numA >= numC) {
            System.out.println("Num A la so lon nhat");
        } else if (numB >= numC) {
            System.out.println("Num B la so lon nhat");
        } else {
            System.out.println("Num C la so lon nhat");
        }
    }

    public static void sortNum(int numA, int numB, int numC) {
        int temp;
        if (numA > numB) {
            temp = numA;
            numA = numB;
            numB = temp;
        }
        if (numA > numC) {
            temp = numA;
            numA = numC;
            numC = temp;
        }
        if (numB > numC) {
            temp = numB;
            numB = numC;
            numC = temp;
        }
        System.out.println(numA + "    " + numB + "   " + numC);
    }

    public static boolean check(int numA) {
        return numA >= 10 && numA <= 100;
    }
    
    public static double TNCT(int month) {
        int luongCoBan = 650000;
        double tongLuong;
        if (month < 12) {
            return tongLuong = 1.92 * luongCoBan;
        } else if (month < 36) {
            return tongLuong = 2.34 * luongCoBan;
        }else if (month < 60) {
            return tongLuong = 3 * luongCoBan;
        }else{
            return tongLuong = 4.5 * luongCoBan;
        }
    }
    
    public static void giaiPT(int a, int b) {
        if (a == 0) {
            if(b == 0){
                System.out.println("Phuong trinh vo so nghiem");
            }else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }else{
            double nghiem =(double) -b / a;
            System.out.println("Nghiem cua phuong trinh nay la: " + nghiem);
        }
    }
    
    public static void ngay(int thang, int nam) {
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang co 31 ngayf");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang co 30 ngayf");
                break;
            case 2:
                if (nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0)) {
                    System.out.println("Thang co 29 ngay");
                    break;
                }else {
                    System.out.println("Thang co 28 ngay");
                    break;
                }
            default:
                break;
        }
    }
}
