/**
 * Date: 2020-06-22 16:02
 * Author: xupp
 */

package org.example.image;

import net.coobird.thumbnailator.Thumbnails;

import java.io.File;
import java.io.IOException;

//图片压缩
public class Compression {
    public static void excute(File src, File target) throws IOException {
        Thumbnails.
                of(src).
                scale(1).
                toFile(target);
    }

    public static void main(String[] args) throws IOException {
        excute(new File("H:/a.png"),new File("H:/b.jpg"));
    }
}
