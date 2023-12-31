package net.innominds.springboot.exceptoin;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private  String resourceName;
	private String fieldname;
	private Object fieldValue;
	public ResourceNotFoundException(String resourceName, String fieldname, Object fieldValue) {
		super(String.format("%s not found with %s : '%s'", resourceName, fieldname, fieldValue));
		this.resourceName = resourceName;
		this.fieldname = fieldname;
		this.fieldValue = fieldValue;
	}
	
	public String getResourceName() {
		return  resourceName;
	}
	
	public String getFeildName() {
		return fieldname;
	}
	
	public Object getFeildValue() {
		return fieldValue;
	}
}
