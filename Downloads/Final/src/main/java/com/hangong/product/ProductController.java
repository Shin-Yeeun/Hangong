package com.hangong.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/product")

public class ProductController {
	@Autowired
		ProductService productService;

	@RequestMapping(value = "/productlist", method = RequestMethod.GET)
	public String boardlist(Model model) {
		model.addAttribute("list", productService.getProductList());
		return "productlist";
	}

	@RequestMapping(value = "/addproduct", method = RequestMethod.GET)
	public String addPost(Model model) {
		return "addproductform";
	}

	@RequestMapping(value = "/addproductok", method = RequestMethod.POST)
	public String addPostOK(ProductVO vo) {
		if (productService.insertProduct(vo) == 0) {
			System.out.println("데이터 추가 실패 ");
		} else
			System.out.println("데이터 추가 성공!!");
		return "redirect:productlist";
	}

	@RequestMapping(value = "/editproductform/{id}", method = RequestMethod.GET)
	public String editPost(@PathVariable("id") int id, Model model) {
		ProductVO productVO = productService.getProduct(id);
		model.addAttribute("u", productVO);
		return "editproductform";
	}

	@RequestMapping(value = "/editproductok", method = RequestMethod.POST)
	public String editPostOK(ProductVO vo) {
		if (productService.updateProduct(vo) == 0) {
			System.out.println("데이터 수정 실패 ");
		} else
			System.out.println("데이터 수정 성공!!");
		return "redirect:productlist";
	}

	@RequestMapping(value="/deleteproductok/{id}",method=RequestMethod.GET)
	public String deletePostOK(@PathVariable("id")int id){
		
		if(productService.deleteProduct(id)==0)
			System.out.println("데이터 삭제 실패");
		else 
			System.out.println("데이터 삭제 성공!!");
	
		return "redirect:../productlist";
	}

}
