package com.mycompany.autocode.utils;

import org.springframework.http.HttpRequest;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Enumeration;
import java.util.zip.GZIPOutputStream;

/**
 * author: JinBingBing
 * description: 测试servlet
 * time: 2016/12/29 17:42.
 */
public class MyServletDemo extends HttpServlet {
//
//    private ServletConfig config;
//
//    @Override
//    public void init(ServletConfig config){
//        this.config = config;
//    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException,ServletException {
        String data = "中国";
//        ByteArrayOutputStream bout = new ByteArrayOutputStream();
//        GZIPOutputStream gout = new GZIPOutputStream(bout);
//        gout.write(data.getBytes());
//        byte b[] = bout.toByteArray();
        response.setStatus(HttpServletResponse.SC_OK);
//        response.setHeader("Content-Encoding","gzip");
//        response.setHeader("Content-Length",b.length+"");
//        response.setHeader("Location","/test.jsp");
//        response.getOutputStream().write(b);
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
//        response.setDateHeader("expires",System.currentTimeMillis()+24*3600*1000);
        response.setHeader("content-type","text/html;charset=UTF-8");
//        response.setHeader("refresh","3;/img/earth.jpg");
//            response.setHeader("content-disposition","attachment;filename=xxx.jpg");
//        InputStream in = this.getServletContext().getResourceAsStream("/img/earth.jpg");
//        byte y[] = new byte[1024];
//        byte[] bytes = data.getBytes("UTF-8");
//        OutputStream out = response.getOutputStream();
//        out.write("<meta http-equiv='content-type' content='text/html;charset=UTF-8'/>");
        out.write(data);
//        int len = 0;
//        while ((len = in.read(y))>0){
//            out.write(y,0,len);
//        }
//        //获取所有的初始化参数
//        Enumeration<String> e = config.getInitParameterNames();
//        while (e.hasMoreElements()) {
//            String name = e.nextElement();
//            String value = config.getInitParameter(name);
//            response.getWriter().print(name + "=" + value + "<br/>");
//        }
//        ClassLoader loader = MyServletDemo.class.getClassLoader();
//        InputStream in = loader.getResourceAsStream("main/java/com/mycompany/autocode/model/BaseDO.java");
//        String path = this.getServletContext().getRealPath("resources/spring-mvc.xml");
//        String filename = path.substring(path.lastIndexOf("\\")+1);
//        InputStream in = this.getServletContext().getResourceAsStream("spring-mvc.xml");
//        byte buffer[] = new byte[1024];
//        int len = 0;
//        OutputStream outputStream = new FileOutputStream("e:\\"+filename);
//        while ((len = in.read(buffer))>0){
//            outputStream.write(buffer,0,len);
//        }
//        outputStream.close();
//        in.close();
    }

    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
        this.doGet(request,response);
    }

}

