$(function() {
	// solving the active menu problem
	switch(x) {
	
		case 'About Us':
			$('#about').addClass('active');
			break;
		case 'Contac':
			$('#contact').addClass('active');
			break;
		case 'Shopping ':
			$('#Home').addClass('active');
			break;
		case 'View Products':
			$('#listProducts').addClass("active");
		default:
			$('#home').addClass('active');
			break;		
	}
});