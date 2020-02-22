package com.example.tera5.rest.domain.service.simple;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.tera5.rest.domain.model.ResultData;
import com.example.tera5.rest.domain.model.UserBean;

/**
 * 入力クラスを結果クラスに格納するServiceImplクラス
 *
 */
@Service
@Transactional
public class SimpleServiceImpl implements SimpleService {

    /**
     * 入力クラスを結果クラスに格納する<br>
     * １．UserBeanクラスの属性の値をResultDataクラスに格納する。<br>
     * ２．総件数をResultDataクラスに設定する。<br>
     * ３．ResultDataクラスを返却する。
     *
     * @param params 入力クラス
     * @return 結果クラス
     */
    public ResultData execute(UserBean params) {
        ResultData result = new ResultData();
        List<UserBean> userBeanList = new ArrayList<UserBean>();
        UserBean userBean = new UserBean();
        userBean.setId(params.getId());
        userBean.setName(params.getName());
        userBean.setAge(params.getAge());
        userBean.setBirth(params.getBirth());
        userBeanList.add(userBean);
        result.setUserBean(userBeanList);
        result.setTotalCount(userBeanList.size());
        return result;
    }
}
