/*
 * This class was auto-generated.
 */
package com.onlinepayments.domain;

/**
 * Object containing personal information of the customer
 */
public class MandatePersonalInformationResponse {

	private MandatePersonalNameResponse name = null;

	private String title = null;

	/**
	 * Object containing the name details of the customer.
	 */
	public MandatePersonalNameResponse getName() {
		return name;
	}

	/**
	 * Object containing the name details of the customer.
	 */
	public void setName(MandatePersonalNameResponse value) {
		this.name = value;
	}

	/**
	 * Object containing the name details of the customer.
	 */
	public MandatePersonalInformationResponse withName(MandatePersonalNameResponse value) {
		this.name = value;
		return this;
	}

	/**
	 * Object containing the title of the customer (Mr, Miss or Mrs)
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Object containing the title of the customer (Mr, Miss or Mrs)
	 */
	public void setTitle(String value) {
		this.title = value;
	}

	/**
	 * Object containing the title of the customer (Mr, Miss or Mrs)
	 */
	public MandatePersonalInformationResponse withTitle(String value) {
		this.title = value;
		return this;
	}
}