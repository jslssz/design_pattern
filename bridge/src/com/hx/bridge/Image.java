package com.hx.bridge;

/**
 * @author jxlgcmh
 * @date 2019-11-13 15:59
 * @description
 */
public abstract class Image {
    protected ImageImpl imageImpl;

    /**
     * 注入实现类接口
     * @param imageImpl
     */
    public void setImageImpl(ImageImpl imageImpl) {
        this.imageImpl = imageImpl;
    }

    public  abstract void parseFile(String filePath);
}
