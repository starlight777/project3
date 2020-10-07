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
<!-- Page Content -->
<div class="container">

  <!-- Page Heading -->
  
 
  
 
  <h1 class="my-4">백패킹 
    <small>백패킹, 어떻게 할까요?</small>
  </h1>
	
	<p><a href="/add" class="btn btn-primary btn-block" role="btn">글쓰기 </a></p>
	
  <div class="row">
   
    <c:forEach items="${list }" var="bean">
    <div class="col-lg-6 mb-4">
      <div class="card h-100">
        <a href="#"><img class="card-img-top" src="http://placehold.it/700x400" alt=""></a>
        
        <div class="card-body">       
          <h4 class="card-title">
            <a href="./gear/${bean.gearNo }">${bean.gearTitle }</a>
          </h4>
          <p class="card-text">${bean.gearContent }</p>
          	
        </div>
      </div>
      </div>
      </c:forEach>
    </div>
    
  <!-- /.row -->



  <!-- Pagination 
  <ul class="pagination justify-content-center">
    <li class="page-item">
      <a class="disabled" href="#" aria-label="Previous">
            <span aria-hidden="true">&laquo;</span>
            <span class="sr-only">Previous</span>
          </a>
    </li>
    <li class="page-item">
      <a class="active" href="?page1">1</a>
    </li>
    <li class="page-item">
      <a class="disabled" href="?page2">2</a>
    </li>
    <li class="page-item">
      <a class="disabled" href="?page3">3</a>
    </li>
    <li class="page-item">
      <a class="page-link" href="#" aria-label="Next">
            <span aria-hidden="true">&raquo;</span>
            <span class="sr-only">Next</span>
          </a>
    </li>
  </ul> -->

</div>


<!-- /.container -->
				<!-- Content ends -->
<%@ include file="/WEB-INF/views/template/footer.jspf" %>





</body>
</html>