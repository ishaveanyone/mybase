/**
 * Company: 上海数慧系统技术有限公司
 * Department: 数据中心
 * Date: 2020-05-15 13:43
 * Author: xupp
 * Email: xupp@dist.com.cn
 * Desc：
 */

package org.example.compare.win;

import com.sun.jna.WString;

import java.util.Comparator;

public class WindowsExplorerComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return Shlwapi.INSTANCE.StrCmpLogicalW(
                new WString(o1),
                new WString(o2)
        );
    }

}