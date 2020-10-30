package yvan.finalProject.DriverDrowsiness.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import yvan.finalProject.DriverDrowsinessBackend.domain.Truck;

public class TruckValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {

		return Truck.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		Truck truck = (Truck) target;
		
		//whether file has been selected or not
		
		if(truck.getFile() == null || 
				truck.getFile().getOriginalFilename().equals("")) {
			errors.rejectValue("file", null, "please select an image file to upload!");
			return ;
		}
		
		if(!(truck.getFile().getContentType().equals("image/jpeg") ||
				truck.getFile().getContentType().equals("image/png")||
				truck.getFile().getContentType().equals("image/gif")

						))
		{
		errors.rejectValue("file", null, "please use only image file for upload ");
			return;
		}
	}

}
