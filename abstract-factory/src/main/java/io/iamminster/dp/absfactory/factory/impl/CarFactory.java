package io.iamminster.dp.absfactory.factory.impl;

import io.iamminster.dp.absfactory.factory.VehicleFactoryIF;
import io.iamminster.dp.absfactory.product.part.FrameAbs;
import io.iamminster.dp.absfactory.product.part.WheelAbs;
import io.iamminster.dp.absfactory.product.part.impl.CarFrame;
import io.iamminster.dp.absfactory.product.part.impl.CarWheel;
import io.iamminster.dp.absfactory.product.vehicle.VehicleIF;
import io.iamminster.dp.absfactory.product.vehicle.impl.Car;
import io.iamminster.dp.absfactory.utils.Utils;

public class CarFactory implements VehicleFactoryIF {

    @Override
    public WheelAbs createWheel() {
        return new CarWheel(Utils.WheelType.FOUR_WHEEL);
    }

    @Override
    public FrameAbs createFrame() {
        return new CarFrame(Utils.FrameSize.BIG);
    }

    @Override
    public VehicleIF createVehicle() {
        return new Car(createWheel(), createFrame());
    }
}
