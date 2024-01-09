/*
 * This class was auto-generated.
 */
package com.onlinepayments.domain;

/**
 * Object containing the specific input details for card payments
 */
public class CardPaymentMethodSpecificInput {

	private Boolean allowDynamicLinking = null;

	private String authorizationMode = null;

	private Card card = null;

	private String cardOnFileRecurringExpiration = null;

	private String cardOnFileRecurringFrequency = null;

	private CurrencyConversionInput currencyConversion = null;

	private String initialSchemeTransactionId = null;

	private Boolean isRecurring = null;

	private PaymentProduct130SpecificInput paymentProduct130SpecificInput = null;

	private PaymentProduct3208SpecificInput paymentProduct3208SpecificInput = null;

	private PaymentProduct3209SpecificInput paymentProduct3209SpecificInput = null;

	private Integer paymentProductId = null;

	private CardRecurrenceDetails recurring = null;

	private String returnUrl = null;

	private String schemeReferenceData = null;

	private Boolean skipAuthentication = null;

	private ThreeDSecure threeDSecure = null;

	private String token = null;

	private Boolean tokenize = null;

	private String transactionChannel = null;

	private String unscheduledCardOnFileRequestor = null;

	private String unscheduledCardOnFileSequenceIndicator = null;

	/**
	 * * true - Default - Allows subsequent payments to use PSD2 dynamic linking from this payment (including Card On File).
	 * * false - Indicates that the dynamic linking (including Card On File data) will be ignored.
	 */
	public Boolean getAllowDynamicLinking() {
		return allowDynamicLinking;
	}

	/**
	 * * true - Default - Allows subsequent payments to use PSD2 dynamic linking from this payment (including Card On File).
	 * * false - Indicates that the dynamic linking (including Card On File data) will be ignored.
	 */
	public void setAllowDynamicLinking(Boolean value) {
		this.allowDynamicLinking = value;
	}

	/**
	 * * true - Default - Allows subsequent payments to use PSD2 dynamic linking from this payment (including Card On File).
	 * * false - Indicates that the dynamic linking (including Card On File data) will be ignored.
	 */
	public CardPaymentMethodSpecificInput withAllowDynamicLinking(Boolean value) {
		this.allowDynamicLinking = value;
		return this;
	}

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
	public CardPaymentMethodSpecificInput withAuthorizationMode(String value) {
		this.authorizationMode = value;
		return this;
	}

	/**
	 * Object containing card details
	 */
	public Card getCard() {
		return card;
	}

	/**
	 * Object containing card details
	 */
	public void setCard(Card value) {
		this.card = value;
	}

	/**
	 * Object containing card details
	 */
	public CardPaymentMethodSpecificInput withCard(Card value) {
		this.card = value;
		return this;
	}

	/**
	 * The end date of the last scheduled payment in a series of transactions.
	 * Format YYYYMMDD
	 */
	public String getCardOnFileRecurringExpiration() {
		return cardOnFileRecurringExpiration;
	}

	/**
	 * The end date of the last scheduled payment in a series of transactions.
	 * Format YYYYMMDD
	 */
	public void setCardOnFileRecurringExpiration(String value) {
		this.cardOnFileRecurringExpiration = value;
	}

	/**
	 * The end date of the last scheduled payment in a series of transactions.
	 * Format YYYYMMDD
	 */
	public CardPaymentMethodSpecificInput withCardOnFileRecurringExpiration(String value) {
		this.cardOnFileRecurringExpiration = value;
		return this;
	}

	/**
	 * Period of payment occurrence for recurring and installment payments. Allowed values:
	 *   * Yearly
	 *   * Quarterly
	 *   * Monthly
	 *   * Weekly
	 *   * Daily
	 */
	public String getCardOnFileRecurringFrequency() {
		return cardOnFileRecurringFrequency;
	}

	/**
	 * Period of payment occurrence for recurring and installment payments. Allowed values:
	 *   * Yearly
	 *   * Quarterly
	 *   * Monthly
	 *   * Weekly
	 *   * Daily
	 */
	public void setCardOnFileRecurringFrequency(String value) {
		this.cardOnFileRecurringFrequency = value;
	}

