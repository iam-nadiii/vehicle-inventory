package com.pluralsight;

import java.util.Scanner;

public class App {
    static Vehicle[] vehicleList = new Vehicle[20];
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        vehicleList[0] = new Vehicle(101121, "Ford Explorer", "Red"
                , 45000, 13500);
        vehicleList[1] = new Vehicle(101122, "Toyota Camry", "Blue",
                60000, 11000);
        vehicleList[2] = new Vehicle(101123, "Chevrolet Malibu", "Black",
                50000, 9700);
        vehicleList[3] = new Vehicle(101124, "Honda Civic", "White",
                70000, 7500);
        vehicleList[4] = new Vehicle(101125, "Subaru Outback", "Green",
                55000, 14500);
        vehicleList[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow",
                30000, 16000);

        int counter = 0;

        for (Vehicle vehicle : vehicleList) {
            if (vehicle != null) {
                counter += 1;
            }

        }
        System.out.println(counter);

        boolean isCodeRunning = true;

        do {

            System.out.println("What do you want to do?");
            System.out.println(" 1 - List all vehicles");
            System.out.println(" 2 - Search by make/model");
            System.out.println(" 3 - Search by price range");
            System.out.println(" 4 - Search by color");
            System.out.println(" 5 - Add a vehicle");
            System.out.println(" 6 - Quit");
            System.out.println("Enter your command: ");
            int command = input.nextInt();
            switch (command) {
                case 1:
                    listAllVehicles(vehicleList);
                    break;
                case 2:


                    System.out.println("Enter the make and model of the vehicle: ");
                    String makeModel = input.nextLine();
                    System.out.println(findVehicleByMakeModel(makeModel));
                    break;
                case 3:
                    System.out.println("Enter the price: ");
                    float price = input.nextFloat();
                    System.out.println(findVehicleByPrice(price));
                    break;
                case 4:
                    System.out.println("Enter the color of the vehicle: ");
                    String color = input.next();
                    input.nextLine();
                    System.out.println(findVehicleByColorl(color));
                    break;
                case 5:
                    System.out.println(addAVehicle());
                    break;
                case 6:
                    System.out.println("Thanks for using our services!");
                    System.out.println("System exiting now.");
                    isCodeRunning = false;
                    return;

            }
        } while (isCodeRunning) ;



    }

    public static void listAllVehicles(Vehicle[] vehicleList){
        for(Vehicle car: vehicleList){
            if(car != null){
                System.out.println("[Model: " + car.getMakeModel()+ ", Color: " + car.getColor()
                + ", Price: $" + car.getPrice() + ", Vehicle ID: " + car.getVehicleId()+
                        ", Odometer Reading: " + car.getOdometerReading()+"]");
                System.out.println();

            }

        }
    }

    public static String findVehicleByMakeModel(String carMakeModel){
        for(Vehicle vehicle: vehicleList){
            if(vehicle.getMakeModel().equals(carMakeModel)){
                return "[Model: " + vehicle.getMakeModel()+ ", Color: " + vehicle.getColor()
                        + ", Price: $" + vehicle.getPrice() + ", Vehicle ID: " + vehicle.getVehicleId()+
                        ", Odometer Reading: " + vehicle.getOdometerReading()+"]";


            }
        }
        return ("Unfortunately we do not have that make and model at the moment.");
    }

    public static String findVehicleByColorl(String color){
        for(Vehicle vehicle: vehicleList){
            if(vehicle.getColor().equals(color)){
                return "[Model: " + vehicle.getMakeModel()+ ", Color: " + vehicle.getColor()
                        + ", Price: $" + vehicle.getPrice() + ", Vehicle ID: " + vehicle.getVehicleId()+
                        ", Odometer Reading: " + vehicle.getOdometerReading()+"]";


            }
        }
        return ("Unfortunately we do not have a vehicle with such color.");
    }

    public static String findVehicleByPrice(float price){
        for(Vehicle vehicle: vehicleList){
            if(vehicle.getPrice() == price){
                return "[Model: " + vehicle.getMakeModel()+ ", Color: " + vehicle.getColor()
                        + ", Price: $" + vehicle.getPrice() + ", Vehicle ID: " + vehicle.getVehicleId()+
                        ", Odometer Reading: " + vehicle.getOdometerReading()+"]";


            }
        }
        return ("Unfortunately we do not have a vehicle with such price.");
    }


    public static String addAVehicle(){
        for(int i = 0; i < vehicleList.length; i++) {
            if (vehicleList[i] == null) {
                System.out.print("Enter car make and model: ");
                String makeModel = input.next();
                input.nextLine();

                System.out.print("Enter car color: ");
                String color = input.next();
                input.nextLine();

                System.out.print("Enter odometer reading: ");
                int odometerReading = input.nextInt();

                System.out.print("Enter vehicle price: ");
                float price = input.nextFloat();

                System.out.print("Enter vehicle ID: ");
                long vehicleId = input.nextLong();

                vehicleList[i] = new Vehicle(vehicleId, makeModel, color, odometerReading, price);
                return "Vehicle Added";


            }



        }
        return "Unfortunately, our dealership is at full capacity at the moment";


    }


}




