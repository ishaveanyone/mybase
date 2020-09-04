/**
 * Company: 上海数慧系统技术有限公司
 * Department: 数据中心
 * Date: 2019-12-19 11:25
 * Author: xupp
 * Email: xupp@dist.com.cn
 * Desc：
 */
package org.example.verify.rules;

import java.lang.annotation.Inherited;
import java.security.PrivateKey;
//可以保证类使用了这个注解可以在其所有的子类进行传递
@Inherited
public @interface BaseAnnon {
    String name() default "";
}
