package com.elechen.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * Created  with Intellij IDEA.
 * User: EleChen
 * Date: 17/5/7
 * Time: 18:59
 * Description: 描述.
 */
@Entity
public class Gladys {

    @Id //主键
    @GeneratedValue  //自增
    private Integer id;
    private String name;

    @Min(value = 18, message = "太小了... 你！")
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Gladys{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
