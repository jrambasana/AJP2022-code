<%-- 
    Document   : userdetails
    Created on : Feb 17, 2018, 8:19:59 AM
    Author     : heman
--%>

<jsp:useBean id="userinfo" class="beginnersbook.Details">
    
</jsp:useBean> 

    
<jsp:setProperty property="*" name="userinfo"/> 
You have enterted below details:<br> 
<jsp:getProperty property="username" name="userinfo"/><br> 
<jsp:getProperty property="password" name="userinfo"/><br> 
<jsp:getProperty property="age" name="userinfo" /><br>
