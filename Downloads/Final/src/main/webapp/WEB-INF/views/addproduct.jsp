<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.hangong.product.ProductDAO"%>

<% request.setCharacterEncoding("utf-8"); %>

<jsp:useBean id="u" class="com.hangong.product.ProductVO" />
<jsp:setProperty property="*" name="u"/>

<%
	ProductDAO productDAO = new ProductDAO();
	int i = productDAO.insertProduct(u);
	String msg = "데이터 추가 성공 !";
	if(i == 0) msg = "[에러] 데이터 삭제 ";
%>

<script>
	alert('<%=msg%>');
	location.href='productlist.jsp';
</script>