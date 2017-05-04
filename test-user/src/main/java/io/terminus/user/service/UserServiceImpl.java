package io.terminus.user.service;

import io.terminus.common.enums.ErrorEnums;
import io.terminus.common.response.Response;
import io.terminus.user.dao.UserDao;
import io.terminus.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xionggao on 2017/5/4.
 */
@Service
public class UserServiceImpl implements UserService{

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public Response<Integer> addUser (User user){
        if(user == null){
            return Response.fail(ErrorEnums.PARAM_ERROR.value());
        }
        Integer flag = userDao.addUser(user);
        if(flag<0){
            return Response.fail(ErrorEnums.ADD_FAIL.value());
        }
        return Response.ok(flag);
    }

    @Override
    public Response<Integer> delUser (String id){
        if(id == null){
            return Response.fail(ErrorEnums.PARAM_ERROR.value());
        }
        Integer flag = userDao.delUser(id);
        if(flag<0){
            return Response.fail(ErrorEnums.DEL_FAIL.value());
        }
        return Response.ok(flag);
    }

    @Override
    public Response<List<User>> listUser (){
        List<User>list = userDao.listUser();
        if(list.size()==0){
            return Response.ok(null);
        }
        return Response.ok(list);
    }

    @Override
    public Response<Integer> updateUser(User user){
        if(user == null){
            return Response.fail(ErrorEnums.UPDATE_FAIL.value());
        }
        Integer flag = userDao.updateUser(user);
        if(flag<0){
            return Response.fail(ErrorEnums.UPDATE_FAIL.value());
        }
        return Response.ok(flag);
    }
}
