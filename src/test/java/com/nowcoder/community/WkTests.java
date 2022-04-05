package com.nowcoder.community;

import java.io.IOException;

public class WkTests {

    public static void main(String[] args) {
        String cmd = "/usr/local/bin/wkhtmltoimage --quality 75 www.baidu.com /Users/tex/Developer/data/wk-images/3.png";
        try {
            Process process = Runtime.getRuntime().exec(cmd);
            try {
                if (process.waitFor() == 0) {
                    // ...
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("ok.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
