class Car {
    private String make;
    private String model;
    private int year;
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public String displayInfo() {
        return "Make: " + make + ", Model: " + model + ", Year: " + year;
    }
}

class Book {
    private String title;
    private String author;
    private int pages;
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String displayInfo() {
        return "Title: " + title + ", Author: " + author + ", Pages: " + pages;
    }
}
public class classAndObjects {
    public static void main(String[] args) {

        Car car = new Car("Toyota", "Camry", 2020);
        Book book = new Book("How to read", "Bob Smith", 500);

        System.out.println("Car Information: " + car.displayInfo());
        System.out.println("Book Information: " + book.displayInfo());
    }
}
