package com.hadasim.assignment2.HMOMember;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/")
public class HMOMemberController {


    private final HMOMemberService hmoMemberService;

    @Autowired
    public HMOMemberController(HMOMemberService hmoMemberService) {
        this.hmoMemberService = hmoMemberService;
    }

    /**
     * Display the home page, with the list of members in the HMO
     * @return  home page, with the list of members in the HMO.
     */
    @GetMapping("/hmomember")
    public List<HMOMember> getHMOMember() {
        return  hmoMemberService.getHMOMembers();
    }

    /**
     * Displaying information about a member by a specific id
     * @param id
     * @return member details
     */
    @GetMapping("/hmomember/{id}")
    public Optional<HMOMember> getMemberById(@PathVariable("id") long id) {
        return hmoMemberService.getHMOMemberById(id);
    }


    /**
     * Adds a new member to the HMO member database.
     * @param member
     */
    @PostMapping("/hmomember")
    public void addNewMember(@RequestBody HMOMember member) {
        hmoMemberService.addNewMember(member);
    }

    /**
     * Deletes the member in the HMO, whose ID was received
     * @param id
     */
    @DeleteMapping("/{id}")
    public void deleteMember(@PathVariable("id") long id) {
        hmoMemberService.deleteMemberById(id);
    }


//    @PostMapping
//    public void registerNewMember(@RequestBody HMOMember member) {
//        boolean memberSaved = hmoMemberService.addNewMember(member);
//        if(memberSaved == false) {
//            throw new RuntimeException(
//                "HMO Member with id exists");
//        } else {
//
//        }
//
//
//    }

    //    @GetMapping("/hmomember/{id}")
//    public HMOMember getMemberById(@PathVariable("id") long id) {
//        return hmoMemberService.getMember(id);
//    }




//    @GetMapping("/hmomember/{id}")
//    public HMOMember showMember(@PathVariable Long id) {
//        HMOMember member = hmoMemberService.getHMOMember(id);
//        return member;
//    }
}
