# TRADFRI2MQTT

Trådfri-to-MQTT is a software bridge implemented in Java that allows control and monitoring of the IKEA Trådfri lightning system via MQTT messages

# Invocation

java -jar TRADFRI2MQTT-X.X.X-SNAPSHOT.jar

All the parameters (Gateway's IP, ID, security key and MQTT broker's IP and credentials) should be specified in the config.java file before building the application
Some additional constants (like the default publish and subscribe topics as well as the messages could be also specified from there)

With the default configuration TRADFRI2MQTT works as follows:

Publishes state messages on topics like this:

 - home/lights/Living Room Light/state
 - home/lights/Living Room Light/brightness
 - home/lights/Living Room Light/color
 - home/room/Living Room/state
 - home/room/Living Room/brightness

Subscribes to control messages on topics like this:

 - TRADFRI/bulb/Living Room Light/control/state
 - TRADFRI/bulb/Living Room Light/control/brightness
 - TRADFRI/bulb/Living Room Light/control/color
 - TRADFRI/room/Living Room/control/state
 - TRADFRI/room/Living Room/control/brightness
 - TRADFRI/room/Living Room/control/mood

publish "ON"/"OFF" to the `state` topic to turn the light off/on respectively

publish 0-100 to the `brightness` topic to change the brightness

publish "cold" / "normal" / "warm" to the `color` topic to change color temperatures.
This however only works on individual bulbs.

publish the name of a mood (case-sensitive) to the `mood` topic of a room to adapt that mood.
IKEA predefined moods are internally uppercase-only for some reason: "EVERYDAY" / "FOCUS" / "RELAX".
Your self-defined moods have to be spelled like in the Trådfri App.
At the moment, only control is implemented and state is not.

# MQTT broker example
For this software bridge to work a MQTT broker is required.

An easy-to-use MQTT broker is [mosquitto](https://mosquitto.org/).

After installation run it locally with `mosquitto`.

Then submit commands like this:
`mosquitto_pub -t "TRÅDFRI/bulb/LivingRoomBulb1/control/temperature" -m warm`
or subscribe like this:
`mosquitto_sub -t "TRÅDFRI/room/LivingRoom/state/on"`
