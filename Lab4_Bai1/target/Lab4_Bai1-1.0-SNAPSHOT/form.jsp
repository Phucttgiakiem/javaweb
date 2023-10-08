

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="/UploadServlet" method="post" enctype="multipart/form-data">
            Hình ảnh: <input type="file" name="photo_file"><br>
            Tài liệu: <input type="file" name="doc_file"><br>
            <hr>
            <button>Upload</button>
        </form>
    </body>
</html>
