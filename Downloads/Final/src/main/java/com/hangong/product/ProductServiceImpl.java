package com.hangong.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductDAO productDAO;
	
	
	

	@Override
	public int insertProduct(ProductVO vo) {
		// TODO Auto-generated method stub
		return productDAO.insertProduct(vo);
	}


	@Override
	public int updateProduct(ProductVO vo) {
		// TODO Auto-generated method stub
		return productDAO.updateProduct(vo);
	}


	@Override
	public int deleteProduct(int seq) {
		// TODO Auto-generated method stub
		return productDAO.deleteProduct(seq);
	}


	@Override
	public List<ProductVO> getProductList() {
		// TODO Auto-generated method stub
		return productDAO.getProductList();
	}

	public ProductVO getProduct(int seq) {
		// TODO Auto-generated method stub
		return productDAO.getProduct(seq);
	}
}
