package io.iamminster.dp.absfactory.factory;

import io.iamminster.dp.absfactory.factory.impl.BicycleFactory;
import io.iamminster.dp.absfactory.factory.impl.CarFactory;
import io.iamminster.dp.absfactory.utils.Utils.VehicleType;

import java.util.Objects;

public class FactoryMaker {

    private static CarFactory carFactory;
    private static BicycleFactory bicycleFactory;

    static {
        carFactory = null;
        bicycleFactory = null;
    }

    public static VehicleFactoryIF makeFactory(VehicleType type) {
        switch (type) {
            case CAR:
            default:
                if (Objects.isNull(carFactory)) {
                    System.out.println("Initialize car factory");
                    carFactory = new CarFactory();
                }
                return carFactory;
            case BICYCLE:
                if (Objects.isNull(bicycleFactory)) {
                    System.out.println("Initialize bicycle factory");
                    bicycleFactory = new BicycleFactory();
                }
                return bicycleFactory;
        }

    }
}
