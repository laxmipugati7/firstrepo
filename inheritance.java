class parent{
    String name;
    int age;

    parent(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

}
class child extends parent{
    child(String name,int age){
        super(name,age);
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

}
class main{
    public static void main(String[] args) {
        parent p=new parent("guru",21);
        child c=new child("guru",22);
        p.display();
        System.out.println("----------------------");
        c.display();
