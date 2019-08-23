package name.monster.commonentity.entity;

/**
 * @ClassName: User
 * @Description: TODO
 * @Author miaopeng
 * @Date 2019-08-23 15:50:57
 **/
public class User {
    private String id;
    private String name;
    private String sex;
    private String phone;
    private boolean status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
