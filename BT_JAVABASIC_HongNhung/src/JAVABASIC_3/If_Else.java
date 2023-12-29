package JAVABASIC_3;

public class If_Else {
    int number = 100;

    public int Checknumber(int n) {
        if (n == number) {
            System.out.println("n bằng number");
        } else if (n < number) {
            System.out.println("n bé hơn number");
        } else {
            System.out.println("n lớn hơn number");
        }
        return n;
    }
    public static void main(String[] args) {
        If_Else object1 = new If_Else();
        object1.Checknumber(300);
    }
}
