package Grop6;

public class Car {
    double carPrice;
    String color;

    Car(double carPrice) {
        this.carPrice = carPrice;
    }

    double calculateSalePrice() {
        return 0;
    }
}

class Sedan extends Car {
    int l;

    Sedan(double carPrice, int l) {
        super(carPrice);
        this.l = l;
    }

    double calculateSalePrice() {
        if (l > 20) {
            return (carPrice - (carPrice * 5 / 100));
        } else {
            return (carPrice - (carPrice * 10 / 100));
        }
    }
}

class Truck extends Car {
    int w;

    Truck(double carPrice, int w) {
        super(carPrice);
        this.w = w;
    }

    double calculateSalePrice() {
        if (w > 2000) {
            return (carPrice - (carPrice * 10 / 100));
        } else {
            return (carPrice - (carPrice * 20 / 100));
        }
    }
}
class CarTester{
    /* Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice() which should be returning
   a price of the car.
           Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight and has its own implementation of calculateSalePrice() method in which returned price is calculated as following: if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
   The Sedan class has field as length and also does it is own implementation of calculateSalePrice(): if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount*/
    public static void main(String[] args) {
        Car[] cars = {new Sedan(30000, 25), new Truck(50000, 2000)};
        for (Car car : cars) {
            System.out.println("the actual price " + car.carPrice + ", the discounted price is " + car.calculateSalePrice());
        }
    }
}
