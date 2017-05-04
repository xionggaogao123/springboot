package io.terminus.user.dao;

import io.terminus.user.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xionggao on 2017/5/4.
 */
@Mapper
public interface UserDao  {

    public Integer addUser (User user);

    public Integer delUser (String id);

    public List<User> listUser ();

    public Integer updateUser (User user);

}
