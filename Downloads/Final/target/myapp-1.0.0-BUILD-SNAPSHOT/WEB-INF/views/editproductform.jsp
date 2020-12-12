<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="com.hangong.product.ProductDAO,com.hangong.product.ProductVO"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

<style>
#edit {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
  margin-bottom: 10px;
  text-align:center;
}
#edit td {
  border: 1px solid #ddd;
  padding: 8px;
}
#edit td:nth-child(1) {
  width:100px;
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: center;
  background-color: #e7708d;
  color: white;
}
</style>
<head>

<meta charset="UTF-8">
<title>Edit Form</title>
</head>
<body>



<h1>제품/서비스 정보 수정 </h1>
<form action="../editproductok" method="post">
<input type="hidden" name="seq" value="${u.seq}"/>
<table id="edit">
<tr><td>ProductName:</td><td><input type="text" name="productname" value="${u.productname}"/></td></tr>
<tr><td>Price:</td><td><input type=text" name="price" value="${u.price}" /></td></tr>
<tr><td>Description:</td><td><textarea cols="50" rows="3" name="description">${u.description}</textarea></td></tr>
</table>
<tr><td colspan="2"><input type="submit" class="btn btn-warning" value="제품 수정"/>
<input type="button" value="취소"  class="btn btn-warning" onclick="history.back()"/></td></tr>


</form>

</body>
</html>