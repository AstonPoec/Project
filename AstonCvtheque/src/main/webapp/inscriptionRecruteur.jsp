<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inscrip Recruteur</title>
	<link rel="stylesheet" href="bootstrap/dist/css/bootstrap.css">
	<link rel="stylesheet" href="bootstrap/dist/css/bootstrap-theme.css">
	<link rel="stylesheet" href="css/style.css">
	
	
</head>
<body>
<!-- http://www.rbastien.com/blog/2014/12/charger-une-page-sur-un-onglet-bootstrap-specifique/ -->

    <div class="container-fluid">
      <div class="row-fluid">
      
      
      <!--  <div role="tabpanel"> -->
      
        <!-- <div class="col-md-3 col-sm-3">  -->
    <!--     <div class="col-md-2">
         <div class="column_right">
          Sidebar content
          	<ul class="nav nav-pills nav-stacked">
			  	<li role="presentation"><a href="#rechercheCandidats" aria-controls="rechercheCandidats" role="tab" data-toggle="tab">Recherche</a></li>
   	 			<li role="presentation"><a href="#changePassword" aria-controls="changePassword" role="tab" data-toggle="tab">Changer mot de passe</a></li>
    			<li role="presentation"><a href="#profil" aria-controls="profil" role="tab" data-toggle="tab">Profil</a></li>
    			
  			</ul>
			
		</div>	
        </div> -->
      
      
    
        <!--Body content-->
        <!-- <div class="col-md-9 col-sm-9">  -->
        <div class="col-md-10 col-md-offset-1"> 
        	<!-- <div class="column_left"> -->
  				<div class="form-control divInputs">
  				
  				<!--   <div class="tab-content"> -->
  					  
    <!-- <div role="tabpanel" class="tab-pane" id="rechercheCandidats"> -->
    
   <!-- views/rechercheCandidats.html -->
<!-- <h1>precherche Candidats page</h1> -->

<!-- <div class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3"> -->
     
<!-- <div class="col-md-11 col-md-offset-1">   -->
<div class="col-xs-5 col-sm-5 col-md-12">  
					
					
<form class="form-horizontal" role="form">	

<fieldset >
<!-- http://www.tutorialrepublic.com/codelab.php?topic=bootstrap&file=text-formatting -->
<!-- http://www.w3schools.com/bootstrap/bootstrap_ref_css_text.asp -->
<!-- http://www.tutorialspoint.com/bootstrap/bootstrap_typography.htm -->

	<!-- http://getbootstrap.com/2.3.2/base-css.html -->
    <!--   <legend class="text-muted"> -->
    <legend class="text-info">
     	<small>Infos Connexion</small>
    </legend>		 
      
<!-- POSTE -->
	<!-- <div class="col-xs-5 col-sm-5 col-md-5">	
  		<div class="form-group">
    		<label for="inputPoste" class="col-md-4">Poste</label>
    		<div class="col-md-8">
    			<input type="text" name="poste" class="form-control input-sm" id="inputPoste" placeholder="" tabindex="1">
  			</div>  
  		</div>		
	</div> -->
<!-- MOTS -->
<!-- 	<div class="col-xs-5 col-sm-5 col-md-5">
  		<div class="form-group">
    		<label for="inputMotsCles" class="col-md-4">Mots cl&eacutes</label>
     		<div class="col-md-8">
    			<input type="text" name="motsCles" class="form-control input-sm" id="inputMotsCles" placeholder="" tabindex="2">
  			</div>
  		</div>
	</div> -->
<!-- Bouton rechercher -->	
<!-- 	<div class="col-xs-2 col-sm-2 col-md-2">
		<button type="submit" class="btn btn-primary btn-sm">Rechercher</button>
		<a href="#" class="btn btn-info btn-lg"><span class="glyphicon glyphicon-search"></span> Search</a>
	</div> -->
	
	
	<!-- http://www.bootply.com/QdS119dye4 -->
	<!-- http://www.w3schools.com/bootstrap/bootstrap_ref_js_collapse.asp -->
 <!-- 	<div class="col-md-12"> -->
 		<!-- <a data-toggle="collapse" data-target="#rechercheAvancee" ref="#">Recherche avanc&eacutee</a> -->

<!--   	<div id="rechercheAvancee" class="collapse"> -->
    			
		<!-- CRITERE 1 -->
			<div class="col-xs-5 col-sm-5 col-md-4">	
		  		<div class="form-group">
		    		<label for="inputLogin" class="col-md-4">Login / Email</label>
		    		<div class="col-md-8">
		    			<input type="text" name="ecole" class="form-control input-sm" id="inputLogin" placeholder="" tabindex="1">
		  			</div>  
		  		</div>		
			</div>  
		<!-- CRITERE 2 -->
			<div class="col-xs-5 col-sm-5 col-md-4">	
		  		<div class="form-group">
		    		<label for="inputMdp" class="col-md-4">Mot de passe</label>
		    		<div class="col-md-8">
		    			<input type="text" name="ecole" class="form-control input-sm" id="inputMdp" placeholder="" tabindex="1">
		  			</div>  
		  		</div>		
			</div>  
		<!-- CRITERE 3 -->
			<div class="col-xs-5 col-sm-5 col-md-4">	
		  		<div class="form-group">
		    		<label for="inputConfirmationPwd" class="col-md-4">Confirmation</label>
		    		<div class="col-md-8">
		    			<input type="text" name="confirmPwd" class="form-control input-sm" id="inputConfirmationPwd" placeholder="" tabindex="1">
		  			</div>  
		  		</div>		
			</div>
  <!-- 	</div> -->
  
  
  </fieldset>
  

  
  
  
  
