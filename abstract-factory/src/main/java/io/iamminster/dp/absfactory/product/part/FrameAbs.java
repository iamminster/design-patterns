package io.iamminster.dp.absfactory.product.part;

import io.iamminster.dp.absfactory.utils.Utils;

public abstract class FrameAbs implements PartIF {
    private Utils.FrameSize size;

    public FrameAbs(final Utils.FrameSize size) {
        setSize(size);
    }

    @Override
    public void printDesc() {
        System.out.println("frame size " + getSize());
    }

    public Utils.FrameSize getSize() {
        return size;
    }

    public void setSize(Utils.FrameSize size) {
        this.size = size;
    }
}
