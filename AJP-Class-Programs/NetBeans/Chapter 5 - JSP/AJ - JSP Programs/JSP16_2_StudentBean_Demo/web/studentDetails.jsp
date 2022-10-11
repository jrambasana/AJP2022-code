<jsp:useBean id="stud" class="com.Student">
</jsp:useBean> 

<jsp:setProperty property="name" 
                 name="stud" value="abcd"/> 
<jsp:setProperty property="roll_no" 
                 name="stud" value="12"/> 

Username: <jsp:getProperty property="name" 
                 name="stud"/> 
<br> 
Roll no: <jsp:getProperty property="roll_no" 
                 name="stud" />

