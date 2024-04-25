/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE RADIO_CALIBRATION PACKING
package com.MAVLink.ualberta;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
import com.MAVLink.Messages.Units;
import com.MAVLink.Messages.Description;

/**
 * Complete set of calibration parameters for the radio
 */
public class msg_radio_calibration extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_RADIO_CALIBRATION = 221;
    public static final int MAVLINK_MSG_LENGTH = 42;
    private static final long serialVersionUID = MAVLINK_MSG_ID_RADIO_CALIBRATION;

    
    /**
     * Aileron setpoints: left, center, right
     */
    @Description("Aileron setpoints: left, center, right")
    @Units("")
    public int aileron[] = new int[3];
    
    /**
     * Elevator setpoints: nose down, center, nose up
     */
    @Description("Elevator setpoints: nose down, center, nose up")
    @Units("")
    public int elevator[] = new int[3];
    
    /**
     * Rudder setpoints: nose left, center, nose right
     */
    @Description("Rudder setpoints: nose left, center, nose right")
    @Units("")
    public int rudder[] = new int[3];
    
    /**
     * Tail gyro mode/gain setpoints: heading hold, rate mode
     */
    @Description("Tail gyro mode/gain setpoints: heading hold, rate mode")
    @Units("")
    public int gyro[] = new int[2];
    
    /**
     * Pitch curve setpoints (every 25%)
     */
    @Description("Pitch curve setpoints (every 25%)")
    @Units("")
    public int pitch[] = new int[5];
    
    /**
     * Throttle curve setpoints (every 25%)
     */
    @Description("Throttle curve setpoints (every 25%)")
    @Units("")
    public int throttle[] = new int[5];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_RADIO_CALIBRATION;

        
        for (int i = 0; i < aileron.length; i++) {
            packet.payload.putUnsignedShort(aileron[i]);
        }
                    
        
        for (int i = 0; i < elevator.length; i++) {
            packet.payload.putUnsignedShort(elevator[i]);
        }
                    
        
        for (int i = 0; i < rudder.length; i++) {
            packet.payload.putUnsignedShort(rudder[i]);
        }
                    
        
        for (int i = 0; i < gyro.length; i++) {
            packet.payload.putUnsignedShort(gyro[i]);
        }
                    
        
        for (int i = 0; i < pitch.length; i++) {
            packet.payload.putUnsignedShort(pitch[i]);
        }
                    
        
        for (int i = 0; i < throttle.length; i++) {
            packet.payload.putUnsignedShort(throttle[i]);
        }
                    
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a radio_calibration message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        
        for (int i = 0; i < this.aileron.length; i++) {
            this.aileron[i] = payload.getUnsignedShort();
        }
                
        
        for (int i = 0; i < this.elevator.length; i++) {
            this.elevator[i] = payload.getUnsignedShort();
        }
                
        
        for (int i = 0; i < this.rudder.length; i++) {
            this.rudder[i] = payload.getUnsignedShort();
        }
                
        
        for (int i = 0; i < this.gyro.length; i++) {
            this.gyro[i] = payload.getUnsignedShort();
        }
                
        
        for (int i = 0; i < this.pitch.length; i++) {
            this.pitch[i] = payload.getUnsignedShort();
        }
                
        
        for (int i = 0; i < this.throttle.length; i++) {
            this.throttle[i] = payload.getUnsignedShort();
        }
                
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_radio_calibration() {
        this.msgid = MAVLINK_MSG_ID_RADIO_CALIBRATION;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_radio_calibration( int[] aileron, int[] elevator, int[] rudder, int[] gyro, int[] pitch, int[] throttle) {
        this.msgid = MAVLINK_MSG_ID_RADIO_CALIBRATION;

        this.aileron = aileron;
        this.elevator = elevator;
        this.rudder = rudder;
        this.gyro = gyro;
        this.pitch = pitch;
        this.throttle = throttle;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_radio_calibration( int[] aileron, int[] elevator, int[] rudder, int[] gyro, int[] pitch, int[] throttle, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_RADIO_CALIBRATION;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.aileron = aileron;
        this.elevator = elevator;
        this.rudder = rudder;
        this.gyro = gyro;
        this.pitch = pitch;
        this.throttle = throttle;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_radio_calibration(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_RADIO_CALIBRATION;

        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

                
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_RADIO_CALIBRATION - sysid:"+sysid+" compid:"+compid+" aileron:"+aileron+" elevator:"+elevator+" rudder:"+rudder+" gyro:"+gyro+" pitch:"+pitch+" throttle:"+throttle+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_RADIO_CALIBRATION";
    }
}
        