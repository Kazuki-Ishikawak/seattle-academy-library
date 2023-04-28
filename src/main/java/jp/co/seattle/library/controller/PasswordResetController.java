package jp.co.seattle.library.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jp.co.seattle.library.service.BooksService;
import jp.co.seattle.library.service.UsersService;

@Controller
public class PasswordResetController {
	final static Logger logger = LoggerFactory.getLogger(PasswordResetController.class);

	@Autowired
	private BooksService passwodReset;

	@RequestMapping(value = "/passwordReset", method = RequestMethod.POST)
	public String passwprd(Locale locale, @RequestParam("bookId") int bookId, Model model) {

		// パスワード情報を更新する
		UsersService.PasswprdReset(password);

		// 一覧画面に遷移する
		return "redirect:/home";
	}
}
