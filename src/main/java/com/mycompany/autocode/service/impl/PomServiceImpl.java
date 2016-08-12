package com.mycompany.autocode.service.impl;

import com.mycompany.autocode.dao.PomDao;
import com.mycompany.autocode.model.PomDO;
import com.mycompany.autocode.service.PomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * author: JinBingBing
 * description:
 * time: 2016/8/8.
 */
@Service
public class PomServiceImpl implements PomService {

    @Resource
    private PomDao pomDao;

    public boolean addPom(PomDO pomDO) throws Exception {
        return false;
    }

    public boolean modifyPom(PomDO pomDO) throws Exception {
        return false;
    }

    public boolean removePom(String id) throws Exception {
        return false;
    }

    public PomDO getPomById(String id) throws Exception {
        return null;
    }

    public List<PomDO> queryPom(PomDO pomDO) throws Exception {
        return null;
    }
}
