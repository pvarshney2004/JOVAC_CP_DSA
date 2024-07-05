package Class_Codes.OOPS_S03;

public class Child extends Parent{
    int c=50;
    int d=60;
    int e=70;
    public void printAddition(){
        System.out.println(c+d+e);
    }
    public void print(){
        System.out.println("In child");
    }

    public static void main(String[] args) {
        Parent ob = new Child();
//        System.out.println(((Child)ob).d);
//        ob.print();
//        System.out.println(ob.c);
//        System.out.println(ob.a);
//        System.out.println(ob.b);
        ((Child)ob).printAddition();

    }
}
