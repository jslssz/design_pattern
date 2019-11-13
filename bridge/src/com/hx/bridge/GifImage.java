package com.hx.bridge;

/**
 * @author jxlgcmh
 * @date 2019-11-13 16:02
 * @description
 */
public class GifImage extends Image {
    @Override
    public void parseFile(String filePath) {
        Matrix matrix =new Matrix();
        // super 可以不写，为了表示是调用父类的，所以显示调用
        super.imageImpl.doPaint(matrix);
        System.out.println(filePath+", 格式为.gif");
    }
}
