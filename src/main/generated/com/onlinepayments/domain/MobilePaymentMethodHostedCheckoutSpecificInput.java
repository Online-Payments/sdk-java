/*
 * This class was auto-generated.
 */
package com.onlinepayments.domain;

/**
 * Object containing the specific input details for mobile payments
 */
public class MobilePaymentMethodHostedCheckoutSpecificInput {

	private String authorizationMode = null;

	private MobilePaymentProduct320SpecificInput paymentProduct320SpecificInput = null;

	private Integer paymentProductId = null;

	/**
	 * Determines the type of the authorization that will be used. Allowed values: 
	 *   * FINAL_AUTHORIZATION - The payment creation results in an authorization that is ready for capture. Final authorizations can't be reversed and need to be captured for the full amount within 7 days. 
	 *   * PRE_AUTHORIZATION - The payment creation results in a pre-authorization that is ready for capture. Pre-authortizations can be reversed and can be captured within 30 days. The capture amount can be lower than the authorized amount. 
	 *   * SALE - The payment creation results in an authorization that is already captured at the moment of approval. 
	 * 
	 *   Only used with some acquirers, ignored for acquirers that do not support this. In case the acquirer does not allow this to be specified the authorizationMode is 'unspecified', which behaves similar to a final authorization.
	 */
	public String getAuthorizationMode() {
		return authorizationMode;
	}

	/**
	 * Determines the type of the authorization that will be used. Allowed values: 
	 *   * FINAL_AUTHORIZATION - The payment creation results in an authorization that is ready for capture. Final authorizations can't be reversed and need to be captured for the full amount within 7 days. 
	 *   * PRE_AUTHORIZATION - The payment creation results in a pre-authorization that is ready for capture. Pre-authortizations can be reversed and can be captured within 30 days. The capture amount can be lower than the authorized amount. 
	 *   * SALE - The payment creation results in an authorization that is already captured at the moment of approval. 
	 * 
	 *   Only used with some acquirers, ignored for acquirers that do not support this. In case the acquirer does not allow this to be specified the authorizationMode is 'unspecified', which behaves similar to a final authorization.
	 */
	public void setAuthorizationMode(String value) {
		this.authorizationMode = value;
	}

	/**
	 * Determines the type of the authorization that will be used. Allowed values: 
	 *   * FINAL_AUTHORIZATION - The payment creation results in an authorization that is ready for capture. Final authorizations can't be reversed and need to be captured for the full amount within 7 days. 
	 *   * PRE_AUTHORIZATION - The payment creation results in a pre-authorization that is ready for capture. Pre-authortizations can be reversed and can be captured within 30 days. The capture amount can be lower than the authorized amount. 
	 *   * SALE - The payment creation results in an authorization that is already captured at the moment of approval. 
	 * 
	 *   Only used with some acquirers, ignored for acquirers that do not support this. In case the acquirer does not allow this to be specified the authorizationMode is 'unspecified', which behaves similar to a final authorization.
	 */
	public MobilePaymentMethodHostedCheckoutSpecificInput withAuthorizationMode(String value) {
		this.authorizationMode = value;
		return this;
	}

	/**
	 * Object containing information specific to Google Pay. Required for payments with product 320.
	 */
	public MobilePaymentProduct320SpecificInput getPaymentProduct320SpecificInput() {
		return paymentProduct320SpecificInput;
	}

	/**
	 * Object containing information specific to Google Pay. Required for payments with product 320.
	 */
	public void setPaymentProduct320SpecificInput(MobilePaymentProduct320SpecificInput value) {
		this.paymentProduct320SpecificInput = value;
	}

	/**
	 * Object containing information specific to Google Pay. Required for payments with product 320.
	 */
	public MobilePaymentMethodHostedCheckoutSpecificInput withPaymentProduct320SpecificInput(MobilePaymentProduct320SpecificInput value) {
		this.paymentProduct320SpecificInput = value;
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
	public MobilePaymentMethodHostedCheckoutSpecificInput withPaymentProductId(Integer value) {
		this.paymentProductId = value;
		return this;
	}
}
