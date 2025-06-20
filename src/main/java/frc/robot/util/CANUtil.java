// Copyright 2021-2025 FRC 6328
// http://github.com/Mechanical-Advantage
//
// This program is free software; you can redistribute it and/or
// modify it under the terms of the GNU General Public License
// version 3 as published by the Free Software Foundation or
// available in the root directory of this project.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU General Public License for more details.

package frc.robot.util;

import com.ctre.phoenix6.hardware.CANcoder;

public class CANUtil {
  /**
   * Returns the current angle in rotations
   * Range between [-1, 1)
   * */
  public static double cancoderRotations(CANcoder cancoder) {
    return cancoder.getAbsolutePosition().refresh().getValueAsDouble(); // [-1, 1) range
  }

  /*
   * Returns the current angle in radians
   */
  public static double cancoderRadians(CANcoder cancoder) {
    return cancoderRotations(cancoder) * 2.0 * Math.PI;
  }

  public static double cancoderRotPerSec(CANcoder cancoder) {
    return cancoder.getVelocity().refresh().getValueAsDouble();
  }

  public static double cancoderRadPerSec(CANcoder cancoder) {
    return cancoderRotPerSec(cancoder) * 2.0 * Math.PI;
  }
}
