<%--
  Created by IntelliJ IDEA.
  User: AD
  Date: 1/5/2024
  Time: 3:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Add</title>
</head>
<body>
<h1>Thêm mới học sinh</h1>
<form action="/StudentServlet?action=ADD" method="post">

  <table border="1" cellspacing="10" cellpadding="20">
    <tr>
      <th>Nhập tên</th>
      <td><input type="text" name="name"/></td>
    </tr>
    <tr>
      <th>Nhập tuổi</th>
      <td><input type="number" name="age" min="18"/></td>
    </tr>
    <tr>
      <th>Nhập giới tính</th>
      <td><select name="sex">
        <option value="true">Nam</option>
        <option value="false">Nữ</option>
      </select></td>
    </tr>

    <tr>
      <td colspan="2">
        <button type="submit">Add</button></td>
    </tr>
  </table>
</form>
</body>
</html>