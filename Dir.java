package Directory;

public class Dir

{

    private String dirName;
    protected String dirFisicalAdress; // адресс физического устройства директории
    static String dirPath;          // путь к директории на физическом устройстве
    static int numberOfFiles;                 // число файлов в директории
    int dirSize;                       // размер директории(суммарный размер файлов в ней)
    File files;


    void newFile(){      // метод для создания объектов класса файл будет использоваться конструктором класса файл
        Dir dir = new Dir();// тем самым реализовывая композицию
        File file = new File();
        file.fileName();
        file.fileSize=dir.getFilesSize();

    }

    void deleteFile() {// метод для удаления объектов класса файл будет реализовывать полное управление временем жизни
                              // объектов класса Файл - тем самым реализовывая композицию
    }


    int getFilesSize() {
        for (int i = 0, i < Dir.numberOfFiles, i++){
            int FilesSize = +File.fileSize;
        }
    }

    public static void main(String[] args) {
        newFile();
        system.out.println(file.fileName(););
    }


}