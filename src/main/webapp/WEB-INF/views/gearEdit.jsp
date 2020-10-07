<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<%@ include file="/WEB-INF/views/template/head.jspf" %>
</head>
<body>
	<%@ include file="/WEB-INF/views/template/nav.jspf" %>
	<%@ include file="/WEB-INF/views/template/header.jspf" %>
					<!-- Content starts -->
					
<form class="form-horizontal" method="post">
	<input type="hidden" name="_method" value="put">
  <div class="form-group">
    <label for="gearNo" class="col-sm-2 control-label">글번호 </label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="gearNo" id="gearNo" value="${bean.gearNo }" readonly="readonly"/>
    </div>
  </div>
  <div class="form-group">
    <label for="gearTitle" class="col-sm-2 control-label">제  목 </label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="gearTitle" id="gearTitle" value="${bean.gearTitle }"/>
    </div>
  </div>
  <div class="form-group">
    <label for="gearContent" class="col-sm-2 control-label">내  용 </label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="gearContent" id="gearContent" value="${bean.gearContent }"/>
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-primary">수 정</button>
      <button type="reset" class="btn btn-default">취 소</button>
    </div>
  </div>
</form>

 
				<!-- Content ends -->
<%@ include file="/WEB-INF/views/template/footer.jspf" %>





</body>
</html>