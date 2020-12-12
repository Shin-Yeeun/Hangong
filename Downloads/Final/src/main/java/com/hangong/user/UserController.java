package com.hangong.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/user")

public class UserController {
	@Autowired
		UserService userService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String boardlist(Model model) {
		model.addAttribute("list", userService.getUserList());
		return "list";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addPost(Model model) {
		return "adduserform";
	}

	@RequestMapping(value = "/addok", method = RequestMethod.POST)
	public String addPostOK(UserVO vo) {
		if (userService.insertUser(vo) == 0) {
			System.out.println("데이터 추가 실패 ");
		} else
			System.out.println("데이터 추가 성공!!");
		return "redirect:list";
	}

	@RequestMapping(value = "/editform/{id}", method = RequestMethod.GET)
	public String editPost(@PathVariable("id") int id, Model model) {
		UserVO userVO = userService.getUser(id);
		model.addAttribute("u", userVO);
		return "editform";
	}

	@RequestMapping(value = "/editok", method = RequestMethod.POST)
	public String editPostOK(UserVO vo) {
		if (userService.updateUser(vo) == 0) {
			System.out.println("데이터 수정 실패 ");
		} else
			System.out.println("데이터 수정 성공!!");
		return "redirect:list";
	}

	@RequestMapping(value="/deleteok/{id}",method=RequestMethod.GET)
	public String deletePostOK(@PathVariable("id")int id){
		
		if(userService.deleteUser(id)==0)
			System.out.println("데이터 삭제 실패");
		else 
			System.out.println("데이터 삭제 성공!!");
	
		return "redirect:../list";
	}

}
