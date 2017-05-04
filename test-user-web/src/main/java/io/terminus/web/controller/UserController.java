package io.terminus.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.terminus.common.response.Response;
import io.terminus.user.model.User;
import io.terminus.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

/**
 * Created by xionggao on 2017/5/4.
 */
@RestController
@RequestMapping("/api/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "hello")
    public String helloWorld (){
        return "hello world";
    }


    @RequestMapping(value = "addUser",method = RequestMethod.POST)
    public Response<Integer> addUserController (@RequestBody  String body){
        ObjectMapper mapper = new ObjectMapper();
        try{
            User user = mapper.readValue(body,User.class);
            return  userService.addUser(user);
        }catch (IOException e){
            return Response.fail("添加失败");
        }
    }

    @RequestMapping(value = "listUser",method = RequestMethod.GET)
    public Response<List<User>> listUserController (){
        return userService.listUser();
    }

    @RequestMapping(value = "delUser",method = RequestMethod.GET)
    public Response<Integer> delUserController (@RequestParam("id") String id) {
        return userService.delUser(id);
    }

    @RequestMapping(value = "updateUser",method = RequestMethod.POST)
    public Response<Integer> updateUserController (@RequestBody String body){
        ObjectMapper mapper = new ObjectMapper();
        try{
            User user = mapper.readValue(body,User.class);
            return  userService.updateUser(user);
        }catch (IOException e){
            return Response.fail("更新失败");
        }
    }











}
