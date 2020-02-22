package com.example.tera5.rest.domain.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

/**
 * 結果クラス
 *
 */
@JsonRootName("Result")
public class ResultData implements Serializable {

    /**
     * シリアルバージョンID。
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * ユーザ情報保持Beanリスト。
     */
    @JacksonXmlElementWrapper(useWrapping=false)
    private List<UserBean> userBean = null;

    /**
     * 総件数。
     */
    private Integer totalCount = null;

    /**
     * ユーザ情報保持Beanを返却する。
     *
     * @return 保持するユーザ情報保持Bean
     */
    public List<UserBean> getUserBean() {
        return userBean;
    }

    /**
     * ユーザ情報保持Beanリストを設定する。
     *
     * @param userBean ユーザ情報保持Beanリスト
     */
    public void setUserBean(List<UserBean> userBean) {
        this.userBean = userBean;
    }

    /**
     * ユーザ情報保持Beanをリストに追加する。
     *
     * @param userBean ユーザ情報保持Bean
     */
    public void addUserBean(UserBean userBean) {
        this.userBean.add(userBean);
    }

    /**
     * 総件数を返却する。
     *
     * @return 保持する総件数
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * 総件数を設定する。
     *
     * @param totalCount 総件数
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}
