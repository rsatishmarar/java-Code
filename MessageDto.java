package com.vks.plugIn.bean;

import java.util.Arrays;

public class MessageDto {

  // common eventName
  private String   eventName;
  private String   appName;

  // item details
  private long     itemId;
  private String   itemName;
  private String   itemDescription;
  private String   itemBrand;
  private String   itemMFG;
  private String   itemEXP;
  private double   itemPrice;
  private boolean  itemIsInOffer;
  private long     itemOfferPercent;

  // credential details
  private Long     userId;
  private String   password;

  // credential flag
  private boolean  credentialFlag;

  // credential details and customer details
  private String   userType;
  private String   userName;

  // customer details
  private String   firstName;
  private String   lastName;
  private String   emailId;
  private String   phoneNum;
  private String   gender;

  // mail details
  private String[] to;
  private String[] cc;
  private String[] bcc;
  private String   sendingReason;

  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public long getItemId() {
    return itemId;
  }

  public void setItemId(long itemId) {
    this.itemId = itemId;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public String getItemDescription() {
    return itemDescription;
  }

  public void setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
  }

  public String getItemBrand() {
    return itemBrand;
  }

  public void setItemBrand(String itemBrand) {
    this.itemBrand = itemBrand;
  }

  public String getItemMFG() {
    return itemMFG;
  }

  public void setItemMFG(String itemMFG) {
    this.itemMFG = itemMFG;
  }

  public String getItemEXP() {
    return itemEXP;
  }

  public void setItemEXP(String itemEXP) {
    this.itemEXP = itemEXP;
  }

  public double getItemPrice() {
    return itemPrice;
  }

  public void setItemPrice(double itemPrice) {
    this.itemPrice = itemPrice;
  }

  public boolean isItemIsInOffer() {
    return itemIsInOffer;
  }

  public void setItemIsInOffer(boolean itemIsInOffer) {
    this.itemIsInOffer = itemIsInOffer;
  }

  public long getItemOfferPercent() {
    return itemOfferPercent;
  }

  public void setItemOfferPercent(long itemOfferPercent) {
    this.itemOfferPercent = itemOfferPercent;
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public boolean isCredentialFlag() {
    return credentialFlag;
  }

  public void setCredentialFlag(boolean credentialFlag) {
    this.credentialFlag = credentialFlag;
  }

  public String getUserType() {
    return userType;
  }

  public void setUserType(String userType) {
    this.userType = userType;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  public String getPhoneNum() {
    return phoneNum;
  }

  public void setPhoneNum(String phoneNum) {
    this.phoneNum = phoneNum;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String[] getTo() {
    return to;
  }

  public void setTo(String[] to) {
    this.to = to;
  }

  public String[] getCc() {
    return cc;
  }

  public void setCc(String[] cc) {
    this.cc = cc;
  }

  public String[] getBcc() {
    return bcc;
  }

  public void setBcc(String[] bcc) {
    this.bcc = bcc;
  }

  public String getSendingReason() {
    return sendingReason;
  }

  public void setSendingReason(String sendingReason) {
    this.sendingReason = sendingReason;
  }

  @Override
  public String toString() {
    return "MessageDto [eventName=" + eventName + ", appName=" + appName + ", itemId=" + itemId + ", itemName=" + itemName + ", itemDescription="
        + itemDescription + ", itemBrand=" + itemBrand + ", itemMFG=" + itemMFG + ", itemEXP=" + itemEXP + ", itemPrice=" + itemPrice
        + ", itemIsInOffer=" + itemIsInOffer + ", itemOfferPercent=" + itemOfferPercent + ", userId=" + userId + ", password=" + password
        + ", credentialFlag=" + credentialFlag + ", userType=" + userType + ", userName=" + userName + ", firstName=" + firstName + ", lastName="
        + lastName + ", emailId=" + emailId + ", phoneNum=" + phoneNum + ", gender=" + gender + ", to=" + Arrays.toString(to) + ", cc="
        + Arrays.toString(cc) + ", bcc=" + Arrays.toString(bcc) + ", sendingReason=" + sendingReason + "]";
  }

}
