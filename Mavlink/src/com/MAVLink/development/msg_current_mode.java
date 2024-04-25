/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE CURRENT_MODE PACKING
package com.MAVLink.development;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
import com.MAVLink.Messages.Units;
import com.MAVLink.Messages.Description;

/**
 * Get the current mode.
        This should be emitted on any mode change, and broadcast at low rate (nominally 0.5 Hz).
        It may be requested using MAV_CMD_REQUEST_MESSAGE.
      
 */
public class msg_current_mode extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_CURRENT_MODE = 436;
    public static final int MAVLINK_MSG_LENGTH = 9;
    private static final long serialVersionUID = MAVLINK_MSG_ID_CURRENT_MODE;

    
    /**
     * A bitfield for use for autopilot-specific flags
     */
    @Description("A bitfield for use for autopilot-specific flags")
    @Units("")
    public long custom_mode;
    
    /**
     * The custom_mode of the mode that was last commanded by the user (for example, with MAV_CMD_DO_SET_STANDARD_MODE, MAV_CMD_DO_SET_MODE or via RC). This should usually be the same as custom_mode. It will be different if the vehicle is unable to enter the intended mode, or has left that mode due to a failsafe condition. 0 indicates the intended custom mode is unknown/not supplied
     */
    @Description("The custom_mode of the mode that was last commanded by the user (for example, with MAV_CMD_DO_SET_STANDARD_MODE, MAV_CMD_DO_SET_MODE or via RC). This should usually be the same as custom_mode. It will be different if the vehicle is unable to enter the intended mode, or has left that mode due to a failsafe condition. 0 indicates the intended custom mode is unknown/not supplied")
    @Units("")
    public long intended_custom_mode;
    
    /**
     * Standard mode.
     */
    @Description("Standard mode.")
    @Units("")
    public short standard_mode;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_CURRENT_MODE;

        packet.payload.putUnsignedInt(custom_mode);
        packet.payload.putUnsignedInt(intended_custom_mode);
        packet.payload.putUnsignedByte(standard_mode);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a current_mode message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.custom_mode = payload.getUnsignedInt();
        this.intended_custom_mode = payload.getUnsignedInt();
        this.standard_mode = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_current_mode() {
        this.msgid = MAVLINK_MSG_ID_CURRENT_MODE;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_current_mode( long custom_mode, long intended_custom_mode, short standard_mode) {
        this.msgid = MAVLINK_MSG_ID_CURRENT_MODE;

        this.custom_mode = custom_mode;
        this.intended_custom_mode = intended_custom_mode;
        this.standard_mode = standard_mode;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_current_mode( long custom_mode, long intended_custom_mode, short standard_mode, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_CURRENT_MODE;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.custom_mode = custom_mode;
        this.intended_custom_mode = intended_custom_mode;
        this.standard_mode = standard_mode;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_current_mode(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_CURRENT_MODE;

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
        return "MAVLINK_MSG_ID_CURRENT_MODE - sysid:"+sysid+" compid:"+compid+" custom_mode:"+custom_mode+" intended_custom_mode:"+intended_custom_mode+" standard_mode:"+standard_mode+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_CURRENT_MODE";
    }
}
        