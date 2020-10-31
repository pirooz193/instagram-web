package ir.maktab.repository;

import ir.maktab.domains.account.Account;


public interface AccountRepository<ID> {
    Account generateAccount(Account account);
    Account  accountLogIn(String username, String password);
    Account getFollowers(ID id);
    Account getFollwings(ID id);
}
