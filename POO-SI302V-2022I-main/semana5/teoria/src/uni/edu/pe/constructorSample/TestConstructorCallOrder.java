package uni.edu.pe.constructorSample;

class Parent{

    Parent(){
        super();
        System.out.println("Parent()...");
    }

    Parent(String mensaje){
        System.out.println("Parent()..."+mensaje);
    }
}
class Child extends Parent{
    Child(){
        super("mensaje de child");
        System.out.println("Child()...");
    }
}
public class TestConstructorCallOrder {

    public static void main(String[] args) {
        //new Parent();
        new Child();
    }

}
