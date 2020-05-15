/**
 * Company: 上海数慧系统技术有限公司
 * Department: 数据中心
 * Date: 2020-05-15 13:22
 * Author: xupp
 * Email: xupp@dist.com.cn
 * Desc：
 */

package org.example.sort.insertionsort;

import org.example.sort.Entity;
import org.example.sort.Sortor;

/**
 * 二分插入排序
 */
public class BinaryInsertionSort implements Sortor {

    @Override
    public void sort(Entity[] files){
        //无非就是排序 使用折中插排 或者快排序
        //从第一个插排
        for(int i=1;i<files.length;i++){
            int low=0;
            int high=i-1;
            Entity target=files[i];
            while(low<=high){
                Entity mid=files[(low+high)/2];
                Integer targetIndex=target.getIndex();
                Integer midIndex=mid.getIndex();
                //说明中间值 更加小 抛弃前一部分
                if(targetIndex.compareTo(midIndex)>0){
                    low=(low+high)/2+1;
                }else{
                    high=(low+high)/2-1;
                }
            }
            //进行位移
            for(int j=i;j>low;j--){
                files[j]=files[j-1];
            }
            files[low]=target;
        }
        System.out.println(1);
    }

}
