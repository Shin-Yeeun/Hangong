<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
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
<title>Insert title here</title>
<link rel="stylesheet" href="member.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

</head>
<body>

<h1>Add New Post</h1>
<form action="addproductok" method="post">
<table id="edit">

<tr><td>ProductName:</td><td><input type="text" name="productname"/></td></tr>
<tr><td>Price:</td><td><input type="text" name="price"/></td></tr>
<tr><td>Description:</td><td><textarea cols="50" rows="3" name="description"></textarea></td></tr>
</table>
<td><a href="productlist" class="btn btn-warning">제품 목록 보기 </a></td>
<td><input type="submit" class="btn btn-warning" value="제품 추가 " /></td>

</form>

</body>
</html>