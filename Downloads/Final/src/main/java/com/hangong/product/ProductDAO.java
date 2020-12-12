package com.hangong.product;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class ProductDAO {
	@Autowired
	SqlSessionTemplate sqlSession;
	public int insertProduct(ProductVO vo) {
		return sqlSession.insert("Product.insertProduct",vo);
	}
	public int updateProduct(ProductVO vo) {
		return sqlSession.update("Product.updateProduct",vo);
	}
	public int deleteProduct(int seq) {
		return sqlSession.delete("Product.deleteProduct",seq);
	}
	public ProductVO getProduct(int seq) {
		return sqlSession.selectOne("Product.getProduct",seq);
	}
	public List<ProductVO> getProductList(){
		 
		return sqlSession.selectList("Product.getProductList");
			
	
	}
}
