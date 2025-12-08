public class sumOfArray{
public static void main(String []args){
int arr1[][] = {{2, 4, 5}, {3, 6, 5}, {7, 6, 9}};
        int arr2[][] = {{4, 6, 8}, {8, 7, 4}, {8, 7, 4}};
        int multi[][]=new int[3][3];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                multi[i][j] = arr1[i][j] * arr2[i][j];
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {

                System.out.print(multi[i][j] + "   ");

            }

            System.out.println();
        }
}
}
