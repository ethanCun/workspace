package com.czy.app.bis.mine.controller;

import com.czy.app.bis.mine.entity.User;
import com.czy.app.bis.mine.service.UserService;
import com.czy.common.base.BaseController;
import com.czy.common.base.resp.BaseRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public BaseRep add(@RequestBody User user, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return BaseRep.fail(bindingResult.getAllErrors().stream()
                    .map(ObjectError::getObjectName)
                    .collect(Collectors.joining(",")), null);
        }
        return this.userService.add(user);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public BaseRep list() {
        return this.userService.list();
    }

    @RequestMapping(value = "/del", method = RequestMethod.POST)
    public BaseRep del(Integer id) {
        return this.userService.del(id);
    }
}