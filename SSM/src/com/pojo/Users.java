package com.pojo;

public class Users {
    private Integer id;
    
    private Integer age;

    private String username;

    private String realname;

    private String password;

    private String gender;

    private String usertype;

    private String address;

    private String identity;

    private String tel;

    private String position;

    private String nation;

    private String drivinfo;

    private String drivage;

    private String idimag;

    private String drivimag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype == null ? null : usertype.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getDrivinfo() {
        return drivinfo;
    }

    public void setDrivinfo(String drivinfo) {
        this.drivinfo = drivinfo == null ? null : drivinfo.trim();
    }

    public String getDrivage() {
        return drivage;
    }

    public void setDrivage(String drivage) {
        this.drivage = drivage == null ? null : drivage.trim();
    }

    public String getIdimag() {
        return idimag;
    }

    public void setIdimag(String idimag) {
        this.idimag = idimag == null ? null : idimag.trim();
    }

    public String getDrivimag() {
        return drivimag;
    }

    public void setDrivimag(String drivimag) {
        this.drivimag = drivimag == null ? null : drivimag.trim();
    }

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
    
}