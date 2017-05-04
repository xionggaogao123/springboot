package io.terminus.user.model;

import io.terminus.common.annotion.Data;

/**
 * Created by xionggao on 2017/5/4.
 */
@Data
public class User {

    private Long id;

    private String name;

    private String gender;

    private String tel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
