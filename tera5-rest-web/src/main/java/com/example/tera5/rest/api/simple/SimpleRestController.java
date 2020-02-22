package com.example.tera5.rest.api.simple;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tera5.rest.domain.model.ResultData;
import com.example.tera5.rest.domain.model.UserBean;
import com.example.tera5.rest.domain.service.simple.SimpleService;

/**
 * 基本的なコントローラークラス
 * 
 * @author burua
 *
 */
@RestController
public class SimpleRestController {

	@Inject
	SimpleService simpleService;

	@RequestMapping(headers = "requestName=simple")
	public ResultData simple(@RequestBody UserBean userBean) {

		ResultData result = simpleService.execute(userBean);

		return result;
	}

}
