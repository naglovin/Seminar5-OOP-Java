//Создать пекедж terminal. Дальнейшие работы ведем в нем
//        - Создать интерфейс CommandParser c методом
//        String[] parseCommand (String inputCommand)
//       - Создать класс TerminalReader, который содержит переменную CommandParser и метод,
//       который в бесконечном цикле слушает команды с помощью Scanner(System.in)

package terminal;

public interface CommandParser {
    String[] parseCommand (String inputCommand){

    }
}
