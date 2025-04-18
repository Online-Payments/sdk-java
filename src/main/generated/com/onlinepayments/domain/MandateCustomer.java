/*
 * This file was automatically generated.
 */

package com.onlinepayments.domain;

public class MandateCustomer {

    private BankAccountIban bankAccountIban;

    private String companyName;

    private MandateContactDetails contactDetails;

    private MandateAddress mandateAddress;

    private MandatePersonalInformation personalInformation;

    /**
     * Object containing IBAN information
     */
    public BankAccountIban getBankAccountIban() {
        return bankAccountIban;
    }

    /**
     * Object containing IBAN information
     */
    public void setBankAccountIban(BankAccountIban value) {
        this.bankAccountIban = value;
    }

    /**
     * Object containing IBAN information
     */
    public MandateCustomer withBankAccountIban(BankAccountIban value) {
        this.bankAccountIban = value;
        return this;
    }

    /**
     * Name of company, as a customer
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Name of company, as a customer
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Name of company, as a customer
     */
    public MandateCustomer withCompanyName(String value) {
        this.companyName = value;
        return this;
    }

    /**
     * Object containing email address
     */
    public MandateContactDetails getContactDetails() {
        return contactDetails;
    }

    /**
     * Object containing email address
     */
    public void setContactDetails(MandateContactDetails value) {
        this.contactDetails = value;
    }

    /**
     * Object containing email address
     */
    public MandateCustomer withContactDetails(MandateContactDetails value) {
        this.contactDetails = value;
        return this;
    }

    /**
     * Object containing consumer address details.
     * Required for Create mandate and Create payment calls.
     * Required for Create hostedCheckout calls where the IBAN is also provided.
     */
    public MandateAddress getMandateAddress() {
        return mandateAddress;
    }

    /**
     * Object containing consumer address details.
     * Required for Create mandate and Create payment calls.
     * Required for Create hostedCheckout calls where the IBAN is also provided.
     */
    public void setMandateAddress(MandateAddress value) {
        this.mandateAddress = value;
    }

    /**
     * Object containing consumer address details.
     * Required for Create mandate and Create payment calls.
     * Required for Create hostedCheckout calls where the IBAN is also provided.
     */
    public MandateCustomer withMandateAddress(MandateAddress value) {
        this.mandateAddress = value;
        return this;
    }

    /**
     * Object containing personal information of the customer.
     * Required for Create mandate and Create payment calls.
     */
    public MandatePersonalInformation getPersonalInformation() {
        return personalInformation;
    }

    /**
     * Object containing personal information of the customer.
     * Required for Create mandate and Create payment calls.
     */
    public void setPersonalInformation(MandatePersonalInformation value) {
        this.personalInformation = value;
    }

    /**
     * Object containing personal information of the customer.
     * Required for Create mandate and Create payment calls.
     */
    public MandateCustomer withPersonalInformation(MandatePersonalInformation value) {
        this.personalInformation = value;
        return this;
    }
}
