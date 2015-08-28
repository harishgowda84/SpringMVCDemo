<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:errors path="employee.*" />
<form action="/SpringMVCdemo/success" method="post">
  First name:<br>
  <input type="text" name="firstname">
  <br>
  Last name:<br>
  <input type="text" name="lastname">
  
   <br>SSNId:<br>
  <input type="text" name="ssnid">
  
   <br>BirthDate:<br>
  <input type="text" name="birthdate">
  
  
   Hobbies:<br>
  <select name="hobbies" multiple>
  <option value="music">Music</option>
  <option value="reading">Reading</option>
  <option value="arts">Arts</option>
  
</select>
  
  <input type="submit" value="Submit"/>
</form>

</body>
</html>