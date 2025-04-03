/*
 * This file was automatically generated.
 */

package com.onlinepayments.domain;

public class Discount {

    private Long amount;

    /**
     * Amount in the smallest currency unit, i.e.:
     * <ul>
     *   <li>EUR is a 2-decimals currency, the value 1234 will result in EUR 12.34</li>
     *   <li>KWD is a 3-decimals currency, the value 1234 will result in KWD 1.234</li>
     *   <li>JPY is a zero-decimal currency, the value 1234 will result in JPY 1234</li>
     * </ul>
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * Amount in the smallest currency unit, i.e.:
     * <ul>
     *   <li>EUR is a 2-decimals currency, the value 1234 will result in EUR 12.34</li>
     *   <li>KWD is a 3-decimals currency, the value 1234 will result in KWD 1.234</li>
     *   <li>JPY is a zero-decimal currency, the value 1234 will result in JPY 1234</li>
     * </ul>
     */
    public void setAmount(Long value) {
        this.amount = value;
    }

    /**
     * Amount in the smallest currency unit, i.e.:
     * <ul>
     *   <li>EUR is a 2-decimals currency, the value 1234 will result in EUR 12.34</li>
     *   <li>KWD is a 3-decimals currency, the value 1234 will result in KWD 1.234</li>
     *   <li>JPY is a zero-decimal currency, the value 1234 will result in JPY 1234</li>
     * </ul>
     */
    public Discount withAmount(Long value) {
        this.amount = value;
        return this;
    }
}
