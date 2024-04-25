/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE DATA96 PACKING
package com.MAVLink.ardupilotmega;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
import com.MAVLink.Messages.Units;
import com.MAVLink.Messages.Description;

/**
 * Data packet, size 96.
 */
public class msg_data96 extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_DATA96 = 172;
    public static final int MAVLINK_MSG_LENGTH = 98;
    private static final long serialVersionUID = MAVLINK_MSG_ID_DATA96;

    
    /**
     * Data type.
     */
    @Description("Data type.")
    @Units("")
    public short type;
    
    /**
     * Data length.
     */
    @Description("Data length.")
    @Units("bytes")
    public short len;
    
    /**
     * Raw data.
     */
    @Description("Raw data.")
    @Units("")
    public short data[] = new short[96];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_DATA96;

        packet.payload.putUnsignedByte(type);
        packet.payload.putUnsignedByte(len);
        
        for (int i = 0; i < data.length; i++) {
            packet.payload.putUnsignedByte(data[i]);
        }
                    
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a data96 message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.type = payload.getUnsignedByte();
        this.len = payload.getUnsignedByte();
        
        for (int i = 0; i < this.data.length; i++) {
            this.data[i] = payload.getUnsignedByte();
        }
                
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_data96() {
        this.msgid = MAVLINK_MSG_ID_DATA96;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_data96( short type, short len, short[] data) {
        this.msgid = MAVLINK_MSG_ID_DATA96;

        this.type = type;
        this.len = len;
        this.data = data;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_data96( short type, short len, short[] data, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_DATA96;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.type = type;
        this.len = len;
        this.data = data;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_data96(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_DATA96;

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
        return "MAVLINK_MSG_ID_DATA96 - sysid:"+sysid+" compid:"+compid+" type:"+type+" len:"+len+" data:"+data+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_DATA96";
    }
}
        