
//onction utilisée pour le contenu des onglets du menu

//$(function()
//{ 
//	$("#barreMenuHorizontal").tabs(); 
//});

$(function()
{ 
	$("#barreMenuVertical").tabs(); 
});


var url = document.location.toString();
if (url.match('#')) {
  $('.exemple a[href=#'+url.split('#')[1]+']').tab('show') ;
}