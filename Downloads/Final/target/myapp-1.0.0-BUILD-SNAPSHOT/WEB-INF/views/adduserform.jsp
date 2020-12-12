<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<title>Insert title here</title>
</head>
<body>


<h1>Add New Post</h1>
<form action="addok" method="post">
<table id="edit">

<tr><td>ID:</td><td><input type="text" name="userid"/></td></tr>
<tr><td>Name:</td><td><input type="text" name="username"/></td></tr>
<tr><td>Password:</td><td><input type="password" name="password"/></td></tr>
<tr><td>Address:</td><td><textarea cols="50" rows="3" name="address"></textarea></td></tr>
</table>
<td><a href="list"  class="btn btn-warning">회원 보기 </a></td>
<td><input type="submit"  class="btn btn-warning" value="회원 추가 "/></td>

</form>
</body>
</html>