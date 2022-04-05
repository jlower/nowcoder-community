package com.nowcoder.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author lowo
 * @Email
 * @Date 2022/4/5
 * @Description community
 */

@Controller
public class LoginController {

	@RequestMapping(path = "/register", method = RequestMethod.GET)
	public String getRegisterPage() {

		return "/site/register";
	}

}
