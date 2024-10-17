package net.javaguides.banking.mapper;
/*
 * The AccountMapper class is used to map the AccountDto to Account entity.
 */
 

import net.javaguides.banking.dto.AccountDto;
import net.javaguides.banking.entity.Account;

public class AccountMapper {
	
	public static Account mapToAccount(AccountDto accountDto) {
		
		Account account = new Account(
				accountDto.getId(),
				accountDto.getAccountHolderName(),
				accountDto.getBalance()
		);
		
		return account;
	}
	
	public static AccountDto mapToAccountDto(Account account) {
		
        AccountDto accountDto = new AccountDto(
        		account.getId(),
        		account.getAccountHolderName(),
        		account.getBalance()
        		);
        return accountDto;
    }

}
