<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>file upload</title>
</head>
<body>
    <form action="./file/fileupload.do" method="post" enctype="multipart/form-data">
        <label>文件上传</label>
        <input type="file" name="file">
        <input type="submit" value="提交">
    </form>
</body>
</html>