package com.mycompany.autocode.utils;

import org.springframework.http.HttpRequest;

import javax.imageio.ImageIO;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Enumeration;
import java.util.Random;
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
//        String data = "中国";
//        ByteArrayOutputStream bout = new ByteArrayOutputStream();
//        GZIPOutputStream gout = new GZIPOutputStream(bout);
//        gout.write(data.getBytes());
//        byte b[] = bout.toByteArray();
//        response.setStatus(HttpServletResponse.SC_FOUND);
//        response.setHeader("Content-Encoding","gzip");
//        response.setHeader("Content-Length",b.length+"");
//        response.setHeader("Location","/test.jsp");
//        response.getOutputStream().write(b);
//        response.setCharacterEncoding("UTF-8");
//        PrintWriter out = response.getWriter();
//        response.setDateHeader("expires",System.currentTimeMillis()+24*3600*1000);
//        response.setHeader("content-type","text/html;charset=UTF-8");
//        response.setHeader("refresh","3;/img/earth.jpg");
//        response.setHeader("content-disposition","attachment;filename=xxx.jpg");
//        InputStream in = this.getServletContext().getResourceAsStream("/img/earth.jpg");
//        byte y[] = new byte[1024];
//        byte[] bytes = data.getBytes("UTF-8");
//        OutputStream out = response.getOutputStream();
//        out.write("<meta http-equiv='content-type' content='text/html;charset=UTF-8'/>");
//        out.write(1);
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
//        String path = this.getServletContext().getRealPath("/test.jsp");
//        String filename = path.substring(path.lastIndexOf("\\")+1);
//        InputStream in = this.getServletContext().getResourceAsStream("/WEB-INF/classes/spring-mvc.xml");
//        byte buffer[] = new byte[1024];
//        int len = 0;
//        OutputStream outputStream =response.getOutputStream();
//        while ((len = in.read(buffer))>0){
//            outputStream.write(buffer,0,len);
//        }
//        outputStream.close();
//        in.close();
        //生成随机数
//        response.sendRedirect("/test.jsp");
        response.setHeader("refresh","5");
        BufferedImage image = new BufferedImage(80,20,BufferedImage.TYPE_INT_RGB);
        Graphics2D g = (Graphics2D) image.getGraphics();
        g.setColor(Color.RED);
        g.fillRect(0,0,80,20);
        g.setColor(Color.BLUE);
        g.setFont(new Font(null,Font.BOLD,20));
        g.setColor(Color.GREEN);
        for (int i=0;i<10;i++){
            int x1 = new Random().nextInt(80);
            int y1 = new Random().nextInt(20);
            int x2 = new Random().nextInt(80);
            int y2 = new Random().nextInt(20);
            g.drawLine(x1,y1,x2,y2);
        }
        g.drawString("fsdfasd",0,20);
        response.setHeader("content-type","image/jpeg");
        response.setDateHeader("expries",-1);
        response.setHeader("Cache-Control","no-cache");
        response.setHeader("Pragma","no-cache");
        ImageIO.write(image,"jpg",response.getOutputStream());


//        response.setHeader("content-type", "image/jpeg");//使用content-type响应头指定发送给浏览器的数据类型为"image/jpeg"
//        //读取位于项目根目录下的img文件夹里面的WP_20131005_002.jpg这张图片，返回一个输入流
//        InputStream in = this.getServletContext().getResourceAsStream("/img/earth.jpg");
//        byte buffer[] = new byte[1024];
//        int len = 0;
//        OutputStream out = response.getOutputStream();//得到输出流
//        while ((len = in.read(buffer)) > 0) {//读取输入流(in)里面的内容存储到缓冲区(buffer)
//            out.write(buffer, 0, len);//将缓冲区里面的内容输出到浏览器
//            }
    }

    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
        this.doGet(request,response);
    }

}

