package mine;
import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by User on 01.10.2017.
 */
@WebServlet("/me")
public class MyServlet extends HttpServlet {


        public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            resp.setContentType("text/html;charset=utf-8");

            PrintWriter pw = resp.getWriter();
            pw.println("<H1>Hello, world! или Привет мир</H1>");

        }

    }
