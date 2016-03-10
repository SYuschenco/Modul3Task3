package Directory;

public class File {

    String fileName;
    String fileType;
    String fileLocation;
    static int fileSize;

    File(){
       //  Dir.newFile();// конструктор класса файл использует метод класса директория тем самым реализует полную
                            // зависимость класса файл от класса Директория в виде композиции
    }


}