	/**
	 * Period of payment occurrence for recurring and installment payments. Allowed values:
	 *   * Yearly
	 *   * Quarterly
	 *   * Monthly
	 *   * Weekly
	 *   * Daily
	 */
	public CardPaymentMethodSpecificInput withCardOnFileRecurringFrequency(String value) {
		this.cardOnFileRecurringFrequency = value;
		return this;
	}

	public CurrencyConversionInput getCurrencyConversion() {
		return currencyConversion;
	}

	public void setCurrencyConversion(CurrencyConversionInput value) {
		this.currencyConversion = value;
	}

	public CardPaymentMethodSpecificInput withCurrencyConversion(CurrencyConversionInput value) {
		this.currencyConversion = value;
		return this;
	}

	/**
	 * The unique scheme transactionId of the initial transaction that was performed with SCA. In case this is unknown a scheme transactionId of an earlier transaction part of the same sequence can be used as a fall-back. Strongly advised to be submitted for any MerchantInitiated or recurring transaction (a subsequent one).
	 */
	public String getInitialSchemeTransactionId() {
		return initialSchemeTransactionId;
	}

	/**
	 * The unique scheme transactionId of the initial transaction that was performed with SCA. In case this is unknown a scheme transactionId of an earlier transaction part of the same sequence can be used as a fall-back. Strongly advised to be submitted for any MerchantInitiated or recurring transaction (a subsequent one).
	 */
	public void setInitialSchemeTransactionId(String value) {
		this.initialSchemeTransactionId = value;
	}

	/**
	 * The unique scheme transactionId of the initial transaction that was performed with SCA. In case this is unknown a scheme transactionId of an earlier transaction part of the same sequence can be used as a fall-back. Strongly advised to be submitted for any MerchantInitiated or recurring transaction (a subsequent one).
	 */
	public CardPaymentMethodSpecificInput withInitialSchemeTransactionId(String value) {
		this.initialSchemeTransactionId = value;
		return this;
	}

	/**
	 * * true - Indicates that the transactions is part of a scheduled recurring sequence. In addition, recurringPaymentSequenceIndicator indicates if the transaction is the first or subsequent in a recurring sequence. 
	 * * false - Indicates that the transaction is not part of a scheduled recurring sequence.
	 * The default value for this property is false.
	 */
	public Boolean getIsRecurring() {
		return isRecurring;
	}

	/**
	 * * true - Indicates that the transactions is part of a scheduled recurring sequence. In addition, recurringPaymentSequenceIndicator indicates if the transaction is the first or subsequent in a recurring sequence. 
	 * * false - Indicates that the transaction is not part of a scheduled recurring sequence.
	 * The default value for this property is false.
	 */
	public void setIsRecurring(Boolean value) {
		this.isRecurring = value;
	}

	/**
	 * * true - Indicates that the transactions is part of a scheduled recurring sequence. In addition, recurringPaymentSequenceIndicator indicates if the transaction is the first or subsequent in a recurring sequence. 
	 * * false - Indicates that the transaction is not part of a scheduled recurring sequence.
	 * The default value for this property is false.
	 */
	public CardPaymentMethodSpecificInput withIsRecurring(Boolean value) {
		this.isRecurring = value;
		return this;
	}

	/**
	 * Object containing specific input required for CB payments
	 */
	public PaymentProduct130SpecificInput getPaymentProduct130SpecificInput() {
		return paymentProduct130SpecificInput;
	}

	/**
	 * Object containing specific input required for CB payments
	 */
	public void setPaymentProduct130SpecificInput(PaymentProduct130SpecificInput value) {
		this.paymentProduct130SpecificInput = value;
	}

	/**
	 * Object containing specific input required for CB payments
	 */
	public CardPaymentMethodSpecificInput withPaymentProduct130SpecificInput(PaymentProduct130SpecificInput value) {
		this.paymentProduct130SpecificInput = value;
		return this;
	}

	/**
	 * Object containing specific input required for OneyDuplo Leroy Merlin payments.
	 */
	public PaymentProduct3208SpecificInput getPaymentProduct3208SpecificInput() {
		return paymentProduct3208SpecificInput;
	}

	/**
	 * Object containing specific input required for OneyDuplo Leroy Merlin payments.
	 */
	public void setPaymentProduct3208SpecificInput(PaymentProduct3208SpecificInput value) {
		this.paymentProduct3208SpecificInput = value;
	}

