import abstraction.EmailService;
import common.Book;
import encapsulation.BankAccount;
import inheritance.Car;
import polymorphism.Circle;
import polymorphism.Rectangle;

import java.awt.*;

public class Main {
    public static void main(String[] args){
        Book book=new Book("Godan","Munsi PremChand",1000);
        Book book1=new Book("Gaban","Munsi PremChand",900);

        book.read();
        book1.read();

        //encapslation testing
        BankAccount bankAccount=new BankAccount(500);

        bankAccount.deposit(100);
        bankAccount.withdraw(700);
        bankAccount.withdraw(400);

        //abstraction
        EmailService emailService=new EmailService();
        emailService.sendEmail("Manish","Code is working");

        Car myCar = new Car();
        myCar.startEngine(); // Inherited from Vehicle
        System.out.println("Doors: " + myCar.getNumberOfDoors()); // Unique to Car


        Circle myCircle = new Circle(5.0);
        Rectangle myRectangle = new polymorphism.Rectangle(4.0, 6.0);

        // Same command, different execution
        myCircle.calculateArea();
        myRectangle.calculateArea();
    }
}
