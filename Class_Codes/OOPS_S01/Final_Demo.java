package Class_Codes.OOPS_S01;

public class Final_Demo {
    public static void main(String[] args) {
//        Constants ob = new Constants();
//        System.out.println(ob.max);
//        Cannot assign a value to final variable 'max'
//        ob.max=324325234;

//        final Constants ob2 = new Constants();
//        System.out.println(ob2.minValue);
//        ob2.minValue=5000;
//        System.out.println(ob2.minValue);

//        ob2 = new Constants();   -> not possible

        Constants finalise;
        for(int i=0; i<1000; i++){
            finalise = new Constants();
        }

    }
}
