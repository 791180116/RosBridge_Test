package com.lc.rosbridge_lib.std_msgs;
import com.jilk.ros.message.Message;
import com.jilk.ros.message.MessageType;

@MessageType(string = "std_msgs/ByteMultiArray")
public class ByteMultiArray extends Message {
	/**
	*  specification of data layout
	*/
	public MultiArrayLayout layout;
	
	/**
	*  array of data
	*/
	public byte[] data;
	
}
