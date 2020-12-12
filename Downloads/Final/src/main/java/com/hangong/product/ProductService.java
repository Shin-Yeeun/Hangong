package com.hangong.product;

import java.util.List;


public interface ProductService {
	public int insertProduct(ProductVO vo);
	public int updateProduct(ProductVO vo);
	public ProductVO getProduct(int seq);
	public int deleteProduct(int seq);
	public List<ProductVO> getProductList() ;
}
