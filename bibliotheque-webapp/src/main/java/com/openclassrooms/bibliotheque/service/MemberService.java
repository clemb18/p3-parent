package com.openclassrooms.bibliotheque.service;

import com.openclassrooms.bibliotheque.ws.MemberWs;

public interface MemberService {


    MemberWs findMember(String name, String mailAdress);

    MemberWs findMemberLogin(String mailAdress, String password);

}

