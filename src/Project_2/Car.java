package Project_2;

public abstract class Car {

/*
3. Create a Class Car that would have the
    following fields: carPrice and color and method
    calculateSalePrice() which should be returning
    a price of the car.
            Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight and has its own
            implementation of calculateSalePrice() method in which returned price is calculated as
    following: if weight>2000 then returned price car should include 10% discount, otherwise 20%  discount.
    The Sedan class has field as length and also-does it its own implementation of calculateSalePrice(): if length of sedan is >20
    feet then returned car price should include 5% discount, otherwise 10% discount

 */

    /*double carPrice;
    String color;

    abstract double calculateSalesPrice();

    Car(double carPrice) {
        this.carPrice = carPrice;

    }

    class Sedan extends Car {
        double length;

        Sedan(double carPrice, double length) {
            super(carPrice);
            this.length = length;
        }

        @Override
        double calculateSalesPrice() {
            if (length > 20) {
                return carPrice * 0.95;
            } else {
                return carPrice * 0.9;
            }
        }

     class Truck extends Car {
            double weight;

            Truck(double carPrice, double weight) {
                super(carPrice);
                this.weight = weight;
            }

            @Override
            double calculateSalesPrice() {
                if (weight > 2000) {
                    return carPrice * 0.9;
                } else {
                    return carPrice * 0.8;
                }
            }





     */


        double carPrice;
        String color;
        abstract double calculateSalePrice();
        Car(double carPrice){
            this.carPrice=carPrice;
        }
    }
    class Sedan extends Car{
        double length;

        Sedan(double carPrice,double length) {
            super(carPrice);
            this.length=length;
        }
        @Override
        double calculateSalePrice() {
            if(length>20){return carPrice*0.95;}
            else{return carPrice*0.9;}
        }
    }
    class Truck extends Car{
        double weight;
        Truck(double carPrice,double weight) {
            super(carPrice);
            this.weight=weight;
        }

        @Override
        double calculateSalePrice() {
            if(weight>2000){return carPrice*0.9;}
            else {return carPrice*0.8;}
        }
    }
    class CarTester{
        public static void main(String[] args) {
            Car[]cars={new Sedan(55000,16),new Truck(77000,2200)};
            for(Car car:cars){
                System.out.println(car.getClass().getSimpleName() + " SalePrice");
                System.out.println(car.calculateSalePrice());
            }
        }
    }
















































