package Main;

import DefaultCommand.*;

public class RemoteLoader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		/*
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("");
		*/
		Stereo stereo = new Stereo("Living Room");

		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		/*
		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		*/
		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, stereoOnWithCD, stereoOff);
		
		System.out.println(remoteControl);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		
		/////////////
		RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();
		
		Light livingRoomLight2 = new Light("Living Room");
		LightOnCommand livingRoomLightOn2 = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff2 = new LightOffCommand(livingRoomLight);
		
		remoteControlWithUndo.setCommand(0, livingRoomLightOn2, livingRoomLightOff2);
		
		remoteControlWithUndo.onButtonWasPushed(0);
		remoteControlWithUndo.offButtonWasPushed(0);
		System.out.println(remoteControlWithUndo);
		remoteControlWithUndo.undoButtonWasPushed();
		remoteControlWithUndo.offButtonWasPushed(0);
		remoteControlWithUndo.onButtonWasPushed(0);
		System.out.println(remoteControlWithUndo);
		remoteControlWithUndo.undoButtonWasPushed();
		
	}

}
