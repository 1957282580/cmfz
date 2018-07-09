import com.baizhi.cmfz.dao.ManagerDao;
import com.baizhi.cmfz.dao.MasterDao;
import com.baizhi.cmfz.entity.Manager;
import com.baizhi.cmfz.entity.Master;
import com.baizhi.cmfz.entity.Picture;
import com.baizhi.cmfz.entity.User;
import com.baizhi.cmfz.service.MasterService;
import com.baizhi.cmfz.service.PictureService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class userTest {
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        ManagerDao o =  (ManagerDao) applicationContext.getBean("managerDao");
        Manager manager = o.selectmanager("zbh");
        System.out.println(manager);
    }

    @Test
    public void test2(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        PictureService pictureService = (PictureService) applicationContext.getBean("pictureServiceImpl");


        Map<String,Object> map = pictureService.findAll(0,3);

        for (Map.Entry<String , Object> entry : map.entrySet()) {
            System.out.println(entry);
        }

        /*List<Picture> list = pictureService.findAll(0,3);*/

        /*for (Picture picture : list) {
            System.out.println(picture);
        }*/

    }

    @Test
    public void test3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MasterService masterService = (MasterService) applicationContext.getBean("masterServiceImpl");

        Master master = new Master("111","111","666");

        /*int result = masterService.insert(master);*/

        int result = masterService.update(master);

        /*Map<String , Object> map = masterService.findAll(0,3);


        for (Map.Entry<String , Object> entry : map.entrySet()){
            System.out.println(entry);
        }*/

       /* MasterDao masterDao = (MasterDao) applicationContext.getBean("masterDao");

        List<Master> list = masterDao.selectAll(0,3);

        for (Master master : list) {
            System.out.println(master);
        }*/




    }




}
