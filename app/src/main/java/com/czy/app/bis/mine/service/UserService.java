package com.czy.app.bis.mine.service;

import com.czy.app.bis.mine.entity.User;
import com.czy.common.base.resp.BaseRep;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    BaseRep add(User user);

    BaseRep del(Integer id);

    BaseRep list();
}
