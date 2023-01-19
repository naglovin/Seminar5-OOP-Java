//- Создать интерфейс CommandExecutable c абстрактным методом execute()
//        - Реализовать 2 класса, имплементировав созданный интерфейс,
//        CreateStudentExecutable и DeleteStudentExecutable.
//        В унаследованных методах они должны обращаться к методом класса StudentService.
//        - Подумать какие переменные могли бы содержать созданные классы

package terminal.executable;

public interface CommandExecutable { // ЭТОТ КЛАСС АБСТРАКТНЫЙ ПОТОМУ ЧТО У НАС ТУТ НЕТ ТЕЛА МЕТОДА
    void execute();
}
