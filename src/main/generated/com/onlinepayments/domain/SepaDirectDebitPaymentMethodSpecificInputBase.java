/*
 * This class was auto-generated.
 */
package com.onlinepayments.domain;

/**
 * Object containing the specific input details for SEPA direct debit payments
 */
public class SepaDirectDebitPaymentMethodSpecificInputBase {

	private SepaDirectDebitPaymentProduct771SpecificInputBase paymentProduct771SpecificInput = null;

	private Integer paymentProductId = null;

	/**
	 * Object containing information specific to SEPA Direct Debit
	 */
	public SepaDirectDebitPaymentProduct771SpecificInputBase getPaymentProduct771SpecificInput() {
		return paymentProduct771SpecificInput;
	}

	/**
	 * Object containing information specific to SEPA Direct Debit
	 */
	public void setPaymentProduct771SpecificInput(SepaDirectDebitPaymentProduct771SpecificInputBase value) {
		this.paymentProduct771SpecificInput = value;
	}

	/**
	 * Object containing information specific to SEPA Direct Debit
	 */
	public SepaDirectDebitPaymentMethodSpecificInputBase withPaymentProduct771SpecificInput(SepaDirectDebitPaymentProduct771SpecificInputBase value) {
		this.paymentProduct771SpecificInput = value;
		return this;
	}

	/**
	 * Payment product identifier - Please see Products documentation for a full overview of possible values.
	 */
	public Integer getPaymentProductId() {
		return paymentProductId;
	}

	/**
	 * Payment product identifier - Please see Products documentation for a full overview of possible values.
	 */
	public void setPaymentProductId(Integer value) {
		this.paymentProductId = value;
	}

	/**
	 * Payment product identifier - Please see Products documentation for a full overview of possible values.
	 */
	public SepaDirectDebitPaymentMethodSpecificInputBase withPaymentProductId(Integer value) {
		this.paymentProductId = value;
		return this;
	}
}
