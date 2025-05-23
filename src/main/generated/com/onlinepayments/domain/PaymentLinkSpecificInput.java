/*
 * This file was automatically generated.
 */

package com.onlinepayments.domain;

import java.time.ZonedDateTime;

public class PaymentLinkSpecificInput {

    private String description;

    private ZonedDateTime expirationDate;

    private String recipientName;

    /**
     * A note related to the created payment link.
     */
    public String getDescription() {
        return description;
    }

    /**
     * A note related to the created payment link.
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * A note related to the created payment link.
     */
    public PaymentLinkSpecificInput withDescription(String value) {
        this.description = value;
        return this;
    }

    /**
     * The date after which the payment link will not be usable to complete the payment. The date sent cannot be more than 6 months in the future or a past date. It must also contain the UTC offset.
     */
    public ZonedDateTime getExpirationDate() {
        return expirationDate;
    }

    /**
     * The date after which the payment link will not be usable to complete the payment. The date sent cannot be more than 6 months in the future or a past date. It must also contain the UTC offset.
     */
    public void setExpirationDate(ZonedDateTime value) {
        this.expirationDate = value;
    }

    /**
     * The date after which the payment link will not be usable to complete the payment. The date sent cannot be more than 6 months in the future or a past date. It must also contain the UTC offset.
     */
    public PaymentLinkSpecificInput withExpirationDate(ZonedDateTime value) {
        this.expirationDate = value;
        return this;
    }

    /**
     * The payment link recipient name.
     */
    public String getRecipientName() {
        return recipientName;
    }

    /**
     * The payment link recipient name.
     */
    public void setRecipientName(String value) {
        this.recipientName = value;
    }

    /**
     * The payment link recipient name.
     */
    public PaymentLinkSpecificInput withRecipientName(String value) {
        this.recipientName = value;
        return this;
    }
}
