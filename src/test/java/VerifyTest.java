import org.example.verify.Verificator;
import org.example.verify.rules.NotNull;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Date: 2020-09-04 18:02
 * Author: xupp
 */
public class VerifyTest {

    @Test
    public void test(){
        A a=new A();
        a.setName(null);
        Map<String,Object> map=new HashMap();
        map.put("name",null);
        boolean flag=Verificator.verifySingleObj(A.class,map);
        System.out.println(flag);

    }
}

