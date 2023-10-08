package controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


@MultipartConfig
@WebServlet(name="UploadServlet",urlPatterns ={"/UploadServlet"})
public class UploadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/form.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
// đường dẫn thư mục tính từ gốc của website
        File dir = new File(req.getServletContext().getRealPath("/files"));
        if (!dir.exists()) { // tạo nếu chưa tồn tại
            dir.mkdirs();
        }
// lưu các file upload vào thư mục files
        Part photo = req.getPart("photo_file"); // file hình   
        File photoFile = new File(dir, photo.getSubmittedFileName());
        photo.write(photoFile.getName());
        Part doc = req.getPart("doc_file"); // file tài liệu
        File docFile = new File(dir, doc.getSubmittedFileName());
        doc.write(docFile.getName());
// chia sẻ cho result.jsp để hiển thị
        req.setAttribute("img", photoFile);
        req.setAttribute("doc", docFile);
        req.getRequestDispatcher("/result.jsp").forward(req, resp);
    }
}
