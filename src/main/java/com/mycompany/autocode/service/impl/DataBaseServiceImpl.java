package com.mycompany.autocode.service.impl;

import com.mycompany.autocode.dao.DataBaseDao;
import com.mycompany.autocode.model.DataBaseDO;
import com.mycompany.autocode.service.DataBaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * author: JinBingBing
 * description:
 * time: 2016/8/8.
 */
@Service
public class DataBaseServiceImpl implements DataBaseService{

    @Resource
    private DataBaseDao dataBaseDao;

    public boolean addDataBase(DataBaseDO dataBaseDO) throws Exception {
        return false;
    }

    public boolean modifyDataBase(DataBaseDO dataBaseDO) throws Exception {
        return false;
    }

    public boolean removeDataBase(String id) throws Exception {
        return false;
    }

    public DataBaseDO getDataBaseById(String id) throws Exception {
        return null;
    }

    public List<DataBaseDO> queryDataBase(DataBaseDO dataBaseDO) throws Exception {
        return null;
    }
}
