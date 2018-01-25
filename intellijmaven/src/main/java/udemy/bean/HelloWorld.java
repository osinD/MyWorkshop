package udemy.bean;

public class HelloWorld {

    public HelloWorld(){

    }

    public HelloWorld(String message){
        this.message = message;
    }

    private  String message;

    public void getMessage() {
        System.out.print("Hello osin");
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
