public class arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][3];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("enter rows" + (i + 1) + "and cols" + (j + 1));
                arr[i][j] = sc.nextInt();
            }
        }
}
}
