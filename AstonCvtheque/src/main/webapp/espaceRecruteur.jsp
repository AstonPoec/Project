<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Recruteur</title>
	<link rel="stylesheet" href="bootstrap/dist/css/bootstrap.css">
	<link rel="stylesheet" href="bootstrap/dist/css/bootstrap-theme.css">
	<link rel="stylesheet" href="css/style.css">
	
	
</head>
<body>
<!-- http://www.rbastien.com/blog/2014/12/charger-une-page-sur-un-onglet-bootstrap-specifique/ -->

    <div class="container-fluid">
      <div class="row-fluid">
       <div role="tabpanel">
      
        <!-- <div class="col-md-3 col-sm-3">  -->
        <div class="col-md-2">
         <div class="column_right">
          <!--Sidebar content-->
          	<ul class="nav nav-pills nav-stacked">
			  	<li role="presentation"><a href="#rechercheCandidats" aria-controls="rechercheCandidats" role="tab" data-toggle="tab">Recherche</a></li>
   	 			<li role="presentation"><a href="#changePassword" aria-controls="changePassword" role="tab" data-toggle="tab">Changer mot de passe</a></li>
    			<li role="presentation"><a href="#profil" aria-controls="profil" role="tab" data-toggle="tab">Profil</a></li>
    			
  			</ul>
			
		</div>	
        </div>
      
      
    
        <!--Body content-->
        <!-- <div class="col-md-9 col-sm-9">  -->
        <div class="col-md-10"> 
        	<div class="column_left">
  				<div class="form-control divInputs">
  				
  				  <div class="tab-content">
  					  
    <div role="tabpanel" class="tab-pane" id="rechercheCandidats">
    
   <!-- views/rechercheCandidats.html -->
<!-- <h1>precherche Candidats page</h1> -->

<!-- <div class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3"> -->
     
<!-- <div class="col-md-11 col-md-offset-1">   -->
<div class="col-md-12">  
					
					
<form class="form-horizontal" role="form">	

<fieldset >
<!-- http://www.tutorialrepublic.com/codelab.php?topic=bootstrap&file=text-formatting -->
<!-- http://www.w3schools.com/bootstrap/bootstrap_ref_css_text.asp -->
<!-- http://www.tutorialspoint.com/bootstrap/bootstrap_typography.htm -->

	<!-- http://getbootstrap.com/2.3.2/base-css.html -->
    <!--   <legend class="text-muted"> -->
    <legend class="text-info">
     	<small>Recherche</small>
    </legend>		 
      
<!-- POSTE -->
	<div class="col-xs-5 col-sm-5 col-md-5">	
  		<div class="form-group">
    		<label for="inputPoste" class="col-md-4">Poste</label>
    		<div class="col-md-8">
    			<input type="text" name="poste" class="form-control input-sm" id="inputPoste" placeholder="" tabindex="1">
  			</div>  
  		</div>		
	</div>
<!-- MOTS -->
	<div class="col-xs-5 col-sm-5 col-md-5">
  		<div class="form-group">
    		<label for="inputMotsCles" class="col-md-4">Mots cl&eacutes</label>
     		<div class="col-md-8">
    			<input type="text" name="motsCles" class="form-control input-sm" id="inputMotsCles" placeholder="" tabindex="2">
  			</div>
  		</div>
	</div>
<!-- Bouton rechercher -->	
	<div class="col-xs-2 col-sm-2 col-md-2">
		<button type="submit" class="btn btn-primary btn-sm">Rechercher</button>
		<!-- <a href="#" class="btn btn-info btn-lg"><span class="glyphicon glyphicon-search"></span> Search</a> -->
	</div>
	
	
	<!-- http://www.bootply.com/QdS119dye4 -->
	<!-- http://www.w3schools.com/bootstrap/bootstrap_ref_js_collapse.asp -->
 	<div class="col-md-12">
 		<a data-toggle="collapse" data-target="#rechercheAvancee" ref="#">Recherche avanc&eacutee</a>

  	<div id="rechercheAvancee" class="collapse">
    			
		<!-- CRITERE 1 -->
