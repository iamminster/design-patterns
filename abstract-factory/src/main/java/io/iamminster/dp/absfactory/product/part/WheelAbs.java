package io.iamminster.dp.absfactory.product.part;

import io.iamminster.dp.absfactory.utils.Utils;

public abstract class WheelAbs implements PartIF {
    private Utils.WheelType type;

    public WheelAbs(final Utils.WheelType type) {
        setType(type);
    }

    public Utils.WheelType getType() {
        return type;
    }

    public void setType(Utils.WheelType type) {
        this.type = type;
    }

    @Override
    public void printDesc() {
        System.out.println("wheel type " + getType());
    }
}
