package com.elechen.service;

import com.elechen.domain.Gladys;
import com.elechen.enums.ResultEnum;
import com.elechen.exception.GladysException;
import com.elechen.repository.GladysRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * Created  with Intellij IDEA.
 * User: EleChen
 * Date: 17/5/7
 * Time: 20:45
 * Description: 描述.
 */
@Service
public class GladysService {

    @Resource
    private GladysRepository gladysRepository;

    @Transactional
    public void insertTwo(){
        Gladys gladys = new Gladys();
        gladys.setAge(23);
        gladys.setName("zcc");
        gladysRepository.save(gladys);

        Gladys gladys2 = new Gladys();
        gladys2.setAge(21);
        gladys2.setName("wf");
        gladysRepository.save(gladys2);
    }

    public void getAge(Integer id) throws Exception{
        Gladys gladys =  gladysRepository.findOne(id);
        Integer age = gladys.getAge();
        if (age<=10){
            throw new GladysException(ResultEnum.PRIMARY_SCHOOL);
        }else if(age>10 && age<15){
            throw new GladysException(ResultEnum.MIDDLE_SCHOOL);
        }

        //其他业务逻辑。。。
    }

}
