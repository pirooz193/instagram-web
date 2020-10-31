package ir.maktab;

import ir.maktab.domains.account.Account;
import ir.maktab.domains.account.post.Post;
import ir.maktab.service.AccountService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet
public class InstagramWebDemo extends HttpServlet {

    AccountService accountService = new AccountService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        String sUsername = request.getParameter("sUsername");
        String sPassword = request.getParameter("sPassword");


        Account account = accountService.accountLogIn(username, password);

        accountService.generateAccount(sUsername, sPassword);
//        ----------------------------

//        request.getPart("")

        if (account != null) {
            StringBuilder postDiv = new StringBuilder();
            for (Post post : account.getPosts()) {
                String posts = " <div class=\"posts\">\n" +
                        "                <img src=\"" + post.getPhoto() + "\"  height=\"250\" width=\"280\">\n" +
                        "                <div> <img\n" +
                        "                        src=\"https://www.transparentpng.com/thumb/instagram-heart/5AVRiZ-instagram-heart-background.png\"\n" +
                        "                        alt=\"Instagram Heart Background @transparentpng.com\" height=\"20\" width=\"20\"><img\n" +
                        "                        src=\"https://img.icons8.com/fluent-systems-regular/2x/topic.png\" height=\"20\" width=\"20\"></div>\n" +
                        "\n" +
                        "            </div>";
                postDiv.append(posts);
            }

            out.println("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <title>" + account.getUsername() + "/profile</title>\n" +
                    "    <link rel=\"stylesheet\" href=\"account.css\">\n" +
                    "    \n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<header>\n" +
                    "\n" +
                    "<topnav>\n" +
                    "        <div class=\"topnav\">\n" +
                    "            <a class=\"active\" href=\"http://localhost:9090/instagram_web_war_exploded/LogInBar.html\" style=\"float: left\">Log Out</a>\n" +
                    "<a style=\"float: right\" href=\"http://localhost:9090/instagram_web_war_exploded/addPost.html\">+ Add Post </a>" +
                    "            \n" +
                    "        </div>\n" +
                    "    </topnav>" +
                    "    <div class=\"container\">\n" +
                    "\n" +
                    "        <div class=\"profile\">\n" +
                    "\n" +
                    "            <div class=\"profile-image\">\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "            </div>\n" +
                    "\n" +
                    "            <div class=\"profile-user-settings\">\n" +
                    "\n" +
                    "                <h1 class=\"profile-user-name\">" + account.getUsername() + "</h1>\n" +
                    "\n" +
                    "                <button class=\"btn profile-edit-btn\">Edit Profile</button>\n" +
                    "\n" +
                    "                <button class=\"btn profile-settings-btn\" aria-label=\"profile settings\"><i class=\"fas fa-cog\"\n" +
                    "                                                                                          aria-hidden=\"true\"></i>\n" +
                    "                </button>\n" +
                    "\n" +
                    "            </div>\n" +
                    "\n" +
                    "            <div class=\"profile-stats\">\n" +
                    "\n" +
                    "                <ul>\n" +
                    "                    <li><span class=\"profile-stat-count\">" + account.getPosts().size() + "</span> posts</li>\n" +
                    "                    <li><span class=\"profile-stat-count\">" + account.getFollowers().size() + "</span> followers</li>\n" +
                    "                    <li><span class=\"profile-stat-count\">" + account.getFollowings().size() + "</span> following</li>\n" +
                    "                </ul>\n" +
                    "\n" +
                    "            </div>\n" +
                    "\n" +
                    "            <div class=\"profile-bio\">\n" +
                    "\n" +
                    "\n" +
                    "            </div>\n" +
                    "\n" +
                    "        </div>\n" +
                    "\n" +
                    " <div id=\"postbox\">\n" +
                    "\n" +
                    postDiv +
                    "        </div>" +
                    "    </div>\n" +
                    "\n" +
                    "</header>\n" +
                    "\n" +
                    "<main></main>\n" +
                    "</body>\n" +
                    "</html>");
        } else {
            out.println("<h1>wrong user or password!!</h1>");
        }


        out.close();
    }
}
