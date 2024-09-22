//Classe concreta
public class TurnOffLightCommand implements Command {

    private Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff(); // delega a ação ao Receiver
    }

}