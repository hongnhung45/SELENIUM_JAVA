package BT_JAVAOOP1;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien name = new NhanVien();
        name.getName();
        System.out.println("Tên là: "+name.getName());
        NhanVien age =new NhanVien();
        System.out.println("Tuổi là: "+age.getAge());


    }
}
