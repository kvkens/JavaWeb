<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>上传表单</title>
</head>
<body>
 <form name="uploadForm" method="post" enctype="MULTIPART/FORM-DATA" action="../upload">
    <table>
      <tr>
       <td><div align="right">User Name:</div></td>
       <td><input type="text" name="username" size="30"/> </td>
      </tr>
      <tr>
       <td><div align="right">Upload File1:</div></td>
       <td><input type="file" name="file1" size="30"/> </td>
      </tr>
      <tr>
        <td><div align="right">Upload File2:</div></td>
        <td><input type="file" name="file2" size="30"/> </td>
      </tr>
      <tr>
        <td><input type="submit" name="submit" value="upload"></td>
        <td><input type="reset" name="reset" value="reset"></td>
      </tr>
    </table>
  </form>
</body>
</html>