<fieldset >
    <legend class="text-info">
     	<small>Infos Entreprise</small>
    </legend>

<!-- NOM CONTACT -->
	<div class="col-xs-5 col-sm-5 col-md-10">
  		<div class="form-group">
    		<label for="inputNomContact" class="col-md-3">Nom contact</label>
    		<div class="col-md-6 col-md-pull-1">
    			<input type="text" name="nomContact" class="form-control input-sm" id="inputNomContact" placeholder="" tabindex="1">
  			</div>  
  		</div>		
	</div>
	
<!-- RAISON SOCIALE -->
	<div class="col-xs-5 col-sm-5 col-md-10">
  		<div class="form-group">
    		<label for="inputRaisonSociale" class="col-md-3">Raison sociale</label>
    		<div class="col-md-6 col-md-pull-1">
    			<input type="text" name="raisonSociale" class="form-control input-sm" id="inputRaisonSociale" placeholder="" tabindex="1">
  			</div>  
  		</div>		
	</div>	    
    
<!-- ADRESSE -->
	<div class="col-xs-5 col-sm-5 col-md-5">
  		<div class="form-group">
    		<label for="inputRaisonSociale" class="col-md-4">Adresse</label>
    		<div class="col-md-8 ">
    			<input type="text" name="raisonSociale" class="form-control input-sm" id="inputRaisonSociale" placeholder="" tabindex="1">
  			</div>  
  		</div>		
	</div>	  
	 
<!-- VILLE -->
	<div class="col-xs-5 col-sm-5 col-md-4">
  		<div class="form-group">
    		<label for="inputRaisonSociale" class="col-md-4">Ville</label>
    		<div class="col-md-8 col-md-pull-2">
    			<input type="text" name="raisonSociale" class="form-control input-sm" id="inputRaisonSociale" placeholder="" tabindex="1">
  			</div>  
  		</div>		
	</div>
		 
<!-- CODE POSTAL -->	
	<div class="col-xs-5 col-sm-5 col-md-3">
  		<div class="form-group">
    		<label for="inputCodePostal" class="col-md-6">Code postal</label>
    		<div class="col-md-6 col-md-pull-1">
    			<input type="text" name="codePostal" class="form-control input-sm" id="inputCodePostal" placeholder="" tabindex="1">
  			</div>  
  		</div>		
	</div>	   
<!-- SECTEUR D'ACTIVITE -->
	<div class="col-xs-5 col-sm-5 col-md-10">
		<div class="form-group">
  			<label for="selectSecteurActivite" class="col-md-3">Secteur d'activit&eacutes</label>
  			<div class="col-md-6 col-md-pull-1 selectContainer">
	  			<select name="secteurActivites" class="form-control input-sm" id="selectSecteurActivite">
	  		 		<option value=""></option>
	  		 		<option value="">Bac</option>
	                <option value="">BTS/DUT</option>
	                <option value="">Licence</option>
	                <option value="">Master</option>
  			</select>
  			</div>
		</div>
	</div>  
</fieldset>
	

	<fieldset >
    <legend class="text-info text-center">
     	<small>Pr&eacutesentation de l'entreprise</small>
    </legend>
    <div class="col-md-8 col-md-push-2">
    	<textarea class="form-control" rows="3">
    
    	</textarea>
    </div>  
    </fieldset>



  						<div class="col-md-3 col-md-offset-3 col-md-push-2">
					  		<button type="submit" class="btn btn-primary btn-sm">Abandon</button>
					  			
					</div>
					
					<div class="col-md-3 col-md-offset-3 col-md-pull-2">
					  		 <button type="submit" class="btn btn-primary btn-sm">Enregistrer</button>
					  		
					 </div>

	<!-- 
	<div class="row">
				<div class="col-xs-6 col-md-6"><input type="submit" value="Register" class="btn btn-primary btn-block btn-lg" tabindex="7"></div>
				<div class="col-xs-6 col-md-6">
					<a href="#" class="btn btn-success btn-block btn-lg">Sign In</a>
				</div>
	</div> 
	-->
  
  



  <!-- 	  </div>	 -->
  
 

<!-- 	<div class="col-xs-5 col-sm-5 col-md-2">
			
	</div>   -->
			



	<!-- <div class="col-xs-5 col-sm-5 col-md-2">
			
	</div>  --> 
	
	
<!--  </fieldset>	 -->	
</form>
	</div>		
	


    
 <!--    </div> -->
    
<!-- CHANGE PASSWORD -->
    <div role="tabpanel" class="tab-pane" id="changePassword">
		<div class="col-md-8 col-md-offset-2">
		<!-- <div class="col-md-12">   -->			
    	</div>
   </div>
  	
<!-- PROFIL -->   
	<div role="tabpanel" class="tab-pane" id="profil">
		<div class="col-md-12">  			
		<form class="form-horizontal" role="form">	

		</form>    	 
    </div>  				
</div>
  				
  				
  				
  				
  			</div>
  		</div>
  
    <!--   </div> -->
  <!--     </div> -->
   <!--  </div> -->
    
    
      </div>
    </div>

<script src="js/jquery-1.10.2.js"></script>
	<script src="js/jquery-ui-1.10.4.js"></script>
	<script src="js/scriptOnglet.js"></script>


 	<script src="jquery/dist/jquery.js"></script>
    <script src="bootstrap/dist/js/bootstrap.js"></script>
</body>
</html>