	

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
			case 'Booking':
				$('#booking').addClass('active');
				break;
			
			default:
				$('#home').addClass('active');
				break;
			
		}
		
		
	
	
	

	
	var $alert = $('.alert');
	
	if($alert.length){
		setTimeout(function(){
			$alert.fadeOut('slow');
		} , 3000)
	}
	});