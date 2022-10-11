<%
// Create cookies for first and last names.      
Cookie firstName = new Cookie("first_name",
                       request.getParameter("first_name"));
Cookie lastName = new Cookie("last_name",
                       request.getParameter("last_name"));

// Set expiry date after 24 Hrs for both the cookies.
firstName.setMaxAge(60*60*24); 
lastName.setMaxAge(60*60*24); 

// Add both the cookies in the response header.
response.addCookie( firstName );
response.addCookie( lastName );
%>
<html>
<head>
<title>Setting Cookies</title>
</head>
<body>
<center>
<h1>Setting Cookies</h1>
</center>
<ul>
<li><p><b>First Name:</b>
   <%= request.getParameter("first_name")%>
</p></li>
<li><p><b>Last  Name:</b>
   <%= request.getParameter("last_name")%>
</p></li>
<li><p><b>Lets Fetch Data from Cookie in Next Page</b>
   <a href="main2.jsp">Click to go Next Page</a>
</p></li>

</ul>
</body>
</html>