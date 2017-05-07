package com.elechen.controller;

import com.elechen.aspect.HttpAspect;
import com.elechen.domain.Gladys;
import com.elechen.domain.Result;
import com.elechen.repository.GladysRepository;
import com.elechen.service.GladysService;
import com.elechen.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * Created  with Intellij IDEA.
 * User: EleChen
 * Date: 17/5/7
 * Time: 19:06
 * Description: 描述.
 */
@RestController
public class GladysController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HttpAspect.class);

    @Resource
    private GladysRepository gladysRepository;

    @Resource
    private GladysService gladysService;

    /**
     * 查询所有
     *
     * @return List<Gladys>
     */
    @GetMapping(value = "/gladys")
    public List<Gladys> gladysList() {
        return gladysRepository.findAll();
    }

    /**
     * 添加
     *
     * @return Gladys
     */
    @PostMapping(value = "/gladys")
    public Result gladysAdd(@Valid Gladys gladys, BindingResult bindingResult) {
        //校验结果判断
        if (bindingResult.hasErrors()) {
            LOGGER.error(bindingResult.getFieldError().getDefaultMessage());
            return ResultUtil.error(101,"年龄不满18");
        }
        LOGGER.info("添加.....");

        return ResultUtil.success(gladysRepository.save(gladys));
    }

    @PutMapping(value = "/gladys/{id}")
    public Gladys updateGladys(@PathVariable("id") Integer id,
                               @RequestParam("name") String name,
                               @RequestParam("age") Integer age) {

        Gladys gladys = new Gladys();
        gladys.setId(id);
        gladys.setName(name);
        gladys.setAge(age);
        return gladysRepository.save(gladys);
    }

    /**
     * 查询一个
     *
     * @param id id
     * @return Gladys
     */
    @GetMapping(value = "/gladys/{id}")
    public Gladys findOneGladys(@PathVariable("id") Integer id) {
        return gladysRepository.findOne(id);
    }

    /**
     * 通过年龄查询 自定义查找
     *
     * @param age 年龄
     * @return List<Gladys>
     */
    @GetMapping(value = "/gladys/age/{age}")
    public List<Gladys> findGladys(@PathVariable("age") Integer age) {
        return gladysRepository.findByAge(age);
    }

    /**
     * 添加两个
     */
    @PostMapping(value = "/gladys/two")
    public void insertTwo() {
        gladysService.insertTwo();
    }

    @GetMapping(value = "/gladys/getAge/{id}")
    public void getAge(@PathVariable("id") Integer id) throws Exception{
        gladysService.getAge(id);
    }
}
