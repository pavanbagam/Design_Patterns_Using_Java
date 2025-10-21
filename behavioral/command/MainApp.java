package behavioral.command;
import behavioral.command.commands.OpenCloseCurtainsCommand;
import behavioral.command.commands.SwitchLightsCommand;
import behavioral.command.components.FloorLamp;
import behavioral.command.components.Room;
public class MainApp {

    public static void main(String[] args) {

        Room room = new Room();
        room.setCommand(new OpenCloseCurtainsCommand(room.getCurtains()));
        room.executeCommand();
        System.out.println(room.curtainsOpen());

        System.out.println("==========================================");

        FloorLamp lamp = new FloorLamp();
        lamp.setCommand(new SwitchLightsCommand(lamp.getLight()));
        lamp.executeCommand();
        System.out.println(lamp.isLightOn());

    }

}
