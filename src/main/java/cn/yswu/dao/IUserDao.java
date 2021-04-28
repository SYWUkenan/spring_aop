package cn.yswu.dao;

import cn.yswu.entity.User;

/**
 * @author yswu
 * @date 2021-04-28 10:55
 */
public interface IUserDao {

    User select(Integer id) throws Exception;
    void add(User user) throws Exception;
    void update(User user) throws Exception;
    void delete(Integer id) throws Exception;
}
