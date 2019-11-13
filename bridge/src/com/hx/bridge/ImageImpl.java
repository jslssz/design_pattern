package com.hx.bridge;

/**
 * @author jxlgcmh
 * @date 2019-11-13 15:51
 * Description 抽象操作系统实现类，充当实现类的接口
 */
public interface ImageImpl {
    /**
     *  显示像素矩阵
     * @param matrix
     */
    void doPaint(Matrix matrix);
}
