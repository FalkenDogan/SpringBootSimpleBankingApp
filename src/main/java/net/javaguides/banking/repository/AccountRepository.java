package net.javaguides.banking.repository;
/*
 * Databank ile bağlantıyı sağlayacak olan methodlara buradan temin edilecek.
 */

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.banking.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
