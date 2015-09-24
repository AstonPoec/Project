<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login</title>
    <link rel="stylesheet" href="bootstrap/dist/css/bootstrap.css">
    <link rel="stylesheet" href="bootstrap/dist/css/bootstrap-theme.css">

    
    <!-- Dimensionnement des cadres pour menu bootstrap -->
	<link rel="stylesheet" href="css/style.css">
	
	
     <!--
     toto
         Si on souhaite rajouter du CCS alors qu'on utilise du Boostrap, faut rajouter son propore CSS en dessous des lignes
         Pour ecraser des propriétés de Boostrap, il faut utiliser l'ID qui prend le dessus sur les CLASS
     -->
</head>
<body ng-app="espaceConnexion">
    <!-- 
        On inclut la page de Navigation.
        La balise ci-dessous est liée à "ng-app" de body. En son absence, il ne s'affiche pas la page de navigation
        NB : Dans src, on utilise les simples quote pour indiquer qu'il s'agit d'une chaine de caractères. Par défaut, src=" "
     -->
  
 <div class="container">
    <div class="row-fluid">
        <div class="col-md-10"> 
       		<div class="form-control divInputs">
				<div class="col-md-8 col-md-offset-2">
<form class="form-horizontal" role="form" action="ServletLogin" method="post">
	<fieldset>
   		<legend class="text-info">
     		<small>CVTHEQUE</small>
    	</legend>	
	
					<!-- LOGIN / EMAIL -->
					<div class="col-xs-5 col-sm-5 col-md-10 col-md-offset-1">
				  		<div class="form-group">
				    		<label for="inputConnexionLogin" class="col-md-5">Login / Email</label>
				    		<div class="col-md-7">
				    			<input type="text" name="login" class="form-control input-sm" id="inputConnexionLogin" placeholder="" tabindex="1">
				  			</div>  
				  		</div>		
					</div>
	
					<!-- MOT DE PASSE -->
					<div class="col-xs-5 col-sm-5 col-md-10 col-md-offset-1">
				  		<div class="form-group">
				    		<label for="inputConnexionMdp" class="col-md-5">Mot de passe</label>
				    		<div class="col-md-7">
				    			<input type="text" name="password" class="form-control input-sm" id="inputConnexionMdp" placeholder="" tabindex="1">
				  			</div>  
				  		</div>		
					</div>	
	
					<div class="col-md-3 col-md-offset-3 col-md-push-2">
					  	 <button type="submit" class="btn btn-primary btn-sm">Connexion</button>
					  							
					</div>
					
					<div class="col-md-3 col-md-offset-3">
					  		<!-- <button type="submit" class="btn btn-primary btn-sm">Inscription</button> -->
					  		<a href="#inscription" class="btn btn-primary btn-sm" role="button">Inscription</a>
					 </div>
				
	</fieldset>	
</form>
				<!-- pour afficher la page de connexion/inscription -->
				<ng-view></ng-view>
  				</div>
			</div>
		</div>
	</div>
</div>	

<script src="js/jquery-1.10.2.js"></script>
	<script src="js/jquery-ui-1.10.4.js"></script>
	<script src="js/scriptOnglet.js"></script> 
    
    <script src="jquery/dist/jquery.js"></script>
    <script src="bootstrap/dist/js/bootstrap.js"></script>
    
</body>
</html>