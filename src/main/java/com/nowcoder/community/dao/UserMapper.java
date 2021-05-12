package com.nowcoder.community.dao;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;
//只需要写接口不需要写实现类
//需要注解让spring容器装配bean，要想实现需要配置文件，配置文件中需要给每个方法提供sql语句，这样mybatis底层自动生成一个实现类
@Mapper
public interface UserMapper {

    User selectById(int id);

    User selectByName(String username);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id, int status);

    int updateHeader(int id, String headerUrl);

    int updatePassword(int id, String password);

}
