import java.util.Stack;
import java.util.*;
interface Command {
    void execute();
}

class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}

class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
class Light {
    public void turnOn() {
        System.out.println("The light is on");
    }

    public void turnOff() {
        System.out.println("The light is off");
    }
}


// class RemoteControl {
//     private Command command;

//     public void setCommand(Command command) {
//         this.command = command;
//     }

//     public void pressButton() {
//         command.execute();
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Light light = new Light();
//         Command lightOn = new LightOnCommand(light);
//         Command lightOff = new LightOffCommand(light);

//         RemoteControl remote = new RemoteControl();

//         // Turn the light on
//         remote.setCommand(lightOn);
//         remote.pressButton();

//         // Turn the light off
//         remote.setCommand(lightOff);
//         remote.pressButton();
//     }
// }




// interface Command {
//     void execute();
//     void undo();
// }

// class LightOnCommand implements Command {
//     private Light light;

//     public LightOnCommand(Light light) {
//         this.light = light;
//     }

//     @Override
//     public void execute() {
//         light.turnOn();
//     }

//     @Override
//     public void undo() {
//         light.turnOff();
//     }
// }

// class LightOffCommand implements Command {
//     private Light light;

//     public LightOffCommand(Light light) {
//         this.light = light;
//     }

//     @Override
//     public void execute() {
//         light.turnOff();
//     }

//     @Override
//     public void undo() {
//         light.turnOn();
//     }
// }

// class CommandHistory {
//     private Stack<Command> history = new Stack<>();

//     public void push(Command command) {
//         history.push(command);
//     }

//     public Command pop() {
//         return history.pop();
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Light light = new Light();
//         Command lightOn = new LightOnCommand(light);
//         Command lightOff = new LightOffCommand(light);

//         CommandHistory history = new CommandHistory();

//         // Perform some actions
//         lightOn.execute();
//         history.push(lightOn);

//         lightOff.execute();
//         history.push(lightOff);

//         // Undo last action
//         Command lastCommand = history.pop();
//         lastCommand.undo();
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Light light = new Light();
//         Command lightOn = new LightOnCommand(light);
//         Command lightOff = new LightOffCommand(light);

//         TaskQueue queue = new TaskQueue();
//         queue.addCommand(lightOn);
//         queue.addCommand(lightOff);

//         queue.processCommands();
//     }
// }

// class TaskQueue {
//     private Queue<Command> queue = new LinkedList<>();

//     public void addCommand(Command command) {
//         queue.add(command);
//     }

//     public void processCommands() {
//         while (!queue.isEmpty()) {
//             Command command = queue.poll();
//             command.execute();
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Light light = new Light();
//         Command lightOn = new LightOnCommand(light);
//         Command lightOff = new LightOffCommand(light);

//         Button buttonOn = new Button(lightOn);
//         Button buttonOff = new Button(lightOff);

//         buttonOn.click();
//         buttonOff.click();
//     }
// }

// class Button {
//     private Command command;

//     public Button(Command command) {
//         this.command = command;
//     }

//     public void click() {
//         command.execute();
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Command command = new CreateUserCommand("John Doe");
//         // Serialize command to send to a service
//         String serializedCommand = serialize(command);
//         // Deserialize and execute command in the service
//         Command deserializedCommand = deserialize(serializedCommand);
//         deserializedCommand.execute();
//     }

//     private static String serialize(Command command) {
//         // Serialization logic
//         return command.toString(); // Simplified for example
//     }

//     private static Command deserialize(String data) {
//         // Deserialization logic
//         return new CreateUserCommand(data); // Simplified for example
//     }
// }

// class CreateUserCommand implements Command {
//     private String username;

//     public CreateUserCommand(String username) {
//         this.username = username;
//     }

//     @Override
//     public void execute() {
//         System.out.println("Creating user: " + username);
//     }
// }
public class Main {
    public static void main(String[] args) {
        CommandFactory commandFactory = new CommandFactory();
        Command command = commandFactory.createCommand("TurnOnLight");
        command.execute();
    }
}

class CommandFactory {
    public Command createCommand(String commandType) {
        if ("TurnOnLight".equals(commandType)) {
            return new LightOnCommand(new Light());
        } else if ("TurnOffLight".equals(commandType)) {
            return new LightOffCommand(new Light());
        }
        throw new IllegalArgumentException("Unknown command type");
    }
}

