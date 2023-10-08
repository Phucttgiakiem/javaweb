

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>RESULT<h2>
        <h2>1. Hình: ${img.name}</h2>
        <img src="/Lab4_Bai1/files/${img.name}" height="100">
        <h2>2. Tài liệu: ${doc.name}</h2>
        <a href="/Lab4_Bai1/files/${doc.name}">Tải về</a>
    </body>
</html>
