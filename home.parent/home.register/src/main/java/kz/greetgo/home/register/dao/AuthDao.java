package kz.greetgo.home.register.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface AuthDao {
    @Select("select username from users where username=#{username} and password=#{password}")
    String getUsernameByUsernameAndPassword(@Param("username") String username,
                                            @Param("password") String password);
}
