<html>
<head>
<title>Using POST Method to Read Form Data</title>
</head>
<body>
<center>
<h1>Using POST Method to Read Form Data</h1>
<ul>
<li><p><b>First Name:</b>
   <%= request.getParameter("fn")%>
</p></li>
<li><p><b>Last  Name:</b>
   <%= request.getParameter("ln")%>
</p></li>
</ul>
</body>
</html>