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
			case 'Service':
				$('#service').addClass('active');
				break;
			default:
				$('#home').addClass('active');
				break;
			
		}
		
		
	
	
	
		var trucks = [
	
					['1', 'ABC'],
					['2', 'CYX'],
					['3', 'PQR'],
					['4', 'MNO'],
					['5', 'WVB'],
					['6', 'CFG'],
					['7', 'HIK'],
					['8', 'LMP']
					
					];
		
		var $table = $('#TruckListTable');
	
			if($table.length){

		//console.log('Inside the table');		
		
			$table.DataTable({
			data:trucks		
			
			});	
		}
	
	
	
	});