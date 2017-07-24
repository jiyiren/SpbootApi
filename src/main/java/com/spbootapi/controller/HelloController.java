package com.spbootapi.controller;

import com.spbootapi.entity.User;
import com.spbootapi.model.ResultDataMode;
import com.spbootapi.model.ResultMode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author yiji
 * @version v1.0.0
 * @date 2017/7/24 下午3:12
 * @Description
 */

@Api("测试控制类")
@RestController
public class HelloController {


    /**
     * Hello World
     * @return
     */
    @GetMapping("/")
    public String index(){
        return "Hello World!";
    }

    /**
     * 测试Swagger API接口样式
     * @param id
     * @return
     */
    @ApiOperation(value="根据用户id获取用户信息", notes="notes")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long",paramType = "path")
    @GetMapping("/user/{id}")
    public ResultDataMode<User> getUser(@PathVariable("id") long id){
        ResultDataMode<User> resultDataMode=new ResultDataMode<>();
        resultDataMode.setResultCode(ResultMode.SUCCESS_CODE);
        resultDataMode.setMsg("SUCCESS");
        User user=new User();
        user.setId(id);
        user.setUserName("张三");
        user.setPassword("123456");
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        resultDataMode.setData(user);
        return resultDataMode;
    }

//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long"),
//            @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
//    })


}
