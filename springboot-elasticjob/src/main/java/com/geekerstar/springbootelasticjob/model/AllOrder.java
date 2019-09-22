package com.geekerstar.springbootelasticjob.model;

import java.math.BigDecimal;
import java.util.Date;

public class AllOrder {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column all_order.id
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column all_order.third_order_id
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    private Integer thirdOrderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column all_order.type
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column all_order.total_amount
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    private BigDecimal totalAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column all_order.create_user
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    private String createUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column all_order.create_time
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column all_order.update_user
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    private String updateUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column all_order.update_time
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column all_order.id
     *
     * @return the value of all_order.id
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column all_order.id
     *
     * @param id the value for all_order.id
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column all_order.third_order_id
     *
     * @return the value of all_order.third_order_id
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    public Integer getThirdOrderId() {
        return thirdOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column all_order.third_order_id
     *
     * @param thirdOrderId the value for all_order.third_order_id
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    public void setThirdOrderId(Integer thirdOrderId) {
        this.thirdOrderId = thirdOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column all_order.type
     *
     * @return the value of all_order.type
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column all_order.type
     *
     * @param type the value for all_order.type
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column all_order.total_amount
     *
     * @return the value of all_order.total_amount
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column all_order.total_amount
     *
     * @param totalAmount the value for all_order.total_amount
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column all_order.create_user
     *
     * @return the value of all_order.create_user
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column all_order.create_user
     *
     * @param createUser the value for all_order.create_user
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column all_order.create_time
     *
     * @return the value of all_order.create_time
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column all_order.create_time
     *
     * @param createTime the value for all_order.create_time
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column all_order.update_user
     *
     * @return the value of all_order.update_user
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column all_order.update_user
     *
     * @param updateUser the value for all_order.update_user
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column all_order.update_time
     *
     * @return the value of all_order.update_time
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column all_order.update_time
     *
     * @param updateTime the value for all_order.update_time
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
