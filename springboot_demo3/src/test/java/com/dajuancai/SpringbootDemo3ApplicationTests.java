package com.dajuancai;

import com.dajuancai.Control.HelloControl;
import com.dajuancai.pojo.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Method;

//@RunWith(SpringJUnit4ClassRunner.class) // spring 测试环境
@RunWith(SpringRunner.class)  // spring boot 测试环境
@SpringBootTest  // 标记为 springboot的test 类 加载项目的 ApplicationContext 上下文环境
class SpringbootDemo3ApplicationTests {

    /*
    * 调用 control 的 hello 方法
    *
    * */

    @Autowired
    private HelloControl helloControl;
    
    @Autowired
    private Person person;
    @Test
    void contextLoads() throws NoSuchMethodException {
//        Class<? extends HelloControl> aClass = helloControl.getClass();
//        Method hello = aClass.getMethod("hello");
//        String hello = helloControl.hello();
//        System.out.println(hello);
        System.out.println(person);

    }


}
