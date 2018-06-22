package com.hr.controller;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

/**
 * @Author:HuRan
 * @Description:
 * @Date: Created in 18:17 2018/6/22
 * @Modified By:
 */
@RestController
@RequestMapping("/demo")
public class UserController {
    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
    @ApiImplicitParams({@ApiImplicitParam(dataType = "java.lang.Long", name = "id", value = "id", required = true, paramType = "path"),
            @ApiImplicitParam(dataType = "User", name = "user", value = "用户信息", required = true)
    })
    @ApiResponses({@ApiResponse(code = 500, message = "接口异常")})
    @ResponseBody
    @RequestMapping(value = "/user/{id}", method = RequestMethod.POST)
    public User insert(@PathVariable Long id, User user) {
        System.out.println("id：" + id + ",user:" + user);
        return user;
    }
}
