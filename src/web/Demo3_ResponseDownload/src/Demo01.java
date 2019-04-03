import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

public class Demo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /*
        * File DownLoad
        *
        * */
        String filename = req.getParameter("filename");

        /*
        * 文件名有中文时的处理方式，转为iso8859的bytes再转为utf-8方式
        * */
        filename = URLEncoder.encode(filename, "UTF-8");

        String path = getServletContext().getRealPath(filename);
        resp.setHeader("Content-Disposition", "attachment; filename="+filename);


        InputStream is = new FileInputStream(path);
        OutputStream os = resp.getOutputStream();

        int len;
        byte[] buffer = new byte[1024];
        while ((len = is.read(buffer)) != -1){
             os.write(buffer, 0, len);
        }
        os.close();
        is.close();
    }
}
