package Class_Codes.OOPS_S01;
class A{
    String name = "Prashant";
    //name = "Prashant" is a global variable
    void print(String name){
        //here string name is local variable
        System.out.println(this.name);
    }
}
public class Global_Local {
    public static void main(String[] args) {
        A a = new A();
        a.print("njsndc");
    }
}
