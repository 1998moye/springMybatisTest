package spring.mybatisTest.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import spring.mybatisTest.entity.User;

public interface UserMapper {
    @Select("select * from m_user where id = #{id}")
    public User getUser(@Param("id")Long id);
}
