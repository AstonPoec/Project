<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<title>Responsive Menu - ProgrammingFree</title>
<!-- Mobile viewport optimized -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width">
<!-- CSS -->

<link href="bootstrap/css/bootstrap.css" rel="stylesheet"
	type="text/css" />
<link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet"
	type="text/css" />
<link rel=stylesheet href="formulaire.css" type="text/css">


</head>
<body>


	<div>

		<!-- Nav tabs -->
		<ul class="nav nav-tabs" role="tablist">
			<li role="presentation" class="active"><a href="#home"
				aria-controls="home" role="tab" data-toggle="tab">Etat civil</a></li>
			<li role="presentation"><a href="#competence"
				aria-controls="profile" role="tab" data-toggle="tab">Compétences</a></li>
			<li role="presentation"><a href="#experience"
				aria-controls="messages" role="tab" data-toggle="tab">Expérience</a></li>
			<li role="presentation"><a href="#formation"
				aria-controls="settings" role="tab" data-toggle="tab">Formation</a></li>
			<li role="presentation"><a href="#divers"
				aria-controls="settings" role="tab" data-toggle="tab">Divers</a></li>
		</ul>

		<!--   <!-- Tab panes -->
		<!--   <div class="tab-content"> -->
		<!--     <div role="tabpanel" class="tab-pane active" id="home">...</div> -->
		<!--     <div role="tabpanel" class="tab-pane" id="profile">...</div> -->
		<!--     <div role="tabpanel" class="tab-pane" id="messages">...</div> -->
		<!--     <div role="tabpanel" class="tab-pane" id="settings">...</div> -->
		<!--   </div> -->

	</div>


	<div id="myTabContent" class="tab-content">
		<div role="tabpanel" class="tab-pane fade in active" id="home"
			aria-labelledBy="home-tab">
			<div class=cvt-form>
				<form action="#" class="cvt-form cvt-register">
					<p>
						<span class="cvt-italic">Complétez le formulaire. Les
							champs marqués par </span><em>*</em> sont <strong>obligatoires</strong>
					</p>

					<fieldset>

						<legend>Infos connexion</legend>
						<label for="register-login">Login(doit être l'email)</label> <input
							id="register-login" placeholder="Votre login" autofocus=""
							value=""> <label for="cvt-motdepasse">Mot de
							passe</label> <input name="cvt-motdepasse" id="cvt-motdepasse"
							type="password" name="" placeholder="Votre mot de passe"
							autofocus=""></br> </br> <label for="cvt-motdepasse">
							Confirmez votre mot de passe</label> <input name="cvt-motdepasse"
							id="cvt-motdepasse" type="password" name=""
							placeholder="Votre mot de passe" autofocus="">
</fieldset>
						<fieldset>

							<legend>Etat civil</legend>

							<label for="cvt-name">Nom</label> <input name="cvt-name"
								id="cvt-name" placeholder="Votre nom" autofocus="" required="">

							<label for="cvt-prenom">Prénom</label> <input name="cvt-prenom"
								id="cvt-prenom" placeholder="Votre Prénom" autofocus=""
								required=""></br> <label for="cvt-datedenaissance">Date
								de naissance</label> <input name="cvt-datedenaissance"
								id="cvt-datedenaissance" placeholder="00/00/0000" autofocus=""
								required=""> <label for="cvt-adresse">Adresse</label> <input
								name="cvt-adresse" id="cvt-adresse" placeholder="Votre adresse"
								autofocus="" required=""></br><label for="cvt-codepostal">Code Postal</label> <input
								name="cvt-codepostal" id="cvt-codepostal" placeholder="Votre code postal"
								autofocus="" required=""><label for="cvt-ville">Ville</label> <input
								name="cvt-ville" id="cvt-ville" placeholder="Votre ville"
								autofocus="" required=""></br> <label for="cvt-telephone">Portable</label>
								<input name="cvt-telephone" id="cvt-telephone"
								placeholder="06xxxxxxxx" pattern="06[0-9]{8}" type="tel"> <span
								class="cvt-departement">Département</span> <select name="cvt-departement">
								<option>Haut de seine</option>
								<option>Bac +1</option>
							
							</select>

<!-- 							<label for="cvt-email">Email</label> <input name="cvt-email" -->
<!-- 								id="cvt-email" type="email" -->
<!-- 								placeholder="prenom.nom@blablabla.fr" required="" -->
<!-- 								pattern="[a-zA-Z]*.[a-zA-Z]*@polytechnique.edu">

</br> -->
								 <label
								for="cvt-classe">Classe</label> <input name="cvt-classe"
								id="cvt-classe" type="text" placeholder="classeX" required="">

							<label for="cvt-contrat">Contrat</label> <input
								name="cvt-contrat" id="cvt-contrat" type="text"
								placeholder="classeX" required=""> <span
								class="cvt-espace">Niveau d'étude</span> <select name="cvt-niveau">
								<option>Baccalauréat</option>
								<option>Bac +1</option>
								<option selected="selected">Bac +2</option>
								<option>Bac +3</option>
								<option>Bac +4</option>
								<option>Bac +5</option>
							</select>
</fieldset>
							<p>
							<input value="Enregistrer" type="submit"
									style="alignment-adjust: central">
								<input value="Suivant" type="submit"
									style="alignment-adjust: central">
							</p>
				</form>
			</div>
			</fieldset>
		</div>
		<div role="tabpanel" class="tab-pane fade" id="competence"
			aria-labelledBy="profile-tab">
			<fieldset>
				<legend>COMPETENCES</legend>


				<span class="cvt-competence">Compétences</span> <select
					name="competence">
					<option>JAVA</option>
					<option>Angular JS</option>
					<option>Javascript</option>
					<option>JQuery</option>
					<option selected="selected">JAVA J2E</option>
					<option>DOT NET</option>
					<option>C#</option>
					<option>C++</option>
				</select> <span class="cvt-niveau">Niveau</span> <select name="niveau">
					<option>*</option>
					<option>**</option>
					<option selected="selected">***</option>
					<option>****</option>
					<option>*****</option>
					<p>
						<input value="Ajouter Compétence" type="submit"
							style="alignment-adjust: central" onclick="ajouterLignes();">
					</p>
				</select>


				<table id="cvt-array">
					<caption></caption>
					<thead>
						
							<th>Compétences</th> 
							<th>Niveau</th> 	
					</thead>
					<tfoot></tfoot>
					<tbody>
						<tr>
							<td>JAVA J2E</td>
							<td></td>
						</tr>
						<tr><td>Spring MVC</td></tr>
					
					</tbody>
				</table>

				</table>
				
							<p>
							<input value="Précédent" type="submit"
									style="alignment-adjust: central">
								<input value="Enregistrer" type="submit"
									style="alignment-adjust: central">
									<input value="Suivant" type="submit"
									style="alignment-adjust: central">
							</p>
			
			</fieldset>
			
		</div>

		<div role="tabpanel" class="tab-pane fade" id="experience"
			aria-labelledBy="dropdown1-tab">
			
			<fieldset>
				<legend>EXPERIENCES PROFESSIONNELLES</legend>
				<label for="entreprise">DE</label><input id="cvt-periodedebut"
					 type="date" required=""> 
					 <label
					for="poste">A</label><input id="cvt-periodefin"
					 type="date"required="">
					
					<label for="posteoccupe">POSTE</label><input id="cvt-posteoccupe" placeholder="poste occupé"
					required=""> 
				
					<label for="finperiode">ENTREPRISE</label><input
					id="cvt-entreprise" type="date" placeholder="nom de l'entreprise" >	<p>
						<input value="Ajouter Expérience" type="submit" style="alignment-adjust:central" onclick="ajouterLignes();">
						</p><br> 
				
		
			</fieldset>

			<table id="cvt-array">
					<caption></caption>
					<thead>
						
							<th>Début</th> 
							<th>Fin</th>
							<th>Poste</th>
							<th>Entreprise</th> 	
					</thead>
					<tfoot></tfoot>
					<tbody>
						<tr>
							<td></td>
							<td></td>
						</tr>
						<tr><td></td></tr>
					
					</tbody>
				</table>

				</table>
				
				<p>
							<input value="Précédent" type="submit"
									style="alignment-adjust: central">
								<input value="Enregistrer" type="submit"
									style="alignment-adjust: central">
									<input value="Suivant" type="submit"
									style="alignment-adjust: central">
							</p>
		
		</div>
		<div role="tabpanel" class="tab-pane fade" id="formation"
			aria-labelledBy="dropdown1-tab">
			<fieldset>
				<legend>FORMATION</legend>
				
				<p>Etes-vous actuellement en formation Ã  ASTON ? 
				<select name="cvt-formationactuel">
					<option selected="selected">Oui</option>
					<option>Non</option>
				</select>
				<select name="cvt-formationaston">
					<option selected="selected">POEC JAVA</option>
					<option>POEC PHP</option>
					<option>POEC DOT NET</option>
				</select>
			
				</p>
				<label for="entreprise">DE</label><input id="cvt-periodedebut"
					 type="date" required=""> 
					 <label
					for="poste">A</label><input id="cvt-periodefin"
					 type="date"required=""><br> 
					
					<label
					for="posteoccupe">Diplôme</label><input id="cvt-posteoccupe"
					required=""> 
					
					<label for="finperiode">Ecole/Université</label><input
					id="cvt-entreprise" type="date" placeholder="nom de l'école/université" required=""><br>
					
					<table id="cvt-array">
					<caption></caption>
					<thead>
						
							<th>Début</th> 
							<th>Fin</th>
							<th>Diplôme</th>
							<th>Ecole/Université</th> 	
					</thead>
					<tfoot></tfoot>
					<tbody>
						<tr>
							<td></td>
							<td></td>
						</tr>
						<tr><td></td></tr>
					
					</tbody>
				</table>

				</table>
				
				<!-- 			pattern=<label for="classe">Classe</label> <input id="classe type="text" placeholder="classeX" required="">"[0-9]{2}" required="" type="number">  -->
				<!-- 		<textarea id="comments"></textarea> -->
			</fieldset>

			<p>
							<input value="Précédent" type="submit"
									style="alignment-adjust: central">
								<input value="Enregistrer" type="submit"
									style="alignment-adjust: central">
									<input value="Suivant" type="submit"
									style="alignment-adjust: central">
							</p>
		</fieldset>
		</div>
		<div role="tabpanel" class="tab-pane fade" id="divers"
			aria-labelledBy="dropdown2-tab">
				<fieldset>
				<legend>DIVERS</legend>
				
				
				 <p><input id="cvt-periodedebut"
					 type="date" required="">
				<input value="Parcourir" type="submit"
					style="alignment-adjust: central">
			</p>
					 <p><label
					for="poste">TELECHARGER UN CV</label><input id="cvt-periodefin"
					 type="date"required=""><input value="Parcourir" type="submit"
					style="alignment-adjust: central">
			</p> 
					<span class="cvt-espace">Véhiculé?</span>
					<select name="cvt-formationaston">
					<option selected="selected">Oui</option>
					<option>Non</option>
					
				</select>
				<p>
							<input value="Précédent" type="submit"
									style="alignment-adjust: central">
								<input value="Enregistrer" type="submit"
									style="alignment-adjust: central">
									
							</p>
				<!-- 			pattern=<label for="classe">Classe</label> <input id="classe type="text" placeholder="classeX" required="">"[0-9]{2}" required="" type="number">  -->
				<!-- 		<textarea id="comments"></textarea> -->
			</fieldset>
		</div>
	</div>
	</div>


	


	<!--Scripts-->
	
	<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
	<script src="bootstrap/js/bootstrap.js" type="text/javascript"></script>
	<script src="menu.js" type="text/javascript"></script>
</html>