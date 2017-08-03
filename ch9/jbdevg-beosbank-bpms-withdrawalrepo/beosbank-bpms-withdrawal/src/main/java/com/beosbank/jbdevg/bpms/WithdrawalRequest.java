package com.beosbank.jbdevg.bpms;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class WithdrawalRequest implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Request Identifier")
   private java.math.BigInteger id;
   @org.kie.api.definition.type.Label("Request Date")
   private java.util.Date date;
   @org.kie.api.definition.type.Label("receiver First Name")
   private java.lang.String receiverFirstName;
   @org.kie.api.definition.type.Label("Receiver Last Name")
   private java.lang.String receiverLastName;
   @org.kie.api.definition.type.Label("Reference transaction to claim")
   private java.lang.String claimReference;
   @org.kie.api.definition.type.Label("Country from which the transaction was sent")
   private java.lang.String senderCountry;
   @org.kie.api.definition.type.Label("Sender First Name")
   private java.lang.String senderFirstName;
   @org.kie.api.definition.type.Label("Sender Last Name ")
   private java.lang.String senderLastName;

   @org.kie.api.definition.type.Label("amount to received ")
   private java.lang.Double amount;

   @org.kie.api.definition.type.Label("Person who validate the transaction in the Agency ( Frist Validation)")
   private java.lang.String validatedBy;

   @org.kie.api.definition.type.Label("Person who certified the transaction in the Agency ( Second Validation if Any)")
   private java.lang.String certifiedBy;

   @org.kie.api.definition.type.Label("Date")
   private java.util.Date validationDate;

   @org.kie.api.definition.type.Label("Certification Date")
   private java.util.Date certificationDate;

   @org.kie.api.definition.type.Label("Transaction Status")
   @org.kie.api.definition.type.Description("Transaction Status")
   private int status;

   @org.kie.api.definition.type.Label("receiver age / birth date")
   private int receiverAge;

   @org.kie.api.definition.type.Label("Error list returned by the validation process")
   private java.lang.String errors;

   public WithdrawalRequest()
   {
   }

   public java.math.BigInteger getId()
   {
      return this.id;
   }

   public void setId(java.math.BigInteger id)
   {
      this.id = id;
   }

   public java.util.Date getDate()
   {
      return this.date;
   }

   public void setDate(java.util.Date date)
   {
      this.date = date;
   }

   public java.lang.String getReceiverFirstName()
   {
      return this.receiverFirstName;
   }

   public void setReceiverFirstName(java.lang.String receiverFirstName)
   {
      this.receiverFirstName = receiverFirstName;
   }

   public java.lang.String getReceiverLastName()
   {
      return this.receiverLastName;
   }

   public void setReceiverLastName(java.lang.String receiverLastName)
   {
      this.receiverLastName = receiverLastName;
   }

   public java.lang.String getClaimReference()
   {
      return this.claimReference;
   }

   public void setClaimReference(java.lang.String claimReference)
   {
      this.claimReference = claimReference;
   }

   public java.lang.String getSenderCountry()
   {
      return this.senderCountry;
   }

   public void setSenderCountry(java.lang.String senderCountry)
   {
      this.senderCountry = senderCountry;
   }

   public java.lang.String getSenderFirstName()
   {
      return this.senderFirstName;
   }

   public void setSenderFirstName(java.lang.String senderFirstName)
   {
      this.senderFirstName = senderFirstName;
   }

   public java.lang.String getSenderLastName()
   {
      return this.senderLastName;
   }

   public void setSenderLastName(java.lang.String senderLastName)
   {
      this.senderLastName = senderLastName;
   }

   public java.lang.Double getAmount()
   {
      return this.amount;
   }

   public void setAmount(java.lang.Double amount)
   {
      this.amount = amount;
   }

   public java.lang.String getValidatedBy()
   {
      return this.validatedBy;
   }

   public void setValidatedBy(java.lang.String validatedBy)
   {
      this.validatedBy = validatedBy;
   }

   public java.lang.String getCertifiedBy()
   {
      return this.certifiedBy;
   }

   public void setCertifiedBy(java.lang.String certifiedBy)
   {
      this.certifiedBy = certifiedBy;
   }

   public java.util.Date getValidationDate()
   {
      return this.validationDate;
   }

   public void setValidationDate(java.util.Date validationDate)
   {
      this.validationDate = validationDate;
   }

   public java.util.Date getCertificationDate()
   {
      return this.certificationDate;
   }

   public void setCertificationDate(java.util.Date certificationDate)
   {
      this.certificationDate = certificationDate;
   }

   public int getStatus()
   {
      return this.status;
   }

   public void setStatus(int status)
   {
      this.status = status;
   }

   public int getReceiverAge()
   {
      return this.receiverAge;
   }

   public void setReceiverAge(int receiverAge)
   {
      this.receiverAge = receiverAge;
   }

   public java.lang.String getErrors()
   {
      return this.errors;
   }

   public void setErrors(java.lang.String errors)
   {
      this.errors = errors;
   }

   public void clearErrors()
   {
      this.errors = "";
   }

   public void addError(String errorItem)
   {
      setErrors(this.getErrors() + "\n" + errorItem);
   }

   public String getDetails()
   {
      return "Ref=" + this.getClaimReference() + " Sender=" + this.getSenderFirstName() + " " + this.getSenderLastName() + "(" + this.getSenderCountry() + ")  Receiver=" + this.getReceiverFirstName() + " " + this.getReceiverLastName();
   }

   public WithdrawalRequest(java.math.BigInteger id, java.util.Date date,
         java.lang.String receiverFirstName, java.lang.String receiverLastName,
         java.lang.String claimReference, java.lang.String senderCountry,
         java.lang.String senderFirstName, java.lang.String senderLastName,
         java.lang.Double amount, java.lang.String validatedBy,
         java.lang.String certifiedBy, java.util.Date validationDate,
         java.util.Date certificationDate, int status, int receiverAge,
         java.lang.String errors)
   {
      this.id = id;
      this.date = date;
      this.receiverFirstName = receiverFirstName;
      this.receiverLastName = receiverLastName;
      this.claimReference = claimReference;
      this.senderCountry = senderCountry;
      this.senderFirstName = senderFirstName;
      this.senderLastName = senderLastName;
      this.amount = amount;
      this.validatedBy = validatedBy;
      this.certifiedBy = certifiedBy;
      this.validationDate = validationDate;
      this.certificationDate = certificationDate;
      this.status = status;
      this.receiverAge = receiverAge;
      this.errors = errors;
   }

}