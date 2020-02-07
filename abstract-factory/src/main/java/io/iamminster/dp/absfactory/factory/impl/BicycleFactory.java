package io.iamminster.dp.absfactory.factory.impl;

import io.iamminster.dp.absfactory.factory.VehicleFactoryIF;
import io.iamminster.dp.absfactory.product.part.WheelAbs;
import io.iamminster.dp.absfactory.product.part.FrameAbs;
import io.iamminster.dp.absfactory.product.vehicle.VehicleIF;
import io.iamminster.dp.absfactory.product.vehicle.impl.Bicycle;
import io.iamminster.dp.absfactory.product.part.impl.BicycleWheel;
import io.iamminster.dp.absfactory.product.part.impl.BicycleFrame;
import io.iamminster.dp.absfactory.utils.Utils;

public class BicycleFactory implements VehicleFactoryIF {
    @Override
    public WheelAbs createWheel() {
        return new BicycleWheel(Utils.WheelType.TWO_WHEEL);
    }

    @Override
    public FrameAbs createFrame() {
        return new BicycleFrame(Utils.FrameSize.SMALL);
    }

    @Override
    public VehicleIF createVehicle() {
        return new Bicycle(createWheel(), createFrame());
    }
}