	/**
	 * Object containing specific input required for OneyDuplo Leroy Merlin payments.
	 */
	public CardPaymentMethodSpecificInput withPaymentProduct3208SpecificInput(PaymentProduct3208SpecificInput value) {
		this.paymentProduct3208SpecificInput = value;
		return this;
	}

	/**
	 * Object containing specific input required for OneyDuplo Alcampo payments.
	 */
	public PaymentProduct3209SpecificInput getPaymentProduct3209SpecificInput() {
		return paymentProduct3209SpecificInput;
	}

	/**
	 * Object containing specific input required for OneyDuplo Alcampo payments.
	 */
	public void setPaymentProduct3209SpecificInput(PaymentProduct3209SpecificInput value) {
		this.paymentProduct3209SpecificInput = value;
	}

	/**
	 * Object containing specific input required for OneyDuplo Alcampo payments.
	 */
	public CardPaymentMethodSpecificInput withPaymentProduct3209SpecificInput(PaymentProduct3209SpecificInput value) {
		this.paymentProduct3209SpecificInput = value;
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
	public CardPaymentMethodSpecificInput withPaymentProductId(Integer value) {
		this.paymentProductId = value;
		return this;
	}

	/**
	 * Object containing data related to recurring
	 */
	public CardRecurrenceDetails getRecurring() {
		return recurring;
	}

	/**
	 * Object containing data related to recurring
	 */
	public void setRecurring(CardRecurrenceDetails value) {
		this.recurring = value;
	}

	/**
	 * Object containing data related to recurring
	 */
	public CardPaymentMethodSpecificInput withRecurring(CardRecurrenceDetails value) {
		this.recurring = value;
		return this;
	}

	/**
	 * The URL that the customer is redirect to after the payment flow has finished. You can add any number of key value pairs in the query string that, for instance help you to identify the customer when they return to your site. Please note that we will also append some additional key value pairs that will also help you with this identification process.
	 * Note: The provided URL should be absolute and contain the protocol to use, e.g. http:// or https://. For use on mobile devices a custom protocol can be used in the form of protocol://. This protocol must be registered on the device first.
	 * URLs without a protocol will be rejected.
	 */
	public String getReturnUrl() {
		return returnUrl;
	}

	/**
	 * The URL that the customer is redirect to after the payment flow has finished. You can add any number of key value pairs in the query string that, for instance help you to identify the customer when they return to your site. Please note that we will also append some additional key value pairs that will also help you with this identification process.
	 * Note: The provided URL should be absolute and contain the protocol to use, e.g. http:// or https://. For use on mobile devices a custom protocol can be used in the form of protocol://. This protocol must be registered on the device first.
	 * URLs without a protocol will be rejected.
	 */
	public void setReturnUrl(String value) {
		this.returnUrl = value;
	}

	/**
	 * The URL that the customer is redirect to after the payment flow has finished. You can add any number of key value pairs in the query string that, for instance help you to identify the customer when they return to your site. Please note that we will also append some additional key value pairs that will also help you with this identification process.
	 * Note: The provided URL should be absolute and contain the protocol to use, e.g. http:// or https://. For use on mobile devices a custom protocol can be used in the form of protocol://. This protocol must be registered on the device first.
	 * URLs without a protocol will be rejected.
	 */
	public CardPaymentMethodSpecificInput withReturnUrl(String value) {
		this.returnUrl = value;
		return this;
	}

	/**
	 * This is the unique Scheme Reference Data from the initial transaction that was performed with a Strong Customer Authentication. In case this value is unknown, a Scheme Reference of an earlier transaction that was part of the same sequence can be used as a fall-back. Still, it is strongly advised to submit this value for any Merchant Initiated Transaction or any recurring transaction (hereby defined as "Subsequent").
	 */
	public String getSchemeReferenceData() {
		return schemeReferenceData;
	}

	/**
	 * This is the unique Scheme Reference Data from the initial transaction that was performed with a Strong Customer Authentication. In case this value is unknown, a Scheme Reference of an earlier transaction that was part of the same sequence can be used as a fall-back. Still, it is strongly advised to submit this value for any Merchant Initiated Transaction or any recurring transaction (hereby defined as "Subsequent").
	 */
	public void setSchemeReferenceData(String value) {
		this.schemeReferenceData = value;
	}

	/**
	 * This is the unique Scheme Reference Data from the initial transaction that was performed with a Strong Customer Authentication. In case this value is unknown, a Scheme Reference of an earlier transaction that was part of the same sequence can be used as a fall-back. Still, it is strongly advised to submit this value for any Merchant Initiated Transaction or any recurring transaction (hereby defined as "Subsequent").
	 */
	public CardPaymentMethodSpecificInput withSchemeReferenceData(String value) {
		this.schemeReferenceData = value;
		return this;
	}

	/**
	 * Deprecated: Use threeDSecure.skipAuthentication instead.
	 *  * true = 3D Secure authentication will be skipped for this transaction. This setting should be used when isRecurring is set to true and recurringPaymentSequenceIndicator is set to recurring.
	 *  * false = 3D Secure authentication will not be skipped for this transaction.
	 * 
	 *   Note: This is only possible if your account in our system is setup for 3D Secure authentication and if your configuration in our system allows you to override it per transaction.
	 */
	public Boolean getSkipAuthentication() {
		return skipAuthentication;
	}

	/**
	 * Deprecated: Use threeDSecure.skipAuthentication instead.
	 *  * true = 3D Secure authentication will be skipped for this transaction. This setting should be used when isRecurring is set to true and recurringPaymentSequenceIndicator is set to recurring.
	 *  * false = 3D Secure authentication will not be skipped for this transaction.
	 * 
	 *   Note: This is only possible if your account in our system is setup for 3D Secure authentication and if your configuration in our system allows you to override it per transaction.
	 */
	public void setSkipAuthentication(Boolean value) {
		this.skipAuthentication = value;
	}

	/**
	 * Deprecated: Use threeDSecure.skipAuthentication instead.
	 *  * true = 3D Secure authentication will be skipped for this transaction. This setting should be used when isRecurring is set to true and recurringPaymentSequenceIndicator is set to recurring.
	 *  * false = 3D Secure authentication will not be skipped for this transaction.
	 * 
	 *   Note: This is only possible if your account in our system is setup for 3D Secure authentication and if your configuration in our system allows you to override it per transaction.
	 */
	public CardPaymentMethodSpecificInput withSkipAuthentication(Boolean value) {
		this.skipAuthentication = value;
		return this;
	}

	/**
	 * Object containing specific data regarding 3-D Secure
	 */
	public ThreeDSecure getThreeDSecure() {
		return threeDSecure;
	}

	/**
	 * Object containing specific data regarding 3-D Secure
	 */
	public void setThreeDSecure(ThreeDSecure value) {
		this.threeDSecure = value;
	}

	/**
	 * Object containing specific data regarding 3-D Secure
	 */
	public CardPaymentMethodSpecificInput withThreeDSecure(ThreeDSecure value) {
		this.threeDSecure = value;
		return this;
	}

	/**
	 * ID of the token to use to create the payment.
	 */
	public String getToken() {
		return token;
	}

	/**
	 * ID of the token to use to create the payment.
	 */
	public void setToken(String value) {
		this.token = value;
	}

	/**
	 * ID of the token to use to create the payment.
	 */
	public CardPaymentMethodSpecificInput withToken(String value) {
		this.token = value;
		return this;
	}

	/**
	 * Indicates if this transaction should be tokenized
	 *  * true - Tokenize the transaction. Note that a payment on the payment platform that results in a status REDIRECTED cannot be tokenized in this way.
	 *  * false - Do not tokenize the transaction, unless it would be tokenized by other means such as auto-tokenization of recurring payments.
	 */
	public Boolean getTokenize() {
		return tokenize;
	}

	/**
	 * Indicates if this transaction should be tokenized
	 *  * true - Tokenize the transaction. Note that a payment on the payment platform that results in a status REDIRECTED cannot be tokenized in this way.
	 *  * false - Do not tokenize the transaction, unless it would be tokenized by other means such as auto-tokenization of recurring payments.
	 */
	public void setTokenize(Boolean value) {
		this.tokenize = value;
	}

	/**
	 * Indicates if this transaction should be tokenized
	 *  * true - Tokenize the transaction. Note that a payment on the payment platform that results in a status REDIRECTED cannot be tokenized in this way.
	 *  * false - Do not tokenize the transaction, unless it would be tokenized by other means such as auto-tokenization of recurring payments.
	 */
	public CardPaymentMethodSpecificInput withTokenize(Boolean value) {
		this.tokenize = value;
		return this;
	}

	/**
	 * Indicates the channel via which the payment is created. Allowed values:
	 *   * ECOMMERCE - The transaction is a regular E-Commerce transaction.
	 *   * MOTO - The transaction is a Mail Order/Telephone Order.
	 * 
	 *   Defaults to ECOMMERCE.
	 */
	public String getTransactionChannel() {
		return transactionChannel;
	}

	/**
	 * Indicates the channel via which the payment is created. Allowed values:
	 *   * ECOMMERCE - The transaction is a regular E-Commerce transaction.
	 *   * MOTO - The transaction is a Mail Order/Telephone Order.
	 * 
	 *   Defaults to ECOMMERCE.
	 */
	public void setTransactionChannel(String value) {
		this.transactionChannel = value;
	}

	/**
	 * Indicates the channel via which the payment is created. Allowed values:
	 *   * ECOMMERCE - The transaction is a regular E-Commerce transaction.
	 *   * MOTO - The transaction is a Mail Order/Telephone Order.
	 * 
	 *   Defaults to ECOMMERCE.
	 */
	public CardPaymentMethodSpecificInput withTransactionChannel(String value) {
		this.transactionChannel = value;
		return this;
	}

	/**
	 * Indicates which party initiated the unscheduled recurring transaction. Allowed values:
	 *   * merchantInitiated - Merchant Initiated Transaction.
	 *   * cardholderInitiated - Cardholder Initiated Transaction.
	 * Note:
	 *   * This property is not allowed if isRecurring is true.
	 *   * When a customer has chosen to use a token on a hosted checkout this property is set to "cardholderInitiated".
	 */
	public String getUnscheduledCardOnFileRequestor() {
		return unscheduledCardOnFileRequestor;
	}

	/**
	 * Indicates which party initiated the unscheduled recurring transaction. Allowed values:
	 *   * merchantInitiated - Merchant Initiated Transaction.
	 *   * cardholderInitiated - Cardholder Initiated Transaction.
	 * Note:
	 *   * This property is not allowed if isRecurring is true.
	 *   * When a customer has chosen to use a token on a hosted checkout this property is set to "cardholderInitiated".
	 */
	public void setUnscheduledCardOnFileRequestor(String value) {
		this.unscheduledCardOnFileRequestor = value;
	}

	/**
	 * Indicates which party initiated the unscheduled recurring transaction. Allowed values:
	 *   * merchantInitiated - Merchant Initiated Transaction.
	 *   * cardholderInitiated - Cardholder Initiated Transaction.
	 * Note:
	 *   * This property is not allowed if isRecurring is true.
	 *   * When a customer has chosen to use a token on a hosted checkout this property is set to "cardholderInitiated".
	 */
	public CardPaymentMethodSpecificInput withUnscheduledCardOnFileRequestor(String value) {
		this.unscheduledCardOnFileRequestor = value;
		return this;
	}

	/**
	 * * first = This transaction is the first of a series of unscheduled recurring transactions
	 * * subsequent = This transaction is a subsequent transaction in a series of unscheduled recurring transactions
	 * Note: this property is not allowed if isRecurring is true.
	 */
	public String getUnscheduledCardOnFileSequenceIndicator() {
		return unscheduledCardOnFileSequenceIndicator;
	}

	/**
	 * * first = This transaction is the first of a series of unscheduled recurring transactions
	 * * subsequent = This transaction is a subsequent transaction in a series of unscheduled recurring transactions
	 * Note: this property is not allowed if isRecurring is true.
	 */
	public void setUnscheduledCardOnFileSequenceIndicator(String value) {
		this.unscheduledCardOnFileSequenceIndicator = value;
	}

	/**
	 * * first = This transaction is the first of a series of unscheduled recurring transactions
	 * * subsequent = This transaction is a subsequent transaction in a series of unscheduled recurring transactions
	 * Note: this property is not allowed if isRecurring is true.
	 */
	public CardPaymentMethodSpecificInput withUnscheduledCardOnFileSequenceIndicator(String value) {
		this.unscheduledCardOnFileSequenceIndicator = value;
		return this;
	}
}
