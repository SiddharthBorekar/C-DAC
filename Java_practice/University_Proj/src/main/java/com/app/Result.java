package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Result
 */
@WebServlet("/result")
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String prn = req.getParameter("prn");
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Found");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sidd","root","@Joker123");
			System.out.println("Connection Established!!!!");
			PreparedStatement pst = con.prepareStatement("select * from Employee where prn=?");

			pst.setString(1, prn);
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				float sub1 = rs.getFloat("sub1");
				float sub2 = rs.getFloat("sub2");
				float sub3 = rs.getFloat("sub3");
				
				float total = sub1 + sub2 + sub3 ;
				float percentage = (total / 300)*100;

				String result;
				if (sub1 >= 35 && sub2 >= 35 && sub3 >= 35) {
					result = "PASS";
				} else {
					result = "FAIL";
				}
				out.println("<html>");

				out.println("<head>");

				out.println("<title>Student Result</title>");

				out.println("<style>");

				out.println("*{");
				out.println("margin:0;");
				out.println("padding:0;");
				out.println("box-sizing:border-box;");
				out.println("font-family:Arial,sans-serif;");
				out.println("}");

				out.println("body{");
				out.println("height:100vh;");
				out.println("display:flex;");
				out.println("justify-content:center;");
				out.println("align-items:center;");
				out.println("background-image:url(\"https://images.unsplash.com/photo-1562774053-701939374585\");");
				out.println("background-size:cover;");
				out.println("background-position:center;");
				out.println("position:relative;");
				out.println("}");

				out.println("body::before{");
				out.println("content:'';");
				out.println("position:absolute;");
				out.println("top:0;");
				out.println("left:0;");
				out.println("width:100%;");
				out.println("height:100%;");
				out.println("background:rgba(0,0,0,0.4);");
				out.println("backdrop-filter:blur(6px);");
				out.println("}");

				out.println(".container{");
				out.println("position:relative;");
				out.println("width:500px;");
				out.println("background:rgba(255,255,255,0.92);");
				out.println("padding:35px;");
				out.println("border-radius:18px;");
				out.println("box-shadow:0 0 25px rgba(0,0,0,0.4);");
				out.println("z-index:1;");
				out.println("}");

				out.println("h2{");
				out.println("text-align:center;");
				out.println("margin-bottom:25px;");
				out.println("color:#1e3c72;");
				out.println("font-size:32px;");
				out.println("}");

				out.println("table{");
				out.println("width:100%;");
				out.println("border-collapse:collapse;");
				out.println("}");

				out.println("td{");
				out.println("padding:12px;");
				out.println("border:1px solid #ccc;");
				out.println("font-size:16px;");
				out.println("}");

				out.println("tr:nth-child(even){");
				out.println("background:#f2f2f2;");
				out.println("}");

				out.println("tr:hover{");
				out.println("background:#dfefff;");
				out.println("transition:0.3s;");
				out.println("}");

				out.println(".result-pass{");
				out.println("color:green;");
				out.println("font-weight:bold;");
				out.println("}");

				out.println(".result-fail{");
				out.println("color:red;");
				out.println("font-weight:bold;");
				out.println("}");

				out.println(".btn{");
				out.println("display:block;");
				out.println("margin-top:20px;");
				out.println("text-align:center;");
				out.println("text-decoration:none;");
				out.println("background:#007bff;");
				out.println("color:white;");
				out.println("padding:12px;");
				out.println("border-radius:8px;");
				out.println("font-size:16px;");
				out.println("}");

				out.println(".btn:hover{");
				out.println("background:#0056b3;");
				out.println("}");

				out.println("</style>");

				out.println("</head>");

				out.println("<body>");

				out.println("<div class='container'>");

				out.println("<h2>Student Result</h2>");

				out.println("<table>");

				out.println("<tr><td><b>PRN</b></td><td>" + prn + "</td></tr>");

				out.println("<tr><td><b>Subject 1</b></td><td>" + sub1 + "</td></tr>");

				out.println("<tr><td><b>Subject 2</b></td><td>" + sub2 + "</td></tr>");

				out.println("<tr><td><b>Subject 3</b></td><td>" + sub3 + "</td></tr>");

				out.println("<tr><td><b>Total</b></td><td>" + total + "</td></tr>");

				out.println("<tr><td><b>Percentage</b></td><td>" + percentage + "%</td></tr>");

				out.println("<tr><td><b>Result</b></td><td class='" 
				        + (result.equalsIgnoreCase("PASS") ? "result-pass" : "result-fail") 
				        + "'>" + result + "</td></tr>");

				out.println("</table>");

				out.println("<a class='btn' href='index.html'>Back To Home</a>");

				out.println("</div>");

				out.println("</body>");

				out.println("</html>");
			} else {
//				out.println("<h3>No Student Found</h3>");
				req.getRequestDispatcher("index.html").include(req, resp);
			}
			rs.close();
			pst.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}