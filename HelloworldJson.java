import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.google.gson.*;

public class HelloworldJson extends HttpServlet {

   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("application/json;charset=UTF-8");
      response.setCharacterEncoding("UTF-8");
      PrintWriter out = response.getWriter();
      Gson gson = new Gson();
      Student stu = new Student("gaowu","7190764213",21);
      String json = gson.toJson(stu);
      out.println(json);
      out.flush();
      out.close();
   }
}
