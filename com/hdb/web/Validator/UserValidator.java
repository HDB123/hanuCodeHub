package com.hdb.web.Validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.hdb.web.dto.User;
@Component
public class UserValidator  implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		System.out.println("supportsssss");
		return User.class.equals(arg0);
	}

	@Override
	public void validate(Object obj, Errors err) {
		// TODO Auto-generated method stub
		
		 ValidationUtils.rejectIfEmpty(err, "name", "user.name.empty");
	      ValidationUtils.rejectIfEmpty(err, "email", "user.email.empty");
	      ValidationUtils.rejectIfEmpty(err, "gender", "user.gender.empty");
	      ValidationUtils.rejectIfEmpty(err, "languages", "user.languages.empty");
	      User user = (User) obj;

	      Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
	            Pattern.CASE_INSENSITIVE);
	      if (!(pattern.matcher(user.getEmail()).matches())) {
	         err.rejectValue("email", "user.email.invalid");
	      }

	      if(user.getName().length()<3) {
	    	  err.rejectValue("name", "name.length");
	      }
		
	}

}
