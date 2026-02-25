class animal{
    void move(){
        System.out.println("this animal is moving");
    }
}
class cat extends animal{

}
class dog extends animal{

}
class bird extends animal{
    @Override
    void move(){
        System.out.println("this animal is flying");
    }
}
public class main {
    public static void main(String[] args) {
        cat cat = new cat();
        dog dog = new dog();
        bird bird = new bird();

        cat.move();
        dog.move();
        bird.move();
    }
}
