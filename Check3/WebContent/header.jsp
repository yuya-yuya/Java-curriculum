<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,java.text.SimpleDateFormat"%>
<%@ page import="java.util.Calendar" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
 #header{
  width:100%;
  background-color: gray;
  display: inline-block;
  padding: 10px;
  color: white;
  padding: 10px;
  font-size: 10px;
 }
</style>
<body>

<header>
 <div id="header">
  login
  <%  Calendar cal = Calendar.getInstance();
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
      String formatDate = sdf.format(cal);%>
  <%= formatDate %>
 </div>
</header>

<!-- </body>
</html> -->