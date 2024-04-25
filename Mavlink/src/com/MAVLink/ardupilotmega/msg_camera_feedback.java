/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE CAMERA_FEEDBACK PACKING
package com.MAVLink.ardupilotmega;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
import com.MAVLink.Messages.Units;
import com.MAVLink.Messages.Description;

/**
 * Camera Capture Feedback.
 */
public class msg_camera_feedback extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_CAMERA_FEEDBACK = 180;
    public static final int MAVLINK_MSG_LENGTH = 47;
    private static final long serialVersionUID = MAVLINK_MSG_ID_CAMERA_FEEDBACK;

    
    /**
     * Image timestamp (since UNIX epoch), as passed in by CAMERA_STATUS message (or autopilot if no CCB).
     */
    @Description("Image timestamp (since UNIX epoch), as passed in by CAMERA_STATUS message (or autopilot if no CCB).")
    @Units("us")
    public long time_usec;
    
    /**
     * Latitude.
     */
    @Description("Latitude.")
    @Units("degE7")
    public int lat;
    
    /**
     * Longitude.
     */
    @Description("Longitude.")
    @Units("degE7")
    public int lng;
    
    /**
     * Altitude (MSL).
     */
    @Description("Altitude (MSL).")
    @Units("m")
    public float alt_msl;
    
    /**
     * Altitude (Relative to HOME location).
     */
    @Description("Altitude (Relative to HOME location).")
    @Units("m")
    public float alt_rel;
    
    /**
     * Camera Roll angle (earth frame, +-180).
     */
    @Description("Camera Roll angle (earth frame, +-180).")
    @Units("deg")
    public float roll;
    
    /**
     * Camera Pitch angle (earth frame, +-180).
     */
    @Description("Camera Pitch angle (earth frame, +-180).")
    @Units("deg")
    public float pitch;
    
    /**
     * Camera Yaw (earth frame, 0-360, true).
     */
    @Description("Camera Yaw (earth frame, 0-360, true).")
    @Units("deg")
    public float yaw;
    
    /**
     * Focal Length.
     */
    @Description("Focal Length.")
    @Units("mm")
    public float foc_len;
    
    /**
     * Image index.
     */
    @Description("Image index.")
    @Units("")
    public int img_idx;
    
    /**
     * System ID.
     */
    @Description("System ID.")
    @Units("")
    public short target_system;
    
    /**
     * Camera ID.
     */
    @Description("Camera ID.")
    @Units("")
    public short cam_idx;
    
    /**
     * Feedback flags.
     */
    @Description("Feedback flags.")
    @Units("")
    public short flags;
    
    /**
     * Completed image captures.
     */
    @Description("Completed image captures.")
    @Units("")
    public int completed_captures;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_CAMERA_FEEDBACK;

        packet.payload.putUnsignedLong(time_usec);
        packet.payload.putInt(lat);
        packet.payload.putInt(lng);
        packet.payload.putFloat(alt_msl);
        packet.payload.putFloat(alt_rel);
        packet.payload.putFloat(roll);
        packet.payload.putFloat(pitch);
        packet.payload.putFloat(yaw);
        packet.payload.putFloat(foc_len);
        packet.payload.putUnsignedShort(img_idx);
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(cam_idx);
        packet.payload.putUnsignedByte(flags);
        
        if (isMavlink2) {
             packet.payload.putUnsignedShort(completed_captures);
            
        }
        return packet;
    }

    /**
     * Decode a camera_feedback message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.time_usec = payload.getUnsignedLong();
        this.lat = payload.getInt();
        this.lng = payload.getInt();
        this.alt_msl = payload.getFloat();
        this.alt_rel = payload.getFloat();
        this.roll = payload.getFloat();
        this.pitch = payload.getFloat();
        this.yaw = payload.getFloat();
        this.foc_len = payload.getFloat();
        this.img_idx = payload.getUnsignedShort();
        this.target_system = payload.getUnsignedByte();
        this.cam_idx = payload.getUnsignedByte();
        this.flags = payload.getUnsignedByte();
        
        if (isMavlink2) {
             this.completed_captures = payload.getUnsignedShort();
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_camera_feedback() {
        this.msgid = MAVLINK_MSG_ID_CAMERA_FEEDBACK;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_camera_feedback( long time_usec, int lat, int lng, float alt_msl, float alt_rel, float roll, float pitch, float yaw, float foc_len, int img_idx, short target_system, short cam_idx, short flags, int completed_captures) {
        this.msgid = MAVLINK_MSG_ID_CAMERA_FEEDBACK;

        this.time_usec = time_usec;
        this.lat = lat;
        this.lng = lng;
        this.alt_msl = alt_msl;
        this.alt_rel = alt_rel;
        this.roll = roll;
        this.pitch = pitch;
        this.yaw = yaw;
        this.foc_len = foc_len;
        this.img_idx = img_idx;
        this.target_system = target_system;
        this.cam_idx = cam_idx;
        this.flags = flags;
        this.completed_captures = completed_captures;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_camera_feedback( long time_usec, int lat, int lng, float alt_msl, float alt_rel, float roll, float pitch, float yaw, float foc_len, int img_idx, short target_system, short cam_idx, short flags, int completed_captures, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_CAMERA_FEEDBACK;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_usec = time_usec;
        this.lat = lat;
        this.lng = lng;
        this.alt_msl = alt_msl;
        this.alt_rel = alt_rel;
        this.roll = roll;
        this.pitch = pitch;
        this.yaw = yaw;
        this.foc_len = foc_len;
        this.img_idx = img_idx;
        this.target_system = target_system;
        this.cam_idx = cam_idx;
        this.flags = flags;
        this.completed_captures = completed_captures;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_camera_feedback(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_CAMERA_FEEDBACK;

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
        return "MAVLINK_MSG_ID_CAMERA_FEEDBACK - sysid:"+sysid+" compid:"+compid+" time_usec:"+time_usec+" lat:"+lat+" lng:"+lng+" alt_msl:"+alt_msl+" alt_rel:"+alt_rel+" roll:"+roll+" pitch:"+pitch+" yaw:"+yaw+" foc_len:"+foc_len+" img_idx:"+img_idx+" target_system:"+target_system+" cam_idx:"+cam_idx+" flags:"+flags+" completed_captures:"+completed_captures+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_CAMERA_FEEDBACK";
    }
}
        