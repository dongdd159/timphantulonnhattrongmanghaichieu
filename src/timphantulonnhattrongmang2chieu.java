import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class timphantulonnhattrongmang2chieu {
    public static void main(String[] args) {
        int[][] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row:");
        int n = scanner.nextInt();
        System.out.print("Enter column:");
        int m = scanner.nextInt();
        array = new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0; j<m;j++){
                System.out.println("array[" + i + "][" + j + "] = " + ":");
                array[i][j]=scanner.nextInt();
            }
        }
        System.out.println("phần tử lớn nhất là " + findmax(array));
    }
    public static int findmax(int[][] arr){
        int max = arr[0][0];
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
}
