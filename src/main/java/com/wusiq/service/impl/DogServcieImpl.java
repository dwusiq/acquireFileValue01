package com.wusiq.service.impl;

import com.wusiq.service.DogServcie;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 用一个狗子的例子，实现从properties配置文件获取值的功能
 */
@Component
public class DogServcieImpl implements DogServcie{
    @Value("${dog.name}")
    private String dogName;

    @Override
    public void dogDo() {
        System.out.println(dogName + " go to school and stardy!");
    }
}
