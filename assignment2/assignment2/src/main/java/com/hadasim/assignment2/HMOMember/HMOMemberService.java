package com.hadasim.assignment2.HMOMember;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


@Service
public class HMOMemberService {

    private final HMOMemberRepository hmoMemberRepository;

    @Autowired
    public HMOMemberService(HMOMemberRepository hmoMemberRepository) {
        this.hmoMemberRepository = hmoMemberRepository;
    }


    public List<HMOMember> getHMOMembers() {
        return hmoMemberRepository.findAll();
    }

    public Optional<HMOMember> getHMOMemberById(Long id) {
        Optional<HMOMember> memberOptional = hmoMemberRepository.findById(id);
        if (!memberOptional.isPresent()) {
            throw new RuntimeException(
                "HMO Member with id does not exists");
        }
        return memberOptional;
    }

    public void addNewMember(HMOMember member) {
        Optional<HMOMember> memberOptional = hmoMemberRepository.findMemberById(member.getId());
        if (memberOptional.isPresent()) {
            throw new RuntimeException(
                "HMO Member with id exists");
        }

        // Checking that the mobile phone has 10 digits, if not throwing an exception
        if (member.getMobilePhone().length() != 10) {
            throw new ArithmeticException("The mobile number is invalid");
        }

        //Checking if the date of the recovery is before the date of receiving a positive answer and throwing an exception
        if(member.getDatePositiveResult() != null && member.getRecoveryDate() != null) {
            if (member.getRecoveryDate().isBefore(member.getDatePositiveResult())) {
                throw new ArithmeticException("The date of the recovery is incorrect because is before the date of positive resualt");
            }
        }


        //Checking that the first name and last name are all letters
        if (!member.getFirstName().chars().allMatch(Character::isLetter) ||
            !member.getLastName().chars().allMatch(Character::isLetter)
        ) {
            throw new ArithmeticException("The first name and the last name must to be all letters");
        }


        /**
         * Search if one of the dates was not received
         */
        if (member.getFirstGetVaccinated() == null) {
            member.setFirstGetVaccinated(LocalDate.parse("1111-11-11"));
            member.setFirstVaccineManufacturer("does not get vaccineted");
        }
        if (member.getSecondGetVaccinated() == null) {
            member.setSecondGetVaccinated(LocalDate.parse("1111-11-11"));
            member.setSecondVaccineManufacturer("does not get vaccineted");
        }
        if (member.getThirdGetVaccinated() == null) {
            member.setThirdGetVaccinated(LocalDate.parse("1111-11-11"));
            member.setThirdVaccineManufacturer("does not get vaccineted");
        }
        if (member.getFourthGetVaccinated() == null) {
            member.setFourthGetVaccinated(LocalDate.parse("1111-11-11"));
            member.setFourthVaccineManufacturer("does not get vaccineted");
        }

        //Checking that all characters on the phone and mobile phone are numbers
        if (!member.getPhone().chars().allMatch(Character::isDigit) ||
            !member.getMobilePhone().chars().allMatch(Character::isDigit)
        ) {
            throw new ArithmeticException("The phone number is ivalid - Not everything is digits");
        }
        hmoMemberRepository.save(member);
    }

    public void deleteMemberById(Long id) {
        hmoMemberRepository.deleteById(id);
    }




//    public Optional<HMOMember> getMember(Long id){
//        Optional<HMOMember> memberOptional = hmoMemberRepository.findById(id);
//        if (!memberOptional.isPresent()) {
//            throw new RuntimeException(
//                "HMO Member with id does not exists");
//        }
//        return memberOptional;
//    }

    //    public Optional<HMOMember> getHMOMemberById(Long id) {
//            return hmoMemberRepository.findMemberById(id);
//
//    }





}
