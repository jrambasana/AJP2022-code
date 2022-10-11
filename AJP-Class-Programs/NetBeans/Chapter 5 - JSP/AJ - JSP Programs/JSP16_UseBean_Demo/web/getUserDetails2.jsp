<jsp:useBean id="userinfo"  class="com.User">
</jsp:useBean>  
<jsp:setProperty property="*" name="userinfo"/>

You have entered below details:<br> 
Username: <jsp:getProperty property="username" 
                 name="userinfo"/> <br>
Password: <jsp:getProperty property="password" 
                 name="userinfo"/><br>
Your Age: <jsp:getProperty property="age"      
                 name="userinfo" />

