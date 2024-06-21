package Class_Codes.OOPS_S01;

public class Objects_Demo {
    public static void main(String[] args) {
        Car c1 = new Car();
//        System.out.println(c1.colour);
//        System.out.println(c1.price);
        c1.price = 1000000;
        c1.colour = "red";
        System.out.println(c1.colour);
        System.out.println(c1.price);

        Car c2 = new Car();
        c2.colour="bule";
        c2.price = 123453454;
        System.out.println(c2.colour);
        System.out.println(c2.price);
        //method calling with the help of ref variable
        c1.display();
        c2.display();

        Car c3 = new Car();
        c3.display();
    }
}
