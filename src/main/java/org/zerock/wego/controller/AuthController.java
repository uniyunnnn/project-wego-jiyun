package org.zerock.wego.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.zerock.wego.domain.common.UserVO;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor

@RequestMapping("auth")
@RestController
public class AuthController {
	
//	@GetMapping(path = "/json/session")
//	public UserVO getAuthJsonFromSession(
//			@SessionAttribute("__AUTH__")UserVO authUserVO
//			) {
//		log.trace("getAuthJsonFromSession({}) invoked", authUserVO);
//
//		return authUserVO;
//	} // getBadgeName
	// 삭제예정


} // end class
