/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
  static Intake m_Instance = null;
  private WPI_TalonSRX m_intakeMotor = null;
  private WPI_TalonSRX m_intakeArmMotor = null;
  /**
   * Creates a new Intake.
   */
  public Intake() {
    //m_intakeMotor = new WPI_TalonSRX();
    //m_intakeArmMotor = new WPI_TalonSRX();
  }

  public static Intake getInstance() {
    if(m_Instance == null) {
			synchronized (Intake.class) {
				m_Instance = new Intake();
			}
		}
		return m_Instance;
  }

  public static void raiseIntake() {

  }

  public static void lowerIntake() {
    
  }

  public static void startIntakeMotors() {
    
  }

  public static void stopIntakeMotors() {
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
