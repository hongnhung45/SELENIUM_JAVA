package JAVABASIC_2;

public class Bai2Calculator {
    //Tạo hàm tính tổng 2 số nguyên
    public int tong2SoNguyen(int a,int b){
        return a+b;
    }

    //Tạo hàm tính tích 2 số thực
    public double tich2SoThuc(double a, double b){
        return a*b;
    }

    public static void main(String[] args) {
        Bai2Calculator object1 =new Bai2Calculator();
        System.out.println("Tổng 2 số nguyên là: "+ object1.tong2SoNguyen(4,5));
        System.out.println("Tích 2 số thực là: "+ object1.tich2SoThuc(8.9,9.5));

    }
}
