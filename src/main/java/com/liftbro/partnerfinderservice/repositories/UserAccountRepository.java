package com.liftbro.partnerfinderservice.repositories;

import com.liftbro.partnerfinderservice.model.UserAccount;
import org.springframework.data.repository.CrudRepository;

public interface UserAccountRepository extends CrudRepository<UserAccount, Long> {
}
