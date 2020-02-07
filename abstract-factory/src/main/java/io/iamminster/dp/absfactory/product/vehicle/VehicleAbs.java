package io.iamminster.dp.absfactory.product.vehicle;

import io.iamminster.dp.absfactory.product.part.FrameAbs;
import io.iamminster.dp.absfactory.product.part.WheelAbs;

public abstract class VehicleAbs implements VehicleIF {
    private WheelAbs wheel;
    private FrameAbs frame;

    public VehicleAbs(final WheelAbs wheel, final FrameAbs frame) {
        setFrame(frame);
        setWheel(wheel);
    }

    public WheelAbs getWheel() {
        return wheel;
    }

    public void setWheel(WheelAbs wheel) {
        this.wheel = wheel;
    }

    public FrameAbs getFrame() {
        return frame;
    }

    public void setFrame(FrameAbs frame) {
        this.frame = frame;
    }

    @Override
    public void printDescription() {
        getFrame().printDesc();
        getWheel().printDesc();
    }

}
