/*
 * This file was automatically generated.
 */

package com.onlinepayments.domain;

public class GPayThreeDSecure {

    private String challengeCanvasSize;

    private String challengeIndicator;

    private String exemptionRequest;

    private RedirectionData redirectionData;

    private Boolean skipAuthentication;

    /**
     * Dimensions of the challenge window that potentially will be displayed to the customer. The challenge content is formatted to appropriately render in this window to provide the best possible user experience. Preconfigured sizes are width x height in pixels of the window displayed in the customer browser window. Possible values are
     * <ul>
     *   <li>250x400 (default)</li>
     *   <li>390x400</li>
     *   <li>500x600</li>
     *   <li>600x400</li>
     *   <li>full-screen</li>
     * </ul>
     */
    public String getChallengeCanvasSize() {
        return challengeCanvasSize;
    }

    /**
     * Dimensions of the challenge window that potentially will be displayed to the customer. The challenge content is formatted to appropriately render in this window to provide the best possible user experience. Preconfigured sizes are width x height in pixels of the window displayed in the customer browser window. Possible values are
     * <ul>
     *   <li>250x400 (default)</li>
     *   <li>390x400</li>
     *   <li>500x600</li>
     *   <li>600x400</li>
     *   <li>full-screen</li>
     * </ul>
     */
    public void setChallengeCanvasSize(String value) {
        this.challengeCanvasSize = value;
    }

    /**
     * Dimensions of the challenge window that potentially will be displayed to the customer. The challenge content is formatted to appropriately render in this window to provide the best possible user experience. Preconfigured sizes are width x height in pixels of the window displayed in the customer browser window. Possible values are
     * <ul>
     *   <li>250x400 (default)</li>
     *   <li>390x400</li>
     *   <li>500x600</li>
     *   <li>600x400</li>
     *   <li>full-screen</li>
     * </ul>
     */
    public GPayThreeDSecure withChallengeCanvasSize(String value) {
        this.challengeCanvasSize = value;
        return this;
    }

    /**
     * Allows you to indicate if you want the customer to be challenged for extra security on this transaction. Possible values:
     * <ul>
     *   <li>no-preference - You have no preference whether or not to challenge the customer (default)</li>
     *   <li>no-challenge-requested - you prefer the cardholder not to be challenged</li>
     *   <li>challenge-requested - you prefer the customer to be challenged</li>
     *   <li>challenge-required - you require the customer to be challenged</li>
     *   <li>no-challenge-requested-risk-analysis-performed – letting the issuer know that you have already assessed the transaction with fraud prevention tool</li>
     *   <li>no-challenge-requested-data-share-only – sharing data only with the DS</li>
     *   <li>no-challenge-requested-consumer-authentication-performed – authentication already happened at your side – when login in to your website</li>
     *   <li>no-challenge-requested-use-whitelist-exemption – cardholder has whitelisted you at with the issuer</li>
     *   <li>challenge-requested-whitelist-prompt-requested – cardholder is trying to whitelist you</li>
     *   <li>request-scoring-without-connecting-to-acs – sending information to CB DS for a fraud scoring</li>
     * </ul>
     */
    public String getChallengeIndicator() {
        return challengeIndicator;
    }

    /**
     * Allows you to indicate if you want the customer to be challenged for extra security on this transaction. Possible values:
     * <ul>
     *   <li>no-preference - You have no preference whether or not to challenge the customer (default)</li>
     *   <li>no-challenge-requested - you prefer the cardholder not to be challenged</li>
     *   <li>challenge-requested - you prefer the customer to be challenged</li>
     *   <li>challenge-required - you require the customer to be challenged</li>
     *   <li>no-challenge-requested-risk-analysis-performed – letting the issuer know that you have already assessed the transaction with fraud prevention tool</li>
     *   <li>no-challenge-requested-data-share-only – sharing data only with the DS</li>
     *   <li>no-challenge-requested-consumer-authentication-performed – authentication already happened at your side – when login in to your website</li>
     *   <li>no-challenge-requested-use-whitelist-exemption – cardholder has whitelisted you at with the issuer</li>
     *   <li>challenge-requested-whitelist-prompt-requested – cardholder is trying to whitelist you</li>
     *   <li>request-scoring-without-connecting-to-acs – sending information to CB DS for a fraud scoring</li>
     * </ul>
     */
    public void setChallengeIndicator(String value) {
        this.challengeIndicator = value;
    }

