package uk.me.hardill.TRADFRI2MQTT;

/**
 *
 * @author Sotirios K.
 */
public class config {
    
	// Bridge's parameters must be specified below
    public static final String MQTT_USER = "MQTT_USER"; // Replace this with MQTT broker's username
    public static final String MQTT_PASS = "MQTT_PASSWORD"; // Replace this with MQTT broker's password
    public static final String COAP_ID = "Client_identity"; // Leave it as is or replace it with custom created COAP ID on latest gateway firmwares
    public static final String COAP_ID_PSK = "SECURITY_CODE"; // If a custom COAP ID is used above then the associated key must be used here, otherwise use the security code printed on the gateway
    public static final String TRADFRI_IP = "GATEWAY_IP_ADDRESS"; // Replace this with the IP address of the gateway
    public static final String BROKER_IP = "BROKER_IP_ADDRESS";	// Replace this with the MQTT broker's IP address
	public static final boolean RETAINED_MESSAGES = true;
    // MQTT Topic static variables
    // One example publish topic, using the static variables below is: home/lights/LivingRoomLight/state
    public static final String PUBLISH_PREFIX = "home/lights/"; // Default was: "TRÅDFRI/bulb/"
	public static final String ROOM_PUBLISH_PREFIX = "home/room/"; // Default was: "TRÅDFRI/room/"
    public static final String STATE_NAME = "/state"; // Default was: "/state/on"
    public static final String DIM_NAME = "/brightness"; // Default was: "/state/dim"
    public static final String COLOR_NAME = "/color"; // Default was: "/state/temperature"
    public static final String ON_NAME = "ON"; // Default was: "1"
    public static final String OFF_NAME = "OFF"; // Default was: "0"
    // One example control/subscribe topic, using those static variables is: TRADFRI/bulb/LivingRoomLight/control/state
    public static final String STATE_COMMAND_NAME = "state"; // Default was: "on"
    public static final String DIM_COMMAND_NAME = "brightness"; // Default was: "dim"
    public static final String COLOR_COMMAND_NAME = "color"; // Default was: "temperature"
    // Request period
    public static final int SAMPLE_PERIOD = 300;
    
}
