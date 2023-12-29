package JAVABASIC_4;

public class VongLapAndMang {
    public static void main(String[] args) {

        //tạo mảng để lưu các số chẵn
        int Arraynumber[]=new int[26];

        //vì không phải nhập tay mà phải dùng số được in ra từ vòng lặp, nên phải tạo biến để lưu các giá trị đó
        int a=0;
        for(int i=0; i<=50; i+=2){
            Arraynumber[a] =i; //gắn giá trị cho mảng
            a++;
        };
        //chạy vòng lặp cải tiến để lấy các số trong mảng ra
        for (int number1:Arraynumber){
            System.out.println("Số đó là: "+ number1);
        };
    }
}
