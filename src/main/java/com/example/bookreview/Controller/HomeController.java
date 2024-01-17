package com.example.bookreview.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	private final String HOME_VIEW = "/Main/Home";
	private final String LOGIN_VIEW = "/Login/Login";
	private final String REGISTER_PAGE = "/Login/Register";
	private final String REVIEW_PAGE = "/Review/ReviewMain";
	private final String REVIEW_DETAIL_PAGE = "/Review/ReviewDetail";

	@GetMapping("/")
	public String goHome () {
		return HOME_VIEW;
	}

	@GetMapping("/login")
	public String goLogin () {
		return LOGIN_VIEW;
	}

	@GetMapping("/register")
	public String goRegister(){
		return REGISTER_PAGE;
	}

	@GetMapping("/review")
	public String goReview(){
		return REVIEW_PAGE;
	}

	@GetMapping("/review/detail")
	public String goReviewDetail(){
		return REVIEW_DETAIL_PAGE;
	}
}
