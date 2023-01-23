//Создать класс Command, который бы инкапсулировал в себе содержимое введенной команды
//        - Реализовать в нем булевские методы для проверки введенных команд
//        - отредактировать класс CommandExecutableFactory,
//        убрав из него хардкод и начав принимать на вход объект Command


package terminal;

import java.util.List;

public class Command {
    private final String ADD = "/add";
    private final String DEL = "/del";
    List<String> argumets;
    String mainFirstCommand;

    public String getFirstArgument() {
        return argumets.get(0);
    }

    public boolean isCreateCommand(){
        return mainFirstCommand.equals(ADD);
    }
    public boolean isDeleteCommand(){
        return mainFirstCommand.equals(DEL);
    }
}
