<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="style.css">
<title>jspTest</title>
</head>
<body>
	<!-- includeディレクティブを使用してheader.jspを呼び出す -->
	<%@ include file="header.jsp"%>

	<!-- name、idの入力エリアを作成しなさい -->
	<div class="test">
	<table class="form">
		<tr>
			<th>name</th>
			<td>
				<input type="text" name="name">
			</td>
		</tr>
			<th>id</th>
			<td>
				<input type="text" name="id">
			</td>
		<tr>
	</table>
	</div>

	<!-- includeディレクティブを使用してfooter.jspを呼び出す -->
	<%@ include file="footer.jsp"%>

</body>
</html>