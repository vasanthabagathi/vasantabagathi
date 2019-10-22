<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>.btnn-group.button{
background-color.black;/*green*/
border.1px solid green;
padding:15px 60px;
text-decoration:none;
display:inline-block;
font-size:16px;
cursor.pointer;
top:100%;
font-color:white;
}
.btn-group.button:not(:last-child){
border-right:none;/*Prevent double borders*/
}
a{
color.pink;
underline:none;
}
.btn-group.button:hover{
background-color.#3e8e41;
}
</style>
</head>
<body background="C:\Users\vasanthab\Download\cyan-NR.jpg">
<centre><span style="font-size:20px;font-family:serif;font-style:bold;">
<h1>VIRTUSA</h1>
</span>
</centre>
<div class="btn-group">
<centre>
<div class="button" style="font-color:white">
<a href="ManagerProfile">MY Profile</a>
</div>
<div class="button">
<a href="ManagerViewAppServlet">View Applications</a>
</div>
<div class="button">
<a href="ScheduleInterview">Schedule Interview</a>
</div>
<div class="button">
<a href="MgrViewIntServlet">Interviewers</a>
</div>
<div class="button">
<a href="ResultUpdateServlet">Result Update</a>
</div>
</centre>
</div>
</body>
</html>