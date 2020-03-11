package com.openclassrooms.bibliotheque.service;

import com.openclassrooms.bibliotheque.ws.MemberWs;

public interface MemberService {

    MemberWs findMemberLogin(String mailAdress, String password);

}

