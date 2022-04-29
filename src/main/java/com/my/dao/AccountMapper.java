package com.my.dao;

public interface AccountMapper {

    public void save(Account account);

    public List<Account> findAll();

}