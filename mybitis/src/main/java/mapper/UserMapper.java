package mapper;

import org.apache.ibatis.annotations.Select;
import pojo.User;

import java.util.List;

public interface UserMapper {
    /**
     * 添加用户
     */
    int insertUser();

    /**
     * 删除用户
     */
    int deleteUser();


    /**
     * 通过id来查找用户
     */
    User getUserById();

    /**
     * 查询所有用户信息
     */
    List<User> getAll();


    /**
     *
     */
    @Select("select *from t_user where age = #{ahe}")
    List<User> getAllByAge(int age);
}