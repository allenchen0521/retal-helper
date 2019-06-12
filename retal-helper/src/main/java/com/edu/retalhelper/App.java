package com.edu.retalhelper;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // A 租屋物件資料
        float areaA = 10f;
        String typeA = "套房";
        int priceA = 12000;
        String ownerA = "Allen";
        String addressA = "台北市遼寧街xx號";

        // B 租屋物件資料
        float areaB = 8f;
        String typeB = "套房";
        int priceB = 8000;
        String ownerB = "Tony";
        String addressB = "新北市中和區中和路yy號";

        // C 租屋物件資料
        float areaC = 4f;
        String typeC = "雅房";
        int priceC = 15000;
        String ownerC = "Darren";
        String addressC = "新北市新店區中正路zz號";

        // info
        String infoA = "A 租屋" + areaA + " 坪 房型 " + typeA + " 每月" + priceA + "元" + " 屋主: " + ownerA
                + " 地址: " + addressA;
        String infoB = "B 租屋" + areaB + " 坪 房型 " + typeB + " 每月" + priceB + "元" + " 屋主: " + ownerB
                + " 地址: " + addressB;
        String infoC = "C 租屋" + areaC + " 坪 房型 " + typeC + " 每月" + priceC + "元" + " 屋主: " + ownerC
                + " 地址: " + addressC;

        Scanner sc = new Scanner(System.in);

        mainLoop: while (true) {
            System.out.println("歡迎使用租屋小幫手, 請選擇功能:");
            System.out.println("1. 陳列出所有出租房屋");
            System.out.println("2. 房屋出租查詢");
            System.out.println("3. 離開");

            if (sc.hasNextInt()) {
                int option = sc.nextInt();
                switch (option) {
                case 1:
                    System.out.println(infoA);
                    System.out.println(infoB);
                    System.out.println(infoC);
                    break;
                case 2:
                    System.out.println("請輸入 A or B or C");
                    String id = sc.next();

                    switch (id) {
                    case "A":
                        System.out.println(infoA);
                        break;
                    case "B":
                        System.out.println(infoB);
                        break;
                    case "C":
                        System.out.println(infoC);
                        break;
                    default:
                        System.out.println("很抱歉! 此 ID 不存在");
                        break;
                    }
                    break;
                case 3:
                    break mainLoop;
                default:
                    break;
                }
            }
            else {
                // 接收非數字 option, 可解決 token 指標向下讀取
                sc.next();
            }
        }

    }

}
