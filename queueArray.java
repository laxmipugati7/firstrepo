import java.util.Scanner;

 class queueArray {
    int queue[];
    int front,rear,size;

    queueArray(int size) {
        this.size = size;
        queue = new int[size];
        front = 0;
        rear = -1;
    }
    void insert(int value){
        if(rear==size-1) {
            System.out.println("queue is full");
        }
        else{
            rear++;
            queue[rear]=value;
            System.out.println("inserted");
        }
    }
    void delete(){
        if(front>rear) {
            System.out.println("queue is empty");
        }
        else{
            System.out.println("deleted");
            front++;
        }
    }
    void display(){
        if(front>rear) {
            System.out.println("queue is empty");
        }
        else{
            System.out.println("queue elements:");
            for(int i=front;i<=rear;i++) {
                System.out.print(queue[i]+" ");
            }
            System.out.println();

        }
    }
}
class queueDemo{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.println("enter the size of the array");
         int size = sc.nextInt();

         queueArray obj = new queueArray(size);

         while(true){
             System.out.println("1.insert");
             System.out.println("2.delete");
             System.out.println("3.display");
             System.out.println("4.exit");

             System.out.println("Enter your choice");
             int choice = sc.nextInt();
             switch(choice){
                 case 1:
                     System.out.print("Enter element to insert: ");
                     int value = sc.nextInt();
                     obj.insert(value);
                     break;

                 case 2:
                     obj.delete();
                     break;

                 case 3:
                     obj.display();
                     break;

                 case 4:
                     System.out.println("Exiting...");
                     sc.close();
                     return;

                 default:
                     System.out.println("Invalid choice");
             }
         }
     }
}
