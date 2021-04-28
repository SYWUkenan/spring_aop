package cn.yswu.service.impl;

import cn.yswu.dao.IUserDao;
import cn.yswu.entity.User;
import cn.yswu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yswu
 * @date 2021-04-28 10:55
 */
@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    IUserDao userDao;


    public User select(Integer id) throws Exception {
        System.out.println("查询user");


        return userDao.select(id);
    }


    public void add(User user) throws Exception {
        System.out.println("增加user");
        userDao.add(user);
    }


    public void update(User user) throws Exception {
        System.out.println("修改user");
        userDao.update(user);
    }


    public void delete(Integer id) throws Exception {
        System.out.println("删除user");
        userDao.delete(id);
    }
}
