package org.covito.demo.nutz.model.console;

import java.util.Date;

import org.nutz.dao.entity.annotation.*;

/**
 * <p>实体类- 系统用户</p>
 * <p>Table: sys_user </p>
 *
 * @since 2014-10-29 03:08:14
 */
@Table("sys_user")
public class SysUser {

    /** id - ID */
    @Id
    @Column
    private Integer id;

    /** 工号 */
    @Column
    private Integer no;

    /** 名字 */
    @Column
    private String name;

    /** 昵称 */
    @Column
    private String nick_name;

    /** 邮箱 */
    @Column
    private String email;

    /** 登录用户名 */
    @Column
    private String login_name;

    /** 密码 */
    @Column
    private String pwd;

    /** 手机号 */
    @Column
    private String mobile;

    /** 电话 */
    @Column
    private String phone;

    /** 状态 */
    @Column
    private String status;

    /** 机构id */
    @Column
    private Byte org_id;

    /** 角色类型 */
    @Column
    private Byte role_type;

    /** 头像地址 */
    @Column
    private String portrait;

    /** 用户类型 */
    @Column
    private String type;

    /** 头象更新日期 */
    @Column
    private Date portrait_update;

    /** 添加日期 */
    @Column
    private Date add_time;

    /** 更新时间 */
    @Column
    private Date updatetime;

    /** 本次登录时间 */
    @Column
    private Date this_login_time;

    /** 本次登录ip */
    @Column
    private Date this_login_ip;

    /** 上次登录时间 */
    @Column
    private Date last_login_time;

    /** 上次登录ip */
    @Column
    private Date last_login_ip;

	/** Get ID */
    public Integer getId(){
        return this.id;
    }
    
    /** Set ID */
    public void setId(Integer id){
        this.id = id;
    }
	/** Get 工号 */
    public Integer getNo(){
        return this.no;
    }
    
    /** Set 工号 */
    public void setNo(Integer no){
        this.no = no;
    }
	/** Get 名字 */
    public String getName(){
        return this.name;
    }
    
    /** Set 名字 */
    public void setName(String name){
        this.name = name;
    }
	/** Get 昵称 */
    public String getNick_name(){
        return this.nick_name;
    }
    
    /** Set 昵称 */
    public void setNick_name(String nick_name){
        this.nick_name = nick_name;
    }
	/** Get 邮箱 */
    public String getEmail(){
        return this.email;
    }
    
    /** Set 邮箱 */
    public void setEmail(String email){
        this.email = email;
    }
	/** Get 登录用户名 */
    public String getLogin_name(){
        return this.login_name;
    }
    
    /** Set 登录用户名 */
    public void setLogin_name(String login_name){
        this.login_name = login_name;
    }
	/** Get 密码 */
    public String getPwd(){
        return this.pwd;
    }
    
    /** Set 密码 */
    public void setPwd(String pwd){
        this.pwd = pwd;
    }
	/** Get 手机号 */
    public String getMobile(){
        return this.mobile;
    }
    
    /** Set 手机号 */
    public void setMobile(String mobile){
        this.mobile = mobile;
    }
	/** Get 电话 */
    public String getPhone(){
        return this.phone;
    }
    
    /** Set 电话 */
    public void setPhone(String phone){
        this.phone = phone;
    }
	/** Get 状态 */
    public String getStatus(){
        return this.status;
    }
    
    /** Set 状态 */
    public void setStatus(String status){
        this.status = status;
    }
	/** Get 机构id */
    public Byte getOrg_id(){
        return this.org_id;
    }
    
    /** Set 机构id */
    public void setOrg_id(Byte org_id){
        this.org_id = org_id;
    }
	/** Get 角色类型 */
    public Byte getRole_type(){
        return this.role_type;
    }
    
    /** Set 角色类型 */
    public void setRole_type(Byte role_type){
        this.role_type = role_type;
    }
	/** Get 头像地址 */
    public String getPortrait(){
        return this.portrait;
    }
    
    /** Set 头像地址 */
    public void setPortrait(String portrait){
        this.portrait = portrait;
    }
	/** Get 用户类型 */
    public String getType(){
        return this.type;
    }
    
    /** Set 用户类型 */
    public void setType(String type){
        this.type = type;
    }
	/** Get 头象更新日期 */
    public Date getPortrait_update(){
        return this.portrait_update;
    }
    
    /** Set 头象更新日期 */
    public void setPortrait_update(Date portrait_update){
        this.portrait_update = portrait_update;
    }
	/** Get 添加日期 */
    public Date getAdd_time(){
        return this.add_time;
    }
    
    /** Set 添加日期 */
    public void setAdd_time(Date add_time){
        this.add_time = add_time;
    }
	/** Get 更新时间 */
    public Date getUpdatetime(){
        return this.updatetime;
    }
    
    /** Set 更新时间 */
    public void setUpdatetime(Date updatetime){
        this.updatetime = updatetime;
    }
	/** Get 本次登录时间 */
    public Date getThis_login_time(){
        return this.this_login_time;
    }
    
    /** Set 本次登录时间 */
    public void setThis_login_time(Date this_login_time){
        this.this_login_time = this_login_time;
    }
	/** Get 本次登录ip */
    public Date getThis_login_ip(){
        return this.this_login_ip;
    }
    
    /** Set 本次登录ip */
    public void setThis_login_ip(Date this_login_ip){
        this.this_login_ip = this_login_ip;
    }
	/** Get 上次登录时间 */
    public Date getLast_login_time(){
        return this.last_login_time;
    }
    
    /** Set 上次登录时间 */
    public void setLast_login_time(Date last_login_time){
        this.last_login_time = last_login_time;
    }
	/** Get 上次登录ip */
    public Date getLast_login_ip(){
        return this.last_login_ip;
    }
    
    /** Set 上次登录ip */
    public void setLast_login_ip(Date last_login_ip){
        this.last_login_ip = last_login_ip;
    }
}