<!-- 			<div class="col-xs-5 col-sm-5 col-md-4">
				<div class="form-group">
		  			<label for="selectCritere1" class="col-md-4">Critere 1</label>
		  			<div class="col-md-8 selectContainer">
			  			<select name="classe" class="form-control input-sm" id="selectCritere1"> 
			  				<option value=""></option>
			                <option value="">Critere a</option>
			                <option value="">Critere b</option>
			                <option value="">Critere c</option>
		  			</select>
		  			</div>
				</div>
			</div>  -->  
		<!-- CRITERE 2 -->
<!-- 			<div class="col-xs-5 col-sm-5 col-md-4">
				<div class="form-group">
		  			<label for="selectCritere2" class="col-md-4">Critere 2</label>
		  			<div class="col-md-8 selectContainer">
			  			<select name="diplome" class="form-control input-sm" id="selectCritere2">
			  		 		<option value=""></option>
			  		 		 <option value="">Critere a</option>
			                <option value="">Critere b</option>
			                <option value="">Critere c</option>
		  			</select>
		  			</div>
				</div>
			</div> -->  
		<!-- CRITERE 3 -->
<!-- 			<div class="col-xs-5 col-sm-5 col-md-4">	
		  		<div class="form-group">
		    		<label for="inputCritere" class="col-md-4">Critere 3</label>
		    		<div class="col-md-8">
		    			<input type="text" name="ecole" class="form-control input-sm" id="inputCritere" placeholder="" tabindex="1">
		  			</div>  
		  		</div>		
			</div> -->
		<!-- REGION -->
	<div class="col-xs-5 col-sm-5 col-md-5">
		<div class="form-group">
  			<label for="selectRegion" class="col-md-4">R&eacutegion</label>
  			<div class="col-md-8 selectContainer">
	  			<select name="region" class="form-control input-sm" id="selectRegion"> 
	  				<option value=""></option>
	  				
	  				
	  				<c:forEach items="${region}" var="region">
	  				 <option value="${region.key}">${region.value}</option>
	  				
	  				 </c:forEach>
	  				 
	  	
    
	                <!-- <option value="idf">Ile de France</option>
	                <option value="alsace">Alsace</option>
	                <option value="poitouCharentes">Poitou-Charentes</option>
	                <option value="nordPasCalais">Nord-Pas-de-Calais</option>
	                <option value="picardie">Picardie</option> -->
  			</select>
  			</div>
		</div>
	</div>   
<!-- DEPARTEMENT -->
	<div class="col-xs-5 col-sm-5 col-md-5">
		<div class="form-group">
  			<label for="selectDepartement" class="col-md-4">D&eacutepartement</label>
  			<div class="col-md-8 selectContainer">
	  			<select name="departement" class="form-control input-sm" id="selectDepartement">
	  		 		<option value=""></option>
	                <option value="allier">Allier</option>
	                <option value="aude">Aude</option>
	                <option value="meurtheMoselle">Meurthe-et-Moselle</option>
	                <option value="seineMarne">Seine-et-Marne</option>
	                <option value="valMarne">Val-de-Marne</option>
  			</select>
  			</div>
		</div>
	</div>  

	<div class="col-xs-5 col-sm-5 col-md-2">
			
	</div> 	
			
  	</div>
  
  	  </div>	
 
			

<!-- COMPETENCE -->	
<!-- 	<div class="col-xs-5 col-sm-5 col-md-5">	
  		<div class="form-group">
    		<label for="inputCompetence" class="col-md-4">Comp&eacutetence</label>
    		<div class="col-md-8">
    			<input type="text" name="competence" class="form-control input-sm" id="inputCompetence" placeholder="" tabindex="1">
  			</div>  
  		</div>		
	</div> -->
<!-- NIVEAU -->
<!-- 	<div class="col-xs-5 col-sm-5 col-md-5">
		<div class="form-group">
  			<label for="selectNiveau" class="col-md-4">Niveau</label>
  			<div class="col-md-8 selectContainer">
	  			<select name="niveau" class="form-control input-sm" id="selectNiveau">
	  		 		<option value=""></option>
	  		 		<option value="">*</option>
	  		 		<option value="">**</option>
	  		 		<option value="">***</option>
	  		 		<option value="">****</option>
	  		 		<option value="">*****</option>
  			</select>
  			</div>
		</div>
	</div>  
	<div class="col-xs-5 col-sm-5 col-md-2">
			
	</div>  --> 
