package com.hx.bridge;

/**
 * @author jxlgcmh
 * @date 2019-11-13 15:57
 * @description
 */
public class LinuxImpl implements ImageImpl {
    @Override
    public void doPaint(Matrix matrix) {
        System.out.println("在Linux操作系统中显示图片");
    }
}
