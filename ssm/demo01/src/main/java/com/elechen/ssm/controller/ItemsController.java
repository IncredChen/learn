package com.elechen.ssm.controller;

import com.elechen.ssm.po.Items;
import com.elechen.ssm.po.ItemsCustom;
import com.elechen.ssm.po.ItemsQueryVo;
import com.elechen.ssm.service.ItemsService;
import javafx.scene.media.MediaView;
import org.apache.ibatis.scripting.xmltags.ForEachSqlNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Incredile on 2016/11/23.
 */
@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/quertList")
    public ModelAndView findItemsList() throws Exception {
        List<ItemsCustom> itemsList = itemsService.findItemsList(null);
        ModelAndView mv = new ModelAndView("items/itemsList");
        mv.addObject("itemsList", itemsList);
        return mv;
    }

    @RequestMapping("/itemInfo")
    public ModelAndView findItemById() throws Exception {
        ItemsCustom itemsCustom = itemsService.findItemById(2);

        List<ItemsCustom> itemsList = new ArrayList<ItemsCustom>();
        itemsList.add(itemsCustom);
        ModelAndView mv = new ModelAndView("items/itemsList");
        mv.addObject("itemsList", itemsList);
        return mv;
    }

    @RequestMapping("/editItems")
    public ModelAndView editItems(int id) throws Exception {
        ItemsCustom itemsCustom = itemsService.findItemById(id);
        ModelAndView mv = new ModelAndView("items/editItems");
        mv.addObject("itemsCustom", itemsCustom);
        return mv;
    }

    //@validated 校验pojo
    //BindResult bindResult 接收校验出错信息
    //多个pojo 是配对出现，位置固定
    @RequestMapping("/editItemsSubmit")
    public ModelAndView editItemsSubmit(Model model,
                                        HttpServletRequest request,
                                        HttpServletResponse response,
                                        Integer id,
                                        @Validated ItemsCustom itemsCustom , BindingResult bindingResult,
                                         MultipartFile pictureFile ) throws Exception {
        //获取校验信息
        if(bindingResult.hasErrors()){
            List<ObjectError> errors = bindingResult.getAllErrors();
            for(ObjectError o : errors){
                //得到错误信息内容
                System.out.println(o.getDefaultMessage());
            }
            //在页面将错误信息传到页面
            model.addAttribute("errors",errors);
            ModelAndView mv = new ModelAndView("items/edititems");
            return mv;
        }

        String orginalFileName = pictureFile.getOriginalFilename();

        String pic_path = "D:\\\\img_repo";

        String newFileName = UUID.randomUUID()+orginalFileName.substring(orginalFileName.lastIndexOf("."));
        File newFile = new File(pic_path+newFileName);

        pictureFile.transferTo(newFile);
        itemsCustom.setPic(newFileName);


        //参数绑定，直接在方法参数列表中添加需要的数据。
        itemsService.updateItem(id, itemsCustom);
        // ModelAndView 转到成功页面
        ModelAndView mv = new ModelAndView("success");
        return mv;
        //string 返回值 逻辑视图名
        // return "succee";
        // return "forward: ";
        // return "redirect: ";
        // void 返回值
        //实现转发
        //request.getRequestDispatcher("items/quertList.action").forward(request,response);
        //实现重定向
        //response.sendRedirect("items/quertList.action");
        //实现返回json
//        response.setCharacterEncoding("utf-8");
//        response.setContentType("application/json;charset=utf-8");
//        response.getWriter().write("json串");
    }

    //数组参数绑定 contorller 方法的返回值和form表单的name相同
    @RequestMapping("/deleteItems")
    public ModelAndView deleteItems(Integer[] items) {
        //实现删除逻辑
        ModelAndView mv = new ModelAndView("success");
        return mv;
    }

    //批量修改之查询
    @RequestMapping("editItemsQuery")
    public ModelAndView editItemsQuery() throws Exception {
        List<ItemsCustom> itemsList = itemsService.findItemsList(null);
        ModelAndView mv = new ModelAndView("items/editItemsQuery");
        mv.addObject("itemsList", itemsList);
        return mv;
    }
    //批量修改之提交修改

    @RequestMapping("editItemsSubmit1")
    public ModelAndView editItemsSubmit1(ItemsQueryVo itemsQueryVo) throws Exception {

        /**
         * 批量修改逻辑
         */
        ModelAndView mv = new ModelAndView("success");
        return mv;
    }

}
