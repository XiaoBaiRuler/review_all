package answer;

import java.io.File;

/**
 * @Author xiaobai
 * @Date 2021/3/19 19:43
 * @Version 1.0
 */
public class Answer01 {

    public static void main(String[] args) {
        File file = new File("F:\\xiaobai");
        deleteAllFiles(file);
    }

    public static void deleteAllFiles(File file) {
        File[] list = file.listFiles();
        if (list != null){
            for (File temp : list){
                deleteAllFiles(temp);
            }
        }
        file.delete();
    }
}
