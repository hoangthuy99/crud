<%--
  Created by IntelliJ IDEA.
  User: thuyhoang
  Date: 07/01/2024
  Time: 23:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <title>Title</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<h1>Danh sách sinh viên</h1>
<a href="/StudentServlet?action=ADD">Thêm mới sinh viên</a>
<table class="table">
    <thead>
    <tr>
        <th>STT</th>
        <th>Họ tên</th>
        <th>Tuổi</th>
        <th>Giới tính</th>
        <th colspan="2">Hành động</th>

    </tr>
    </thead>
    <tbody>
    <tr>
<c:forEach items="${students}" var="st">
    <tr>
    <td>${st.id}</td>
    <td>${st.name}</td>
    <td>${st.age}</td>
    <td>${st.sex?"Nam":"Nữ"}</td>
    <td><a href="/StudentServlet?action=EDIT&id=${st.id}">Sửa</a></td>
    <td><a onclick="return confirm('Bạn có chắc chắn muốn xóa không ?')" href="/StudentServlet?action=DELETE&id=${st.id}">Xóa</a></td>
    </tr>


    </tbody>
</table>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>