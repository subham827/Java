
package FileSystem;
import java.io.*;
public class IOStreamsEx1 {
    public static void main(String[] args) throws IOException{
      File f = new File("C:/Users/HP/documents/java/handcricket", "a.java");
      f.createNewFile();
        // check if file exist or not
        File basepath = new File("C:/Users/HP/documents/java/java exceptions");
        File f2 = new File(basepath, "theory.txt");
        if(f2.exists()){
            System.out.println("File exists");
        }else{
            System.out.println("File does not exist");
        }
        // list the files of a directory
        File [] files = basepath.listFiles();
        for(File f1: files){
            System.out.println(f1.getName());

        }
        // filter the files of a directory
        File [] files1 = basepath.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        });
        for(File f1: files1){
            System.out.println(f1.getName());
        }

        // read the content of a file
        FileReader fr = new FileReader(f2);
        int i;
        while((i=fr.read())!=-1){
            System.out.print((char)i);
        }
    
    
    File newbasepath = new File("C:/Users/HP/documents/java/handcricket");
    File srcfile = new File(newbasepath, "src.txt");
    File destfile = new File(newbasepath, "dest.txt");
    File destfile2 = new File(newbasepath, "dest2.txt");
    FileInputStream fis = new FileInputStream(srcfile);
    FileOutputStream fos = new FileOutputStream(destfile);
    FileOutputStream fos1 = new FileOutputStream(destfile2);
    int i1;
   
    
    byte [] b = new byte[1024];
    int i2;
    // Now here we paas b in this so at a time it will read only 1024 bytes , suppose src is 1028 bytes long and at first time it will transfer 1024 bytes but at the second time it needs only 4bytes but still it will transfer 1024 bytes resulting in addition of unnecessary bytes in the destination file.

    while((i2=fis.read(b))!=-1){
        fos1.write(b,0,i2);
        // Now this is done to rectify it
    }
    fis.close();
    fos1.close();
    
    
    
}
}