package io.terminus.user.service;

import io.terminus.common.response.Response;
import io.terminus.user.model.User;
import java.util.List;

/**
 * Created by xionggao on 2017/5/4.
 */
public interface UserService {

    Response<Integer> addUser (User user);

    Response<Integer> delUser (String id);

    Response<List<User>> listUser ();

    Response<Integer> updateUser(User user);
}
