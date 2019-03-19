package org.occ.p3.consumer.repository;


import org.occ.p3.model.Borrow;
import org.occ.p3.model.Member;
import org.occ.p3.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface UserRepository extends CrudRepository<User, Integer>{

    User findByUserNameAndPassword(String userName, String password);

    Optional<User> findById(Integer id);

    //List<Borrow> findBorrowListByUserId(Integer userId);
}
