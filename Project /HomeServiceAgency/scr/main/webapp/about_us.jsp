<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="stylesheet" href="SignUpProcurer.css">
<link rel="stylesheet" href="navbarAndFooter.css" type="text/css">
<link rel="stylesheet" href="about_us.css">
<link rel="icon" type="image/x-icon" href="images/favicon.ico">
<link rel="stylesheet" href="bootstrap.min.css" type="text/css">
<title>About HSA</title>
</head>
<body>
	<!-- navbar -->
	<jsp:include page="Navbar.jsp"></jsp:include>
	<!-- about-us-wrap -->
	<section class="About-us-wrap">
		<div class="container">
			<div class="row">
				<div class="col-5">
					<h1 class="headline mb-3">Who We Are</h1>
					<p>HSA online home services
						platform. Launched in 2023. The
						platform helps customers book reliable & high quality services -
						beauty treatments, massages, haircuts, home cleaning,
						appliance repair, painting and more delivered by
						trained professionals conveniently at home.</p>
						
					<h1 class="headline mb-3">How We Do It</h1>	
					<p>HSA The Home Service Agency provides a platform that allows
						skilled and experienced professionals to connect with users
						looking for specific services. Once on the platform, our
						match-making algorithm identifies professionals who are closest to
						the users' requirements and available at the requested time and
						date.</p>
					<p class="mb-4" id="about"></p>
				</div>
				<div class="col-2"></div>
				<div class="col-5">
					<img src="images/about-us.svg">
				</div>
			</div>
		</div>
	</section>
	<!-- Founders -->
	<section class="founder">
		<div class="container">
			<div class="founder-heading text-center">
				<h1 class="headline mb-3 fw-bold">DEVELOPERS</h1>
			</div>
			<div class="row mt-5 mb-3 founder_dp">
				<div class="col-lg-3 col-md-6 col-sm-12 text-center">
					<img src="./images/hu.jpg" class="mb-3 mx-auto rounded-circle"
						style="width: 10rem; height: 10rem;" alt="Sourima" srcset="">
					<p class="fw-semibold fs-4 mb-0">Rahul Gohil</p>
					<p class="text-secondary fw-light">(B.Tech.), Swarrnim Startup & Innovation University,Gandhinagar</p>
				</div>
				<div class="col-lg-3 col-md-6  col-sm-12  text-center">
					<img src="./images/P1.jpg" class="mb-3 mx-auto rounded-circle"
						style="width: 10rem; height: 10rem;" alt="Sarita" srcset="">
					<p class="fw-semibold fs-4 mb-0">Prashant Patel</p>
					<p class="text-secondary fw-light">(B.Tech.), Swarrnim Startup & Innovation University,Gandhinagar</p>
				</div>
			</div>
		</div>
	</section>
	<!-- footer -->
	<jsp:include page="Footer.jsp"></jsp:include>
	<script src="loginSignup.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
