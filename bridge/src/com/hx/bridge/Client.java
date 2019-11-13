package com.hx.bridge;

/**
 * @author jxlgcmh
 * @date 2019-11-13 16:05
 * @description
 */
public class Client {
    public static void main(String[] args) {
        Image image =new JpgImage();
        ImageImpl imageImpl =new WindowsImpl();
        image.setImageImpl(imageImpl);
        image.parseFile("www.baidu.com");
    }
}
