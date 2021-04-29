import ConnectMysql.ListMember;
import ConnectMysql.TeamDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "GetInfo",urlPatterns = "/GetInfo")
public class GetInfo extends HttpServlet {
    public String hobby;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        hobby = request.getParameter("hobby");
        TeamDB teamDB=new TeamDB();

        ArrayList<ListMember> members=teamDB.getMember2(hobby);

        if (hobby.equals("\n")||hobby.equals("")||hobby==null){
            request.getRequestDispatcher("/defeat.jsp").forward(request,response);
        }
        if (members.size()!=0){
            request.setAttribute("list",members);
            request.getRequestDispatcher("/print.jsp").forward(request,response);
        } else{
            request.getRequestDispatcher("/defeat.jsp").forward(request,response);
        }
    }
}
