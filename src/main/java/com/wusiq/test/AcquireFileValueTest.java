package com.wusiq.test;

import com.wusiq.configs.JavaConfig;
import com.wusiq.service.DogServcie;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Spring获取配置文件的测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaConfig.class)//方法一：javaconfig配置信息获取properties的值
//@ContextConfiguration("classpath:applicatonContext.xml")//方法二：xml配置获取properties的值
public class AcquireFileValueTest {

    @Autowired
    DogServcie ds;

    @Test
    public void doTest(){
        ds.dogDo();
    }

}
