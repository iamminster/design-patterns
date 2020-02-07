package io.iamminster.dp.absfactory.factory;

import io.iamminster.dp.absfactory.product.part.FrameAbs;
import io.iamminster.dp.absfactory.product.part.WheelAbs;
import io.iamminster.dp.absfactory.product.vehicle.VehicleIF;

public interface VehicleFactoryIF {
    WheelAbs createWheel();
    FrameAbs createFrame();
    VehicleIF createVehicle();
}
