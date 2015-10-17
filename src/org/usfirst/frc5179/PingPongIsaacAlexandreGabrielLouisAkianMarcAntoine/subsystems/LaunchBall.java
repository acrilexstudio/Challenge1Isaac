// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5179.PingPongIsaacAlexandreGabrielLouisAkianMarcAntoine.subsystems;

import org.usfirst.frc5179.PingPongIsaacAlexandreGabrielLouisAkianMarcAntoine.OI;
import org.usfirst.frc5179.PingPongIsaacAlexandreGabrielLouisAkianMarcAntoine.RobotMap;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class LaunchBall extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    Solenoid solenoid = RobotMap.launchBallSolenoid;
    Compressor compressor = RobotMap.launchBallCompressor;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private double solenoidDelay = (1/(OI.WantedSpeed/60D));
	
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    	while (OI.WantedSpeed != 0){
    	Timer.delay(solenoidDelay);
    	solenoid.set(true);
    	}
    	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

