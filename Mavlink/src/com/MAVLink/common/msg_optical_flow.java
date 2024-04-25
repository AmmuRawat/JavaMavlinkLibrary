/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE OPTICAL_FLOW PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
import com.MAVLink.Messages.Units;
import com.MAVLink.Messages.Description;

/**
 * Optical flow from a flow sensor (e.g. optical mouse sensor)
 */
public class msg_optical_flow extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_OPTICAL_FLOW = 100;
    public static final int MAVLINK_MSG_LENGTH = 34;
    private static final long serialVersionUID = MAVLINK_MSG_ID_OPTICAL_FLOW;

    
    /**
     * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp format (since 1.1.1970 or since system boot) by checking for the magnitude of the number.
     */
    @Description("Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp format (since 1.1.1970 or since system boot) by checking for the magnitude of the number.")
    @Units("us")
    public long time_usec;
    
    /**
     * Flow in x-sensor direction, angular-speed compensated
     */
    @Description("Flow in x-sensor direction, angular-speed compensated")
    @Units("m/s")
    public float flow_comp_m_x;
    
    /**
     * Flow in y-sensor direction, angular-speed compensated
     */
    @Description("Flow in y-sensor direction, angular-speed compensated")
    @Units("m/s")
    public float flow_comp_m_y;
    
    /**
     * Ground distance. Positive value: distance known. Negative value: Unknown distance
     */
    @Description("Ground distance. Positive value: distance known. Negative value: Unknown distance")
    @Units("m")
    public float ground_distance;
    
    /**
     * Flow in x-sensor direction
     */
    @Description("Flow in x-sensor direction")
    @Units("dpix")
    public short flow_x;
    
    /**
     * Flow in y-sensor direction
     */
    @Description("Flow in y-sensor direction")
    @Units("dpix")
    public short flow_y;
    
    /**
     * Sensor ID
     */
    @Description("Sensor ID")
    @Units("")
    public short sensor_id;
    
    /**
     * Optical flow quality / confidence. 0: bad, 255: maximum quality
     */
    @Description("Optical flow quality / confidence. 0: bad, 255: maximum quality")
    @Units("")
    public short quality;
    
    /**
     * Flow rate about X axis
     */
    @Description("Flow rate about X axis")
    @Units("rad/s")
    public float flow_rate_x;
    
    /**
     * Flow rate about Y axis
     */
    @Description("Flow rate about Y axis")
    @Units("rad/s")
    public float flow_rate_y;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_OPTICAL_FLOW;

        packet.payload.putUnsignedLong(time_usec);
        packet.payload.putFloat(flow_comp_m_x);
        packet.payload.putFloat(flow_comp_m_y);
        packet.payload.putFloat(ground_distance);
        packet.payload.putShort(flow_x);
        packet.payload.putShort(flow_y);
        packet.payload.putUnsignedByte(sensor_id);
        packet.payload.putUnsignedByte(quality);
        
        if (isMavlink2) {
             packet.payload.putFloat(flow_rate_x);
             packet.payload.putFloat(flow_rate_y);
            
        }
        return packet;
    }

    /**
     * Decode a optical_flow message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.time_usec = payload.getUnsignedLong();
        this.flow_comp_m_x = payload.getFloat();
        this.flow_comp_m_y = payload.getFloat();
        this.ground_distance = payload.getFloat();
        this.flow_x = payload.getShort();
        this.flow_y = payload.getShort();
        this.sensor_id = payload.getUnsignedByte();
        this.quality = payload.getUnsignedByte();
        
        if (isMavlink2) {
             this.flow_rate_x = payload.getFloat();
             this.flow_rate_y = payload.getFloat();
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_optical_flow() {
        this.msgid = MAVLINK_MSG_ID_OPTICAL_FLOW;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_optical_flow( long time_usec, float flow_comp_m_x, float flow_comp_m_y, float ground_distance, short flow_x, short flow_y, short sensor_id, short quality, float flow_rate_x, float flow_rate_y) {
        this.msgid = MAVLINK_MSG_ID_OPTICAL_FLOW;

        this.time_usec = time_usec;
        this.flow_comp_m_x = flow_comp_m_x;
        this.flow_comp_m_y = flow_comp_m_y;
        this.ground_distance = ground_distance;
        this.flow_x = flow_x;
        this.flow_y = flow_y;
        this.sensor_id = sensor_id;
        this.quality = quality;
        this.flow_rate_x = flow_rate_x;
        this.flow_rate_y = flow_rate_y;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_optical_flow( long time_usec, float flow_comp_m_x, float flow_comp_m_y, float ground_distance, short flow_x, short flow_y, short sensor_id, short quality, float flow_rate_x, float flow_rate_y, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_OPTICAL_FLOW;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_usec = time_usec;
        this.flow_comp_m_x = flow_comp_m_x;
        this.flow_comp_m_y = flow_comp_m_y;
        this.ground_distance = ground_distance;
        this.flow_x = flow_x;
        this.flow_y = flow_y;
        this.sensor_id = sensor_id;
        this.quality = quality;
        this.flow_rate_x = flow_rate_x;
        this.flow_rate_y = flow_rate_y;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_optical_flow(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_OPTICAL_FLOW;

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
        return "MAVLINK_MSG_ID_OPTICAL_FLOW - sysid:"+sysid+" compid:"+compid+" time_usec:"+time_usec+" flow_comp_m_x:"+flow_comp_m_x+" flow_comp_m_y:"+flow_comp_m_y+" ground_distance:"+ground_distance+" flow_x:"+flow_x+" flow_y:"+flow_y+" sensor_id:"+sensor_id+" quality:"+quality+" flow_rate_x:"+flow_rate_x+" flow_rate_y:"+flow_rate_y+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_OPTICAL_FLOW";
    }
}
        