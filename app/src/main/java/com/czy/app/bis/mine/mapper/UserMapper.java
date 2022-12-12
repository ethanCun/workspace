package com.czy.app.bis.mine.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.czy.app.bis.mine.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {
}
