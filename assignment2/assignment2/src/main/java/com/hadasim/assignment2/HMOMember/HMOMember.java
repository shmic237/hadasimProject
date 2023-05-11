package com.hadasim.assignment2.HMOMember;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class HMOMember {

    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String cityAddress;
    private String streetAddress;
    private Integer buildingNumber;
    private LocalDate dateOfBirth;
    private String phone;
    private String mobilePhone;


    private LocalDate firstGetVaccinated;
    private String firstVaccineManufacturer;
    private LocalDate secondGetVaccinated;
    private String secondVaccineManufacturer;
    private LocalDate thirdGetVaccinated;
    private String thirdVaccineManufacturer;
    private LocalDate fourthGetVaccinated;
    private String fourthVaccineManufacturer;

    private LocalDate datePositiveResult;
    private LocalDate recoveryDate;

    private String image;

    public HMOMember() {
    }

    public HMOMember(Long id,
                     String firstName,
                     String lastName,
                     String cityAddress,
                     String streetAddress,
                     Integer buildingNumber,
                     LocalDate dateOfBirth,
                     String phone,
                     String mobilePhone,
                     LocalDate firstGetVaccinated,
                     String firstVaccineManufacturer,
                     LocalDate secondGetVaccinated,
                     String secondVaccineManufacturer,
                     LocalDate thirdGetVaccinated,
                     String thirdVaccineManufacturer,
                     LocalDate fourthGetVaccinated,
                     String fourthVaccineManufacturer,
                     LocalDate datePositiveResult,
                     LocalDate recoveryDate,
                     String image) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cityAddress = cityAddress;
        this.streetAddress = streetAddress;
        this.buildingNumber = buildingNumber;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.mobilePhone = mobilePhone;
        this.firstGetVaccinated = firstGetVaccinated;
        this.firstVaccineManufacturer = firstVaccineManufacturer;
        this.secondGetVaccinated = secondGetVaccinated;
        this.secondVaccineManufacturer = secondVaccineManufacturer;
        this.thirdGetVaccinated = thirdGetVaccinated;
        this.thirdVaccineManufacturer = thirdVaccineManufacturer;
        this.fourthGetVaccinated = fourthGetVaccinated;
        this.fourthVaccineManufacturer = fourthVaccineManufacturer;
        this.datePositiveResult = datePositiveResult;
        this.recoveryDate = recoveryDate;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCityAddress() {
        return cityAddress;
    }

    public void setCityAddress(String cityAddress) {
        this.cityAddress = cityAddress;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public Integer getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(Integer buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public LocalDate getFirstGetVaccinated() {
        return firstGetVaccinated;
    }

    public void setFirstGetVaccinated(LocalDate firstGetVaccinated) {
        this.firstGetVaccinated = firstGetVaccinated;
    }

    public String getFirstVaccineManufacturer() {
        return firstVaccineManufacturer;
    }

    public void setFirstVaccineManufacturer(String firstVaccineManufacturer) {
        this.firstVaccineManufacturer = firstVaccineManufacturer;
    }

    public LocalDate getSecondGetVaccinated() {
        return secondGetVaccinated;
    }

    public void setSecondGetVaccinated(LocalDate secondGetVaccinated) {
        this.secondGetVaccinated = secondGetVaccinated;
    }

    public String getSecondVaccineManufacturer() {
        return secondVaccineManufacturer;
    }

    public void setSecondVaccineManufacturer(String secondVaccineManufacturer) {
        this.secondVaccineManufacturer = secondVaccineManufacturer;
    }

    public LocalDate getThirdGetVaccinated() {
        return thirdGetVaccinated;
    }

    public void setThirdGetVaccinated(LocalDate thirdGetVaccinated) {
        this.thirdGetVaccinated = thirdGetVaccinated;
    }

    public String getThirdVaccineManufacturer() {
        return thirdVaccineManufacturer;
    }

    public void setThirdVaccineManufacturer(String thirdVaccineManufacturer) {
        this.thirdVaccineManufacturer = thirdVaccineManufacturer;
    }

    public LocalDate getFourthGetVaccinated() {
        return fourthGetVaccinated;
    }

    public void setFourthGetVaccinated(LocalDate fourthGetVaccinated) {
        this.fourthGetVaccinated = fourthGetVaccinated;
    }

    public String getFourthVaccineManufacturer() {
        return fourthVaccineManufacturer;
    }

    public void setFourthVaccineManufacturer(String fourthVaccineManufacturer) {
        this.fourthVaccineManufacturer = fourthVaccineManufacturer;
    }

    public LocalDate getDatePositiveResult() {
        return datePositiveResult;
    }

    public void setDatePositiveResult(LocalDate datePositiveResult) {
        this.datePositiveResult = datePositiveResult;
    }

    public LocalDate getRecoveryDate() {
        return recoveryDate;
    }

    public void setRecoveryDate(LocalDate recoveryDate) {
        this.recoveryDate = recoveryDate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "HMOMember{" +
            "id=" + id +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", cityAddress='" + cityAddress + '\'' +
            ", streetAddress='" + streetAddress + '\'' +
            ", buildingNumber=" + buildingNumber +
            ", dateOfBirth=" + dateOfBirth +
            ", phone='" + phone + '\'' +
            ", mobilePhone='" + mobilePhone + '\'' +
            ", firstGetVaccinated=" + firstGetVaccinated +
            ", firstVaccineManufacturer='" + firstVaccineManufacturer + '\'' +
            ", secondGetVaccinated=" + secondGetVaccinated +
            ", secondVaccineManufacturer='" + secondVaccineManufacturer + '\'' +
            ", thirdGetVaccinated=" + thirdGetVaccinated +
            ", thirdVaccineManufacturer='" + thirdVaccineManufacturer + '\'' +
            ", fourthGetVaccinated=" + fourthGetVaccinated +
            ", fourthVaccineManufacturer='" + fourthVaccineManufacturer + '\'' +
            ", datePositiveResult=" + datePositiveResult +
            ", recoveryDate=" + recoveryDate +
            ", image='" + image + '\'' +
            '}';
    }
}
