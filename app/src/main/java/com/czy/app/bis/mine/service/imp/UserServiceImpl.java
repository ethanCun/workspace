package com.czy.app.bis.mine.service.imp;

import com.czy.app.bis.mine.entity.User;
import com.czy.app.bis.mine.mapper.UserMapper;
import com.czy.app.bis.mine.service.UserService;
import com.czy.common.base.resp.BaseRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public BaseRep add(User user) {
        if (this.userMapper.insert(user) <= 0) {
            return BaseRep.fail();
        }
        return BaseRep.success();
    }

    @Override
    public BaseRep del(Integer id) {
        if (this.userMapper.deleteById(id) <= 0) {
            return BaseRep.fail();
        }
        return BaseRep.success();
    }

    @Override
    public BaseRep list() {
        return BaseRep.success(this.userMapper.selectList(null));
    }

}
