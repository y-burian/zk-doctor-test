package com.opengate.Util;

public class Page {

	private String uri;
	private String label;
	private String imageUri;

	public Page(String uri, String label) {
		this.uri = uri;
		this.label = label;
	}

	public Page(String uri, String label, String imageUri) {
		this.uri = uri;
		this.label = label;
		this.imageUri = imageUri;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}

}
