import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.google.gson.*;
public class AppJson extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        Gson gson = new Gson();
	App app = new App();
        Student stu = new Student(app.id, app.name,app. number,app. age);
        String json = gson.toJson(stu);
        out.println(json);
        out.flush();
        out.close();
    }

}
