package Class_Codes.OOPS_S03;

public class Singleton_Class {
    static int instance;

    private Singleton_Class(){
        //DB Connection
        instance=10;
    }

    public int getInstance(){
        if(instance==0){
            new Singleton_Class();
        }
        return instance;
    }
}