</fieldset>			
</form>





<!-- RESULTATS RECHERCHE -->	
<div class="cold-md-12">	
	<fieldset>
	    <legend class="text-info">
	     	<small>R&eacutesultats</small>
	    </legend>	 
	</fieldset>
	
	<!-- <table class="table table-hover"> -->
	<table class="table table-striped ">
	  <tr>
	  	<td>
	  	  	<button type="button" class="btn btn-link btn-xs" data-toggle="modal" data-target="#modalDetailsCandidat">Candidat 1</button>
	  	</td>
        <td>John</td>
        <td>Doe</td>
        <td>john@example.com</td>
     </tr>
     <tr>
     	<td>Candidat 2</td>
        <td>Mary</td>
        <td>Moe</td>
        <td>mary@example.com</td>
     </tr>		
  	 <tr>
     	<td>Candidat 3</td>
        <td>Steeve</td>
        <td>Loe</td>
        <td>steeve@example.com</td>
     </tr>		
	</table>
</div>

<!-- MODAL DETAILS CANDIDAT -->
<div class="modal fade" id="modalDetailsCandidat" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog modal-lg" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Modal Header</h4>
        </div>
        <div class="modal-body">
          <p>This is a large modal.</p>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
    </div>	      
</div> 

	</div>		
	




    
    </div>
    
<!-- CHANGE PASSWORD -->
    <div role="tabpanel" class="tab-pane" id="changePassword">
    	
    	<!-- views/password.html -->
<!-- <h1>password page</h1> -->
<div class="col-md-8 col-md-offset-2">
<!-- <div class="col-md-12">   -->			
					
<form class="form-horizontal" role="form">	

<fieldset>
    <legend class="text-info">
     	<small>Mot de passe</small>
    </legend>	
    
    
<!-- ANCIEN MOT DE PASSE -->
	<div class="col-xs-5 col-sm-5 col-md-10 col-md-offset-1">
  		<div class="form-group">
    		<label for="inputOldMdp" class="col-md-5">Ancien mot de passe</label>
    		<div class="col-md-7">
    			<input type="text" name="oldPassword" class="form-control input-sm" id="inputOldMdp" placeholder="" tabindex="1">
  			</div>  
  		</div>		
	</div>
	
<!-- NOUVEAU MOT DE PASSE -->
	<div class="col-xs-5 col-sm-5 col-md-10 col-md-offset-1">
  		<div class="form-group">
    		<label for="inputNewMdp" class="col-md-5">Nouveau mot de passe</label>
    		<div class="col-md-7">
    			<input type="text" name="newPassword" class="form-control input-sm" id="inputNewMdp" placeholder="" tabindex="1">
  			</div>  
  		</div>		
	</div>	

<!-- CONFIRMATION MOT DE PASSE -->
	<div class="col-xs-5 col-sm-5 col-md-10 col-md-offset-1">
  		<div class="form-group">
    		<label for="inputConfirmMdp" class="col-md-5">Confirmation</label>
    		<div class="col-md-7">
    			<input type="text" name="confirmPassword" class="form-control input-sm" id="inputConfirmMdp" placeholder="" tabindex="1">
  			</div>  
  		</div>		
	</div>	 
	
	<div class="col-md-6 col-md-offset-3 col-md-push-4">
		<button type="submit" class="btn btn-primary btn-sm">Modifier</button>
		<!-- <a href="#" class="btn btn-info btn-lg"><span class="glyphicon glyphicon-search"></span> Search</a> -->
	</div>   
</fieldset>	

</form>
   
    </div>
    

  </div>
  	
<!-- PROFIL -->   
    <div role="tabpanel" class="tab-pane" id="profil">
    
   <!-- views/profileRecruteur.html -->

<!-- <h1>profile Recruteur page</h1> -->
<div class="col-md-12">  
					
					
<form class="form-horizontal" role="form">	

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
    
  
    	<div class="col-md-6 col-md-offset-3 col-md-push-2">
		
		<button type="submit" class="btn btn-primary btn-sm">Valider</button>
		<!-- <a href="#" class="btn btn-info btn-lg"><span class="glyphicon glyphicon-search"></span> Search</a> -->
	</div>  
	
		
</form>    	
    
    </div>  				

				
  				</div>
  			</div>
  		</div>
  
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