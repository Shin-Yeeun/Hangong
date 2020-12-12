<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<style>
#list {
	border-collapse: separate;
	text-align: center;
	line-height: 1.5;
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	border: 1px solid #e7708d;;
	margin: 20px 10px;
}
#list td, #list th {
	width: 350px;
	padding: 10px;
	vertical-align: top;
	border-bottom: 1px solid #ccc;
}
#list tr:nth-child(even){
border-right: 1px solid #ccc;
border-left: 1px solid #ccc;
background: #fcf1f4;
}
#list tr:hover {
padding: 10px;
font-weight: bold;
vertical-align: top;
color: #7b6f7b;
}
#list th {
  width: 150px;
	padding: 10px;
	font-weight: bold;
	vertical-align: top;
	border-bottom: 1px solid #ccc;
	background: #e7708d;
}
</style>
<h1>제품/서비스 목록 </h1>
<a href="../login/logout" class="btn btn-warning" >Logout</a>
<table id="list" width="90%">
	<tr>
		<th> No</th>
		<th> 제품/서비스 이름 </th>
		<th> 가격 </th>
		<th> 설명 </th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
	<c:forEach var="u" items="${list}">
		<tr>
			<td>${u.seq}</td>
			<td>${u.productname}</td>
			<td>${u.price}</td>
			<td>${u.description}</td>
			<td><a href="editproductform/${u.seq}" class="btn btn-outline-danger">Edit</a></td>
			<td><a href="deleteproductok/${u.seq}" class="btn btn-outline-danger">Delete</a></td>
		</tr>
	</c:forEach>
</table>
<a href="addproduct"  class="btn btn-outline-primary">게시물 추가 </a> 
<a href="../user/list"  class="btn btn-outline-primary">회원 관리 </a>