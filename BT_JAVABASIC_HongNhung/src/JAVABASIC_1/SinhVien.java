package JAVABASIC_1;

public class SinhVien {
    public String CCCD; //biến instance, muốn in trong hàm main thì phải tạo 1 hàm khác để gọi biến và in
    public static String Gender="Nữ"; //biến static

    public String ShowInf() {
        String Name = "Hồng Nhung"; //biến local
        System.out.println(CCCD); //biến instance vẫn gọi được ở những hàm khác
        return Name;
    }
    public void setInf(String CCCD) {
        this.CCCD = CCCD;
        System.out.println(CCCD);
    }
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();

        sv.setInf("900");
        System.out.println("Giới tính:"+Gender);
        System.out.println("Nghề nghiệp:"+ ThongTin.Job);
        System.out.println("Địa chỉ:" + ThongTin.Address);
    }


    };

