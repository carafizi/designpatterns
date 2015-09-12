package tutorialspoint.singleton;

public class SingleObject {

    private static SingleObject instance;

    private SingleObject(){}

    //Get the only object available
    public static synchronized SingleObject getInstance(){
        if(instance == null) {
            instance =  new SingleObject();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}