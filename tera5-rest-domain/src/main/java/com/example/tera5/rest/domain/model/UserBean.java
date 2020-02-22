package com.example.tera5.rest.domain.model;

import java.io.Serializable;
import java.util.Date;

/**
 * ユーザ情報保持Bean。
 *
 * 入力クラス・データベースからの取得時に使用される。
 *
 */
public class UserBean implements Serializable {

    /**
     * シリアルバージョンID。
     */
    private static final long serialVersionUID = 1L;

    /**
     * ユーザID。
     */
    private Integer id = null;

    /**
     * ユーザ名。
     */
    private String name = null;

    /**
     * 年齢。
     */
    private Integer age = null;

    /**
     * 生年月日。
     */
    private Date birth = null;

    /**
     * ユーザIDを返却する。
     *
     * @return 保持するユーザID
     */
    public Integer getId() {
        return id;
    }

    /**
     * ユーザIDを設定する。
     *
     * @param id ユーザID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * ユーザ名を返却する。
     *
     * @return 保持するユーザ名
     */
    public String getName() {
        return name;
    }

    /**
     * ユーザ名を設定する。
     *
     * @param name ユーザ名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 年齢を返却する。
     *
     * @return 保持する年齢
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 年齢を設定する。
     *
     * @param age 年齢
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 生年月日を返却する。
     *
     * @return 保持する生年月日
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * 生年月日を設定する。
     *
     * @param birth 生年月日
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
