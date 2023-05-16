package classPractice;

public class Main {
    public static void main(String[] args) {
        Car toyota=new Toyota("Toyota camry","black",320);
        toyota.brake();
        toyota.gas();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Car lamborgini=new Lamborgini("A200","orange",400);
        lamborgini.brake();
        lamborgini.gas();
    }
}
