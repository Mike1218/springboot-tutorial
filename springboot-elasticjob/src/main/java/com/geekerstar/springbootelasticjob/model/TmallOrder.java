package com.geekerstar.springbootelasticjob.model;

import java.math.BigDecimal;
import java.util.Date;

public class TmallOrder {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tmall_order.id
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tmall_order.order_status
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    private Integer orderStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tmall_order.money
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    private BigDecimal money;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tmall_order.create_user
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    private String createUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tmall_order.create_time
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tmall_order.update_user
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    private String updateUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tmall_order.update_time
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tmall_order.id
     *
     * @return the value of tmall_order.id
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tmall_order.id
     *
     * @param id the value for tmall_order.id
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tmall_order.order_status
     *
     * @return the value of tmall_order.order_status
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tmall_order.order_status
     *
     * @param orderStatus the value for tmall_order.order_status
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tmall_order.money
     *
     * @return the value of tmall_order.money
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tmall_order.money
     *
     * @param money the value for tmall_order.money
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tmall_order.create_user
     *
     * @return the value of tmall_order.create_user
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tmall_order.create_user
     *
     * @param createUser the value for tmall_order.create_user
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tmall_order.create_time
     *
     * @return the value of tmall_order.create_time
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tmall_order.create_time
     *
     * @param createTime the value for tmall_order.create_time
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tmall_order.update_user
     *
     * @return the value of tmall_order.update_user
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tmall_order.update_user
     *
     * @param updateUser the value for tmall_order.update_user
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tmall_order.update_time
     *
     * @return the value of tmall_order.update_time
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tmall_order.update_time
     *
     * @param updateTime the value for tmall_order.update_time
     *
     * @mbg.generated Tue Apr 02 22:46:20 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
