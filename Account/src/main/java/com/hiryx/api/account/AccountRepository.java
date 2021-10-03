package com.hiryx.api.account;

import com.hiryx.api.account.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Alexis
 */
public interface AccountRepository extends JpaRepository<Account, String> {
    
}
