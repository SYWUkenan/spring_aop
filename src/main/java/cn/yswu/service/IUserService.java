package cn.yswu.service;

import cn.yswu.entity.User;

/**
 * @author yswu
 * @date 2021-04-28 10:54
 */
public interface IUserService {

    User select(Integer id) throws Exception;
    void add(User user) throws Exception;
    void update(User user) throws Exception;
    void delete(Integer id) throws Exception;
}
