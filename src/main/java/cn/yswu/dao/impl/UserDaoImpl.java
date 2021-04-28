package cn.yswu.dao.impl;

import cn.yswu.dao.IUserDao;
import cn.yswu.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author yswu
 * @date 2021-04-28 10:56
 */

@Repository
public class UserDaoImpl implements IUserDao {

    /**
     * 访问用户
     * @param id
     * @return
     */
    @Override
    public User select(Integer id) throws Exception {

        if(id==null) {
            throw new Exception("id不能为null");
        }
        return null;
    }

    /**
     * 增加用户
     * @param user
     * @throws Exception
     */
    @Override
    public void add(User user) throws Exception {

        if(user == null){
            throw new Exception("user不能为null");
        }

    }

    /**
     * 修改用户
     * @param user
     * @throws Exception
     */
    @Override
    public void update(User user) throws Exception {
        if(user == null){
            throw new Exception("user不能为null");
        }

    }

    /**
     * 删除用户
     * @param id
     * @throws Exception
     */
    @Override
    public void delete(Integer id) throws Exception {
        if(id==null) {
            throw new Exception("id不能为null");
        }
    }
}
