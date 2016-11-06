package com.elected.struts3;

import com.opensymphony.xwork2.ActionContext;

import javax.servlet.ServletContext;
import javax.sound.midi.Soundbank;
import java.io.File;
import java.util.Map;

/**
 * Created by Incredile on 2016/11/5.
 */
public class FileUpLoad {
    private String upFileName;
    private File up;

    public void setUpFileName(String upFileName) {
        this.upFileName = upFileName;
    }

    public void setUp(File up) {
        this.up = up;
    }

    public String fileUpload(){
        ActionContext actionContext = ActionContext.getContext();
        //actionContext.get



        return "success";
    }
}
