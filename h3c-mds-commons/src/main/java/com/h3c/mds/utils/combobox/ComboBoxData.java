package com.h3c.mds.utils.combobox;

public class ComboBoxData {

	private String id;
	private String value;
	private String text;
	private boolean selected;
	private String readers;

	public ComboBoxData(String id, String value, String text, String readers) {
		super();
		this.id = id;
		this.value = value;
		this.text = text;
		this.readers = readers;
	}

	public ComboBoxData(String id, String value, String text, boolean selected, String readers) {
		super();
		this.id = id;
		this.value = value;
		this.text = text;
		this.selected = selected;
		this.readers = readers;
	}

	public ComboBoxData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public String getReaders() {
		return readers;
	}

	public void setReaders(String readers) {
		this.readers = readers;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
