<%--
  Created by IntelliJ IDEA.
  User: xiaolin.zhang
  Date: 2017/2/19
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
    <form method="post" enctype="multipart/form-data" action="../fileupload/add">
        <tr>
            <td><label for="image"></label> profile image:</td>
            <td><input name="image" type="file"></td>
            <td><input type="submit"></td>
        </tr>
    </form>

</body>
</html>
