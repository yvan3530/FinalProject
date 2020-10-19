	

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
	
	


$('.switch input[type="checkbox"]').on('change', function(){

	var checkbox = $(this);
	var checked = checkbox.prop('checked');
	var dMsg = (checked)? 'you want to activate the truck?':
						 'you want to deactivate the truck?';
	var value = checkbox.prop('value');

	bootbox.confirm({

		size: 'medium',
		title: 'Truck Activation & Deactivation',
		message :dMsg,
		callback: function(confirmed){


			if(confirmed){

				console.log(value);
				bootbox.alert({

					size: 'medium',
					title: 'Information',
					message: 'you are going to perform operation on truck' + value



		});


			}

			else{

				checkbox.prop('checked',!checked);


			}

		}





	});






});





	
	});