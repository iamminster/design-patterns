package io.iamminster.dp.absfactory.product.vehicle.impl;

import io.iamminster.dp.absfactory.product.part.FrameAbs;
import io.iamminster.dp.absfactory.product.part.WheelAbs;
import io.iamminster.dp.absfactory.product.vehicle.VehicleAbs;

public class Bicycle extends VehicleAbs {
    public Bicycle(WheelAbs wheel, FrameAbs frame) {
        super(wheel, frame);
    }

    @Override
    public void printDescription() {
        System.out.println("Bicycle info:");
        super.printDescription();
    }
}
