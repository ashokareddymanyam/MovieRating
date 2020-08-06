package com.movierating.api.converts;

import java.util.Arrays;
import java.util.List;

import javax.persistence.AttributeConverter;

public class ResponseEntity implements AttributeConverter<List<String>, String>{
	
	private String splitChar = ",";

	public ResponseEntity(String splitChar) {
		super();
		this.splitChar = splitChar;
	}

	public ResponseEntity() {
		super();
	}

	@Override
	public String convertToDatabaseColumn(List<String> attribute) {
		return String.join(getSplitChar(), attribute);
	}

	@Override
	public List<String> convertToEntityAttribute(String dbData) {
		return Arrays.asList(dbData.split(getSplitChar()));
	}

	public String getSplitChar() {
		return splitChar;
	}

	public void setSplitChar(String splitChar) {
		this.splitChar = splitChar;
	}

}
