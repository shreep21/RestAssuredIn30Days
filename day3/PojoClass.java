package day3;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PojoClass {
	/* 
	 * Simple JsonInput
	 * "name":"Priya"
	 * "job":"Senior Test Engineer"
	 * 
	 * baseURI: https://reqres.in/
	 * basePath: /api/users
	 */
	//Serialization
	@JsonProperty
	private String nameString;
	@JsonProperty
	private String jobString;
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getJobString() {
		return jobString;
	}
	public void setJobString(String jobString) {
		this.jobString = jobString;
	}
	
	
}
