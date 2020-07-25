import java.io.File;

public class Main {

    static String folderPath = "C:/Users/клаудио/Desktop/Varton";

    public static void main(String[] args) {
        File file = new File(folderPath);
        printReadeableSize(getFolderSize(file));
//        System.out.println(getFolderSize(file));

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

    static void printReadeableSize(long size){
        int index = Math.getExponent(size / 1024);
        if (index < 10) {
            double value = size / 1024;
            System.out.printf("%.2f кБайт\n",value);
        } if (index >= 10 && index < 20) {
            double value = size / Math.pow(1024, 2);
            System.out.printf("%.2f мБайт\n", value);
        } if (index >= 20 && index < 30) {
            double value = size / Math.pow(1024, 3);
            System.out.printf("%.2f гБайт\n", value);
        }

    }


}
