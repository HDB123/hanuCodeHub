<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>hdbkpl.com</title>
</head>
<body>
  <h2>User Success From ${h})</h2>
  <hr />
<h1>${message}</h1>
  <table>
    <tr>
      <th>Name</th>
      <td>${user.name}</td>
    </tr>
    <tr>
      <th>Email</th>
      <td>${user.email}</td>
    </tr>
    <tr>
      <th>Gender</th>
      <td>${user.gender}</td>
    </tr>
    <tr>
      <th valign="top">Languages</th>
      <td>${user.languages}</td>
    </tr>
  </table>
</body>
</html>