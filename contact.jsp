<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
  resize: vertical;
}

input[type=submit] {
  background-color: #efd818;
  color: black;
  padding: 12px 20px;
  border: none;
  font: bold 13px Arial, Helvetica, sans-serif;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  color: #ffffff;
}


</style>
</head>

<body>
<jsp:include page="header.jsp"></jsp:include>


<div style="margin-left: 5% ;max-width: 600px ;display : inline-block;">
<h3 align="center" style="background-color: #efd818;color: black;padding: 12px 20px;border: none; margin-bottom : 15px; margin-top : 15px;border-radius: 4px;">Contact Form</h3>

  <form action="/action_page.php">
    <label for="fname">Full Name</label>
    <input type="text" id="fname" name="firstname" placeholder="Your name..">

    <label for="lname">Your Email</label>
    <input type="text" id="lname" name="lastname" placeholder="Your Email..">

    <label for="country">City</label>
    <select id="country" name="country">
      <option value="Rajkot">Rajkot</option>
      <option value="Amreli">Amreli</option>
      <option value="Bhavnagar">Bhavnagar</option>
    </select>
	<br>
	


    <input type="submit" value="Submit" style="margin-top: 10px">
  </form>
</div>
<div style="display : inline-block;float: right;margin-right: 15%;max-width: 600px ;">
<h3 align="center" style="background-color: #efd818;color: black;padding: 12px 20px;border: none; margin-bottom : 15px; margin-top : 15px;border-radius: 4px;">Feedback Form</h3>
    <label for="subject">Feedback</label>
    <textarea id="subject" name="subject" placeholder="Write Your Feedback Here....." style="height:200px"></textarea>

	<input type="submit" value="Submit">
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>