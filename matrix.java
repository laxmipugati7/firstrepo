import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int count1to50 = 0, count50to100 = 0, countAbove100 = 0;

        System.out.println("Enter matrix numbers :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("enter the value of row"+(i+1)+"col"+(j+1));

                arr[i][j] = sc.nextInt();
                if (arr[i][j] >= 1 && arr[i][j] <= 50) {
                    count1to50++;
                } else if (arr[i][j] > 50 && arr[i][j] <= 100) {
                    count50to100++;
                } else if (arr[i][j] > 100) {
                    countAbove100++;
                }
            }
        }

        System.out.println("In the above array there are " + count1to50 + " numbers between 1 to 50");
        System.out.println("In the above array there are " + count50to100 + " numbers between 50 to 100");
        System.out.println("In the above array there are " + countAbove100 + " numbers above 100");
    }
}




