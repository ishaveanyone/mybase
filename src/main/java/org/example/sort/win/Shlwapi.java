/**
 * Company: 上海数慧系统技术有限公司
 * Department: 数据中心
 * Date: 2020-05-15 9:13
 * Author: xupp
 * Email: xupp@dist.com.cn
 * Desc：
 */

package org.example.sort.win;


import com.sun.jna.Native;
import com.sun.jna.WString;
import com.sun.jna.win32.StdCallLibrary;
public interface Shlwapi extends StdCallLibrary {

    Shlwapi INSTANCE = (Shlwapi) Native.loadLibrary("Shlwapi", Shlwapi.class);

    int StrCmpLogicalW(WString psz1, WString psz2);
}
