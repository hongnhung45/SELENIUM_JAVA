package JAVABASIC_5;

import java.util.HashSet;
import java.util.Set;
public class JAVABASIC_5 {
    public static void main(String[] args) {
        Set<String> hashSet =new HashSet<String>();
        hashSet.add("201121521134");
        hashSet.add("Trần Thị Hồng");
        hashSet.add("Nhung");
        hashSet.add("21");
        hashSet.add("Thống kê-Tin học");
        hashSet.add("46K21.1");
        int size = hashSet.size();
        System.out.println("Số phần tử "+hashSet.size());
        for (int i=0; i<size; i++){
            System.out.println(hashSet+ ", ");
        }
        }
    }

