import business.concretes.ControlManager;
import dataAccess.abstracts.IMemoryRepository;
import dataAccess.concretes.MemoryRepository;
import dataAccess.concretes.ProgrammingLanguageRepository;
import entities.concretes.Entity;
import entities.concretes.Memory;
import entities.concretes.ProgrammingLanguage;

public class Main {
    public static void main(String[] args) {

        ControlManager controlManager=new ControlManager();
        MemoryRepository memoryRepository=new MemoryRepository();
        ProgrammingLanguageRepository programmingLanguageRepository=new ProgrammingLanguageRepository(memoryRepository,controlManager);


        ProgrammingLanguage programmingLanguage1=new ProgrammingLanguage();
        programmingLanguage1.setId(1);
        programmingLanguage1.setName("C#");

        ProgrammingLanguage programmingLanguage2=new ProgrammingLanguage();
        programmingLanguage2.setId(2);
        programmingLanguage2.setName("Java");

        ProgrammingLanguage programmingLanguage3=new ProgrammingLanguage();
        programmingLanguage3.setId(3);
        programmingLanguage3.setName("C++");



        ProgrammingLanguage programmingLanguage4=new ProgrammingLanguage();
        programmingLanguage4.setId(4);
        programmingLanguage4.setName("C#");

        programmingLanguageRepository.add(programmingLanguage1);
        programmingLanguageRepository.add(programmingLanguage2);
        programmingLanguageRepository.add(programmingLanguage3);

        System.out.println("-------------------------------UPDATE STARTED---------------------------------");

        programmingLanguageRepository.update(programmingLanguage2,programmingLanguage4);


        System.out.println("-------------------------------SHOW MEMORY_LIST ---------------------------------");
        memoryRepository.entityList.forEach(System.out::println);

        programmingLanguageRepository.delete(programmingLanguage2);


        System.out.println("-------------------------------AFTER DELETE---------------------------------");
        programmingLanguageRepository.getAll().forEach(System.out::println);




    }
}