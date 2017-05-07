package com.elechen.repository;

import com.elechen.domain.Gladys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created  with Intellij IDEA.
 * User: EleChen
 * Date: 17/5/7
 * Time: 19:04
 * Description: jpa操作.
 */
@Component
public interface GladysRepository extends JpaRepository<Gladys, Integer> {

    //自定义方法（遵守规则）
    public List<Gladys> findByAge(Integer age);
}
