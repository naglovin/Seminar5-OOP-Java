//Создать класс LogingCommandExecutableFactory, наследующий класс CommandExecutableFactory
//        - Переопределить единственный метод так, чтобы он вызывал внутри себя метод предка,
//        но в начале и конце распечатывал информацию о входных и выходных параметрах

package terminal;

import terminal.executable.CommandExecutable;

public class LogingCommandExecutableFactory extends CommandExecutableFactoryImpl {
    public LogingCommandExecutableFactory(){
        super(new StudentService(new StudentRepository()));
    }
    @Override
    public CommandExecutable create(Command input) {
        System.out.println(input);
        CommandExecutable res = super.create(input);
        System.out.printf("нормально");
        return res;

    }
}
