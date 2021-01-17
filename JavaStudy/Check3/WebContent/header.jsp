<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css">
<title>header</title>
</head>
<body>

	<!-- ヘッダーを作成 -->
	<header>
		<div class="header">
			<!-- 見出し -->
			<label class="login">login</label>
			<!-- 日付 -->
			<label class="date">
				<% Date date = new Date();
      				SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
      				String formatDate = sdf.format(date);%>
   				<%= formatDate %>
			</label>
		</div>
	</header>
</body>
</html>