package com.elected.struts2;

import com.sun.org.apache.bcel.internal.generic.RET;

import java.io.*;

/**
 * Created by Incredile on 2016/11/4.
 */
public class MyFileUpLoad {
    private File up;
    private String upFileName;
    private String upContextType;

    public void setUp(File up) {
        this.up = up;
    }

    public void setUpFileName(String upFileName) {
        this.upFileName = upFileName;
    }

    public void setUpContextType(String upContextType) {
        this.upContextType = upContextType;
    }

    public String upload() throws Exception {
        String s = "D:/web/upload/" + upFileName;
        FileOutputStream fos = new FileOutputStream(s);
        FileInputStream fis = new FileInputStream(up);
        int t;
        while ((t=fis.read())!=-1){
            fos.write(t);
        }
        fos.close();
        fis.close();
    return "success";
    }

}
