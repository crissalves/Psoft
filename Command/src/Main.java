//Cliente
public class Main {

    public static void main(String[] args) {
        // Receiver
        Light light = new Light();

        // Comandos concretos
        Command turnOn = new TurnOnLightCommand(light);
        Command turnOff = new TurnOffLightCommand(light);

        // Invoker
        RemoteControl remote = new RemoteControl();

        // Configura e executa os comandos
        remote.setCommand(turnOn);
        remote.pressButton();  // Saída: Light is ON

        remote.setCommand(turnOff);
        remote.pressButton();  // Saída: Light is OFF
    }

}

