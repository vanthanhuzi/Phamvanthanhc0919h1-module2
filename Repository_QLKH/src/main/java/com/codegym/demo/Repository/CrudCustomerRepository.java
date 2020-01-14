package com.codegym.demo.Repository;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

public interface CrudCustomerRepository<T,ID extends Serializable> extends Repository<T,ID>{


}
