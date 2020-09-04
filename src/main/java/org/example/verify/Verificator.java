/**
 * Date: 2020-09-03 18:20
 * Author: xupp
 */

package org.example.verify;

import org.example.verify.rules.NotNull;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.function.Function;

//一个校验器
public class Verificator  {
    /**
     * deal with single object
     * @param clazz
     * @param maps
     * @return
     */
    public static boolean verifySingleObj(Class clazz, Map<String,Object> maps){
        Field[] fields=
                clazz.getFields();
        for (Field field : fields) {
            Annotation[] annotations=
                    field.getAnnotations();
            for (Annotation annotation : annotations) {
                if(annotation instanceof NotNull){
                    if(!maps.containsKey(field.getName())||maps.get(field.getName())==null){
                        return false;
                    }
                }
            }
        }
        return true;
    }



}
