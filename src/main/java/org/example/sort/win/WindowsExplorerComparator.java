/**
 * Company: 上海数慧系统技术有限公司
 * Department: 数据中心
 * Date: 2020-05-15 9:02
 * Author: xupp
 * Email: xupp@dist.com.cn
 * Desc：
 */

package org.example.sort.win;

import com.sun.jna.WString;

import java.util.Comparator;

/**
 * 调用本地的window api 进行按照名称排序
 */
public  class WindowsExplorerComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return Shlwapi.INSTANCE.StrCmpLogicalW(
                new WString(o1), new WString(o2));
    }

    public static void main(String[] args) {
        System.out.println(new WindowsExplorerComparator().compare("(","《"));
    }
}