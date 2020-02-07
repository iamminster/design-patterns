package io.iamminster.dp.absfactory;

import io.iamminster.dp.absfactory.utils.Utils;
import io.iamminster.dp.absfactory.factory.FactoryMaker;

public class Main {


    public static void main(String[] args) {
        // write your code here
        var carFactory = FactoryMaker.makeFactory(Utils.VehicleType.CAR);
        var bicycleFactory = FactoryMaker.makeFactory(Utils.VehicleType.BICYCLE);

//        var carFrame = carFactory.createFrame();
//        var carWheel = carFactory.createWheel();
//        var myCar = new Car(carWheel, carFrame);

//        var bicycleFrame = bicycleFactory.createFrame();
//        var bicycleWheel = bicycleFactory.createWheel();
//        var myBicycle = new Bicycle(bicycleWheel, bicycleFrame);
        for (int i = 0; i < 5; ++i) {
            var myCar = carFactory.createVehicle();
            var myBicycle = bicycleFactory.createVehicle();

            myCar.printDescription();
            myBicycle.printDescription();
            System.out.println();
        }

    }
}
