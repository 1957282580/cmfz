import com.baizhi.cmfz.dao.MenuDao;
import com.baizhi.cmfz.entity.Menu;
import com.baizhi.cmfz.service.MenuService;
import com.baizhi.cmfz.service.MenuServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

public class menuTest {



    @Test
    public void menu(){
      ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
       /*MenuDao menuDao = (MenuDao) applicationContext.getBean("menuDao");

       List<Menu> list = menuDao.selectAll();
        for (Menu menu : list) {
            System.out.println(menu);
        }
*/
        /*MenuService menuService = (MenuService) applicationContext.getBean("menuServiceImpl");
        List<Menu> list = menuService.findAll();
        for (Menu menu : list) {
            System.out.println(menu);
        }
        */
        for (int i = 0 ; i < 10 ; i++){
            System.out.println(UUID.randomUUID().toString().replace("-",""));
        }


    }
}
