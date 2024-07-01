package com.haruns.Degiskenler;

public class TipDonusumleriOrnek {
    public static void main(String[] args) {
        byte b;
        int i = 257, a, c, y;
        double d = 323.142;
        String x = "12345";
        System.out.println("int >> byte dönüşümü");
        b = (byte) i;
        System.out.println("i= " + i + " b = " + b);
        System.out.println("double >> int dönüşümü");
        i = (int) d;
        System.out.println("d = " + d + " b = " + i);
        System.out.println("double >> byte dönüşümü");
        b = (byte) d;
        System.out.println("d = " + d + " b = " + b);
        double sqrt = Math.sqrt((5 * 5 - 4 * 4));

        // String'den integer'a dönüştürme
        a = Integer.parseInt(x);
        System.out.println(a);
        c = a + i;
        System.out.println(c);
        // 1-50 arası rastgele sayı üretimi
        y = (int) (Math.random() * 50) + 1;
        System.out.println(y);


    }
}
