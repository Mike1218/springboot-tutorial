package com.geekerstar.springbootelasticjob.dao;

import com.geekerstar.springbootelasticjob.model.JdOrder;
import com.geekerstar.springbootelasticjob.model.JdOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JdOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jd_order
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    long countByExample(JdOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jd_order
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    int deleteByExample(JdOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jd_order
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jd_order
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    int insert(JdOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jd_order
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    int insertSelective(JdOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jd_order
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    List<JdOrder> selectByExample(JdOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jd_order
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    JdOrder selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jd_order
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    int updateByExampleSelective(@Param("record") JdOrder record, @Param("example") JdOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jd_order
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    int updateByExample(@Param("record") JdOrder record, @Param("example") JdOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jd_order
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    int updateByPrimaryKeySelective(JdOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jd_order
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    int updateByPrimaryKey(JdOrder record);

    List<JdOrder> getNotFetchedOrder(int orderCnt);
}