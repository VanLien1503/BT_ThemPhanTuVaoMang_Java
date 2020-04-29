package BT_ThemPhanTuVaoMang_Java;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
//        int[]array=new int[10];
        int[]array={1,2,3,4,5,6,0,0,0,0};  // khai báo và gán luôn giá trị cho các phần tử
        System.out.println(Arrays.toString(array));
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập Phần Tử Muốn Thêm Vào Mảng");
        int number=scanner.nextInt();
        System.out.println("Nhập vị trí Muốn thêm Vào Mảng");
        int index=scanner.nextInt();
        while (index>array.length-1){
            System.out.println("không thể thêm Phần tử : "+number+" vào Vị Trí " + index);
            System.out.println("Thêm Phần Tử từ 0 đến "+(array.length-1));
            index=scanner.nextInt();
        }
        for (int i=index;i<array.length-1;i++) {
           int temp = array[i];
            array[i]=number;
//            array[i+1]=temp;
            number=temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
