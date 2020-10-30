	

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
		
		
	var token = $('meta[name="_csrf"]').attr('content');
	
	var header = $('meta[name="_csrf_header"]').attr('content');
	
	if(token.length > 0 && header.length > 0) {
	
		$(document).ajaxSend(function(e,xhr,option) {
		
		xhr.setRequestHeader(header,token);
		
		
		});
		
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


	var $loginForm = $('#loginForm');

if($loginForm.length){
    $loginForm.validate({

        rules : {
            username : {
                required: true,
                email: true
            },
            password: {
                required: true

            }

        },
        messages : {
            username : {
                required: 'Please enter the username!',
                email: 'Please enter valid email address!'
            },
            password: {
                required: 'Please enter the Password!'
            }
        },
        errorElement: 'em',
        errorPlacement: function(error, element){
            error.addClass('help-block');
            error.insertAfter(element);
        }
        

    });
}


	
	});