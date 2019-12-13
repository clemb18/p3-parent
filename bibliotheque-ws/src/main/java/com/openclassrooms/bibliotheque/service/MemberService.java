package com.openclassrooms.bibliotheque.service;

import com.openclassrooms.bibliotheque.models.Member;
import com.openclassrooms.projects.bibliot.MemberWs;

public interface MemberService {



    Member findByNameAndFirstName(String name, String firstName);

    Member create(MemberWs member);

}
