package com.java.util;

import java.beans.PropertyEditorSupport;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateConverter extends PropertyEditorSupport {

	@Override
	public String getAsText() {
		LocalDate date = (LocalDate) getValue();
		return date.toString();
	}

	@Override
	public void setAsText(String text) throws java.lang.IllegalArgumentException {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(text, formatter);
		setValue(date);
	}
}
