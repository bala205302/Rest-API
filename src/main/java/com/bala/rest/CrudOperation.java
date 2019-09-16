/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bala.rest;

import com.bala.rest.model.CrudOperationDO;
import java.util.Map;

/**
 *
 * @author bala
 */
public interface CrudOperation {

    public Map<String, Object> getAllRecords();

    public Map<String, Object> getParticularRecord(String empID);

    public Map<String, String> insertRecord(CrudOperationDO crudDO);

    public Map<String, String> updateRecord(CrudOperationDO crudDO);

    public Map<String, String> deleteRecord(String empID);

}
