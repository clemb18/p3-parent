package org.occ.p3.controler;

import org.occ.p3.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BorrowControler {

    @Autowired
    BorrowService borrowService;
}
