<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

<title>메인화면</title>


<%!public void setMenus(HttpSession session){	
	session.setAttribute("dessert1", "dessert1");	
	return;
	}

%>

<script type="text/javascript">
function selectItem(idx){
	var itemName="dessert"+idx;
	
	var formId=document.getElementById("selectMenu");
	document.getElementsByName('menuName')[0].value=itemName;
	document.getElementsByName('redirName')[0].value="dessert";
	
	formId.action="setCartElement.do";
	formId.submit()
}

</script>
<%@ include file = "include/header.jsp" %>

  <!-- Portfolio Grid -->
  <section class="bg-light page-section" id="portfolio">
    <div class="container">
      <div class="row">
        <div class="col-lg-12 text-center">
          <h2 class="section-heading text-uppercase">Menu</h2>
          <h3 class="section-subheading text-muted">원하는 메뉴를 선택해주세요.</h3>
             
         <form name="selectMenu" id="selectMenu" method="post">
         <input type="hidden" name="menuName"/>
         <input type="hidden" name="redirName"/>
         
         </form>
        </div>
      </div>
      <div class="row">
        <div class="col-md-4 col-sm-6 portfolio-item" onclick="javascript:selectItem(1);">
          <a class="portfolio-link" data-toggle="modal" href="#portfolioModal1">
            <div class="portfolio-hover">
              <div class="portfolio-hover-content">
                <i class="fas fa-plus fa-3x"></i>
              </div>
            </div>
            <img class="img-fluid" src="resources/img/portfolio/macaron.jpg" alt="">
          </a>
          <div class="portfolio-caption">
            <h4>마카롱</h4>
            <p class="text-muted">&#8361;&nbsp;2,500</p>
          </div>
        </div>
         <div class="col-md-4 col-sm-6 portfolio-item" onclick="javascript:selectItem(2);">
          <a class="portfolio-link" data-toggle="modal" href="#portfolioModal2">
            <div class="portfolio-hover">
              <div class="portfolio-hover-content">
                <i class="fas fa-plus fa-3x"></i>
              </div>
            </div>
            <img class="img-fluid" src="resources/img/portfolio/tiramisu.jpg" alt="">
          </a>
          <div class="portfolio-caption">
            <h4>티라미수</h4>
            <p class="text-muted">&#8361;&nbsp;6,500</p>
          </div>
        </div>
       <div class="col-md-4 col-sm-6 portfolio-item" onclick="javascript:selectItem(3);">
          <a class="portfolio-link" data-toggle="modal" href="#portfolioModal3">
            <div class="portfolio-hover">
              <div class="portfolio-hover-content">
                <i class="fas fa-plus fa-3x"></i>
              </div>
            </div>
            <img class="img-fluid" src="resources/img/portfolio/pancake.jpg" alt="">
          </a>
          <div class="portfolio-caption">
            <h4>팬 케이크</h4>
            <p class="text-muted">&#8361;&nbsp;6,500</p>
          </div>
        </div>
         <div class="col-md-4 col-sm-6 portfolio-item" onclick="javascript:selectItem(4);">
          <a class="portfolio-link" data-toggle="modal" href="#portfolioModal4">
            <div class="portfolio-hover">
              <div class="portfolio-hover-content">
                <i class="fas fa-plus fa-3x"></i>
              </div>
            </div>
            <img class="img-fluid" src="resources/img/portfolio/cake2.jpg" alt="">
          </a>
          <div class="portfolio-caption">
            <h4>롤 케이크</h4>
            <p class="text-muted">&#8361;&nbsp;5,500</p>
          </div>
        </div>
       <div class="col-md-4 col-sm-6 portfolio-item" onclick="javascript:selectItem(5);">
          <a class="portfolio-link" data-toggle="modal" href="#portfolioModal5">
            <div class="portfolio-hover">
              <div class="portfolio-hover-content">
                <i class="fas fa-plus fa-3x"></i>
              </div>
            </div>
            <img class="img-fluid" src="resources/img/portfolio/cupcake.jpg" alt="">
          </a>
          <div class="portfolio-caption">
            <h4>머핀</h4>
            <p class="text-muted">&#8361;&nbsp;3,000</p>
          </div>
        </div>
       <div class="col-md-4 col-sm-6 portfolio-item" onclick="javascript:selectItem(6);">
          <a class="portfolio-link" data-toggle="modal" href="#portfolioModal6">
            <div class="portfolio-hover">
              <div class="portfolio-hover-content">
                <i class="fas fa-plus fa-3x"></i>
              </div>
            </div>
            <img class="img-fluid" src="resources/img/portfolio/tarate.jpg" alt="">
          </a>
          <div class="portfolio-caption">
            <h4>타르트</h4>
            <p class="text-muted">&#8361;&nbsp;3,000</p>
          </div>
        </div>
      </div>
    </div>
  </section>



  <!-- Bootstrap core JavaScript -->
  <script src="resources/vendor/jquery/jquery.min.js"></script>
  <script src="resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Plugin JavaScript -->
  <script src="resources/vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Contact form JavaScript -->
  <script src="resources/js/jqBootstrapValidation.js"></script>
  <script src="resources/js/contact_me.js"></script>

  <!-- Custom scripts for this template -->
  <script src="resources/js/agency.min.js"></script>


</body>
</html>