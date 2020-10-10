$(function() {
	
	switch(menu) {
		
		case 'About Us':
			$('#about').addClass('active');
			break;
		case 'Health':
			$('#health').addClass('active');
			break;
		case 'Contact Us':
			$('#contact').addClass('active');
			break;
		case 'Service':
			$('#service').addClass('active');
			break;
		default:
			$('#home').addClass('active');
			break;
			
		}
		
		
	});