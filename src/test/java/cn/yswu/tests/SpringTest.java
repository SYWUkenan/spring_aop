package cn.yswu.tests;

import cn.yswu.entity.User;
import cn.yswu.service.IUserService;
import cn.yswu.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yswu
 * @date 2021-04-28 11:16
 */
public class SpringTest {

    @Test
    public void test1() throws Exception {
        //加载spring 上下文

        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:/spring.xml");
        //jdk代理的动态代理类
        IUserService bean = ioc.getBean(IUserService.class);

        bean.add(new User());
        System.out.println("-----------");
        bean.select(1);

        System.out.println(bean.getClass());
    }
}
