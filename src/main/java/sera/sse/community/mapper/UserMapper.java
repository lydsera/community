package sera.sse.community.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import sera.sse.community.model.User;
import sera.sse.community.model.UserExample;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER1
     *
     * @mbg.generated Tue Jan 10 22:29:02 CST 2023
     */
    long countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER1
     *
     * @mbg.generated Tue Jan 10 22:29:02 CST 2023
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER1
     *
     * @mbg.generated Tue Jan 10 22:29:02 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER1
     *
     * @mbg.generated Tue Jan 10 22:29:02 CST 2023
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER1
     *
     * @mbg.generated Tue Jan 10 22:29:02 CST 2023
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER1
     *
     * @mbg.generated Tue Jan 10 22:29:02 CST 2023
     */
    List<User> selectByExampleWithRowbounds(UserExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER1
     *
     * @mbg.generated Tue Jan 10 22:29:02 CST 2023
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER1
     *
     * @mbg.generated Tue Jan 10 22:29:02 CST 2023
     */
    User selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER1
     *
     * @mbg.generated Tue Jan 10 22:29:02 CST 2023
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER1
     *
     * @mbg.generated Tue Jan 10 22:29:02 CST 2023
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER1
     *
     * @mbg.generated Tue Jan 10 22:29:02 CST 2023
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER1
     *
     * @mbg.generated Tue Jan 10 22:29:02 CST 2023
     */
    int updateByPrimaryKey(User record);
}