    /**
     * Allows you to indicate if you want the customer to be challenged for extra security on this transaction. Possible values:
     * <ul>
     *   <li>no-preference - You have no preference whether or not to challenge the customer (default)</li>
     *   <li>no-challenge-requested - you prefer the cardholder not to be challenged</li>
     *   <li>challenge-requested - you prefer the customer to be challenged</li>
     *   <li>challenge-required - you require the customer to be challenged</li>
     *   <li>no-challenge-requested-risk-analysis-performed – letting the issuer know that you have already assessed the transaction with fraud prevention tool</li>
     *   <li>no-challenge-requested-data-share-only – sharing data only with the DS</li>
     *   <li>no-challenge-requested-consumer-authentication-performed – authentication already happened at your side – when login in to your website</li>
     *   <li>no-challenge-requested-use-whitelist-exemption – cardholder has whitelisted you at with the issuer</li>
     *   <li>challenge-requested-whitelist-prompt-requested – cardholder is trying to whitelist you</li>
     *   <li>request-scoring-without-connecting-to-acs – sending information to CB DS for a fraud scoring</li>
     * </ul>
     */
    public GPayThreeDSecure withChallengeIndicator(String value) {
        this.challengeIndicator = value;
        return this;
    }

    /**
     * In PSD2, the ExemptionRequest field is used by merchants requesting an exemption when not using authentication on a transaction, in order to keep the conversion up.
     * <ul>
     *   <li>none = No exemption requested</li>
     *   <li>transaction-risk-analysis = Fraud analysis has been done already by your own fraud module and transaction scored as low risk</li>
     *   <li>low-value = Bellow 30 euros</li>
     *   <li>whitelist = The cardholder has whitelisted you with their issuer</li>
     * </ul>
     */
    public String getExemptionRequest() {
        return exemptionRequest;
    }

    /**
     * In PSD2, the ExemptionRequest field is used by merchants requesting an exemption when not using authentication on a transaction, in order to keep the conversion up.
     * <ul>
     *   <li>none = No exemption requested</li>
     *   <li>transaction-risk-analysis = Fraud analysis has been done already by your own fraud module and transaction scored as low risk</li>
     *   <li>low-value = Bellow 30 euros</li>
     *   <li>whitelist = The cardholder has whitelisted you with their issuer</li>
     * </ul>
     */
    public void setExemptionRequest(String value) {
        this.exemptionRequest = value;
    }

    /**
     * In PSD2, the ExemptionRequest field is used by merchants requesting an exemption when not using authentication on a transaction, in order to keep the conversion up.
     * <ul>
     *   <li>none = No exemption requested</li>
     *   <li>transaction-risk-analysis = Fraud analysis has been done already by your own fraud module and transaction scored as low risk</li>
     *   <li>low-value = Bellow 30 euros</li>
     *   <li>whitelist = The cardholder has whitelisted you with their issuer</li>
     * </ul>
     */
    public GPayThreeDSecure withExemptionRequest(String value) {
        this.exemptionRequest = value;
        return this;
    }

    /**
     * Object containing browser specific redirection related data
     */
    public RedirectionData getRedirectionData() {
        return redirectionData;
    }

    /**
     * Object containing browser specific redirection related data
     */
    public void setRedirectionData(RedirectionData value) {
        this.redirectionData = value;
    }

    /**
     * Object containing browser specific redirection related data
     */
    public GPayThreeDSecure withRedirectionData(RedirectionData value) {
        this.redirectionData = value;
        return this;
    }

    /**
     * <ul>
     *   <li>true = 3D Secure authentication will be skipped for this transaction. This setting should be used when isRecurring is set to true and recurringPaymentSequenceIndicator is set to &quot;recurring&quot;</li>
     *   <li>false = 3D Secure authentication will not be skipped for this transaction</li>
     * </ul>
     * <p>
     * Note: This is only possible if your account in our system is setup for 3D Secure authentication and if your configuration in our system allows you to override it per transaction
     */
    public Boolean getSkipAuthentication() {
        return skipAuthentication;
    }

    /**
     * <ul>
     *   <li>true = 3D Secure authentication will be skipped for this transaction. This setting should be used when isRecurring is set to true and recurringPaymentSequenceIndicator is set to &quot;recurring&quot;</li>
     *   <li>false = 3D Secure authentication will not be skipped for this transaction</li>
     * </ul>
     * <p>
     * Note: This is only possible if your account in our system is setup for 3D Secure authentication and if your configuration in our system allows you to override it per transaction
     */
    public void setSkipAuthentication(Boolean value) {
        this.skipAuthentication = value;
    }

    /**
     * <ul>
     *   <li>true = 3D Secure authentication will be skipped for this transaction. This setting should be used when isRecurring is set to true and recurringPaymentSequenceIndicator is set to &quot;recurring&quot;</li>
     *   <li>false = 3D Secure authentication will not be skipped for this transaction</li>
     * </ul>
     * <p>
     * Note: This is only possible if your account in our system is setup for 3D Secure authentication and if your configuration in our system allows you to override it per transaction
     */
    public GPayThreeDSecure withSkipAuthentication(Boolean value) {
        this.skipAuthentication = value;
        return this;
    }
}
