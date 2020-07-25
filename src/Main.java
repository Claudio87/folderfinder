import java.io.File;

public class Main {

    static String folderPath = "C:/Users/клаудио/Desktop/Varton";

    public static void main(String[] args) {
        File file = new File(folderPath);
        System.out.println(getFolderSize(file));
    }

    static long getFolderSize(File folder){
        long totalSum = 0;
        if(folder.isFile()){
            return folder.length();
        }
        File[] list = folder.listFiles();
        for(File f: list){
            totalSum += getFolderSize(f);
        }
        return totalSum;
    }
}
