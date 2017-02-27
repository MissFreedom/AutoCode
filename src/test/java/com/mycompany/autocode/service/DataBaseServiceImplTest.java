package com.mycompany.autocode.service;

import com.mycompany.autocode.model.DataBaseDO;
import com.mycompany.autocode.utils.UUIDUtils;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/** 
* DataBaseServiceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 24, 2017</pre> 
* @version 1.0 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-ds.xml"})
public class DataBaseServiceImplTest {

    @Resource
    private DataBaseService dataBaseService;

    /**
     *
     * Method: addDataBase(DataBaseDO dataBaseDO)
     *
     */
    @Test
    public void testAddDataBase() throws Exception {
        DataBaseDO dataBaseDO = new DataBaseDO();
        dataBaseDO.setDataBaseId(UUIDUtils.getUUID());
        dataBaseDO.setDataBaseName("asdafas");
        dataBaseService.addDataBase(dataBaseDO);
    }

    /**
     *
     * Method: modifyDataBase(DataBaseDO dataBaseDO)
     *
     */
    @Test
    public void testModifyDataBase() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: removeDataBase(String id)
     *
     */
    @Test
    public void testRemoveDataBase() throws Exception {
//TODO: Test goes here...
    }

    /**
* 
* Method: getDataBaseById(String id) 
* 
*/ 
@Test
public void testGetDataBaseById() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: queryDataBase(DataBaseDO query) 
* 
*/ 
@Test
public void testQueryDataBase() throws Exception { 
//TODO: Test goes here... 
} 


} 
